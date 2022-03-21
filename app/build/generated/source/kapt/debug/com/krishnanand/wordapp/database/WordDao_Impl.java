package com.krishnanand.wordapp.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.krishnanand.wordapp.model.Word;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WordDao_Impl implements WordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Word> __insertionAdapterOfWord;

  public WordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWord = new EntityInsertionAdapter<Word>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `words` (`id`,`word`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Word value) {
        stmt.bindLong(1, value.getId());
        if (value.getWord() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWord());
        }
      }
    };
  }

  @Override
  public long insertWord(final Word instance) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfWord.insertAndReturnId(instance);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<Word>> getAllWords() {
    final String _sql = "SELECT * FROM words";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"words"}, new Callable<List<Word>>() {
      @Override
      public List<Word> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final List<Word> _result = new ArrayList<Word>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Word _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            _item = new Word(_tmpId,_tmpWord);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

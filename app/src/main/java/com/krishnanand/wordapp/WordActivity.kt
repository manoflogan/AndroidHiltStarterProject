package com.krishnanand.wordapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.google.android.material.snackbar.Snackbar
import com.krishnanand.wordapp.databinding.ActivityWordBinding
import com.krishnanand.wordapp.model.WordAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WordActivity : AppCompatActivity() {
    private lateinit var activityWordBinding: ActivityWordBinding

    private val viewModel: WordsViewModel by viewModels()

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityWordBinding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(activityWordBinding.root)
        val wordAdapter = WordAdapter()
        recyclerView = activityWordBinding.recyclerView
        with(recyclerView) {
            adapter = wordAdapter
            setHasFixedSize(true)
            val linearLayoutManager = LinearLayoutManager(this@WordActivity)
            layoutManager = linearLayoutManager
            addItemDecoration(
                DividerItemDecoration(recyclerView.context, linearLayoutManager.orientation)
            )
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                launch {
                    viewModel.insertUpdate.collect { insertCount ->
                        if (insertCount > 0) {
                            Snackbar.make(
                                activityWordBinding.root,
                                resources.getQuantityString(R.plurals.words_added, insertCount.toInt(), insertCount),
                                Snackbar.LENGTH_LONG
                            ).show()
                        }
                    }
                }
                launch {
                    viewModel.wordListFlow.collect {
                        wordAdapter.submitList(it)
                    }
                }
                viewModel.getAllWords()
            }
        }
        activityWordBinding.wordFab.setOnClickListener { view ->

            MaterialDialog(this).show {
               input(hint = "Enter String") { _, text ->
                   viewModel.saveWord(text.toString())
                }
                positiveButton(R.string.submit)
            }
        }
    }
}
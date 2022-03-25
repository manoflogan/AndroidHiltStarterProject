package com.krishnanand.wordapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.krishnanand.wordapp.databinding.ActivityWordBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WordActivity : AppCompatActivity() {
    private lateinit var activityWordBinding: ActivityWordBinding

    private val viewModel: WordsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityWordBinding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(activityWordBinding.root)
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
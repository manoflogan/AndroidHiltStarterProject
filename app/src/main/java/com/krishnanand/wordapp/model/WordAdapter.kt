package com.krishnanand.wordapp.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.krishnanand.wordapp.databinding.WordItemBinding

class WordAdapter: ListAdapter<Word, WordViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val viewHolder = WordViewHolder(
            WordItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
        return viewHolder
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DiffCallback = object: DiffUtil.ItemCallback<Word>() {
            override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
               return oldItem == newItem
            }
        }
    }
}


class WordViewHolder(
    private val binding: WordItemBinding
): RecyclerView.ViewHolder(
    binding.root
) {

    fun bind(word: Word) {
        binding.word = word
        binding.executePendingBindings()
    }
}
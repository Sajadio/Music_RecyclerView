package com.example.music_recyclerview.ui.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.ItemCardNewMusicBinding
import com.example.music_recyclerview.utils.loadImage

class TrendMusicAdapter(
    private var items: List<Music>
) :
    RecyclerView.Adapter<TrendMusicAdapter.NewMusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewMusicViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = ItemCardNewMusicBinding.inflate(inflate, parent, false)
        return NewMusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewMusicViewHolder, position: Int) {
        val music = items[position]
        with(holder.binding) {
            imageViewMusic.loadImage(music.image)
            textViewSongTitle.text = music.title
            textViewSongWriter.text = music.songWriters
        }
    }

    override fun getItemCount(): Int = items.size

    inner class NewMusicViewHolder(val binding: ItemCardNewMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}
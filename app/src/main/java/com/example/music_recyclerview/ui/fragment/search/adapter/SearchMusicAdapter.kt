package com.example.music_recyclerview.ui.fragment.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.ItemCardNewMusicBinding
import com.example.music_recyclerview.utils.loadImage

class SearchMusicAdapter(
    private var items: List<Music>
) :
    RecyclerView.Adapter<SearchMusicAdapter.SearchMusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchMusicViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = ItemCardNewMusicBinding.inflate(inflate, parent, false)
        return SearchMusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchMusicViewHolder, position: Int) {
        val music = items[position]
        with(holder.binding) {
            imageViewMusic.loadImage(music.image)
            textViewSongTitle.text = music.title
            textViewSongWriter.text = music.songWriters
        }
    }

    override fun getItemCount(): Int = items.size

    inner class SearchMusicViewHolder(val binding: ItemCardNewMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}
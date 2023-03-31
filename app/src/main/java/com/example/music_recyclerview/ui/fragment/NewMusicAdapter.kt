package com.example.music_recyclerview.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.ItemCardNewMusicBinding
import com.example.music_recyclerview.databinding.TrendingRightNowCardItemBinding
import com.example.music_recyclerview.utils.loadImage

class NewMusicAdapter(
    private val items: List<Music>
) : RecyclerView.Adapter<NewMusicAdapter.NewMucisViewHolder>() {

    class NewMucisViewHolder(val binding: ItemCardNewMusicBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewMucisViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = ItemCardNewMusicBinding.inflate(inflate, parent, false)
        return NewMucisViewHolder(view)
    }

    override fun getItemCount(): Int  = items.size

    override fun onBindViewHolder(holder: NewMucisViewHolder, position: Int) {
        val item = items[position]
        holder.binding.apply {
            imageViewMusic.loadImage(item.image)
            textViewSongTitle.text = item.title
            textViewSongWriter.text = item.songWriters
        }
    }
}
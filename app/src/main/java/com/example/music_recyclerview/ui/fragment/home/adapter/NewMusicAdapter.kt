package com.example.music_recyclerview.ui.fragment.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.ItemCardNewMusicBinding
import com.example.music_recyclerview.ui.fragment.BaseAdapter
import com.example.music_recyclerview.utils.loadImage

class NewMusicAdapter(
    private var items: List<Music>
) : BaseAdapter<ItemCardNewMusicBinding,Music>(items) {

    override val bindingInfalter: (LayoutInflater, ViewGroup, Boolean) -> ItemCardNewMusicBinding
        get() = ItemCardNewMusicBinding::inflate

    override fun bindItem(binding: ItemCardNewMusicBinding, item: Music) {
      with(binding){
          imageViewMusic.loadImage(item.image)
          textViewSongTitle.text = item.title
          textViewSongWriter.text = item.songWriters
      }
    }

}
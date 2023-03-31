package com.example.music_recyclerview.ui.fragment.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.ItemCardTrendMusicBinding
import com.example.music_recyclerview.ui.fragment.BaseAdapter
import com.example.music_recyclerview.utils.loadImage

class TrendMusicAdapter(
    private var items: List<Music>
) : BaseAdapter<ItemCardTrendMusicBinding,Music>(items) {

    override val bindingInfalter: (LayoutInflater, ViewGroup, Boolean) -> ItemCardTrendMusicBinding
        get() = ItemCardTrendMusicBinding::inflate

    override fun bindItem(binding: ItemCardTrendMusicBinding, item: Music) {
      with(binding){
          imageBigCard.loadImage(item.image)
      }
    }

}
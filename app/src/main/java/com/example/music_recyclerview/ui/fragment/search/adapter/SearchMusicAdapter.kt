package com.example.music_recyclerview.ui.fragment.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.ItemCardNewMusicBinding
import com.example.music_recyclerview.ui.fragment.BaseAdapter
import com.example.music_recyclerview.utils.loadImage

class SearchMusicAdapter(
    private var items: List<Music>
) :BaseAdapter<ItemCardNewMusicBinding,Music>(items) {

    override val bindingInfalter: (LayoutInflater, ViewGroup, Boolean) -> ItemCardNewMusicBinding
        get() = ItemCardNewMusicBinding::inflate

    override fun bindItem(binding: ItemCardNewMusicBinding, item: Music) {
        TODO("Not yet implemented")
    }
}
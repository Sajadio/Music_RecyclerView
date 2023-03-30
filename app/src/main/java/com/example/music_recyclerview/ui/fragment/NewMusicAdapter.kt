package com.example.music_recyclerview.ui.fragment

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_recyclerview.databinding.ItemCardNewMusicBinding

class NewMusicAdapter() :
    RecyclerView.Adapter<NewMusicAdapter.NewMusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewMusicViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NewMusicViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class NewMusicViewHolder(binding: ItemCardNewMusicBinding) :
        RecyclerView.ViewHolder(binding.root)
}
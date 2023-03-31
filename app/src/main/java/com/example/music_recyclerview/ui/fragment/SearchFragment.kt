package com.example.music_recyclerview.ui.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.music_recyclerview.data.DataManger
import com.example.music_recyclerview.data.Music
import com.example.music_recyclerview.databinding.FragmentSearchBinding
import com.example.music_recyclerview.ui.fragment.adapter.SearchMusicAdapter
import kotlin.math.log

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding.include) {
            textViewNewMusic.text = "Search music"
            editTextName.isEnabled = true



            editTextName.addTextChangedListener { title ->
                if (title.toString().isNotEmpty()){
                    val data = DataManger.getSongByTitle(title.toString())
                    setupSearchRecyclerView(data)
                }else{
                    setupSearchRecyclerView(emptyList())
                }
            }
        }
    }

    private fun setupSearchRecyclerView(data: List<Music>) {
        val adapter = SearchMusicAdapter(data)
        binding.recyclerViewSearchMusic.adapter = adapter
    }

}
package com.example.music_recyclerview.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.music_recyclerview.data.DataManger
import com.example.music_recyclerview.databinding.FragmentHomeBinding
import com.example.music_recyclerview.ui.fragment.adapter.NewMusicAdapter
import com.example.music_recyclerview.utils.replaceFragment

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            include.searchBox.setStartIconOnClickListener {
                requireActivity().replaceFragment(SearchFragment(), this::class.simpleName)
            }
            val adapter = NewMusicAdapter(DataManger.songs)
            recyclerViewNewMusic.adapter = adapter
        }
    }
}
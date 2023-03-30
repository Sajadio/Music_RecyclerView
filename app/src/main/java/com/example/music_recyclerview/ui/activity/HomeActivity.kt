package com.example.music_recyclerview.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.music_recyclerview.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
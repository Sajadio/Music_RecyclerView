package com.example.music_recyclerview.utils

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.bumptech.glide.Glide
import com.example.music_recyclerview.R
import com.example.music_recyclerview.ui.fragment.HomeFragment

fun ImageView.loadImage(url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}

fun FragmentActivity.replaceFragment(fragment: Fragment) {
    this.apply {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_music, fragment)
            commit()
        }
    }
}

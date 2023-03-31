package com.example.music_recyclerview.utils

import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.bumptech.glide.Glide
import com.example.music_recyclerview.R

fun ImageView.loadImage(url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}

fun FragmentActivity.replaceFragment(fragment: Fragment, backStack: String? = null) {
    this.apply {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_music, fragment)
            backStack?.let { addToBackStack(backStack) }
            commit()
        }
    }
}

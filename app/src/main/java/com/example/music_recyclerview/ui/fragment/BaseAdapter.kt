package com.example.music_recyclerview.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding


abstract class BaseAdapter<VB : ViewBinding, T : Any>(
    private val items: List<T>
) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder<VB>>() {

    abstract val bindingInfalter: (LayoutInflater, ViewGroup, Boolean) -> VB

    abstract fun bindItem(binding: VB, item: T)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB> {
        val inflate = LayoutInflater.from(parent.context)
        val view = bindingInfalter(inflate, parent, false)
        return BaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        bindItem(holder.binding, items[position])
    }

    override fun getItemCount(): Int = items.size

    class BaseViewHolder<VB : ViewBinding>(val binding: VB) :
        RecyclerView.ViewHolder(binding.root)
}
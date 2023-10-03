package com.example.tokopediatugas7.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokopediatugas7.databinding.Content5Binding
import com.example.tokopediatugas7.model.Content5
import com.example.tokopediatugas7.model.DataItemType

class Content5Adapter (
    private val viewType: Int,
    private val recyclerItemList: List<Content5>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    inner class MenuViewHolder(private val binding : Content5Binding) : RecyclerView.ViewHolder(binding.root) {

        fun bindMenuView(content5: Content5) {
            binding.Icon5.setImageResource(content5.image)
            binding.Text5.text = content5.name
        }
    }

    override fun getItemViewType(position: Int): Int {
        return viewType
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            DataItemType.CONTENT5 -> {
                val binding = Content5Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return MenuViewHolder(binding)
            }
            else -> {
                val binding = Content5Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return MenuViewHolder(binding)
            }
        }    }

    override fun getItemCount(): Int = recyclerItemList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {

            is Content5Adapter.MenuViewHolder -> {
                holder.bindMenuView(recyclerItemList[position])
            }
        }

    }

}
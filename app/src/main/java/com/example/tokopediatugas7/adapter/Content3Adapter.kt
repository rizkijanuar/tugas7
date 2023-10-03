package com.example.tokopediatugas7.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokopediatugas7.databinding.Content3Binding
import com.example.tokopediatugas7.model.Content3
import com.example.tokopediatugas7.model.DataItemType

class Content3Adapter (
    private val viewType: Int,
    private val recyclerItemList: List<Content3>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    inner class BestSellerViewHolder(private val binding : Content3Binding) : RecyclerView.ViewHolder(binding.root) {

        fun bindBestSellerView(content3: Content3) {
            binding.Icon3.setImageResource(content3.image)
            binding.Text3.text = content3.text
        }
    }

    override fun getItemViewType(position: Int): Int {
        return viewType
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            DataItemType.CONTENT3 -> {
                val binding = Content3Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return BestSellerViewHolder(binding)
            }
            else -> {
                val binding = Content3Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return BestSellerViewHolder(binding)
            }
        }
    }

    override fun getItemCount(): Int = recyclerItemList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {

            is Content3Adapter.BestSellerViewHolder -> {
                holder.bindBestSellerView(recyclerItemList[position])
            }
        }

    }

}
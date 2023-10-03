package com.example.tokopediatugas7.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokopediatugas7.databinding.Content2Binding
import com.example.tokopediatugas7.model.Content2
import com.example.tokopediatugas7.model.DataItemType

class Content2Adapter(
    private val viewType: Int,
    private val recyclerItemList: List<Content2>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    inner class BannerViewHolder(private val binding : Content2Binding) : RecyclerView.ViewHolder(binding.root) {

        fun bindBannerView(content2: Content2) {
            binding.Banner2.setImageResource(content2.image)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return viewType
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            DataItemType.CONTENT2 -> {
                val binding = Content2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return BannerViewHolder(binding)
            }
            else -> {
                val binding = Content2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return BannerViewHolder(binding)
            }
        }
    }

    override fun getItemCount(): Int = recyclerItemList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is Content2Adapter.BannerViewHolder -> {
                holder.bindBannerView(recyclerItemList[position])
            }
        }

    }

}
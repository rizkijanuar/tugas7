package com.example.tokopediatugas7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tokopediatugas7.adapter.MainAdapter
import com.example.tokopediatugas7.databinding.ActivityMainBinding
import com.example.tokopediatugas7.model.Content1
import com.example.tokopediatugas7.model.Content2
import com.example.tokopediatugas7.model.DataItem
import com.example.tokopediatugas7.model.DataItemType

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var listData : ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RecylerViewIndex.setHasFixedSize(true)
        binding.RecylerViewIndex.layoutManager = LinearLayoutManager(this)

        listData = ArrayList()
        allData()

        val adapter = MainAdapter(listData)
        binding.RecylerViewIndex.adapter = adapter
    }

    private fun allData() {
        val content1List = ArrayList<Content1>()
        content1List.add(Content1(R.drawable.icon1, "Coins"))
        content1List.add(Content1(R.drawable.icon2, "Langganan" ))
        content1List.add(Content1(R.drawable.icon3, "Gold"))
        content1List.add(Content1(R.drawable.icon4, "More"))

        val content2List = ArrayList<Content2>()
        content2List.add(Content2(R.drawable.banner1))
        content2List.add(Content2(R.drawable.banner2))
        content2List.add(Content2(R.drawable.banner3))

        listData.add(DataItem(DataItemType.CONTENT1, content1List, content2List))
        listData.add(DataItem(DataItemType.CONTENT2, content1List, content2List))
    }
}
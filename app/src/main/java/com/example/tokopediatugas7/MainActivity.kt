package com.example.tokopediatugas7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tokopediatugas7.adapter.MainAdapter
import com.example.tokopediatugas7.databinding.ActivityMainBinding
import com.example.tokopediatugas7.model.Content1
import com.example.tokopediatugas7.model.Content2
import com.example.tokopediatugas7.model.Content3
import com.example.tokopediatugas7.model.Content4
import com.example.tokopediatugas7.model.Content5
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
        val content1Data = ArrayList<Content1>()
        content1Data.add(Content1(R.drawable.iv1, "Coins"))
        content1Data.add(Content1(R.drawable.iv2, "Langganan" ))
        content1Data.add(Content1(R.drawable.iv3, "Gold"))
        content1Data.add(Content1(R.drawable.iv4, "More"))

        val content2Data = ArrayList<Content2>()
        content2Data.add(Content2(R.drawable.banner1))
        content2Data.add(Content2(R.drawable.banner2))
        content2Data.add(Content2(R.drawable.banner3))

        val content3Data = ArrayList<Content3>()
        content3Data.add(Content3(R.drawable.icon1, "Lihat Semua"))
        content3Data.add(Content3(R.drawable.icon2, "Diskon 50%"))
        content3Data.add(Content3(R.drawable.icon3, "Top-up "))
        content3Data.add(Content3(R.drawable.icon4, "Travel "))
        content3Data.add(Content3(R.drawable.icon5, "Promo Hari ini"))
        content3Data.add(Content3(R.drawable.icon6, "Go Food"))

        val content5Data = ArrayList<Content5>()
        content5Data.add(Content5(R.drawable.top1, "Furniture"))
        content5Data.add(Content5(R.drawable.top2, "Gadget"))
        content5Data.add(Content5(R.drawable.top3, "Food"))
        content5Data.add(Content5(R.drawable.top4, "Holiyay"))

        listData.add(DataItem(DataItemType.CONTENT1, content1Data, content2Data, content3Data, content5Data))
        listData.add(DataItem(DataItemType.CONTENT2, content1Data, content2Data, content3Data, content5Data))
        listData.add(DataItem(DataItemType.CONTENT3, content1Data, content2Data, content3Data, content5Data))
        listData.add(DataItem(DataItemType.CONTENT4, Content4("Lanjut disini bang")))
        listData.add(DataItem(DataItemType.CONTENT5, content1Data, content2Data, content3Data, content5Data))
    }
}
package com.example.staggered

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var recylerview:RecyclerView
    lateinit var itemlist:ArrayList<Int>
    lateinit var itemAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        int()
    }

    private fun int() {
        itemlist= ArrayList()
        recylerview=findViewById(R.id.recylerview)
        recylerview.setHasFixedSize(true)
        recylerview.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        addlist()
        itemAdapter=ImageAdapter(itemlist)
        recylerview.adapter=itemAdapter
    }
    private fun addlist()
    {
        itemlist.add(R.drawable.image1)
        itemlist.add(R.drawable.image2)
        itemlist.add(R.drawable.image3)
        itemlist.add(R.drawable.image4)
        itemlist.add(R.drawable.image5)
        itemlist.add(R.drawable.image6)
        itemlist.add(R.drawable.image7)
        itemlist.add(R.drawable.image8)
        itemlist.add(R.drawable.image1)
        itemlist.add(R.drawable.image9)
        itemlist.add(R.drawable.image10)
        itemlist.add(R.drawable.image11)
        itemlist.add(R.drawable.image12)
        itemlist.add(R.drawable.image13)
        itemlist.add(R.drawable.image14)
        itemlist.add(R.drawable.image15)
        itemlist.add(R.drawable.image6)
        itemlist.add(R.drawable.image7)
        itemlist.add(R.drawable.image2)
        itemlist.add(R.drawable.image3)

    }
}
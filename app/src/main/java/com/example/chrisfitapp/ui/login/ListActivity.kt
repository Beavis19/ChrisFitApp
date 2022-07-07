package com.example.chrisfitapp.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chrisfitapp.R
import com.example.chrisfitapp.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_list.*


class ListActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        layoutManager = LinearLayoutManager( this)

        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()

        recyclerView.adapter = adapter
    }
}
package com.walmart.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var productsAdapter: ProductsAdapter
    lateinit var vModel: VModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModel()
        setupView()
        setupObserver()
    }

    private fun setupViewModel() {
        vModel = ViewModelProvider(this)[VModel::class.java]
    }

    private fun setupView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        productsAdapter = ProductsAdapter(applicationContext)
        recyclerView.adapter = productsAdapter
        productsAdapter.setOnClickListener(object : ProductsAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(applicationContext, DetailsActivity::class.java).apply {
                    putExtra("ID", productsAdapter.getProductData()[position].id)
                }
                startActivity(intent)
            }

        })
    }

    private fun setupObserver() {
        vModel.getProduct().observe(this){
            productsAdapter.setProductData(it)
        }
        vModel.setProduct()
    }
}
package com.walmart.products

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.walmart.products.ProductRepository.getProducts
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setupView()
    }

    @SuppressLint("ResourceType")
    private fun setupView() {
        val id = intent.getIntExtra("ID",0)
        val p = getProducts().find { it.id == id }
        if (p != null) {
            Picasso.get().load(p.image).into(imageView2)
            nameTextView.text = p.name
            priceTextView.text = String.format("$%.2f", p.price)
            descriptionTextView.text = p.description
        }
    }
}

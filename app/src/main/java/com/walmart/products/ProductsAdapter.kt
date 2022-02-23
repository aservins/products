package com.walmart.products

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_recycler_view.view.*

class ProductsAdapter(private var context: Context) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    private var products = listOf<Product>()

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    private lateinit var onItemClickListener: OnItemClickListener

    fun setOnClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    fun getProductData() : List<Product> {
        return products;
    }

    fun setProductData(products: List<Product>) {
        this.products = products
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val layoutInflater = LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false)
        return ProductHolder(layoutInflater, onItemClickListener)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.render(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

    inner class ProductHolder(itemView: View, listener: OnItemClickListener): RecyclerView.ViewHolder(itemView) {

        fun render (product: Product) {
            itemView.nameTV.text = product.name
            itemView.priceTV.text = String.format("$%.2f", product.price)
            Picasso.get().load(product.image).into(itemView.imageView)
        }

        init {
            itemView.item.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position)
                }
            }
        }

    }

}
package com.example.tugas_lafyuu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class Product(val image: Int, val name: String, val price: String, val discount: String)

class FlashSaleAdapter(private val context: Context, private val products: List<Product>) :
    RecyclerView.Adapter<FlashSaleAdapter.FlashSaleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlashSaleViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_product_home, parent, false)
        return FlashSaleViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlashSaleViewHolder, position: Int) {
        val product = products[position]
        holder.productImage.setImageResource(product.image)
        holder.productName.text = product.name
        holder.productPrice.text = product.price
        holder.productDiscount.text = product.discount
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class FlashSaleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage: ImageView = itemView.findViewById(R.id.productImage)
        val productName: TextView = itemView.findViewById(R.id.productName)
        val productPrice: TextView = itemView.findViewById(R.id.productPrice)
        val productDiscount: TextView = itemView.findViewById(R.id.productDiscount)
    }
}

package com.merchants.loopx.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.merchants.loopx.R

class TransactionAdapter : RecyclerView.Adapter<TransactionAdapter.MyviewHolder>() {

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems() {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.transaction_items, parent, false)
        return MyviewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.bindItems()
    }
}
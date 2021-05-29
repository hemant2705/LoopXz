package com.merchants.loopx.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.merchants.loopx.R

class MyServiceAdapter(val context:Context, val itemist: ArrayList<String>):RecyclerView.Adapter<MyServiceAdapter.MyServiceAdapterViewHolder>()
{
    class MyServiceAdapterViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val txtview:TextView =view.findViewById(R.id.txtId)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyServiceAdapterViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.service_items,parent,false)
        return MyServiceAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyServiceAdapterViewHolder, position: Int) {
        val text =itemist[position]
        holder.txtview.text=text

    }

    override fun getItemCount(): Int {
        return itemist.size

    }
}
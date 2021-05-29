package com.merchants.loopx.ui.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.merchants.loopx.R
import com.merchants.loopx.ui.adapters.MyServiceAdapter

class MyServices : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var  layoutManager: LinearLayoutManager
    lateinit var fab: FloatingActionButton

    val ilist= arrayListOf(
        "saloon",
        "hair cut",
        "hair spa",
        "aviator"
    )
    lateinit var radapter: MyServiceAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_my_services, container, false)

        recyclerView=view.findViewById(R.id.serviceList)
        layoutManager= LinearLayoutManager(activity)
        fab=view.findViewById(R.id.fabicon)
        radapter= MyServiceAdapter(activity as Context,ilist)

        recyclerView.adapter=radapter
        recyclerView.layoutManager=layoutManager

        fab.setOnClickListener {
            val fragmentManager: FragmentManager? = fragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, AddServiceFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
                    }
        return view
    }

}


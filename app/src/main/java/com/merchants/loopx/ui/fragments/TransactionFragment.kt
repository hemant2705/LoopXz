package com.merchants.loopx.ui.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.merchants.loopx.databinding.FragmentTransactionBinding
import com.merchants.loopx.ui.adapters.TransactionAdapter
import kotlinx.android.synthetic.main.fragment_transaction.*


class TransactionFragment : Fragment() {

    lateinit var binding : FragmentTransactionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTransactionBinding.inflate(inflater)
        return(binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }

    private fun setAdapter() {

        transactionList.layoutManager = LinearLayoutManager(activity, 1, false)
        val adapter = TransactionAdapter()
        transactionList.adapter  =adapter

    }

}

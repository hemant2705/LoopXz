package com.merchants.loopx.ui.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.merchants.loopx.R
import com.merchants.loopx.databinding.FragmentProfileBinding


/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding
    lateinit var BtnServices :Button
    lateinit var BtnEmp :Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        BtnServices=view.findViewById(R.id.btnMyServices)

        BtnServices.setOnClickListener {
            val fragmentManager: FragmentManager? = fragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, MyServices())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view;
    }





}

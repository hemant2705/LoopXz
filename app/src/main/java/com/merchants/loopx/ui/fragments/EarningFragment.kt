
package com.merchants.loopx.ui.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.merchants.loopx.databinding.FragmentProfileBinding


/**
 * A simple [Fragment] subclass.
 */
class EarningFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater)

        return(binding.root)
    }

}

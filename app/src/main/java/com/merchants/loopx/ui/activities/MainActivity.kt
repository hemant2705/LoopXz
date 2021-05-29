package com.merchants.loopx.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.merchants.loopx.R
import com.merchants.loopx.ui.fragments.EarningFragment
import com.merchants.loopx.ui.fragments.HomeFragment
import com.merchants.loopx.ui.fragments.ProfileFragment
import com.merchants.loopx.ui.fragments.TransactionFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val transactionFragment =
            TransactionFragment()
        val earningFragment = EarningFragment()
        val profileFragment = ProfileFragment()

        setCurrentFragment(homeFragment)

        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> setCurrentFragment(homeFragment)
                R.id.navigation_transaction -> setCurrentFragment(transactionFragment)
                R.id.navigation_earning -> setCurrentFragment(earningFragment)
                R.id.navigation_profile -> setCurrentFragment(profileFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }

}
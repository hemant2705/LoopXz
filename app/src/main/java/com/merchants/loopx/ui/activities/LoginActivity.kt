package com.merchants.loopx.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.merchants.loopx.R
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setClickListeners()
    }

    private fun setClickListeners() {
        signUp.setOnClickListener(View.OnClickListener {

            startActivity(Intent(this, SignUpActivity::class.java))
        })
    }

}
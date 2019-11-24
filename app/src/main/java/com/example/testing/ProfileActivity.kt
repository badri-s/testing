package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        morebtt.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        switch1.setOnClickListener{
            if (switched.getVisibility() == View.VISIBLE){
                switched.setVisibility(View.INVISIBLE)
            }else{
                switched.setVisibility(View.VISIBLE)
            }
        }
    }
}

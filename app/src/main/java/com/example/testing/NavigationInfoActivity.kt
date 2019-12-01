package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_navigation_info.*
import kotlinx.android.synthetic.main.activity_navigattion.*

class NavigationInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_info)
        navigation2.setOnClickListener {
            startActivity(Intent(this,NavigattionActivity::class.java))
        }
        vr3.setOnClickListener {
            startActivity(Intent(this,NavigationVRActivity::class.java))
        }
        videodaiwye3.setOnClickListener {
            startActivity(Intent(this,VideoActivity::class.java))
        }
        down1.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        profile3.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
    }
}

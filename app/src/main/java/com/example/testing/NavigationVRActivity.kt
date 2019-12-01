package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_navigation_info.*
import kotlinx.android.synthetic.main.activity_navigation_vr.*
import kotlinx.android.synthetic.main.activity_navigattion.*

class NavigationVRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_vr)
        videodaiwye2.setOnClickListener {
            startActivity(Intent(this,VideoActivity::class.java))
        }
        navigation1.setOnClickListener {
            startActivity(Intent(this,NavigattionActivity::class.java))
        }
        info2.setOnClickListener {
            startActivity(Intent(this,NavigationInfoActivity::class.java))
        }
        down2.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        profile4.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
    }
}

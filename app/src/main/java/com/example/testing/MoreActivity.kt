package com.example.testing

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_more.*
import kotlinx.android.synthetic.main.activity_point.*

class MoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)
        lokation.setOnClickListener {
            startActivity(Intent(this, LocationActivity::class.java))

        }
        livecamera.setOnClickListener {
            startActivity(Intent(this, NavigattionActivity::class.java))
        }
        profile1.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        pointbtt.setOnClickListener {
            startActivity(Intent(this,PointActivity::class.java))
        }
    }
}

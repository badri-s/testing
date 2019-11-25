package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_offline.*

class OfflineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offline)
        backbuttonn1.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
        morebtt2.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
    }
}

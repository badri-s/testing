package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_static.*

class StaticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static)
        dabrunebaukan12.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
        esecmoreshi12.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
    }
}

package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_board_first.*

class BoardFirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_first)
        dabrunebaukan.setOnClickListener {
            startActivity(Intent(this, PointActivity::class.java))
        }
        esecmoreshi1.setOnClickListener {
            startActivity(Intent(this, MoreActivity::class.java))
        }
        pointshopbtt.setOnClickListener {
            startActivity(Intent(this,BoardSecondActivity::class.java))
        }
    }
}

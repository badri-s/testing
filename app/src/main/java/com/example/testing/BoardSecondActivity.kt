package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_board_second.*

class BoardSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_second)
        firstboard.setOnClickListener {
            startActivity(Intent(this,BoardFirstActivity::class.java))
        }
        dabrunebaukan4.setOnClickListener {
            startActivity(Intent(this,PointActivity::class.java))
        }
        esecmoreshi4.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
    }
}

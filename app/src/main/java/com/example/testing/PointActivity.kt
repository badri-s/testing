package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_point.*

class PointActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_point)
        dabrunebamoreshi.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        esecmoreshi.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        showmorebtt.setOnClickListener {
            startActivity(Intent(this, BoardFirstActivity::class.java))
        }

    }
}

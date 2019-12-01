package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_request.*

class RequestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)
        dabrunebaukan10.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
        esecmoreshi11.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        openphoto.setOnClickListener {
            startActivity(Intent(this,NavigattionActivity::class.java))
        }
        openlocation.setOnClickListener {
            startActivity(Intent(this,LocationActivity::class.java))
        }
    }
}

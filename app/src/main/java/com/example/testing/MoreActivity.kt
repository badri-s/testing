package com.example.testing

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_more.*

class MoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)
        lokation.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ge/maps/@41.737191,44.825371,12.04z?hl=ka&authuser=0")))

        }
    }
}

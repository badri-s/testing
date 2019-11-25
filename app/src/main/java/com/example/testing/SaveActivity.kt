package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)
    }
}

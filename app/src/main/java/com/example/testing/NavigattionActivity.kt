package com.example.testing

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_navigattion.*

class NavigattionActivity : AppCompatActivity() {

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigattion)
        videodaiwye.setOnClickListener {
            startActivity(Intent(this,VideoActivity::class.java))
        }
        aprirli.setOnClickListener{
            parlamenta.background = getDrawable(R.drawable.aprili)
        }
        xalxi.setOnClickListener{
            parlamenta.background = getDrawable(R.drawable.savecxraapp)
        }
        nadzvi.setOnClickListener{
            parlamenta.background = getDrawable(R.drawable.nadzvi)
        }
        shavi.setOnClickListener{
            parlamenta.background = getDrawable(R.drawable.saveparlamenti)
        }
        sadeb.setOnClickListener{
            parlamenta.background = getDrawable(R.drawable.sadeb)
        }
        vrbttn.setOnClickListener {
            startActivity(Intent(this,NavigationVRActivity::class.java))
        }
        info1.setOnClickListener {
            startActivity(Intent(this,NavigationInfoActivity::class.java))
        }
        down.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        profile2.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }

    }
}

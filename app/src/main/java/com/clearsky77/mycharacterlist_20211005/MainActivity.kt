package com.clearsky77.mycharacterlist_20211005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toMyCharListBtn.setOnClickListener {
            val myIntent = Intent(this, CharListActivity :: class.java)
            startActivity(myIntent)
        }
    }
}
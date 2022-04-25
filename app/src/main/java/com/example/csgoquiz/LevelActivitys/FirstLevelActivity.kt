package com.example.csgoquiz.LevelActivitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.csgoquiz.R

class FirstLevelActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_level)

        val actionBar = supportActionBar
        actionBar!!.title="First Level"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}
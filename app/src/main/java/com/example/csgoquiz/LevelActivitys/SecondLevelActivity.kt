package com.example.csgoquiz.LevelActivitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.csgoquiz.R

class SecondLevelActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_level)

        val actionBar = supportActionBar
        actionBar!!.title="Second Level"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}
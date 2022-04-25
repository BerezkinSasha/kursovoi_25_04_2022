package com.example.csgoquiz.LevelActivitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.csgoquiz.R

class ThirdLevelActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_level)

        val actionBar = supportActionBar
        actionBar!!.title="Third Level"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}
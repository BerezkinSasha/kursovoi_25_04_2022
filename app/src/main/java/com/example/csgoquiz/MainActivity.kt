package com.example.csgoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.example.csgoquiz.LevelActivitys.FirstLevelActivity
import com.example.csgoquiz.LevelActivitys.SecondLevelActivity
import com.example.csgoquiz.LevelActivitys.ThirdLevelActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //переход на другую страницу не работает, не знаю в чем причина ошибки, может из-за того что создал активити не правильно
        //я сначала создал сам активити потом классы котлина и привязал их вручную, хотя не думаю что в этом ошибка.
        val firstLvlBtn:ImageButton = findViewById(R.id.firstLvlBtn)
        val secondLvlBtn:ImageButton = findViewById(R.id.secondLvlBtn)
        val thirdLvlBtn:ImageButton = findViewById(R.id.thirdLvlBtn)

        firstLvlBtn.setOnClickListener {
            val intent = Intent(this, FirstLevelActivity::class.java)
            startActivity(intent)
        }

        secondLvlBtn.setOnClickListener {
            val intent = Intent(this, SecondLevelActivity::class.java)
            startActivity(intent)
        }

        thirdLvlBtn.setOnClickListener {
            val intent = Intent(this, ThirdLevelActivity::class.java)
            startActivity(intent)
        }
    }


}
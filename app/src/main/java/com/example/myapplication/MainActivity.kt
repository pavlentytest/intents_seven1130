package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn1.setOnClickListener {
            // неявное намерение
            val www = "https://mirea.ru"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(www))
            startActivity(intent)
        }
        btn2.setOnClickListener {
            // явное намерение
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
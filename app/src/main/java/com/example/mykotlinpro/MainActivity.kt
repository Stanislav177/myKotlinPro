package com.example.mykotlinpro

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClick();
        //НЕ понял как в консоль отобразить..
        for(i in 1..10) {
            print("Hello Kotlin!")
        }
    }

    fun initClick() {
        val btnClickOne: Button = findViewById(R.id.btn_click_one)
        val textOne: TextView = findViewById(R.id.text_view_one)
        val btnClickTwo: Button = findViewById(R.id.btn_click_two)
        val textTwo: TextView = findViewById(R.id.text_view_two)

        //Выводим данные из Data-класса
        //val (note, textNote) = Data()
        //Выводим данные из Object
        val (note, textNote) = Repository.newCopy
        
        btnClickOne.setOnClickListener { textOne.text = note }
        btnClickTwo.setOnClickListener { textTwo.text = textNote }
    }
}
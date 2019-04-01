package com.example.feiradasprofissoes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TelaSorteio : AppCompatActivity() {

    private lateinit var mButton2: Button
    private lateinit var mImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_sorteio)


        mButton2 = findViewById(R.id.button2)
        mImageView = findViewById(R.id.imageView)



    }
}

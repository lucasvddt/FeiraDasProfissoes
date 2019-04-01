package com.example.feiradasprofissoes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var mTextView: TextView
    private lateinit var mTextView2: TextView
    private lateinit var mTextView3: TextView
    private lateinit var mTextView4: TextView
    private lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.textView)
        mTextView2 = findViewById(R.id.textView2)
        mTextView3 = findViewById(R.id.textView3)
        mTextView4 = findViewById(R.id.textView4)
        mButton = findViewById(R.id.button)

        mButton.setOnClickListener{

            val intent = Intent(this, TelaSorteio::class.java)
            startActivity(intent)

        }

        mTextView.setOnClickListener{

            val intent = Intent(this, CursoADS::class.java)
            startActivity(intent)

        }





    }
}

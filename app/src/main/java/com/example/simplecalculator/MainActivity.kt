package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etNumber1: EditText? = null
    private var etNumber2: EditText? = null
    private var tvDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisplay)



        val btnAddition = findViewById<Button>(R.id.btnadd)
        btnAddition.setOnClickListener {
           add()
        }

        val btnSubtract = findViewById<Button>(R.id.btnsubtract)
        btnAddition.setOnClickListener {
            sub()
        }

        val btnMultiply = findViewById<Button>(R.id.btnmultiply)
        btnMultiply.setOnClickListener { it:  }

        val btnDivide   = findViewById<Button>(R.id.btndivide)


    }
}
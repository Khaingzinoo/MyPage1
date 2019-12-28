package com.example.mypage1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtnumOne=findViewById<EditText>(R.id.edit_num_one)
        val edtnumTwo=findViewById<EditText>(R.id.edit_num_two)

        val btnSum=findViewById<Button>(R.id.btn_sum)

        val txtResult:TextView=findViewById(R.id.txt_result)

        btnSum.setOnClickListener {
            val numOne: Int=edtnumOne.text.toString().toInt()
            val numTwo:Int=edtnumTwo.text.toString().toInt()
            val result=numOne +  numTwo
            txtResult.text=result.toString()
        }

        val btnSub=findViewById<Button>(R.id.btn_sub)
        btnSub.setOnClickListener {
            val numOne: Int=edtnumOne.text.toString().toInt()
            val numTwo:Int=edtnumTwo.text.toString().toInt()
            val result=numOne -  numTwo
            txtResult.text=result.toString()
        }

        val btnMult=findViewById<Button>(R.id.btn_mult)
        btnMult.setOnClickListener {
            val numOne: Int=edtnumOne.text.toString().toInt()
            val numTwo:Int=edtnumTwo.text.toString().toInt()
            val result=numOne *  numTwo
            txtResult.text=result.toString()
        }

        val btnDiv=findViewById<Button>(R.id.btn_div)
        btnDiv.setOnClickListener {
            val numOne: Int=edtnumOne.text.toString().toInt()
            val numTwo:Int=edtnumTwo.text.toString().toInt()
            val result=numOne /  numTwo
            txtResult.text=result.toString()
        }


    }
}

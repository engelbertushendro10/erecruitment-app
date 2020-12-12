package com.example.erecruitment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculators)
    }
    private val textresult: TextView
        get() = findViewById(R.id.textresult)!!

    fun View.onDigit() {
        if (textresult.text.toString().trim() == "0") textresult.text = null
        textresult.append((this as Button).text.toString())
    }
    fun onOperator(view: View) {
        textresult.append("${(view as Button).text}")
    }
    fun onEqual(view: View) = try {
        val expression: Expression = ExpressionBuilder(textresult.text.toString()).build()
        val result:Double = expression.evaluate()
        textresult.text = (if (result % 1 > 0)result else result.toInt()).toString()
    }catch(e:Exception){
        e.printStackTrace()
        Toast.makeText(this,"operator can not operation", Toast.LENGTH_SHORT).show()
    }
    fun onBreaketStart(view: View){
        textresult.append("(")
    }
    fun onBreaketEnd(view: View){
        textresult.append(")")
    }
    fun onDecimal(view: View){
        textresult.append(".")
    }
    fun onDelete(view: View){
        val resultAfteDel:String = textresult.text.toString()
        if(resultAfteDel.isNotEmpty()) {
            textresult.text = resultAfteDel.dropLast(n = 1)
        }else textresult.text = "0"
    }

    fun onClear(view: View) {
        textresult.text = "0"
    }
}
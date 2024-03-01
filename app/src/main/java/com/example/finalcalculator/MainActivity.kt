package com.example.finalcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {

    private lateinit var expression: TextView
    private lateinit var result: TextView
    private lateinit var clear: Button
    private lateinit var backspace: Button
    private lateinit var percent: Button
    private lateinit var division: Button
    private lateinit var multiplication: Button
    private lateinit var addition: Button
    private lateinit var subtraction: Button
    private lateinit var equal: Button
    private lateinit var dot: Button
    private lateinit var zero: Button
    private lateinit var Doublezero: Button
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var sevenr: Button
    private lateinit var eightr: Button
    private lateinit var nine: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression = findViewById(R.id.expression)
        result = findViewById(R.id.result)
        clear = findViewById(R.id.clear)
        backspace = findViewById(R.id.backspace)
        percent = findViewById(R.id.percent)
        division = findViewById(R.id.division)
        multiplication = findViewById(R.id.multiplication)
        addition = findViewById(R.id.addition)
        subtraction = findViewById(R.id.subtraction)
        equal = findViewById(R.id.equal)
        zero = findViewById(R.id.zero)
        Doublezero = findViewById(R.id.Doublezero)
        one =findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four =findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        sevenr =  findViewById(R.id.seven)
        eightr = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true

        var str: String

        clear.setOnClickListener {

            expression.text = " "
            result.text= ""



        }
        backspace.setOnClickListener {
            if (expression.text.toString().isNotEmpty()){
                val lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0, lastIndex)
                expressionText(str)
                resultText()
            }

        }
        percent.setOnClickListener {



        }
        division.setOnClickListener {

        }
        multiplication.setOnClickListener {

        }
        addition.setOnClickListener {

        }
        subtraction.setOnClickListener {

        }
        equal.setOnClickListener {

        }
        dot.setOnClickListener {

        }
        zero.setOnClickListener {

        }
        Doublezero.setOnClickListener {

        }
        one.setOnClickListener {

        }
        two.setOnClickListener {

        }
        three.setOnClickListener {

        }
        four.setOnClickListener {

        }
        five.setOnClickListener {

        }
        six.setOnClickListener {

        }
        sevenr.setOnClickListener {

        }
        eightr.setOnClickListener {

        }
        nine.setOnClickListener {

        }

    }
    private fun expressionText(buttonValue:String):String{
       return "$(expression.text)$buttonValue"
    }
    private fun resultText(){

    }

    }

package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    //declaring all variables
    lateinit var userinput:TextView
    lateinit var useroutput:TextView
    lateinit var allclear:MaterialButton
    lateinit var zero:MaterialButton
    lateinit var dots:MaterialButton
    lateinit var equal:MaterialButton
    lateinit var one:MaterialButton
    lateinit var two:MaterialButton
    lateinit var three:MaterialButton
    lateinit var pluss:MaterialButton
    lateinit var four:MaterialButton
    lateinit var five:MaterialButton
    lateinit var six:MaterialButton
    lateinit var minuss:MaterialButton
    lateinit var seven:MaterialButton
    lateinit var eight:MaterialButton
    lateinit var nine:MaterialButton
    lateinit var multiplys:MaterialButton
    lateinit var clear:MaterialButton
    lateinit var back:MaterialButton
    lateinit var moduluss:MaterialButton
    lateinit var divides:MaterialButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //providing ids
        userinput=findViewById(R.id.userinput)
        useroutput=findViewById(R.id.answer)
        allclear=findViewById(R.id.buttonA)
        zero=findViewById(R.id.button0)
        dots=findViewById(R.id.buttondot)
        equal=findViewById(R.id.buttonequal)
        pluss=findViewById(R.id.buttonplus)
        one=findViewById(R.id.button1)
        two=findViewById(R.id.button2)
        three=findViewById(R.id.button3)
        four=findViewById(R.id.button4)
        five=findViewById(R.id.button5)
        six=findViewById(R.id.button6)
        seven=findViewById(R.id.button7)
        minuss=findViewById(R.id.buttonminus)
        eight=findViewById(R.id.button8)
        nine=findViewById(R.id.button9)
        multiplys=findViewById(R.id.buttonX)
        clear=findViewById(R.id.buttonC)
        back=findViewById(R.id.buttonB)
        moduluss=findViewById(R.id.buttonmodules)
        divides=findViewById(R.id.buttondivide)

        //number input
        one.setOnClickListener{
          userinput.append("1")
        }
        two.setOnClickListener{
            userinput.append("2")
        }
        three.setOnClickListener{
            userinput.append("3")
        }
        four.setOnClickListener{
            userinput.append("4")
        }
        five.setOnClickListener{
            userinput.append("5")
        }
        six.setOnClickListener{
            userinput.append("6")
        }
        seven.setOnClickListener{
            userinput.append("7")
        }
        eight.setOnClickListener{
            userinput.append("8")
        }
        nine.setOnClickListener{
            userinput.append("9")
        }
        zero.setOnClickListener{
            userinput.append("0")
        }
        dots.setOnClickListener{
            userinput.append(".")
        }
        pluss.setOnClickListener{
            userinput.append("+")
        }
        minuss.setOnClickListener{
            userinput.append("-")
        }
        multiplys.setOnClickListener{
            userinput.append("*")
        }
        moduluss.setOnClickListener{
            userinput.append("%")
        }
        divides.setOnClickListener{
            userinput.append("/")
        }

        getresultofinput()
        getallclear()
        getback()
    }

    private fun getresultofinput() {
        equal.setOnClickListener{
            val expression= ExpressionBuilder(userinput.text.toString()).build()
            val result=expression.evaluate()
            val long=result.toLong()

            if(result==long.toDouble())
            {
                useroutput.text=long.toString()
            }
            else{
                useroutput.text=result.toString()
            }
        }
    }

    private fun getback() {
        back.setOnClickListener{
            //droplast method to drop the last entered number
            //userinput.text to store the result
            userinput.text=userinput.text.toString().dropLast(1)
        }

    }

    private fun getallclear()
    {
        allclear.setOnClickListener{
            useroutput.text = ""
            userinput.text = ""
        }
        clear.setOnClickListener{
            userinput.text=""
            useroutput.text=""
        }
    }
}


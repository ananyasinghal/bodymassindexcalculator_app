package com.example.bodymassindexcalculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun calculate(view : View){
        val weight : Double
        val height : Double
        val mybmi : Float

        weight = edittext1?.text.toString().toDouble()
        height = edittext2?.text.toString().toDouble()

        mybmi = Calculatebmi (weight , height)
        bmi_textview.text = mybmi.toString()
        if (mybmi < 18.5){
            image4.setImageResource(R.drawable.underweight)
        }else if (mybmi > 18.5 && mybmi < 24.9){
            image1.setImageResource(R.drawable.healthy)
        }else if (mybmi > 24.9 && mybmi < 29.9 ){
            image2.setImageResource(R.drawable.obesity)
        }else{
            image3.setImageResource(R.drawable.overweight)
        }
    }

    fun Calculatebmi (weight : Double , height : Double): Float {
        val mybmi : Float
        mybmi = ((weight * 0.45) / ((height * 0.025) * (height * 0.025))).toFloat()
        return mybmi
    }

}




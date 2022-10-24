package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var foodArray= arrayListOf<String>( "Hamburger", "Pizza", "Mexican", "American", "Chinese")

    fun clickDecide(view: View) {
        val randomValues:Int = Random.nextInt(0, foodArray.size-1)
        food_textView.text=foodArray[randomValues]
    }

    fun clickAddFood(view: View) {
        var inputText: String?= addfood_etx.text.toString()
        if (inputText != null) {
            foodArray.add(inputText)
        };
    }
}
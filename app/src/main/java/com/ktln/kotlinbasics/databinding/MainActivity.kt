package com.ktln.kotlinbasics.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ktln.kotlinbasics.R
import com.ktln.kotlinbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnGreet.setOnClickListener{
            greetMe()
        }
    }

    //Greetings
    private fun greetMe(){
        binding.apply {
            tvGreet.text = "Hello  "+etName.text+" ,Welcome to Kotlin."
        }

    }
}

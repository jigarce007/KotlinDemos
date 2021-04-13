package com.ktln.kotlinbasics.codingchallenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.ktln.kotlinbasics.R
import com.ktln.kotlinbasics.databinding.ActivityCcDatabindingBinding


class DataBindingCCActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCcDatabindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_cc_databinding)
        binding.btnDance.setOnClickListener{
            letsDance(binding.btnDance.text.toString())
        }
    }

    //Greetings
    private fun letsDance(switch : String){
        binding.apply {
            if (switch.equals("Start",true)){
            pgDance.visibility = View.VISIBLE
            btnDance.text = "Stop"}
            else{
                pgDance.visibility = View.INVISIBLE
            btnDance.text = "Start"
        }
        }

    }
}

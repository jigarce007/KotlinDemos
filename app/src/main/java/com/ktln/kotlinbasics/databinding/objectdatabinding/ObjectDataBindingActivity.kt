package com.ktln.kotlinbasics.databinding.objectdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ktln.kotlinbasics.R
import com.ktln.kotlinbasics.databinding.ActivityObjDatabindingBinding


class ObjectDataBindingActivity : AppCompatActivity() {
    private lateinit var binding : ActivityObjDatabindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_obj_databinding)
      binding.apply {

          btnGetdata.setOnClickListener {
              student = getStudentData()
          }
      }

    }

    //Greetings
    private fun getStudentData() : Student{
        return Student(1,"JIGAR","28")
    }
}

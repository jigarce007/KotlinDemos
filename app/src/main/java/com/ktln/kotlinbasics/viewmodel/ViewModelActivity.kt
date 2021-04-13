package com.ktln.kotlinbasics.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ktln.kotlinbasics.R
import com.ktln.kotlinbasics.databinding.ActivityMainBinding
import com.ktln.kotlinbasics.databinding.ActivityViewmodelBinding

class ViewModelActivity : AppCompatActivity() {
    private lateinit var binding : ActivityViewmodelBinding
    //initialise view model here..
    private lateinit var viewmodel : ActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_viewmodel)
        viewmodel = ViewModelProvider(this).get(ActivityViewModel::class.java)
        binding.tvCounter.text = viewmodel.showcurrentCount().toString()
        binding.btnAdd.setOnClickListener{
        binding.tvCounter.text = viewmodel.addCount().toString()
        }
    }

}

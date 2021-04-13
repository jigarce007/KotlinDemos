package com.ktln.kotlinbasics.viewmodel

import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {
    //View model basically contains the logic for activity..which can be destroy during
    //Configuration changes like orientation changes of phone.

    private var count = 0

    fun showcurrentCount():Int{
        return count
    }

        fun addCount():Int{
        return  ++count
    }


}
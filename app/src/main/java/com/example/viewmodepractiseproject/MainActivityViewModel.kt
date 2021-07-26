package com.example.viewmodepractiseproject

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var sum :Int = 0



    fun sum(value:Int):Int{
        sum+=value
        return sum
    }
    fun update():Int{
        return sum
    }


}

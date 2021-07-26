package com.example.viewmodepractiseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.viewmodepractiseproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var sum :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            val value = binding.editText.text.toString().toInt()
            binding.editText.text.clear()
            binding.textView.text = add(value).toString()

        }

    }

    private fun add(numeric:Int):Int{
        sum += numeric    // it's represent same like this [sum=sum+value]
        return  sum
    }
}
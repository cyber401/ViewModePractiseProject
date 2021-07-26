package com.example.viewmodepractiseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodepractiseproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var model: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        model = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.textView.text=model.update().toString()
        binding.button.setOnClickListener {
            binding.textView.text= model.sum(binding.editText.text.toString().toInt()).toString()
            binding.editText.text.clear()

        }

    }


}
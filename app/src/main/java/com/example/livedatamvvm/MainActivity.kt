package com.example.livedatamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.livedatamvvm.databinding.ActivityMainBinding
import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userModel: UserModel
    var num = 0
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userModel = ViewModelProvider(this).get(UserModel::class.java)
        binding.btnRed.setOnClickListener {
            userModel.text.setValue("Hello, Red is clicked")
        }
        binding.btnBlue.setOnClickListener {
            userModel.text.setValue("Hello, Blue is clicked")
        }

        userModel.intValue.observe(this){
            binding.tvCount.setText(it.toString())
        }
    }
}
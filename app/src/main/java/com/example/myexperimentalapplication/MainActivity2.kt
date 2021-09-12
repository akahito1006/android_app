package com.example.myexperimentalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// databinding
import com.example.myexperimentalapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    // 間違えやすい
//    X binding: Main2Activity
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "set text by new feature names 'viewBinding.' i hope it would works fine"
    }
}
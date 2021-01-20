package com.example.study_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study_5.databinding.ActivityIntent1Binding

class Intent1 : AppCompatActivity() {
    private lateinit var binding : ActivityIntent1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntent1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var acb = 10
        var b= acb *10
        var c= acb *100

       /* binding.change_activity.setOnClickListener {
            val intent=Intent(this@Intent1,Intent2::class.java)
            startActivity(intent)
        }*/
    }
}
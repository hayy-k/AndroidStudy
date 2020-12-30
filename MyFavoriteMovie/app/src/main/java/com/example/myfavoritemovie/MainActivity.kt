package com.example.myfavoritemovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfavoritemovie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.story.setOnClickListener {
            val intent=Intent(this, StoryActivity::class.java)
            startActivity(intent)
        }

        binding.riley.setOnClickListener {
            val intent2=Intent(this, Riley::class.java)
            startActivity(intent2)
        }

        binding.joy.setOnClickListener {
            val intent3=Intent(this, Joy::class.java)
            startActivity(intent3)
        }
        binding.sadness.setOnClickListener {
            val intent4=Intent(this, Sadness::class.java)
            startActivity(intent4)
        }

        binding.disgust.setOnClickListener {
            val intent5=Intent(this, Disgust::class.java)
            startActivity(intent5)
        }

        binding.fear.setOnClickListener {
            val intent6=Intent(this, Fear::class.java)
            startActivity(intent6)
        }

        binding.anger.setOnClickListener {
            val intent7=Intent(this, Anger::class.java)
            startActivity(intent7)
        }

    }
}
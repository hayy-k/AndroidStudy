package com.example.diaryinmyhand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diaryinmyhand.databinding.ActivityDiaryWritingBinding

class DiaryWriting : AppCompatActivity() {
    private lateinit var binding: ActivityDiaryWritingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiaryWritingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.Back.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
        }

        // < 버튼과 X 버튼의 역할이 같은 건가요..? 버튼이 모호하네용

        binding.delete.setOnClickListener {
            val intent1 = Intent(this,MainActivity2::class.java)
        }

    }
}
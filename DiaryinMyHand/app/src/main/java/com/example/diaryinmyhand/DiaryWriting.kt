package com.example.diaryinmyhand

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            startActivity(intent)
            val alertDialog = AlertDialog.Builder(this)
                    .setTitle("Back")
                    .setMessage("내용을 저장하지 않고 나가시겠습니까?")
                    .setPositiveButton("네", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "네", Toast.LENGTH_SHORT).show()
                    })
                    .setNegativeButton("아니요", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "아니요", Toast.LENGTH_SHORT).show()
                    })
                    .create()
                    .show()
        }

        binding.Ok.setOnClickListener {
            val intent1 = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }

    }
}
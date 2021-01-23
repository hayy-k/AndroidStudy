package com.example.diaryinmyhand

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diaryinmyhand.databinding.ActivityAlertDialogBinding

class AlertDialog : AppCompatActivity() {
    private lateinit var binding: ActivityAlertDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

     /*   binding.more.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                    .setTitle("목록")
        }*/


    }
}
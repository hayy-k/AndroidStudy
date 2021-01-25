package com.example.diaryinmyhand

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diaryinmyhand.R
import com.example.diaryinmyhand.databinding.ActivityAlertDialogBinding

class AlertDialog : AppCompatActivity() {
    private lateinit var binding: ActivityAlertDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        

        binding.more.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                    .setTitle("목록")
                    .setMessage("수행할 내용을 알려주시용!")
                    .setPositiveButton("수정", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "일기를 수정합니다.", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, DiaryWriting::class.java)
                        startActivity(intent)
                    })
                    .setNegativeButton("삭제", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "일기를 삭제합니다.", Toast.LENGTH_SHORT).show()
                        //일기 삭제하는 기능...
                    })
                    .setNeutralButton("이모티콘", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "이모티콘을 설정합니다.", Toast.LENGTH_SHORT).show()
                        //이모티콘 설정??
                    })
                    .create()
                    .show()
        }



        /*binding.more.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                    .setTitle("목록")
                    .setItems(R.array.data_name, DialogInterface.OnClickListener { dialog, which ->
                        when(which){

                            0 -> binding.more.setText("수정")
                            0 -> DialogInterface.OnCancelListener {
                            val intent = Intent(this, DiaryWriting::class.java)
                        }
                            1 -> binding.more.setText("삭제")
                            2 -> binding.more.setText("이모티콘")

                        }
                    })
        }*/


    }
}
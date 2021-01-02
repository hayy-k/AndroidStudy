package com.example.study_8

import androidx.appcompat.app.AppCompatActivity
import android.content.SharedPreferences
import android.os.Bundle
import android.content.Context.MODE_PRIVATE
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        button13.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodBye", "안녕히계세요")
            editor.commit()

        button12.setOnClickListener {
            val sharedPreference=getSharedPreferences("sp1", MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello","데이터 없음1")
            val value2 = sharedPreference.getString("goodBye","데이터 없음2")
            Log.d("key-value","Value:" + value1)
            Log.d("key-value","Value:" + value2)
        }


        button14.setOnClickListener {
            val sharedPreference=getSharedPreferences("sp1", MODE_PRIVATE)
            val editor=sharedPreference.edit()
            editor.remove("hello")
            editor.commit()

        }

        button15.setOnClickListener {
            val sharedPreference=getSharedPreferences("sp1", MODE_PRIVATE)
            val editor=sharedPreference.edit()
            editor.clear()
            editor.commit()
            }


        }
    }
}
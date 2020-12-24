package com.example.study_6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent1.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        //change_activity.setOnClickListener {
        //val intent2 = Intent(this@Intent1,Intent2::class.java)
        //intent2.apply{
        //this.putExtra("number1",1)
        //this.putExtra("number2",2)
        //}
        // startActivityForResult(intent2,200)

        // }
        val intent=Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
        //위의 네이버를 보여주라는 인텐트 생성
        startActivity(intent)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==200){
            Log.d("number",""+requestCode)
            Log.d("number",""+resultCode)
            val result= data?.getIntExtra("result",0)
            Log.d("number",""+result)
        }
    }
}
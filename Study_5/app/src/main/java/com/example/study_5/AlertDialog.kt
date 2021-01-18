package com.example.study_5

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
    }

    /*fun showDialog() {
        val msgBuilder: AlertDialog.Builder = Builder(this@AlertDialog)
            .setTitle("앱 끈다?")
            .setMessage("진짜 끈다?")
            .setPositiveButton("꺼라",
                DialogInterface.OnClickListener { dialogInterface, i -> finish() })
            .setNegativeButton("취소",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(
                        this@AlertDialog,
                        "안 끔",
                        Toast.LENGTH_SHORT
                    ).show()
                })
        val msgDlg: AlertDialog = msgBuilder.create()
        msgDlg.show()
    }
*/
}
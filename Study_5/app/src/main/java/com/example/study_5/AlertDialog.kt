package com.example.study_5

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.study_5.databinding.ActivityAlertDialogBinding
import com.example.study_5.databinding.ActivityMainBinding


class AlertDialog : AppCompatActivity() {
    private lateinit var binding: ActivityAlertDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonQuit.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                    .setTitle("AlertDialog1")
                    .setMessage("Do you want to leave?")
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
                    })
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
                    })
                    .create()
                    .show()
        }
        // AlertDialog(App) / setPositiveButton (CharSequence)
    }
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
package com.example.diaryinmyhand

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CalendarView
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity

class MainActivity {

}

/*
class CalendarActivity : AppCompatActivity() {
    private var mCalendarView: CalendarView? = null
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar_layout)
        mCalendarView = findViewById<View>(R.id.calendarView) as CalendarView
        mCalendarView!!.setOnDateChangeListener { CalendarView, year, month, dayOfMonth ->
            val date = "$year/$month/$dayOfMonth"
            Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:$date")
            val intent = Intent(this@CalendarActivity, MainActivity::class.java)
            intent.putExtra("date", date)
            startActivity(intent)
        }
    }

    companion object {
        private const val TAG = "CalendarActivity"
    }
}*/

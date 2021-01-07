package com.example.todolist

import android.content.ClipData
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ActivityTodolistBinding
import java.util.ArrayList

class Todolist : AppCompatActivity() {
    private lateinit var binding: ActivityTodolistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodolistBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}

/*
class TodoAdapter:(list:ArrayList<TodoItem>, context=Context)RecyclerView.Adapter<TodoAdapter.TodoViewholder>(){
    private var todolist:ArrayList<TodoItem> = list
    private var _context = context
    inner class TodoViewholder(val binding = itembinding)
}*/

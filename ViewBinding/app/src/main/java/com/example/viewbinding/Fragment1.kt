package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.viewbinding.databinding.ActivityFragment1Binding

class Fragment1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFragment1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frag1.setOnClickListener{
            val fragmentOne:FragmentOne= FragmentOne()
            val fragmentManager: FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragmentOne)
            fragmentTransaction.commit()

        }

        binding.frag2.setOnClickListener {
            val fragmentOne:FragmentOne =FragmentOne()
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.detach(fragmentOne)
            fragmentTransaction.commit()

        }
    }
}
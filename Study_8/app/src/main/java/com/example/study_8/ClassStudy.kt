package com.example.study_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClassStudy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_study)
    }
    fun main(array:Array<String>){
        Car("v8 engine","big")
        val bigCar = Car("v7 engine", "big")
        val bigCar1 :Car = Car("v7 engine", "big")
    }
}


class Car(var engine: String, var body: String){
}

class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(Engine: String, Body: String, Door: String) {
        this.engine = Engine
        this.body = Body
        this.door = Door
    }
}

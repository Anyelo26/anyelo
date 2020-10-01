package com.example.idpn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma()
    }
    fun suma(){
        var a1=2
        var a2=3
        println(a1+a2)
    }
    fun resta(){
    }
}

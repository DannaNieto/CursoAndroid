package com.example.myfirstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MySecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_second2)
    }
    override fun onResume(){
        super.onResume()
        Toast.makeText(this,"Hola", Toast.LENGTH_LONG).show()
    }
}
package com.example.myfirstactivity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

  lateinit var tvContador : TextView
  lateinit var btnButon : Button
  var contador = 0

  @SuppressLint("MissingInflatedId")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    tvContador = findViewById(R.id.tvContador)
    btnButon = findViewById(R.id.btnButon)

    btnButon.setOnClickListener {
      contador++
      tvContador.text = contador.toString()
      Toast.makeText(this,contador.toString(),Toast.LENGTH_LONG).show()
    }
  }

  override fun onResume() {
    super.onResume()
    //Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()

    /*val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse("https://www.Google.com")
    startActivity(intent)*/
    //val intent = Intent(this, MySecondActivity2::class.java)
    //startActivity(intent)
  }
}
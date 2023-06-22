package com.example.myfirstactivity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)
  }

  override fun onResume() {
    super.onResume()
    Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()

    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse("https://www.youtube.com")
    startActivity(intent)
  }
}
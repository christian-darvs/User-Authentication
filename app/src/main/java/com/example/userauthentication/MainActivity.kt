package com.example.userauthentication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)
        val text: TextView = findViewById(R.id.textView)
        val reset: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val usernameInput = username.text.toString()
            val passInput = password.text.toString()
            fun String.toColor(): Int = Color.parseColor(this)
            if (usernameInput.equals("admin") && passInput.equals("admin123")){
                val intent = Intent(this, WelcomeUser::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }else if(usernameInput.equals("") && passInput.equals("")){
                Toast.makeText(this, "Missing Information", Toast.LENGTH_SHORT).show()
                username.setHintTextColor("#FF0000".toColor())
                password.setHintTextColor("#FF0000".toColor())
            }else{
                Toast.makeText(this, "Login Denied", Toast.LENGTH_SHORT).show()
                username.setTextColor("#FF0000".toColor())
                password.setTextColor("#FF0000".toColor())
            }
        }

        reset.setOnClickListener {
            fun String.toColor(): Int = Color.parseColor(this)
            text.setText("")
            username.setText("")
            password.setText("")
            password.setHintTextColor("#6b9097".toColor())
            username.setHintTextColor("#6b9097".toColor())
            username.setTextColor("#000000".toColor())
            password.setTextColor("#000000".toColor())


        }
    }
}
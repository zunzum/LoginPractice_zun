package com.zunzum.loginpractice_zun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {
            val inputId = idCheck.text.toString()
            val inputPass = passCheck.text.toString()
            if ( inputId=="admin" && inputPass=="qwer") {
                val name = "zunzum"
                Toast.makeText(this, "${name}관리자입니다", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
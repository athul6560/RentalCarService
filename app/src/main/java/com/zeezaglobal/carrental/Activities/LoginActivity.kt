package com.zeezaglobal.carrental.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zeezaglobal.carrental.R
import com.zeezaglobal.carrental.databinding.ActivityLoginBinding
import com.zeezaglobal.carrental.databinding.ActivitySplashScreenBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))

    }
        binding.registerBtn.setOnClickListener {
            Toast.makeText(this, "Register", Toast.LENGTH_SHORT).show()
        }
}}
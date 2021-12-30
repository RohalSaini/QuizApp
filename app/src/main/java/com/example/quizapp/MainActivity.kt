package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        OnClick()
    }
    fun  OnClick() {
        binding.ButtonGuestLogin.setOnClickListener {
            // Guest Login

        }
        binding.ButtonAdminLogin.setOnClickListener {
            // Admin Login

        }
    }
}
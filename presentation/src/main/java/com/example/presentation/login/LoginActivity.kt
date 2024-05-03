package com.example.presentation.login

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.presentation.theme.FastcampusSNSTheme

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FastcampusSNSTheme {
                LoginNavHost()
            }
        }
    }
}
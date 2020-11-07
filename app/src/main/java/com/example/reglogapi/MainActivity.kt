package com.example.reglogapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.asLiveData
import com.example.data.UserPreferences
import com.example.ui.auth.AuthActivity
import com.example.ui.home.HomeActivity
import com.example.ui.startNewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val userPreferences = UserPreferences(this)

        userPreferences.authtoken.asLiveData().observe(this, {

            val activity = if (it == null) AuthActivity::class.java else HomeActivity::class.java
            startNewActivity(activity)
            finish()
            overridePendingTransition(0, 0)

        })


    }


}
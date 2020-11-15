package com.example.ui.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.reglogapi.R

class SignupDirections private constructor() {
  companion object {
    fun actionSignupToLogin2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signup_to_login2)
  }
}

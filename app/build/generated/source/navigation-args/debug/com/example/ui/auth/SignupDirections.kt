package com.example.ui.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.reglogapi.R

class SignupDirections private constructor() {
  companion object {
    fun actionRegisterToLogin(): NavDirections =
        ActionOnlyNavDirections(R.id.action_register_to_login)
  }
}

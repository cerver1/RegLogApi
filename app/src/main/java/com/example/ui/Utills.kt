package com.example.ui

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.fragment.app.Fragment
import com.example.network.Resources
import com.example.reglogapi.R
import com.example.ui.auth.Login
import com.example.ui.base.Basefragment
import com.google.android.material.snackbar.Snackbar

fun <A : Activity> Activity.startNewActivity(activity: Class<A>) {
    Intent(this, activity).also {
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }

}


fun View.visible(isVisible: Boolean) {

    visibility = if (isVisible) View.VISIBLE else View.GONE

}

fun View.enable(enable: Boolean) {

    isEnabled = enable
    alpha = if (enable) 1f else 0.5f

}


fun View.snackbar(message: String, action: (() -> Unit)? = null) {

    val snackbar = Snackbar.make(this, message, Snackbar.LENGTH_LONG)

    action?.let {
        snackbar.setAction(R.string.retry) {
            it()
        }
    }
    snackbar.show()

}

fun Fragment.handleApiError(
    failure: Resources.Failure,
    retry: (() -> Unit)? = null
) {

    when {
        failure.isNetworkError -> requireView().snackbar(getString(R.string.no_network_message),
            retry
        )
        failure.Code == 401 -> {
            if (this is Login) {
                requireView().snackbar(getString(R.string.wrong_email_or_password))
            } else {
                (this as Basefragment<*, *, *>).logout()
            }
        }
        else -> {
            requireView().snackbar(failure.errorBody.toString())
        }
    }


}




package com.example.ui.auth

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.example.network.AuthApi
import com.example.network.Resources
import com.example.reglogapi.R
import com.example.reglogapi.databinding.FragmentSignupBinding
import com.example.repository.SignUpRepository
import com.example.ui.base.Basefragment
import com.example.ui.enable
import com.example.ui.handleApiError
import com.example.ui.startNewActivity
import com.example.ui.visible


class Signup : Basefragment<SignUpViewmodel, FragmentSignupBinding, SignUpRepository>() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.signupprogressbar.visible(false)
        binding.signupbtn.enable(false)


        viewModel.signupResponse.observe(viewLifecycleOwner, {

            binding.signupprogressbar.visible(false)
            when (it) {
                is Resources.Success ->
//
                {
                    Toast.makeText(
                        activity, getString(R.string.signup_message),
                        Toast.LENGTH_LONG
                    ).show()

                    requireActivity().startNewActivity(AuthActivity::class.java)
                }


                is Resources.Failure -> handleApiError(it)
            }
        })

        fun signup() {

            val name = binding.signupname.text.toString()
            val email = binding.signupemail.text.toString()
            val password = binding.signuppassword.text.toString()
            val passwordconfirmation = binding.confirmPassword.text.toString()
            viewModel.signup(name, email, password, passwordconfirmation)
            binding.signupprogressbar.visible(true)
            binding.logintxtbtn.enable(false)
        }


        binding.signupbtn.setOnClickListener {

            if (binding.confirmPassword.text.toString() == binding.signuppassword.text.toString()
                && isValidEmail()
            ) {
                signup()
            } else {
                Toast.makeText(activity, getString(R.string.regconfimation), Toast.LENGTH_SHORT)
                    .show()
            }


        }


        with(binding) {
            signupname.addTextChangedListener {
                val email = signupemail.text.toString().trim()
                val password = signuppassword.text.toString().trim()
                val confrimpassword = confirmPassword.text.toString().trim()
                signupbtn.enable(
                    it.toString().isNotEmpty()
                            && password.isNotEmpty() && email.isNotEmpty() && confrimpassword.isNotEmpty()
                )
            }


            fun EditText.validate(message: String, validator: (String) -> Boolean) {
                this.doAfterTextChanged {
                    this.error = if (validator(it.toString())) null else message
                }
                this.error = if (validator(this.text.toString())) null else message
            }

            fun String.isValidEmail(): Boolean =
                this.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
            binding.signupemail.validate(getString(R.string.validemail)) { s -> s.isValidEmail() }




            signupemail.addTextChangedListener {

                val name = signupname.text.toString().trim()
                val password = signuppassword.text.toString().trim()
                val confrimpassword = confirmPassword.text.toString().trim()
                signupbtn.enable(
                    it.toString()
                        .isNotEmpty() && password.isNotEmpty() && name.isNotEmpty() && confrimpassword.isNotEmpty()
                )
            }




            signuppassword.addTextChangedListener {
                val name = signupname.text.toString().trim()
                val email = signupemail.text.toString().trim()
                val confrimpassword = confirmPassword.text.toString().trim()
                signupbtn.enable(
                    it.toString().isNotEmpty()
                            && email.isNotEmpty() && name.isNotEmpty() && confrimpassword.isNotEmpty()
                )
            }

            confirmPassword.addTextChangedListener {


                val name = signupname.text.toString().trim()
                val email = signupemail.text.toString().trim()
                val password = signuppassword.text.toString().trim()
                signupbtn.enable(
                    it.toString().isNotEmpty()
                            && email.isNotEmpty() && name.isNotEmpty() && password.isNotEmpty()
                )
            }
        }



        binding.logintxtbtn.setOnClickListener {
            findNavController().navigate(SignupDirections.actionSignupToLogin2())
        }


    }

    fun isValidEmail(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(binding.signupemail.text.toString())
            .matches()
    }


    override fun getViewModel() = SignUpViewmodel::class.java

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentSignupBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() =
        SignUpRepository(remoteDataSource.buildApi(AuthApi::class.java))


}
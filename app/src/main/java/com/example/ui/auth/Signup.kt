package com.example.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.example.network.AuthApi
import com.example.network.Resources
import com.example.reglogapi.databinding.FragmentSignupBinding
import com.example.repository.SignUpRepository
import com.example.ui.base.Basefragment
import com.example.ui.handleApiError
import com.example.ui.startNewActivity
import com.example.ui.visible

class Signup : Basefragment<SignUpViewmodel, FragmentSignupBinding, SignUpRepository>() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.signupprogressbar.visible(false)


        viewModel.signupResponse.observe(viewLifecycleOwner, {

            binding.signupprogressbar.visible(false)
            when (it) {
                is Resources.Success ->
//
                {
                    Toast.makeText(
                        activity, "Congratulations, your account has been successfully created.",
                        Toast.LENGTH_LONG
                    ).show()



                    requireActivity().startNewActivity(AuthActivity::class.java)
                }


                is Resources.Failure -> handleApiError(it)
            }
        })

        binding.signupbtn.setOnClickListener {

            signup()


        }


    }

    private fun signup() {
        val name = binding.signupname.text.toString()
        val email = binding.signupemail.text.toString()
        val password = binding.signuppassword.text.toString()
        val password_confirmation = binding.confirmPassword.text.toString()
        binding.signupprogressbar.visible(true)
        viewModel.signup(name, email, password, password_confirmation)
        binding.signupprogressbar.visible(true)
    }


    override fun getViewModel() = SignUpViewmodel::class.java

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentSignupBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() =
        SignUpRepository(remoteDataSource.buildApi(AuthApi::class.java))


}
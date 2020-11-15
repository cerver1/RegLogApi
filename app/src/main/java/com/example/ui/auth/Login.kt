package com.example.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.network.AuthApi
import com.example.network.Resources
import com.example.reglogapi.databinding.FragmentLoginBinding
import com.example.repository.AuthRepository
import com.example.ui.base.Basefragment
import com.example.ui.enable
import com.example.ui.handleApiError
import com.example.ui.home.HomeActivity
import com.example.ui.startNewActivity
import com.example.ui.visible
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.launch


class Login : Basefragment<AuthViewModel, FragmentLoginBinding, AuthRepository>() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)




        binding.loginprogressbar.visible(false)
        binding.loginBtn.enable(false)

        viewModel.loginResponse.observe(viewLifecycleOwner, {

            binding.loginprogressbar.visible(false)
            when (it) {
                is Resources.Success ->
//
                {
                    lifecycleScope.launch { viewModel.saveAuthToken(it.value.user.access_token!!) }

                    requireActivity().startNewActivity(HomeActivity::class.java)
                }


                is Resources.Failure -> handleApiError(it) { login() }
            }
        })

        binding.loginemail.addTextChangedListener {
            val password = binding.loginpassword.text.toString().trim()
            binding.loginBtn.enable(it.toString().isNotEmpty() && password.isNotEmpty())
        }



        binding.loginpassword.addTextChangedListener {
            val email = binding.loginemail.text.toString().trim()
            binding.loginBtn.enable(it.toString().isNotEmpty() && email.isNotEmpty())
        }



        binding.loginBtn.setOnClickListener {
            login()


        }

        signuptext.setOnClickListener {
            findNavController().navigate(LoginDirections.actionLoginToRegister())
        }

    }


    private fun login() {
        val email = binding.loginemail.text.toString().trim()
        val password = binding.loginpassword.text.toString().trim()
        binding.loginprogressbar.visible(true)
        viewModel.login(email, password)
    }

    override fun getViewModel() = AuthViewModel::class.java

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() =
        AuthRepository(remoteDataSource.buildApi(AuthApi::class.java), userPreferences)

}
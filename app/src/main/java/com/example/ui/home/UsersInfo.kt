package com.example.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.network.Resources
import com.example.network.UserApi
import com.example.reglogapi.databinding.FragmentUsersInfoBinding
import com.example.repository.UserRepository
import com.example.responses.User
import com.example.ui.base.Basefragment
import com.example.ui.visible
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

class UsersInfo : Basefragment<HomeViewModel, FragmentUsersInfoBinding, UserRepository>() {

    override fun getViewModel() = HomeViewModel::class.java

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentUsersInfoBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): UserRepository {
        val token = runBlocking { userPreferences.authtoken.first() }
        val api = remoteDataSource.buildApi(UserApi::class.java, token)
        return UserRepository(api)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (savedInstanceState == null) {
            viewModel.getUser()
        }

        binding.userinfoprogressbar.visible(false)
        viewModel.user.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resources.Success -> {
                    binding.userinfoprogressbar.visible(false)
                    upDateUi(it.value.user)
                }
                is Resources.loading -> {
                    binding.userinfoprogressbar.visible(true)
                }
            }
        })


        binding.userinfologoutbtn.setOnClickListener {
            binding.userinfoprogressbar.visible(true)
            logout()
        }


    }


    private fun upDateUi(user: User) {
        with(binding) {
            useriddisplay.text = user.id.toString()
            useremaildisplay.text = user.email
            usernamedisplay.text = user.name
        }
    }


}



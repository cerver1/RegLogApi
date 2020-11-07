package com.example.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.example.data.UserPreferences
import com.example.network.RemoteDataSource
import com.example.network.UserApi
import com.example.repository.BaseRepository
import com.example.ui.auth.AuthActivity
import com.example.ui.startNewActivity
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

abstract class Basefragment<VM : BaseViewModel, B : ViewBinding, R : BaseRepository> : Fragment() {


    protected lateinit var binding: B
    protected var remoteDataSource = RemoteDataSource()
    protected lateinit var viewModel: VM
    protected lateinit var userPreferences: UserPreferences


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userPreferences = UserPreferences(requireContext())
        binding = getViewBinding(inflater, container)
        val factory = ViewModelFactory(getFragmentRepository())
        viewModel = ViewModelProvider(this, factory).get(getViewModel())

        lifecycleScope.launch {
            userPreferences.authtoken.first()
        }



        return binding.root
    }

    fun logout() = lifecycleScope.launch {
        val token = userPreferences.authtoken.first()
        val api = remoteDataSource.buildApi(UserApi::class.java, token)
        viewModel.logout(api)
        requireActivity().startNewActivity(AuthActivity::class.java)
        userPreferences.clear()
    }


    abstract fun getViewModel(): Class<VM>

    abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): B

    abstract fun getFragmentRepository(): R


}
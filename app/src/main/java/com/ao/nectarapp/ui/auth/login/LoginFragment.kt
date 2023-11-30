package com.ao.nectarapp.ui.auth.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ao.nectarapp.R
import com.ao.nectarapp.databinding.FragmentLoginBinding
import com.ao.nectarapp.utils.extensions.disableBackButton
import com.ao.nectarapp.utils.extensions.hideKeyboard
import com.ao.nectarapp.utils.extensions.to


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        this.disableBackButton()
        binding.linearLayoutLogin.hideKeyboard()
        navigateToSignup()
        return binding.root
    }

    private fun navigateToSignup(){
        binding.loginSignupText.setOnClickListener {
            Navigation.to(it,R.id.login_to_signup)
        }
    }
}
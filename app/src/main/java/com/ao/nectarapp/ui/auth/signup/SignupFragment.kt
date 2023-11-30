package com.ao.nectarapp.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.ao.nectarapp.R
import com.ao.nectarapp.databinding.FragmentSignupBinding
import com.ao.nectarapp.utils.extensions.disableBackButton
import com.ao.nectarapp.utils.extensions.hideKeyboard
import com.ao.nectarapp.utils.extensions.to

class SignupFragment : Fragment() {
    private lateinit var binding: FragmentSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignupBinding.inflate(inflater)
        this.disableBackButton()
        binding.linearLayoutSignup.hideKeyboard()
        navigateToLogin()
        return binding.root
    }

    private fun navigateToLogin() {
        binding.signupLoginText.setOnClickListener {
            Navigation.to(it, R.id.signup_to_login)
        }
    }
}
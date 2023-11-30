package com.ao.nectarapp.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ao.nectarapp.R
import com.ao.nectarapp.databinding.FragmentOnboardingBinding
import com.ao.nectarapp.utils.extensions.to

class OnboardingFragment : Fragment() {
    private lateinit var binding: FragmentOnboardingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater)
        navigateToSignup()
        return binding.root
    }

    private fun navigateToSignup() {
        binding.onboardGetstartedButton.setOnClickListener {
            Navigation.to(it, R.id.onboarding_to_signup)
        }
    }
}
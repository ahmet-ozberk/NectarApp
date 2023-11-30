package com.ao.nectarapp.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ao.nectarapp.R
import com.ao.nectarapp.databinding.FragmentSplashBinding
import com.ao.nectarapp.utils.extensions.to

class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater)
        navigateToOnboarding()
        return binding.root
    }

    private fun navigateToOnboarding(){
        Handler(Looper.getMainLooper()).postDelayed({
            Navigation.to(binding.root, R.id.splash_to_onboarding)
        }, 1000)
    }

}
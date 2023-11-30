package com.ao.nectarapp.utils.extensions

import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

// Navigation
fun Navigation.to(it:View, id:Int) = findNavController(it).navigate(id)
fun Navigation.to(it:View, id:NavDirections) = findNavController(it).navigate(id)
fun Navigation.back(it:View) = findNavController(it).popBackStack()
fun Navigation.back(it:View, id:Int) = findNavController(it).popBackStack(id, false)
fun Fragment.disableBackButton() = requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)


private val callback = object : OnBackPressedCallback(true) {
    override fun handleOnBackPressed() {}
}
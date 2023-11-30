package com.ao.nectarapp.utils.extensions

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

// Hide keyboard
fun View.hideKeyboard() {
    setOnClickListener {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
        clearFocus()
    }
}
package com.omar_aly.todo_list.extensions

import com.google.android.material.textfield.TextInputLayout


fun TextInputLayout.clearError() {
    error = null
    isErrorEnabled = false
}

package com.omar_aly.todo_list.databinding

import android.view.View
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter

@BindingAdapter("tagColor")
fun bindTagColor(imageView: ImageView, @ColorRes resId: Int) {
    imageView.setColorFilter(ContextCompat.getColor(imageView.context, resId))
}

@BindingAdapter("tagColorView")
fun bindTagColorView(view: View, @ColorRes resId: Int) {
    view.setBackgroundResource(resId)
}

@BindingAdapter("isVisible")
fun bindVisibility(view: View, visible: Boolean) {
    view.isVisible = visible
}

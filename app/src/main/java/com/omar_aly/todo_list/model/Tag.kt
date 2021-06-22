package com.omar_aly.todo_list.model

import androidx.annotation.ColorRes
import com.omar_aly.todo_list.R

enum class Tag(
    @ColorRes val resId: Int
) {
    GRAY(R.color.gray),

    PINK(R.color.pink),

    RED(R.color.red),

    INDIGO(R.color.indigo),

    BLUE(R.color.blue),

    TEAL(R.color.teal),

    GREEN(R.color.green),

    LIME(R.color.lime),

    YELLOW(R.color.yellow),

    AMBER(R.color.amber),

    ORANGE(R.color.orange),

    BROWN(R.color.brown);
}

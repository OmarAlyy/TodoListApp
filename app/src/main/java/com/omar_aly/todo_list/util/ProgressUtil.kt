package com.omar_aly.todo_list.util

import androidx.annotation.IntRange
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.model.TodoState


object ProgressUtil {

    fun getTasksDoneProgress(list: List<Todo?>): Int =
        list.takeUnless { it.isEmpty() }?.let {
            ((it.filter { task -> task?.state == TodoState.DONE }.size / it.size.toDouble()) * 100).toInt()
        } ?: 0

    fun getPercentage(@IntRange(from = 0, to = 100) progress: Int) =
        progress.takeIf { it in 0..100 }?.let { "$it%" } ?: "-%"
}

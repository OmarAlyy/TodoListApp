package com.omar_aly.todo_list.model

data class Todo(
    val id: Int = 0,
    val name: String,
    val description: String?,
    val time: String?,
    val remind10: Boolean?,
    val state: TodoState,
    val tag: Tag?
)

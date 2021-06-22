package com.omar_aly.todo_list.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.TodoState

@Entity(
    tableName = "Todo",
)
data class TodoEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    var name: String,
    var description: String?,
    var time: String?,
    var remind10: Boolean?,
    var state: TodoState,
    var tag: Tag?
)

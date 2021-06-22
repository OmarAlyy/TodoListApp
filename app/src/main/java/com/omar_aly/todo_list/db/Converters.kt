package com.omar_aly.todo_list.db

import androidx.room.TypeConverter
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.TodoState

class Converters {

    @TypeConverter
    fun toTaskState(name: String?): TodoState =
        name?.let { enumValueOf<TodoState>(it) } ?: TodoState.DOING

    @TypeConverter
    fun toString(tag: Tag?): String? = tag?.name


    @TypeConverter
    fun toString(todoState: TodoState?): String? = todoState?.name

    @TypeConverter
    fun toTag(name: String?): Tag = name?.let { enumValueOf<Tag>(it) } ?: Tag.GRAY


}

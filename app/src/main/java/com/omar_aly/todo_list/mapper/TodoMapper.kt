package com.omar_aly.todo_list.mapper

import com.omar_aly.todo_list.db.entity.TodoEntity
import com.omar_aly.todo_list.model.Todo


object TodoMapper {
    fun TodoEntity?.toDomain(): Todo? = this?.let {
        Todo(
            id = it.id,
            name = it.name,
            description = it.description,
            state = it.state,
            time = it.time,
            remind10 = it.remind10,
            tag = it.tag,
        )
    }

    fun Todo?.toEntity(): TodoEntity? = this?.let {
        TodoEntity(
            id = it.id,
            name = it.name,
            description = it.description,
            state = it.state,
            time = it.time,
            remind10 = it.remind10,
            tag = it.tag,
        )
    }
}

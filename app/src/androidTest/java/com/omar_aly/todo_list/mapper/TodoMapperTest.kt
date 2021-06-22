package com.omar_aly.todo_list.mapper

import com.omar_aly.todo_list.db.entity.TodoEntity
import com.omar_aly.todo_list.mapper.TodoMapper.toDomain
import com.omar_aly.todo_list.mapper.TodoMapper.toEntity
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.model.TodoState
import org.junit.Assert
import org.junit.Test
import java.lang.Boolean

class TodoMapperTest {
     @Test
    fun testToDomain() {
        val result = TodoEntity(
            0,
            "name",
            "description",
            "time",
            Boolean.TRUE,
            TodoState.DOING,
            Tag.GRAY
        ).toDomain()
        Assert.assertEquals(
            Todo(
                0,
                "name",
                "description",
                "time",
                Boolean.TRUE,
                TodoState.DOING,
                Tag.GRAY
            ), result
        )
    }

    @Test
    fun testToEntity() {
        val result = Todo(
            0,
            "name",
            "description",
            "time",
            Boolean.TRUE,
            TodoState.DOING,
            Tag.GRAY
        ).toEntity()
        Assert.assertEquals(
            TodoEntity(
                0,
                "name",
                "description",
                "time",
                Boolean.TRUE,
                TodoState.DOING,
                Tag.GRAY
            ), result
        )
    }
}
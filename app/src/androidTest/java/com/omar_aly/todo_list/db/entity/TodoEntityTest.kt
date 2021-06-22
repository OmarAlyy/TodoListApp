package com.omar_aly.todo_list.db.entity

import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.TodoState
import org.junit.Assert
import org.junit.Test
import java.lang.Boolean

class TodoEntityTest {
    var todoEntity =
        TodoEntity(0, "name", "description", "10000000", Boolean.TRUE, TodoState.DOING, Tag.GRAY)

    @Test
    fun testGetId() {
        val result = todoEntity.id
        Assert.assertEquals(0, result.toLong())
    }

    @Test
    fun testSetId() {
        todoEntity.id = 0
    }

    @Test
    fun testGetName() {
        val result = todoEntity.name
        Assert.assertEquals("name", result)
    }

    @Test
    fun testSetName() {
        todoEntity.name = "name"
    }

    @Test
    fun testGetDescription() {
        val result = todoEntity.description
        Assert.assertEquals("description", result)
    }

    @Test
    fun testSetDescription() {
        todoEntity.description = "description"
    }

    @Test
    fun testGetTime() {
        val result = todoEntity.time
        Assert.assertEquals("10000000", result)
    }

    @Test
    fun testSetTime() {
        todoEntity.time = "time"
    }

    @Test
    fun testGetRemind10() {
        val result = todoEntity.remind10
        Assert.assertEquals(Boolean.TRUE, result)
    }

    @Test
    fun testSetRemind10() {
        todoEntity.remind10 = Boolean.TRUE
    }

    @Test
    fun testGetState() {
        val result = todoEntity.state
        Assert.assertEquals(TodoState.DOING, result)
    }

    @Test
    fun testSetState() {
        todoEntity.state = TodoState.DOING
    }

    @Test
    fun testGetTag() {
        val result = todoEntity.tag
        Assert.assertEquals(Tag.GRAY, result)
    }

    @Test
    fun testSetTag() {
        todoEntity.tag = Tag.GRAY
    }






}
package com.omar_aly.todo_list.repository

import com.omar_aly.todo_list.db.AppDatabase_Impl
import com.omar_aly.todo_list.db.dao.TodoDao_Impl
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.model.TodoState
import io.reactivex.disposables.CompositeDisposable
import org.junit.Assert
import org.junit.Test
import java.lang.Boolean

class TaskRepositoryTest {



    private val taskRepository = TaskRepository(TodoDao_Impl(AppDatabase_Impl()), CompositeDisposable())



    @Test
    fun testGetAllTasks() {
        val result = taskRepository!!.getAllTasks()
        Assert.assertEquals(null, result)
    }

    @Test
    fun testGetTask() {
        val result = taskRepository!!.getTask(0)
        Assert.assertEquals(null, result)
    }

    @Test
    fun testDeleteTask() {
        taskRepository!!.deleteTask(0)
    }

    @Test
    fun testUpdateTask() {
        taskRepository!!.updateTask(
            Todo(
                0,
                "name",
                "description",
                "time",
                Boolean.TRUE,
                TodoState.DOING,
                Tag.GRAY
            )
        )
    }

    @Test
    fun testInsert() {
        taskRepository!!.insert(
            Todo(
                0,
                "name",
                "description",
                "time",
                Boolean.TRUE,
                TodoState.DOING,
                Tag.GRAY
            )
        )
    }

    @Test
    fun testSetTaskDone() {
        taskRepository!!.setTaskDone(0)
    }

    @Test
    fun testSetTaskDoing() {
        taskRepository!!.setTaskDoing(0)
    }
}
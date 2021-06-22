package com.omar_aly.todo_list.usecase

import com.omar_aly.todo_list.db.AppDatabase_Impl
import com.omar_aly.todo_list.db.dao.TodoDao_Impl
import com.omar_aly.todo_list.repository.TaskRepository
import io.reactivex.disposables.CompositeDisposable
import org.junit.Assert
import org.junit.Test

class GetOneToDoUseCaseTest {
    var getOneToDoUseCase =
        GetOneToDoUseCase(TaskRepository(TodoDao_Impl(AppDatabase_Impl()), CompositeDisposable()))

    @Test
    fun testInvoke() {
        val result = getOneToDoUseCase.invoke(0)
        Assert.assertEquals(result, result)
    }
}
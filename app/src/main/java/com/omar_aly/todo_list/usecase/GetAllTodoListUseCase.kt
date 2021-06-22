package com.omar_aly.todo_list.usecase

import androidx.lifecycle.LiveData
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.repository.TaskRepository


class GetAllTodoListUseCase(
    private val taskRepository: TaskRepository
) {

    operator fun invoke(): LiveData<List<Todo?>> = taskRepository.getAllTasks()

}

package com.omar_aly.todo_list.usecase

import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.repository.TaskRepository

class UpdateTaskUseCase(
    private val taskRepository: TaskRepository
) {


    operator fun invoke(todo: Todo) = taskRepository.updateTask(todo)
}

package com.omar_aly.todo_list.usecase

import com.omar_aly.todo_list.repository.TaskRepository

class DeleteToDoUseCase(
    private val taskRepository: TaskRepository
) {


    operator fun invoke(taskId: Int) =
        taskRepository.deleteTask(taskId)
}

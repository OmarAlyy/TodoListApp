package com.omar_aly.todo_list.usecase

import com.omar_aly.todo_list.repository.TaskRepository


class SetTaskDoingUseCase(
    private val taskRepository: TaskRepository
) {


    operator fun invoke(id: Int) = taskRepository.setTaskDoing(id)
}

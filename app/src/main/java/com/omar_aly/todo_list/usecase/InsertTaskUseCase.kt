package com.omar_aly.todo_list.usecase

import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.model.TodoState
import com.omar_aly.todo_list.repository.TaskRepository


class InsertTaskUseCase(
    private val taskRepository: TaskRepository
) {


    operator fun invoke(
        name: String,
        description: String,
        tag: Tag,
        time: String,
        remind10: Boolean,
        todoState: TodoState
    ): Unit =
        taskRepository.insert(
            Todo(
                name = name,
                description = description,
                tag = tag,
                time = time,
                remind10 = remind10,
                state = todoState
            )
        )

}

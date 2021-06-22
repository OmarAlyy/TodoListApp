package com.omar_aly.todo_list.di

import com.omar_aly.todo_list.repository.TaskRepository
import com.omar_aly.todo_list.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideDeleteTaskUseCase(
        taskRepository: TaskRepository
    ) = DeleteToDoUseCase(taskRepository)

    @Provides
    @ViewModelScoped
    fun provideGetTaskUseCase(
        taskRepository: TaskRepository
    ) = GetOneToDoUseCase(taskRepository)

    @Provides
    @ViewModelScoped
    fun provideInsertTaskUseCase(
        taskRepository: TaskRepository
    ) = InsertTaskUseCase(taskRepository)


    @Provides
    @ViewModelScoped
    fun provideUpdateTaskUseCase(
        taskRepository: TaskRepository
    ) = UpdateTaskUseCase(taskRepository)


    @Provides
    @ViewModelScoped
    fun provideGetAllTasksUseCase(
        taskRepository: TaskRepository
    ) = GetAllTodoListUseCase(taskRepository)


    @Provides
    @ViewModelScoped
    fun provideSetTaskDoingUseCase(
        taskRepository: TaskRepository
    ) = SetTaskDoingUseCase(taskRepository)

    @Provides
    @ViewModelScoped
    fun provideSetTaskDoneUseCase(
        taskRepository: TaskRepository
    ) = SetTaskDoneUseCase(taskRepository)


}

package com.omar_aly.todo_list.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/omar_aly/todo_list/di/UseCaseModule;", "", "()V", "provideDeleteTaskUseCase", "Lcom/omar_aly/todo_list/usecase/DeleteToDoUseCase;", "taskRepository", "Lcom/omar_aly/todo_list/repository/TaskRepository;", "provideGetAllTasksUseCase", "Lcom/omar_aly/todo_list/usecase/GetAllTodoListUseCase;", "provideGetTaskUseCase", "Lcom/omar_aly/todo_list/usecase/GetOneToDoUseCase;", "provideInsertTaskUseCase", "Lcom/omar_aly/todo_list/usecase/InsertTaskUseCase;", "provideSetTaskDoingUseCase", "Lcom/omar_aly/todo_list/usecase/SetTaskDoingUseCase;", "provideSetTaskDoneUseCase", "Lcom/omar_aly/todo_list/usecase/SetTaskDoneUseCase;", "provideUpdateTaskUseCase", "Lcom/omar_aly/todo_list/usecase/UpdateTaskUseCase;", "app_debug"})
@dagger.Module()
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.todo_list.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.DeleteToDoUseCase provideDeleteTaskUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.GetOneToDoUseCase provideGetTaskUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.InsertTaskUseCase provideInsertTaskUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.UpdateTaskUseCase provideUpdateTaskUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.GetAllTodoListUseCase provideGetAllTasksUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.SetTaskDoingUseCase provideSetTaskDoingUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.omar_aly.todo_list.usecase.SetTaskDoneUseCase provideSetTaskDoneUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        return null;
    }
}
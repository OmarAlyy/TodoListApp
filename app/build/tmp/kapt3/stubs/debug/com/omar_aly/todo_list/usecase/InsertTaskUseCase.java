package com.omar_aly.todo_list.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/omar_aly/todo_list/usecase/InsertTaskUseCase;", "", "taskRepository", "Lcom/omar_aly/todo_list/repository/TaskRepository;", "(Lcom/omar_aly/todo_list/repository/TaskRepository;)V", "invoke", "", "name", "", "description", "tag", "Lcom/omar_aly/todo_list/model/Tag;", "time", "remind10", "", "todoState", "Lcom/omar_aly/todo_list/model/TodoState;", "app_debug"})
public final class InsertTaskUseCase {
    private final com.omar_aly.todo_list.repository.TaskRepository taskRepository = null;
    
    public InsertTaskUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.repository.TaskRepository taskRepository) {
        super();
    }
    
    public final void invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.Tag tag, @org.jetbrains.annotations.NotNull()
    java.lang.String time, boolean remind10, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.TodoState todoState) {
    }
}
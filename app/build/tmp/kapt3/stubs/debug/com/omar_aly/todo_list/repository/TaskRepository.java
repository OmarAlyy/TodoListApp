package com.omar_aly.todo_list.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fJ\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/omar_aly/todo_list/repository/TaskRepository;", "", "todoDao", "Lcom/omar_aly/todo_list/db/dao/TodoDao;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/omar_aly/todo_list/db/dao/TodoDao;Lio/reactivex/disposables/CompositeDisposable;)V", "deleteTask", "", "id", "", "getAllTasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/omar_aly/todo_list/model/Todo;", "getTask", "insert", "todo", "setTaskDoing", "setTaskDone", "updateTask", "app_debug"})
public final class TaskRepository {
    private final com.omar_aly.todo_list.db.dao.TodoDao todoDao = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public TaskRepository(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.db.dao.TodoDao todoDao, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.omar_aly.todo_list.model.Todo>> getAllTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.omar_aly.todo_list.model.Todo> getTask(int id) {
        return null;
    }
    
    public final void deleteTask(int id) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.Todo todo) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.Todo todo) {
    }
    
    public final void setTaskDone(int id) {
    }
    
    public final void setTaskDoing(int id) {
    }
}
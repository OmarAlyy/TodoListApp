package com.omar_aly.todo_list.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/omar_aly/todo_list/di/RepositoryModule;", "", "()V", "provideTaskRepository", "Lcom/omar_aly/todo_list/repository/TaskRepository;", "todoDao", "Lcom/omar_aly/todo_list/db/dao/TodoDao;", "composite", "Lio/reactivex/disposables/CompositeDisposable;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.todo_list.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.omar_aly.todo_list.repository.TaskRepository provideTaskRepository(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.db.dao.TodoDao todoDao, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable composite) {
        return null;
    }
}
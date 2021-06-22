package com.omar_aly.todo_list.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/omar_aly/todo_list/db/Converters;", "", "()V", "toString", "", "tag", "Lcom/omar_aly/todo_list/model/Tag;", "todoState", "Lcom/omar_aly/todo_list/model/TodoState;", "toTag", "name", "toTaskState", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.omar_aly.todo_list.model.TodoState toTaskState(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    com.omar_aly.todo_list.model.Tag tag) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    com.omar_aly.todo_list.model.TodoState todoState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.omar_aly.todo_list.model.Tag toTag(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
}
package com.omar_aly.todo_list.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0007H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/omar_aly/todo_list/db/dao/TodoDao;", "", "deleteTask", "", "id", "", "getTask", "Lio/reactivex/Flowable;", "Lcom/omar_aly/todo_list/db/entity/TodoEntity;", "getTasks", "", "insertTask", "", "todo", "setTaskDoing", "setTaskDone", "updateTask", "app_debug"})
public abstract interface TodoDao {
    
    @androidx.room.Query(value = "DELETE FROM Todo WHERE id = :id")
    public abstract void deleteTask(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Todo WHERE id = :id")
    public abstract io.reactivex.Flowable<com.omar_aly.todo_list.db.entity.TodoEntity> getTask(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Todo ORDER BY id ASC")
    public abstract io.reactivex.Flowable<java.util.List<com.omar_aly.todo_list.db.entity.TodoEntity>> getTasks();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertTask(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.db.entity.TodoEntity todo);
    
    @androidx.room.Query(value = "UPDATE Todo SET state = \'DOING\' WHERE id = :id")
    public abstract void setTaskDoing(int id);
    
    @androidx.room.Query(value = "UPDATE Todo SET state = \'DONE\' WHERE id = :id")
    public abstract void setTaskDone(int id);
    
    @androidx.room.Update()
    public abstract void updateTask(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.db.entity.TodoEntity todo);
}
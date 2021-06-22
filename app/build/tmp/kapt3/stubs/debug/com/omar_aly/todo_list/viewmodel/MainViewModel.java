package com.omar_aly.todo_list.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00130\u0012J\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ6\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\u001bJ\u000e\u0010\n\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\b\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/omar_aly/todo_list/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getOneToDo", "Lcom/omar_aly/todo_list/usecase/GetOneToDoUseCase;", "insertTask", "Lcom/omar_aly/todo_list/usecase/InsertTaskUseCase;", "deleteToDo", "Lcom/omar_aly/todo_list/usecase/DeleteToDoUseCase;", "updateTask", "Lcom/omar_aly/todo_list/usecase/UpdateTaskUseCase;", "setTaskDoing", "Lcom/omar_aly/todo_list/usecase/SetTaskDoingUseCase;", "setTaskDone", "Lcom/omar_aly/todo_list/usecase/SetTaskDoneUseCase;", "getTodoList", "Lcom/omar_aly/todo_list/usecase/GetAllTodoListUseCase;", "(Lcom/omar_aly/todo_list/usecase/GetOneToDoUseCase;Lcom/omar_aly/todo_list/usecase/InsertTaskUseCase;Lcom/omar_aly/todo_list/usecase/DeleteToDoUseCase;Lcom/omar_aly/todo_list/usecase/UpdateTaskUseCase;Lcom/omar_aly/todo_list/usecase/SetTaskDoingUseCase;Lcom/omar_aly/todo_list/usecase/SetTaskDoneUseCase;Lcom/omar_aly/todo_list/usecase/GetAllTodoListUseCase;)V", "getAllTasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/omar_aly/todo_list/model/Todo;", "getGetAllTasks", "()Landroidx/lifecycle/LiveData;", "mTriggerFetchData", "Landroidx/lifecycle/MutableLiveData;", "", "deleteTask", "", "id", "", "getTask", "name", "", "description", "tag", "Lcom/omar_aly/todo_list/model/Tag;", "time", "remind10", "todoState", "Lcom/omar_aly/todo_list/model/TodoState;", "loadTasks", "todo", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.omar_aly.todo_list.usecase.GetOneToDoUseCase getOneToDo = null;
    private final com.omar_aly.todo_list.usecase.InsertTaskUseCase insertTask = null;
    private final com.omar_aly.todo_list.usecase.DeleteToDoUseCase deleteToDo = null;
    private final com.omar_aly.todo_list.usecase.UpdateTaskUseCase updateTask = null;
    private final com.omar_aly.todo_list.usecase.SetTaskDoingUseCase setTaskDoing = null;
    private final com.omar_aly.todo_list.usecase.SetTaskDoneUseCase setTaskDone = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> mTriggerFetchData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.omar_aly.todo_list.model.Todo>> getAllTasks = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.GetOneToDoUseCase getOneToDo, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.InsertTaskUseCase insertTask, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.DeleteToDoUseCase deleteToDo, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.UpdateTaskUseCase updateTask, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.SetTaskDoingUseCase setTaskDoing, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.SetTaskDoneUseCase setTaskDone, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.usecase.GetAllTodoListUseCase getTodoList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.omar_aly.todo_list.model.Todo> getTask(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.omar_aly.todo_list.model.Todo>> getGetAllTasks() {
        return null;
    }
    
    public final void insertTask(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.Tag tag, @org.jetbrains.annotations.NotNull()
    java.lang.String time, boolean remind10, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.TodoState todoState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.omar_aly.todo_list.model.Todo>> getAllTasks() {
        return null;
    }
    
    public final void deleteTask(int id) {
    }
    
    public final void setTaskDone(int id) {
    }
    
    public final void setTaskDoing(int id) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.model.Todo todo) {
    }
    
    public final void loadTasks() {
    }
}
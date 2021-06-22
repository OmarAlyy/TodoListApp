package com.omar_aly.todo_list.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/omar_aly/todo_list/model/Todo;", "Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$ViewHolder;", "()V", "taskClickListener", "Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$TaskClickListener;", "getTaskClickListener", "()Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$TaskClickListener;", "setTaskClickListener", "(Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$TaskClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TaskClickListener", "ViewHolder", "app_debug"})
public final class TodoAdapter extends androidx.recyclerview.widget.ListAdapter<com.omar_aly.todo_list.model.Todo, com.omar_aly.todo_list.ui.adapter.TodoAdapter.ViewHolder> {
    public com.omar_aly.todo_list.ui.adapter.TodoAdapter.TaskClickListener taskClickListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.todo_list.ui.adapter.TodoAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.omar_aly.todo_list.model.Todo> DIFF_CALLBACK = null;
    
    public TodoAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.todo_list.ui.adapter.TodoAdapter.TaskClickListener getTaskClickListener() {
        return null;
    }
    
    public final void setTaskClickListener(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.ui.adapter.TodoAdapter.TaskClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.omar_aly.todo_list.ui.adapter.TodoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.ui.adapter.TodoAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/omar_aly/todo_list/databinding/ItemTodoBinding;", "context", "Landroid/content/Context;", "(Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter;Lcom/omar_aly/todo_list/databinding/ItemTodoBinding;Landroid/content/Context;)V", "bind", "", "todo", "Lcom/omar_aly/todo_list/model/Todo;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.omar_aly.todo_list.databinding.ItemTodoBinding binding = null;
        private final android.content.Context context = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.databinding.ItemTodoBinding binding, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.model.Todo todo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$TaskClickListener;", "", "onTaskClick", "", "taskId", "", "card", "Lcom/google/android/material/card/MaterialCardView;", "onTaskDoingClick", "todo", "Lcom/omar_aly/todo_list/model/Todo;", "onTaskDoneClick", "app_debug"})
    public static abstract interface TaskClickListener {
        
        public abstract void onTaskClick(int taskId, @org.jetbrains.annotations.NotNull()
        com.google.android.material.card.MaterialCardView card);
        
        public abstract void onTaskDoneClick(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.model.Todo todo);
        
        public abstract void onTaskDoingClick(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.model.Todo todo);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TodoAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/omar_aly/todo_list/model/Todo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
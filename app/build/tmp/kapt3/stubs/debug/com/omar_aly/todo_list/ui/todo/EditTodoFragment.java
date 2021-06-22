package com.omar_aly.todo_list.ui.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00105\u001a\u00020*H\u0002J\u0010\u00105\u001a\u00020*2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000207H\u0002J\b\u00109\u001a\u000207H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/omar_aly/todo_list/ui/todo/EditTodoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/omar_aly/todo_list/ui/todo/EditTodoFragmentArgs;", "getArgs", "()Lcom/omar_aly/todo_list/ui/todo/EditTodoFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/omar_aly/todo_list/databinding/EditTodoFragmentBinding;", "<set-?>", "", "currentTime", "getCurrentTime", "()J", "setCurrentTime", "(J)V", "currentTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "customCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCustomCalendar", "()Ljava/util/Calendar;", "customTime", "getCustomTime", "setCustomTime", "customTime$delegate", "mainViewModel", "Lcom/omar_aly/todo_list/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/omar_aly/todo_list/viewmodel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "selectedTag", "Lcom/omar_aly/todo_list/model/Tag;", "tags", "", "todo", "Lcom/omar_aly/todo_list/model/Todo;", "editTask", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setTimer", "remindBefore10", "", "validateTaskName", "validateTime", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EditTodoFragment extends androidx.fragment.app.Fragment {
    private com.omar_aly.todo_list.databinding.EditTodoFragmentBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.omar_aly.todo_list.model.Todo todo;
    private com.omar_aly.todo_list.model.Tag selectedTag;
    private final java.util.List<com.omar_aly.todo_list.model.Tag> tags = null;
    private final kotlin.properties.ReadWriteProperty currentTime$delegate = null;
    private final kotlin.properties.ReadWriteProperty customTime$delegate = null;
    private final java.util.Calendar customCalendar = null;
    private java.util.HashMap _$_findViewCache;
    
    public EditTodoFragment() {
        super();
    }
    
    private final com.omar_aly.todo_list.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    private final com.omar_aly.todo_list.ui.todo.EditTodoFragmentArgs getArgs() {
        return null;
    }
    
    private final long getCurrentTime() {
        return 0L;
    }
    
    private final void setCurrentTime(long p0) {
    }
    
    private final long getCustomTime() {
        return 0L;
    }
    
    private final void setCustomTime(long p0) {
    }
    
    public final java.util.Calendar getCustomCalendar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean validateTime() {
        return false;
    }
    
    private final void setTimer(boolean remindBefore10) {
    }
    
    private final void setTimer() {
    }
    
    private final boolean validateTaskName() {
        return false;
    }
    
    private final void editTask() {
    }
}
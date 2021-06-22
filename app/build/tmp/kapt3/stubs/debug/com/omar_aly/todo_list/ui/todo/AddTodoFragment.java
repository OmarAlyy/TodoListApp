package com.omar_aly.todo_list.ui.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J$\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020#H\u0016J\u001a\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u000202H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0019\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/omar_aly/todo_list/ui/todo/AddTodoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/omar_aly/todo_list/databinding/AddTodoFragmentBinding;", "binding", "getBinding", "()Lcom/omar_aly/todo_list/databinding/AddTodoFragmentBinding;", "<set-?>", "", "currentTime", "getCurrentTime", "()J", "setCurrentTime", "(J)V", "currentTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "customCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCustomCalendar", "()Ljava/util/Calendar;", "customTime", "getCustomTime", "setCustomTime", "customTime$delegate", "mainViewModel", "Lcom/omar_aly/todo_list/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/omar_aly/todo_list/viewmodel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "selectedTag", "Lcom/omar_aly/todo_list/model/Tag;", "createTask", "", "insertTask", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setTimer", "remindBefore10", "", "validateTaskName", "validateTime", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddTodoFragment extends androidx.fragment.app.Fragment {
    private final kotlin.properties.ReadWriteProperty currentTime$delegate = null;
    private final kotlin.properties.ReadWriteProperty customTime$delegate = null;
    private final java.util.Calendar customCalendar = null;
    private com.omar_aly.todo_list.databinding.AddTodoFragmentBinding _binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.omar_aly.todo_list.model.Tag selectedTag = com.omar_aly.todo_list.model.Tag.GRAY;
    private java.util.HashMap _$_findViewCache;
    
    public AddTodoFragment() {
        super();
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
    
    private final com.omar_aly.todo_list.databinding.AddTodoFragmentBinding getBinding() {
        return null;
    }
    
    private final com.omar_aly.todo_list.viewmodel.MainViewModel getMainViewModel() {
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
    
    private final void createTask() {
    }
    
    private final void setTimer(boolean remindBefore10) {
    }
    
    private final boolean validateTaskName() {
        return false;
    }
    
    private final boolean validateTime() {
        return false;
    }
    
    private final void insertTask() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}
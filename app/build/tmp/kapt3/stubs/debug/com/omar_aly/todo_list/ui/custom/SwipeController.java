package com.omar_aly.todo_list.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J@\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0014H\u0016J \u0010+\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%H\u0016J\u0018\u0010-\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\fH\u0016J(\u0010/\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/omar_aly/todo_list/ui/custom/SwipeController;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "swipeControllerActions", "Lcom/omar_aly/todo_list/ui/custom/SwipeController$SwipeControllerActions;", "(Landroid/content/Context;Lcom/omar_aly/todo_list/ui/custom/SwipeController$SwipeControllerActions;)V", "background", "Landroid/graphics/drawable/PaintDrawable;", "clearPaint", "Landroid/graphics/Paint;", "colorBackground", "", "getContext", "()Landroid/content/Context;", "deleteDrawable", "Landroid/graphics/drawable/Drawable;", "intrinsicHeight", "intrinsicWidth", "swipeBack", "", "clearCanvas", "", "c", "Landroid/graphics/Canvas;", "left", "", "top", "right", "bottom", "convertToAbsoluteDirection", "flags", "layoutDirection", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onChildDraw", "dX", "dY", "actionState", "isCurrentlyActive", "onMove", "target", "onSwiped", "direction", "setTouchListener", "SwipeControllerActions", "app_debug"})
public final class SwipeController extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.omar_aly.todo_list.ui.custom.SwipeController.SwipeControllerActions swipeControllerActions = null;
    private boolean swipeBack = false;
    private android.graphics.Paint clearPaint;
    private android.graphics.drawable.PaintDrawable background;
    private int colorBackground;
    private android.graphics.drawable.Drawable deleteDrawable;
    private int intrinsicWidth;
    private int intrinsicHeight;
    
    public SwipeController(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.ui.custom.SwipeController.SwipeControllerActions swipeControllerActions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    private final void clearCanvas(android.graphics.Canvas c, float left, float top, float right, float bottom) {
    }
    
    @java.lang.Override()
    public int convertToAbsoluteDirection(int flags, int layoutDirection) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setTouchListener(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/omar_aly/todo_list/ui/custom/SwipeController$SwipeControllerActions;", "", "onDelete", "", "position", "", "app_debug"})
    public static abstract interface SwipeControllerActions {
        
        public abstract void onDelete(int position);
    }
}
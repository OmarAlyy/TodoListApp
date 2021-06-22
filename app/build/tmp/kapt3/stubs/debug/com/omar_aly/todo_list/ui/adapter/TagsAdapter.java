package com.omar_aly.todo_list.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0006\u0010\u0014\u001a\u00020\u0005J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter$ViewHolder;", "items", "", "Lcom/omar_aly/todo_list/model/Tag;", "(Ljava/util/List;)V", "listener", "Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter$Listener;", "getListener", "()Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter$Listener;", "setListener", "(Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter$Listener;)V", "tagSelectedPosition", "", "getTagSelectedPosition", "()I", "setTagSelectedPosition", "(I)V", "getItemCount", "getTagSelected", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "ViewHolder", "app_debug"})
public final class TagsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.omar_aly.todo_list.ui.adapter.TagsAdapter.ViewHolder> {
    private final java.util.List<com.omar_aly.todo_list.model.Tag> items = null;
    private int tagSelectedPosition = 0;
    @org.jetbrains.annotations.Nullable()
    private com.omar_aly.todo_list.ui.adapter.TagsAdapter.Listener listener;
    
    public TagsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.omar_aly.todo_list.model.Tag> items) {
        super();
    }
    
    public final int getTagSelectedPosition() {
        return 0;
    }
    
    public final void setTagSelectedPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.omar_aly.todo_list.ui.adapter.TagsAdapter.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.omar_aly.todo_list.ui.adapter.TagsAdapter.Listener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.omar_aly.todo_list.ui.adapter.TagsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.omar_aly.todo_list.ui.adapter.TagsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.todo_list.model.Tag getTagSelected() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/omar_aly/todo_list/databinding/ItemTagBinding;", "(Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter;Lcom/omar_aly/todo_list/databinding/ItemTagBinding;)V", "bind", "", "tag", "Lcom/omar_aly/todo_list/model/Tag;", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.omar_aly.todo_list.databinding.ItemTagBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.databinding.ItemTagBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.model.Tag tag, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/omar_aly/todo_list/ui/adapter/TagsAdapter$Listener;", "", "onTagClick", "", "tag", "Lcom/omar_aly/todo_list/model/Tag;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onTagClick(@org.jetbrains.annotations.NotNull()
        com.omar_aly.todo_list.model.Tag tag);
    }
}
package com.omar_aly.todo_list.databinding;
import com.omar_aly.todo_list.R;
import com.omar_aly.todo_list.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTodoBindingImpl extends ItemTodoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.task_card, 4);
        sViewsWithIds.put(R.id.task_name_text_view, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTodoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemTodoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.FrameLayout) bindings[0]
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (android.view.View) bindings[1]
            );
        this.checkTaskButton.setTag(null);
        this.container.setTag(null);
        this.taskDescriptionTextView.setTag(null);
        this.taskTagColor.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.todo == variableId) {
            setTodo((com.omar_aly.todo_list.model.Todo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTodo(@Nullable com.omar_aly.todo_list.model.Todo Todo) {
        this.mTodo = Todo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.todo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int todoTagResId = 0;
        android.graphics.drawable.Drawable todoStateTodoStateDOINGCheckTaskButtonAndroidDrawableIcCheck24dpCheckTaskButtonAndroidDrawableIcReplay24dp = null;
        com.omar_aly.todo_list.model.Tag todoTag = null;
        boolean todoStateTodoStateDOING = false;
        com.omar_aly.todo_list.model.Todo todo = mTodo;
        java.lang.String todoDescription = null;
        com.omar_aly.todo_list.model.TodoState todoState = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (todo != null) {
                    // read todo.tag
                    todoTag = todo.getTag();
                    // read todo.description
                    todoDescription = todo.getDescription();
                    // read todo.state
                    todoState = todo.getState();
                }


                if (todoTag != null) {
                    // read todo.tag.resId
                    todoTagResId = todoTag.getResId();
                }
                // read todo.state == TodoState.DOING
                todoStateTodoStateDOING = (todoState) == (com.omar_aly.todo_list.model.TodoState.DOING);
            if((dirtyFlags & 0x3L) != 0) {
                if(todoStateTodoStateDOING) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read todo.state == TodoState.DOING ? @android:drawable/ic_check_24dp : @android:drawable/ic_replay_24dp
                todoStateTodoStateDOINGCheckTaskButtonAndroidDrawableIcCheck24dpCheckTaskButtonAndroidDrawableIcReplay24dp = ((todoStateTodoStateDOING) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(checkTaskButton.getContext(), R.drawable.ic_check_24dp)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(checkTaskButton.getContext(), R.drawable.ic_replay_24dp)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.checkTaskButton, todoStateTodoStateDOINGCheckTaskButtonAndroidDrawableIcCheck24dpCheckTaskButtonAndroidDrawableIcReplay24dp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDescriptionTextView, todoDescription);
            com.omar_aly.todo_list.databinding.BindingAdaptersKt.bindTagColorView(this.taskTagColor, todoTagResId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): todo
        flag 1 (0x2L): null
        flag 2 (0x3L): todo.state == TodoState.DOING ? @android:drawable/ic_check_24dp : @android:drawable/ic_replay_24dp
        flag 3 (0x4L): todo.state == TodoState.DOING ? @android:drawable/ic_check_24dp : @android:drawable/ic_replay_24dp
    flag mapping end*/
    //end
}
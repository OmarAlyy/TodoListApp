package com.omar_aly.todo_list.databinding;
import com.omar_aly.todo_list.R;
import com.omar_aly.todo_list.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ShowTodoDetailsFragmentBindingImpl extends ShowTodoDetailsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 5);
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.toolbar_title, 7);
        sViewsWithIds.put(R.id.edit, 8);
        sViewsWithIds.put(R.id.task_card, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ShowTodoDetailsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ShowTodoDetailsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (android.view.View) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            );
        this.coordinator.setTag(null);
        this.taskDescription.setTag(null);
        this.taskNameTextView.setTag(null);
        this.taskTagColor.setTag(null);
        this.taskTimeTextView.setTag(null);
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
        java.lang.String todoDescriptionLengthInt0TodoDescriptionTaskDescriptionAndroidStringNoDescription = null;
        int todoTagResId = 0;
        int todoDescriptionLength = 0;
        com.omar_aly.todo_list.model.Tag todoTag = null;
        com.omar_aly.todo_list.model.Todo todo = mTodo;
        java.lang.String todoDescription = null;
        boolean todoDescriptionLengthInt0 = false;
        java.lang.String todoName = null;
        java.lang.String todoTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (todo != null) {
                    // read todo.tag
                    todoTag = todo.getTag();
                    // read todo.description
                    todoDescription = todo.getDescription();
                    // read todo.name
                    todoName = todo.getName();
                    // read todo.time
                    todoTime = todo.getTime();
                }


                if (todoTag != null) {
                    // read todo.tag.resId
                    todoTagResId = todoTag.getResId();
                }
                if (todoDescription != null) {
                    // read todo.description.length()
                    todoDescriptionLength = todoDescription.length();
                }


                // read todo.description.length() > 0
                todoDescriptionLengthInt0 = (todoDescriptionLength) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(todoDescriptionLengthInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read todo.description.length() > 0 ? todo.description : @android:string/no_description
                todoDescriptionLengthInt0TodoDescriptionTaskDescriptionAndroidStringNoDescription = ((todoDescriptionLengthInt0) ? (todoDescription) : (taskDescription.getResources().getString(R.string.no_description)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDescription, todoDescriptionLengthInt0TodoDescriptionTaskDescriptionAndroidStringNoDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskNameTextView, todoName);
            com.omar_aly.todo_list.databinding.BindingAdaptersKt.bindTagColorView(this.taskTagColor, todoTagResId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskTimeTextView, todoTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): todo
        flag 1 (0x2L): null
        flag 2 (0x3L): todo.description.length() > 0 ? todo.description : @android:string/no_description
        flag 3 (0x4L): todo.description.length() > 0 ? todo.description : @android:string/no_description
    flag mapping end*/
    //end
}
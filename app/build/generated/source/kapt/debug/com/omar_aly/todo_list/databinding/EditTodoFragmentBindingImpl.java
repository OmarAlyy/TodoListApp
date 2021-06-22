package com.omar_aly.todo_list.databinding;
import com.omar_aly.todo_list.R;
import com.omar_aly.todo_list.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditTodoFragmentBindingImpl extends EditTodoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.task_name_input, 4);
        sViewsWithIds.put(R.id.task_description_input, 5);
        sViewsWithIds.put(R.id.time_p, 6);
        sViewsWithIds.put(R.id.tag_list, 7);
        sViewsWithIds.put(R.id.edit, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EditTodoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private EditTodoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (android.widget.CheckBox) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.omar_aly.todo_list.ui.custom.TimePickerCustom) bindings[6]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.remind10MinutesCheck.setTag(null);
        this.taskDescriptionEditText.setTag(null);
        this.taskNameEditText.setTag(null);
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
        com.omar_aly.todo_list.model.Todo todo = mTodo;
        java.lang.String todoDescription = null;
        java.lang.String todoName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxTodoRemind10 = false;
        java.lang.Boolean todoRemind10 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (todo != null) {
                    // read todo.description
                    todoDescription = todo.getDescription();
                    // read todo.name
                    todoName = todo.getName();
                    // read todo.remind10
                    todoRemind10 = todo.getRemind10();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(todo.remind10)
                androidxDatabindingViewDataBindingSafeUnboxTodoRemind10 = androidx.databinding.ViewDataBinding.safeUnbox(todoRemind10);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.remind10MinutesCheck, androidxDatabindingViewDataBindingSafeUnboxTodoRemind10);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDescriptionEditText, todoDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskNameEditText, todoName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): todo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
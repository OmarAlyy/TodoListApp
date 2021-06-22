package com.omar_aly.todo_list.databinding;
import com.omar_aly.todo_list.R;
import com.omar_aly.todo_list.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTagBindingImpl extends ItemTagBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTagBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemTagBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.FrameLayout) bindings[0]
            );
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.tagColor.setTag(null);
        this.tagColorItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.isSelected == variableId) {
            setIsSelected((java.lang.Boolean) variable);
        }
        else if (BR.tag == variableId) {
            setTag((com.omar_aly.todo_list.model.Tag) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsSelected(@Nullable java.lang.Boolean IsSelected) {
        this.mIsSelected = IsSelected;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isSelected);
        super.requestRebind();
    }
    public void setTag(@Nullable com.omar_aly.todo_list.model.Tag Tag) {
        this.mTag = Tag;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tag);
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
        java.lang.Boolean isSelected = mIsSelected;
        int tagResId = 0;
        com.omar_aly.todo_list.model.Tag tag = mTag;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSelected = false;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSelected)
                androidxDatabindingViewDataBindingSafeUnboxIsSelected = androidx.databinding.ViewDataBinding.safeUnbox(isSelected);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (tag != null) {
                    // read tag.resId
                    tagResId = tag.getResId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.omar_aly.todo_list.databinding.BindingAdaptersKt.bindVisibility(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxIsSelected);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.omar_aly.todo_list.databinding.BindingAdaptersKt.bindTagColor(this.tagColor, tagResId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isSelected
        flag 1 (0x2L): tag
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
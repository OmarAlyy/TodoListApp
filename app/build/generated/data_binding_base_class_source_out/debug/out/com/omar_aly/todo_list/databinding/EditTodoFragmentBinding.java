// Generated by data binding compiler. Do not edit!
package com.omar_aly.todo_list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.omar_aly.todo_list.R;
import com.omar_aly.todo_list.model.Todo;
import com.omar_aly.todo_list.ui.custom.TimePickerCustom;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EditTodoFragmentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton edit;

  @NonNull
  public final CheckBox remind10MinutesCheck;

  @NonNull
  public final RecyclerView tagList;

  @NonNull
  public final TextInputEditText taskDescriptionEditText;

  @NonNull
  public final TextInputLayout taskDescriptionInput;

  @NonNull
  public final TextInputEditText taskNameEditText;

  @NonNull
  public final TextInputLayout taskNameInput;

  @NonNull
  public final TimePickerCustom timeP;

  @Bindable
  protected Todo mTodo;

  protected EditTodoFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton edit, CheckBox remind10MinutesCheck, RecyclerView tagList,
      TextInputEditText taskDescriptionEditText, TextInputLayout taskDescriptionInput,
      TextInputEditText taskNameEditText, TextInputLayout taskNameInput, TimePickerCustom timeP) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edit = edit;
    this.remind10MinutesCheck = remind10MinutesCheck;
    this.tagList = tagList;
    this.taskDescriptionEditText = taskDescriptionEditText;
    this.taskDescriptionInput = taskDescriptionInput;
    this.taskNameEditText = taskNameEditText;
    this.taskNameInput = taskNameInput;
    this.timeP = timeP;
  }

  public abstract void setTodo(@Nullable Todo todo);

  @Nullable
  public Todo getTodo() {
    return mTodo;
  }

  @NonNull
  public static EditTodoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_todo_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EditTodoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EditTodoFragmentBinding>inflateInternal(inflater, R.layout.edit_todo_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EditTodoFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_todo_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EditTodoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EditTodoFragmentBinding>inflateInternal(inflater, R.layout.edit_todo_fragment, null, false, component);
  }

  public static EditTodoFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EditTodoFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EditTodoFragmentBinding)bind(component, view, R.layout.edit_todo_fragment);
  }
}
package com.omar_aly.todo_list;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.omar_aly.todo_list.databinding.EditTodoFragmentBindingImpl;
import com.omar_aly.todo_list.databinding.ItemTagBindingImpl;
import com.omar_aly.todo_list.databinding.ItemTodoBindingImpl;
import com.omar_aly.todo_list.databinding.ShowTodoDetailsFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_EDITTODOFRAGMENT = 1;

  private static final int LAYOUT_ITEMTAG = 2;

  private static final int LAYOUT_ITEMTODO = 3;

  private static final int LAYOUT_SHOWTODODETAILSFRAGMENT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.todo_list.R.layout.edit_todo_fragment, LAYOUT_EDITTODOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.todo_list.R.layout.item_tag, LAYOUT_ITEMTAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.todo_list.R.layout.item_todo, LAYOUT_ITEMTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.todo_list.R.layout.show_todo_details_fragment, LAYOUT_SHOWTODODETAILSFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_EDITTODOFRAGMENT: {
          if ("layout/edit_todo_fragment_0".equals(tag)) {
            return new EditTodoFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for edit_todo_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTAG: {
          if ("layout/item_tag_0".equals(tag)) {
            return new ItemTagBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_tag is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTODO: {
          if ("layout/item_todo_0".equals(tag)) {
            return new ItemTodoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_todo is invalid. Received: " + tag);
        }
        case  LAYOUT_SHOWTODODETAILSFRAGMENT: {
          if ("layout/show_todo_details_fragment_0".equals(tag)) {
            return new ShowTodoDetailsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for show_todo_details_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isSelected");
      sKeys.put(2, "tag");
      sKeys.put(3, "todo");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/edit_todo_fragment_0", com.omar_aly.todo_list.R.layout.edit_todo_fragment);
      sKeys.put("layout/item_tag_0", com.omar_aly.todo_list.R.layout.item_tag);
      sKeys.put("layout/item_todo_0", com.omar_aly.todo_list.R.layout.item_todo);
      sKeys.put("layout/show_todo_details_fragment_0", com.omar_aly.todo_list.R.layout.show_todo_details_fragment);
    }
  }
}

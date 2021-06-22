package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.omar_aly.todo_list.DataBinderMapperImpl());
  }
}

package com.omar_aly.todo_list.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.omar_aly.todo_list.db.Converters;
import com.omar_aly.todo_list.db.entity.TodoEntity;
import com.omar_aly.todo_list.model.Tag;
import com.omar_aly.todo_list.model.TodoState;
import io.reactivex.Flowable;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoDao_Impl implements TodoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoEntity> __insertionAdapterOfTodoEntity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<TodoEntity> __updateAdapterOfTodoEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTask;

  private final SharedSQLiteStatement __preparedStmtOfSetTaskDoing;

  private final SharedSQLiteStatement __preparedStmtOfSetTaskDone;

  public TodoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoEntity = new EntityInsertionAdapter<TodoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Todo` (`id`,`name`,`description`,`time`,`remind10`,`state`,`tag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTime());
        }
        final Integer _tmp;
        _tmp = value.getRemind10() == null ? null : (value.getRemind10() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.toString(value.getState());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converters.toString(value.getTag());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_2);
        }
      }
    };
    this.__updateAdapterOfTodoEntity = new EntityDeletionOrUpdateAdapter<TodoEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Todo` SET `id` = ?,`name` = ?,`description` = ?,`time` = ?,`remind10` = ?,`state` = ?,`tag` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTime());
        }
        final Integer _tmp;
        _tmp = value.getRemind10() == null ? null : (value.getRemind10() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.toString(value.getState());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converters.toString(value.getTag());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_2);
        }
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfDeleteTask = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Todo WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetTaskDoing = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Todo SET state = 'DOING' WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetTaskDone = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Todo SET state = 'DONE' WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertTask(final TodoEntity todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTodoEntity.insertAndReturnId(todo);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTask(final TodoEntity todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTodoEntity.handle(todo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTask(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTask.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTask.release(_stmt);
    }
  }

  @Override
  public void setTaskDoing(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetTaskDoing.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetTaskDoing.release(_stmt);
    }
  }

  @Override
  public void setTaskDone(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetTaskDone.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetTaskDone.release(_stmt);
    }
  }

  @Override
  public Flowable<TodoEntity> getTask(final int id) {
    final String _sql = "SELECT * FROM Todo WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createFlowable(__db, false, new String[]{"Todo"}, new Callable<TodoEntity>() {
      @Override
      public TodoEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfRemind10 = CursorUtil.getColumnIndexOrThrow(_cursor, "remind10");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "tag");
          final TodoEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final Boolean _tmpRemind10;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfRemind10)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfRemind10);
            }
            _tmpRemind10 = _tmp == null ? null : _tmp != 0;
            final TodoState _tmpState;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfState);
            }
            _tmpState = __converters.toTaskState(_tmp_1);
            final Tag _tmpTag;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfTag)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfTag);
            }
            _tmpTag = __converters.toTag(_tmp_2);
            _result = new TodoEntity(_tmpId,_tmpName,_tmpDescription,_tmpTime,_tmpRemind10,_tmpState,_tmpTag);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<TodoEntity>> getTasks() {
    final String _sql = "SELECT * FROM Todo ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"Todo"}, new Callable<List<TodoEntity>>() {
      @Override
      public List<TodoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfRemind10 = CursorUtil.getColumnIndexOrThrow(_cursor, "remind10");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "tag");
          final List<TodoEntity> _result = new ArrayList<TodoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TodoEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final Boolean _tmpRemind10;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfRemind10)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfRemind10);
            }
            _tmpRemind10 = _tmp == null ? null : _tmp != 0;
            final TodoState _tmpState;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfState);
            }
            _tmpState = __converters.toTaskState(_tmp_1);
            final Tag _tmpTag;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfTag)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfTag);
            }
            _tmpTag = __converters.toTag(_tmp_2);
            _item = new TodoEntity(_tmpId,_tmpName,_tmpDescription,_tmpTime,_tmpRemind10,_tmpState,_tmpTag);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

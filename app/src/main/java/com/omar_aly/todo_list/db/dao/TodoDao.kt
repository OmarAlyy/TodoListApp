package com.omar_aly.todo_list.db.dao

import androidx.room.*
import com.omar_aly.todo_list.db.entity.TodoEntity
import io.reactivex.Flowable

@Dao
interface TodoDao {


    @Query("DELETE FROM Todo WHERE id = :id")
    fun deleteTask(id: Int)

    @Query("SELECT * FROM Todo WHERE id = :id")
    fun getTask(id: Int): Flowable<TodoEntity>

    @Query("SELECT * FROM Todo ORDER BY id ASC")
    fun getTasks(): Flowable<List<TodoEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertTask(todo: TodoEntity): Long

    @Query("UPDATE Todo SET state = 'DOING' WHERE id = :id")
    fun setTaskDoing(id: Int)

    @Query("UPDATE Todo SET state = 'DONE' WHERE id = :id")
    fun setTaskDone(id: Int)

    @Update
    fun updateTask(todo: TodoEntity)
}

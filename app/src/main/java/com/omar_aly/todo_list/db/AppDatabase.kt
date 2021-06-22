package com.omar_aly.todo_list.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.omar_aly.todo_list.db.dao.TodoDao
import com.omar_aly.todo_list.db.entity.TodoEntity

@Database(entities = [TodoEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TodoDao

}
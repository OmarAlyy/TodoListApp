package com.omar_aly.todo_list.di

import android.content.Context
import androidx.room.Room
import com.omar_aly.todo_list.app.Constants
import com.omar_aly.todo_list.db.AppDatabase
import com.omar_aly.todo_list.db.dao.TodoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideBlogDb(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context, AppDatabase::class.java,
            Constants.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideBlogDAO(database: AppDatabase): TodoDao {
        return database.taskDao()
    }

    @Provides
    fun provideCompositeDisposable() = CompositeDisposable()


}
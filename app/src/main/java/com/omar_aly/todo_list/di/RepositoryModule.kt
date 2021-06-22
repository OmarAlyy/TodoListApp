package com.omar_aly.todo_list.di


import com.omar_aly.todo_list.db.dao.TodoDao
import com.omar_aly.todo_list.repository.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTaskRepository(todoDao: TodoDao, composite: CompositeDisposable) =
        TaskRepository(todoDao, composite)


}

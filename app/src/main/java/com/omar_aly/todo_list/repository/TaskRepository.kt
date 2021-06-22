package com.omar_aly.todo_list.repository


import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.map
import com.omar_aly.todo_list.db.dao.TodoDao
import com.omar_aly.todo_list.mapper.TodoMapper.toDomain
import com.omar_aly.todo_list.mapper.TodoMapper.toEntity
import com.omar_aly.todo_list.model.Todo
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class TaskRepository(
    private val todoDao: TodoDao,
    private val compositeDisposable: CompositeDisposable
) {


    fun getAllTasks(): LiveData<List<Todo?>> {
        return LiveDataReactiveStreams.fromPublisher(
            todoDao.getTasks()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.computation())
        ).map { list ->
            list.map { it.toDomain() }
        }
    }

    fun getTask(id: Int): LiveData<Todo?> {
        return LiveDataReactiveStreams.fromPublisher(
            todoDao.getTask(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.computation())
        ).map { it.toDomain() }
    }


    fun deleteTask(id: Int) {
        compositeDisposable.add(Observable.fromCallable { todoDao.deleteTask(id) }
            .subscribeOn(Schedulers.computation())
            .subscribe())
    }


    fun updateTask(todo: Todo) {
        compositeDisposable.add(Observable.fromCallable {
            todo.toEntity()?.let { todoDao.updateTask(it) }
        }
            .subscribeOn(Schedulers.computation())
            .subscribe())
    }

    fun insert(todo: Todo) {
        compositeDisposable.add(Observable.fromCallable {
            todo.toEntity()?.let {
                todoDao.insertTask(
                    it
                )
            }
        }
            .subscribeOn(Schedulers.computation())
            .subscribe())
    }

    fun setTaskDone(id: Int) {
        compositeDisposable.add(Observable.fromCallable { todoDao.setTaskDone(id) }
            .subscribeOn(Schedulers.computation())
            .subscribe())
    }

    fun setTaskDoing(id: Int) {
        compositeDisposable.add(Observable.fromCallable { todoDao.setTaskDoing(id) }
            .subscribeOn(Schedulers.computation())
            .subscribe())
    }


}


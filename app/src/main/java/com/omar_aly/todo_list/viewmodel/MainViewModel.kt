package com.omar_aly.todo_list.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.model.TodoState
import com.omar_aly.todo_list.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(

    private val getOneToDo: GetOneToDoUseCase,
    private val insertTask: InsertTaskUseCase,
    private val deleteToDo: DeleteToDoUseCase,
    private val updateTask: UpdateTaskUseCase,
    private val setTaskDoing: SetTaskDoingUseCase,
    private val setTaskDone: SetTaskDoneUseCase,
    getTodoList: GetAllTodoListUseCase,

    ) : ViewModel() {

    private var mTriggerFetchData = MutableLiveData<Boolean>()


    fun getTask(id: Int): LiveData<Todo?> = getOneToDo.invoke(id)


    val getAllTasks: LiveData<List<Todo?>> = Transformations.switchMap(mTriggerFetchData) {
        getTodoList.invoke()
    }

    fun insertTask(
        name: String,
        description: String,
        tag: Tag,
        time: String,
        remind10: Boolean,
        todoState: TodoState
    ) {
        insertTask.invoke(name, description, tag, time, remind10, todoState)
    }


    fun getAllTasks(): LiveData<List<Todo?>> {
        return getAllTasks
    }

    fun deleteTask(id: Int) {
        deleteToDo.invoke(id)
    }


    fun setTaskDone(id: Int) {
        setTaskDone.invoke(id)
    }

    fun setTaskDoing(id: Int) {
        setTaskDoing.invoke(id)
    }

    fun updateTask(todo: Todo) {
        updateTask.invoke(todo)
    }

    fun loadTasks() {
        mTriggerFetchData.value = true
    }


}

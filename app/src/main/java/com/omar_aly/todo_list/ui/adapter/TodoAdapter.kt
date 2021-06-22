package com.omar_aly.todo_list.ui.adapter

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.omar_aly.todo_list.databinding.ItemTodoBinding
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.model.TodoState


class TodoAdapter : ListAdapter<Todo, TodoAdapter.ViewHolder>(DIFF_CALLBACK) {
    lateinit var taskClickListener: TaskClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemTodoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            parent.context
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    inner class ViewHolder(private val binding: ItemTodoBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(todo: Todo) {
            binding.todo = todo
            binding.taskCard.transitionName = todo.id.toString()
            if (todo.state == TodoState.DOING) {
                binding.checkTaskButton.setOnClickListener {
                    taskClickListener.onTaskDoneClick(todo)
                }
                binding.taskNameTextView.text = todo.name
            } else {
                binding.checkTaskButton.setOnClickListener {
                    taskClickListener.onTaskDoingClick(todo)
                }
                val spannableString = SpannableString(todo.name)
                spannableString.setSpan(
                    StrikethroughSpan(),
                    0,
                    spannableString.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                binding.taskNameTextView.text = spannableString
            }
            binding.taskCard.setOnClickListener {
                taskClickListener.onTaskClick(todo.id, binding.taskCard)
            }
        }
    }

    companion object {
        private val DIFF_CALLBACK = object :
            DiffUtil.ItemCallback<Todo>() {

            override fun areItemsTheSame(oldTodo: Todo, newTodo: Todo) =
                oldTodo.id == newTodo.id

            override fun areContentsTheSame(oldTodo: Todo, newTodo: Todo) =
                oldTodo == newTodo
        }
    }

    interface TaskClickListener {
        fun onTaskClick(taskId: Int, card: MaterialCardView)
        fun onTaskDoneClick(todo: Todo)
        fun onTaskDoingClick(todo: Todo)
    }
}

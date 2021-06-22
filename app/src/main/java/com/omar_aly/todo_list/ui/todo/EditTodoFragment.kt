package com.omar_aly.todo_list.ui.todo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.work.Data
import com.omar_aly.todo_list.R
import com.omar_aly.todo_list.app.Constants
import com.omar_aly.todo_list.databinding.EditTodoFragmentBinding
import com.omar_aly.todo_list.extensions.clearError
import com.omar_aly.todo_list.extensions.hideSoftKeyboard
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.ui.adapter.TagsAdapter
import com.omar_aly.todo_list.viewmodel.MainViewModel
import com.omar_aly.todo_list.work.NotificationBuilder
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.add_todo_fragment.time_p
import kotlinx.android.synthetic.main.edit_todo_fragment.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.properties.Delegates

@AndroidEntryPoint
class EditTodoFragment : Fragment() {
    private lateinit var binding: EditTodoFragmentBinding

    private val mainViewModel by viewModels<MainViewModel>()

    private val args: EditTodoFragmentArgs by navArgs()

    private var todo: Todo? = null

    private var selectedTag: Tag? = null


    private val tags = enumValues<Tag>().toList()

    private var currentTime by Delegates.notNull<Long>()

    private var customTime by Delegates.notNull<Long>()

    val customCalendar = Calendar.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.edit_todo_fragment, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //  NavigationUI.setupWithNavController(binding.toolbar, findNavController())

        binding.tagList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        mainViewModel.getTask(args.taskId).observe(
            viewLifecycleOwner,
            {
                todo = it
                binding.todo = todo
                todo?.tag?.let { tag ->
                    val selected = tags.indexOf(tag)
                    selectedTag = tag
                    binding.tagList.adapter = TagsAdapter(tags).apply {
                        tagSelectedPosition = selected
                        listener = TagsAdapter.Listener {
                            selectedTag = it
                        }
                    }
                    binding.tagList.scrollToPosition(selected)
                }
            }
        )
        edit.setOnClickListener {
            if (validateTaskName() && validateTime()) {
                setTimer(binding.remind10MinutesCheck.isChecked)
                editTask()
            }


        }

    }

    private fun validateTime(): Boolean {

        customCalendar.set(
            customCalendar[Calendar.YEAR],
            customCalendar[Calendar.MONTH],
            customCalendar[Calendar.DAY_OF_MONTH],
            time_p.hour,
            time_p.minute,
            0
        )
        customTime = customCalendar.timeInMillis
        currentTime = System.currentTimeMillis()

        return if (binding.remind10MinutesCheck.isChecked && (customTime - currentTime) < TimeUnit.MINUTES.toMillis(
                9
            )
        ) {
            Toast.makeText(
                context,
                "The specified time is not 10 minutes greater than the current time. Please choose another time",
                Toast.LENGTH_LONG
            ).show()
            false
        } else true
    }


    private fun setTimer(remindBefore10: Boolean) {
        try {

            if (customTime > currentTime) {
                val data = Data.Builder().putInt(Constants.NOTIFICATION_ID, customTime.toInt())
                    .putString(Constants.TASK_NAME, binding.taskNameEditText.text.toString())
                    .build()
                val delay = customTime - currentTime
                if (remindBefore10) {
                    val beforeDelay10 = delay - TimeUnit.MINUTES.toMillis(10)
                    context?.let {
                        NotificationBuilder.scheduleNotification(
                            it,
                            beforeDelay10,
                            data
                        )
                    }
                } else
                    context?.let { NotificationBuilder.scheduleNotification(it, delay, data) }
            }


        } catch (e: Exception) {
        }
    }


    private fun setTimer() {

        try {
            customCalendar.set(
                customCalendar[Calendar.YEAR],
                customCalendar[Calendar.MONTH],
                customCalendar[Calendar.DAY_OF_MONTH],
                time_p.hour,
                time_p.minute,
                0
            )
            val customTime = customCalendar.timeInMillis
            val currentTime = System.currentTimeMillis()
            if (customTime > currentTime) {
                val data = Data.Builder().putInt(Constants.NOTIFICATION_ID, 0)
                    .putString(Constants.TASK_NAME, binding.taskNameEditText.text.toString())
                    .build()
                val delay = customTime - currentTime
                context?.let { NotificationBuilder.scheduleNotification(it, delay, data) }
            }
        } catch (e: Exception) {
        }
    }

    private fun validateTaskName(): Boolean {
        binding.taskNameInput.clearError()
        return if (binding.taskNameEditText.text.isNullOrBlank()) {
            binding.taskNameInput.error = getString(R.string.must_be_not_empty)
            false
        } else true
    }

    private fun editTask() {
        val description = binding.taskDescriptionEditText.text.toString()
        val remind10 = binding.remind10MinutesCheck.isChecked

        val titleNotificationSchedule = getString(R.string.notification_schedule_title)
        val patternNotificationSchedule = getString(R.string.notification_schedule_pattern)
        val time =
            titleNotificationSchedule + SimpleDateFormat(
                patternNotificationSchedule, Locale.getDefault()
            ).format(customCalendar.time).toString()

        Log.e("timetimetime", time)
        todo?.let {
            mainViewModel.updateTask(
                Todo(
                    it.id,
                    binding.taskNameEditText.text.toString(),
                    binding.taskDescriptionEditText.text.toString(),
                    time,
                    remind10,
                    it.state,
                    selectedTag
                )
            )
            activity?.hideSoftKeyboard()
            findNavController().navigateUp()
        }
    }
}

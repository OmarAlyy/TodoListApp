package com.omar_aly.todo_list.ui.todo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.work.Data
import com.omar_aly.todo_list.R
import com.omar_aly.todo_list.app.Constants
import com.omar_aly.todo_list.app.Constants.NOTIFICATION_ID
import com.omar_aly.todo_list.databinding.AddTodoFragmentBinding
import com.omar_aly.todo_list.extensions.clearError
import com.omar_aly.todo_list.extensions.hideSoftKeyboard
import com.omar_aly.todo_list.model.Tag
import com.omar_aly.todo_list.model.TodoState
import com.omar_aly.todo_list.ui.adapter.TagsAdapter
import com.omar_aly.todo_list.viewmodel.MainViewModel
import com.omar_aly.todo_list.work.NotificationBuilder
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.add_todo_fragment.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.properties.Delegates


@AndroidEntryPoint
class AddTodoFragment : Fragment() {
    private var currentTime by Delegates.notNull<Long>()
    private var customTime by Delegates.notNull<Long>()
    val customCalendar = Calendar.getInstance()

    private var _binding: AddTodoFragmentBinding? = null
    private val binding get() = _binding!!

    private val mainViewModel by viewModels<MainViewModel>()

    private var selectedTag = Tag.GRAY

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AddTodoFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        NavigationUI.setupWithNavController(binding.toolbar, findNavController())

        binding.tagList.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = TagsAdapter(enumValues<Tag>().toList()).apply {
                listener = TagsAdapter.Listener {
                    selectedTag = it
                }
            }
        }

        save.setOnClickListener {
            createTask()
        }
    }

    private fun createTask() {
        if (validateTaskName() && validateTime()) {
            setTimer(binding.remind10MinutesCheck.isChecked)
            insertTask()
        }
    }


    private fun setTimer(remindBefore10: Boolean) {
        try {

            if (customTime > currentTime) {
                val data = Data.Builder().putInt(NOTIFICATION_ID, customTime.toInt())
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

    private fun validateTaskName(): Boolean {
        binding.taskNameInput.clearError()
        return if (binding.taskNameEditText.text.isNullOrBlank()) {
            binding.taskNameInput.error = getString(R.string.must_be_not_empty)
            false
        } else true
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

    private fun insertTask() {
        val name = binding.taskNameEditText.text.toString()
        val description = binding.taskDescriptionEditText.text.toString()
        val remind10 = binding.remind10MinutesCheck.isChecked
        val titleNotificationSchedule = getString(R.string.notification_schedule_title)
        val patternNotificationSchedule = getString(R.string.notification_schedule_pattern)
        val time =
            titleNotificationSchedule + SimpleDateFormat(
                patternNotificationSchedule, Locale.getDefault()
            ).format(customCalendar.time).toString()



        mainViewModel.insertTask(name, description, selectedTag, time, remind10, TodoState.DOING)
        activity?.hideSoftKeyboard()
        findNavController().navigateUp()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}

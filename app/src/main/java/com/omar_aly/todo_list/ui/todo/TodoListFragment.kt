package com.omar_aly.todo_list.ui.todo

import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.card.MaterialCardView
import com.omar_aly.todo_list.R
import com.omar_aly.todo_list.databinding.TodoListFragmentBinding
import com.omar_aly.todo_list.model.Todo
import com.omar_aly.todo_list.ui.adapter.TodoAdapter
import com.omar_aly.todo_list.ui.custom.SwipeController
import com.omar_aly.todo_list.util.ProgressUtil.getTasksDoneProgress
import com.omar_aly.todo_list.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TodoListFragment : Fragment() {
    private var _binding: TodoListFragmentBinding? = null
    private val binding get() = _binding!!

    private val tasksAdapter = TodoAdapter()

    private val mainViewModel by viewModels<MainViewModel>()
    // NOTE: using Koin we can write also:
    // private val mainViewModel by lazy { getViewModel<MainViewModel>() }
    // Using fragment-ktx extension:
    // private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TodoListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postponeEnterTransition()
        mainViewModel.loadTasks()

        initTasksRecyclerView()
        initProjectSelectedObserver()
        setSwipeActions()
    }


    private fun initProjectSelectedObserver() {


        mainViewModel.getAllTasks.observe(
            viewLifecycleOwner,
            { tasks ->
                tasks?.let {
                    if (it.isEmpty()) {
                        showEmptyListIllustration()
                    } else {
                        hideEmptyListIllustration()
                    }
                    tasksAdapter.submitList(it)
                    setProgressValue(getTasksDoneProgress(it))
                }
            }
        )
    }

    private fun setProgressValue(progress: Int) {
        ObjectAnimator.ofInt(
            binding.progressBar,
            "progress",
            binding.progressBar.progress,
            progress
        ).apply {
            duration = resources.getInteger(R.integer.progress_bar_animation).toLong()
            interpolator = AccelerateInterpolator()
        }.start()
    }

    private fun showEmptyListIllustration() {
        binding.emptyList.visibility = View.VISIBLE
        removeToolbarScrollFlags()
    }

    private fun hideEmptyListIllustration() {
        binding.emptyList.visibility = View.GONE
        setToolbarScrollFlags()
    }

    private fun initTasksRecyclerView() {
        binding.tasksRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = tasksAdapter
        }
        binding.tasksRecyclerView.doOnPreDraw {
            startPostponedEnterTransition()
        }
        tasksAdapter.taskClickListener = object : TodoAdapter.TaskClickListener {
            override fun onTaskClick(taskId: Int, card: MaterialCardView) {
                val extras = FragmentNavigatorExtras(
                    card to taskId.toString()
                )
                val action = TodoListFragmentDirections.navToTask(
                    taskId = taskId
                )
                Log.e("action", "" + action)
                Log.e("extras", "" + extras)
                findNavController().navigate(action, extras)
            }

            override fun onTaskDoneClick(todo: Todo) {
                mainViewModel.setTaskDone(todo.id)
            }

            override fun onTaskDoingClick(todo: Todo) {
                mainViewModel.setTaskDoing(todo.id)
            }
        }
    }

    private fun removeToolbarScrollFlags() {
        (binding.toolbar.layoutParams as AppBarLayout.LayoutParams).scrollFlags = 0
    }

    private fun setToolbarScrollFlags() {
        (binding.toolbar.layoutParams as AppBarLayout.LayoutParams).scrollFlags =
            AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or AppBarLayout.LayoutParams.SCROLL_FLAG_SNAP or AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
    }

    private fun setSwipeActions() {
        val swipeController = SwipeController(
            requireContext(),
            object :
                SwipeController.SwipeControllerActions {
                override fun onDelete(position: Int) {
                    tasksAdapter.currentList[position]?.id?.let { taskId ->
                        mainViewModel.deleteTask(
                            taskId
                        )
                    }
                }
            }
        )
        val itemTouchHelper = ItemTouchHelper(swipeController)
        itemTouchHelper.attachToRecyclerView(binding.tasksRecyclerView)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        private const val TAG = "TodoListFragment"
    }
}

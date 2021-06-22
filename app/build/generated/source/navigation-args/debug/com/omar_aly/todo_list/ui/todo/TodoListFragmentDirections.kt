package com.omar_aly.todo_list.ui.todo

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.omar_aly.todo_list.R
import kotlin.Int

public class TodoListFragmentDirections private constructor() {
  private data class NavToTask(
    public val taskId: Int
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.navToTask

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("taskId", this.taskId)
      return result
    }
  }

  public companion object {
    public fun navToTask(taskId: Int): NavDirections = NavToTask(taskId)

    public fun navToAddTask(): NavDirections = ActionOnlyNavDirections(R.id.navToAddTask)
  }
}

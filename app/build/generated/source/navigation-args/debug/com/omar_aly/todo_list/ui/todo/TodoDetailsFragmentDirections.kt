package com.omar_aly.todo_list.ui.todo

import android.os.Bundle
import androidx.navigation.NavDirections
import com.omar_aly.todo_list.R
import kotlin.Int

public class TodoDetailsFragmentDirections private constructor() {
  private data class NavToEditTaskFragment(
    public val taskId: Int
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.navToEditTaskFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("taskId", this.taskId)
      return result
    }
  }

  public companion object {
    public fun navToEditTaskFragment(taskId: Int): NavDirections = NavToEditTaskFragment(taskId)
  }
}

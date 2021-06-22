package com.omar_aly.todo_list.ui.todo

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class TodoDetailsFragmentArgs(
  public val taskId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("taskId", this.taskId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TodoDetailsFragmentArgs {
      bundle.setClassLoader(TodoDetailsFragmentArgs::class.java.classLoader)
      val __taskId : Int
      if (bundle.containsKey("taskId")) {
        __taskId = bundle.getInt("taskId")
      } else {
        throw IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue")
      }
      return TodoDetailsFragmentArgs(__taskId)
    }
  }
}

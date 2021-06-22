package com.omar_aly.todo_list.work

import android.content.Context
import androidx.work.Data
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.omar_aly.todo_list.app.Constants.NOTIFICATION_WORK
import java.util.concurrent.TimeUnit

class NotificationBuilder {

    companion object {
        fun scheduleNotification(context: Context, delay: Long, data: Data) {
            val notificationWork = OneTimeWorkRequest.Builder(NotifyWork::class.java)
                .setInitialDelay(delay, TimeUnit.MILLISECONDS).setInputData(data).build()
            val instanceWorkManager = WorkManager.getInstance(context)
            instanceWorkManager.beginUniqueWork(
                NOTIFICATION_WORK,
                ExistingWorkPolicy.REPLACE, notificationWork
            ).enqueue()

        }
    }


}
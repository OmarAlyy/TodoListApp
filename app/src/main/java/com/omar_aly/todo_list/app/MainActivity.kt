package com.omar_aly.todo_list.app


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.omar_aly.todo_list.R
import com.omar_aly.todo_list.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController()
        setNavigation()
        create_button.setOnClickListener {
            navController().navigate(R.id.addTodoFragment)
        }
    }

    private fun navController() = findNavController(R.id.nav_host_fragment)

    private fun setNavigation() {
        navController().addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.todoListFragment -> {
                    create_button.show()

                }
                else -> {
                    create_button.hide()
                }
            }
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        return navController().navigateUp()
    }
}
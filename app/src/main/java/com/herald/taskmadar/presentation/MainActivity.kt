package com.herald.taskmadar.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.herald.taskmadar.presentation.ui.theme.TaskMadarTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskMadarTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "user_list",
                    modifier = Modifier.fillMaxSize()
                ) {
                    composable("user_list") {
                        UserListScreen(
                            onAddUser = { navController.navigate("add_user") }
                        )
                    }
                    composable("add_user") {
                        AddUserScreen(
                            onBack = {
                                navController.popBackStack()
                            }
                        )
                    }
                }
            }
        }
    }
}

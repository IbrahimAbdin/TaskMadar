package com.herald.taskmadar.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.herald.taskmadar.domain.UserModel
import com.herald.taskmadar.domain.usecases.AddUserUseCase
import com.herald.taskmadar.domain.usecases.GetUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    getUsersUseCase: GetUsersUseCase,
    private val addUserUseCase: AddUserUseCase
) : ViewModel() {

    val users: StateFlow<List<UserModel>> = getUsersUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun addUser(name: String, age: String, jobTitle: String, gender: String) {
        viewModelScope.launch {
            val user = UserModel(
                name = name,
                age = age.toIntOrNull() ?: 0,
                jobTitle = jobTitle,
                gender = gender
            )
            addUserUseCase(user)
        }
    }
}

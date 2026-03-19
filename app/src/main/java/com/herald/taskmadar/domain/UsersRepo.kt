package com.herald.taskmadar.domain

import kotlinx.coroutines.flow.Flow

interface UsersRepo {
    suspend fun addUser(user: UserModel)
    fun getUsers(): Flow<List<UserModel>>
}

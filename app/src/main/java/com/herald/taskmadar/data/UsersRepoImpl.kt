package com.herald.taskmadar.data

import com.herald.taskmadar.domain.UserModel
import com.herald.taskmadar.domain.UsersRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UsersRepoImpl @Inject constructor(private val usersDao: UserDao): UsersRepo {
    override suspend fun addUser(user: UserModel) = usersDao.insertUser(user.toUserEntity())
    override fun getUsers(): Flow<List<UserModel>> = usersDao.getAllUsers().map { it.map { userEntity -> userEntity.toUserModel() } }
}
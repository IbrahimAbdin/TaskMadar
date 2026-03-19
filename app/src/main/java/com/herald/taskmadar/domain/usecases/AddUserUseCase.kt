package com.herald.taskmadar.domain.usecases

import com.herald.taskmadar.domain.UserModel
import com.herald.taskmadar.domain.UsersRepo
import javax.inject.Inject

class AddUserUseCase @Inject constructor(private val usersRepo: UsersRepo) {
    suspend operator fun invoke(user: UserModel) = usersRepo.addUser(user)
}
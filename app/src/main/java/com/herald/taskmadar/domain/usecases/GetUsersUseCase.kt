package com.herald.taskmadar.domain.usecases

import com.herald.taskmadar.domain.UsersRepo
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(private val usersRepo: UsersRepo) {
    operator fun invoke() = usersRepo.getUsers()
}
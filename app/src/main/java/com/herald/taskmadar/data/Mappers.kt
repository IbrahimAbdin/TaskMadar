package com.herald.taskmadar.data

import com.herald.taskmadar.domain.UserModel

fun UserModel.toUserEntity(): UserEntity {
    return UserEntity(
        name = name, age = age, jobTitle = jobTitle, gender = gender
    )
}

fun UserEntity.toUserModel(): UserModel {
    return UserModel(
        name = name, age = age, jobTitle = jobTitle, gender = gender
    )
}
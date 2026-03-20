package com.herald.taskmadar.data

import com.herald.taskmadar.domain.UserModel

fun UserModel.toUserEntity(): UserEntity {
    return UserEntity(
        id = id,
        name = name,
        age = age,
        jobTitle = jobTitle,
        gender = gender
    )
}

fun UserEntity.toUserModel(): UserModel {
    return UserModel(
        id = id,
        name = name,
        age = age,
        jobTitle = jobTitle,
        gender = gender
    )
}

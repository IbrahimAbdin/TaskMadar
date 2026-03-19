package com.herald.taskmadar.di

import android.content.Context
import androidx.room.Room
import com.herald.taskmadar.data.UserDatabase
import com.herald.taskmadar.data.UserDatabase.Companion.DB_USERS_NAME
import com.herald.taskmadar.data.UsersRepoImpl
import com.herald.taskmadar.domain.UsersRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UsersModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): UserDatabase {
        return Room.databaseBuilder(
            context,
            UserDatabase::class.java,
            DB_USERS_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideUserRepository(db: UserDatabase): UsersRepo {
        return UsersRepoImpl(db.userDao())
    }
}

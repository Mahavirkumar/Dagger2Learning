package com.example.dagger2learning

import com.example.kotlin_android_concepts.FirebaseRepository
import com.example.kotlin_android_concepts.SQLRepositoty
import com.example.kotlin_android_concepts.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoryModule {
    @Binds
    abstract fun getFirebaseRepository(sqlRepositoty: SQLRepositoty):UserRepository
}
package com.example.kotlin_android_concepts

import com.example.dagger2learning.MainActivity
import com.example.dagger2learning.NotificationServiceModule
import com.example.dagger2learning.UserRepositoryModule
import dagger.Component

//whatever object we require we mention it here,if dager able to create return the obkject or
// else give compilr time error(we have to tell them that
// how dagger can create object of required class like @inject )

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

//    fun getUserRegistrationService(): UserRegistrationService
    fun inject(mainActivity: MainActivity)
}
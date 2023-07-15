package com.example.kotlin_android_concepts

import com.example.dagger2learning.MessageQualifier
import javax.inject.Inject

class UserRegistrationService @Inject constructor
    (
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@mk.com", "User Registerd")
    }
}
/*
* 4 problem: Unit Testing
* single responsiblty
* Lifetime of these objects
* Extensible
 */
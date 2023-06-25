package com.example.kotlin_android_concepts

import javax.inject.Inject

class UserRegistrationService @Inject constructor
    (
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply@mk.com", "User Registerd")
    }
}
/*
* 4 problem: Unit Testing
* single responsiblty
* Lifetime of these objects
* Extensible
 */
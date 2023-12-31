package com.example.dagger2learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_android_concepts.DaggerUserRegistrationComponent
import com.example.kotlin_android_concepts.EmailService
import com.example.kotlin_android_concepts.UserRegistrationComponent
import com.example.kotlin_android_concepts.UserRegistrationService
import com.example.kotlin_android_concepts.UserRepository
import dagger.internal.DaggerGenerated

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val userRepository= UserRepository()        //manual dependency injections,as we are creating objects of those calss
//        val emailService= EmailService()            //which require to pass
        //DaggerUserRegistrationComponent-> no need to create by ourself after build dager create this for us

        //        val userRegistrationService= UserRegistrationService(userRepository,emailService)
        val userRegistrationService =
            DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("mk@gmail.com", "111")
    }
}
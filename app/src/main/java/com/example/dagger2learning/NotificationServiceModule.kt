package com.example.dagger2learning

import com.example.kotlin_android_concepts.MessageService
import com.example.kotlin_android_concepts.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }
}
package com.example.dagger2learning

import com.example.kotlin_android_concepts.EmailService
import com.example.kotlin_android_concepts.MessageService
import com.example.kotlin_android_concepts.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @Provides
    @MessageQualifier
    fun getMessageService(retryCount:Int): NotificationService {
        return MessageService(retryCount)
    }
    @Provides
    @Named("email")
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}
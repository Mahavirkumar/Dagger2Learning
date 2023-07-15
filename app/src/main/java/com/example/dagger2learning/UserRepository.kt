package com.example.kotlin_android_concepts

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(emai: String, password: String)
}

class SQLRepositoty @Inject constructor() : UserRepository {
    override fun saveUser(emai: String, password: String) {
        Log.d(TAG, "user save in db")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(emai: String, password: String) {
        Log.d(TAG, "user save in Firebase")
    }

}
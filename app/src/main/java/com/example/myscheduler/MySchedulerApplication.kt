package com.example.myscheduler

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

// Applicationクラスを継承
class MySchedulerApplication : Application() {
    // ApplicationクラスのonCreateメソッドをオーバーライド
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder().allowWritesOnUiThread(true).build()
        Realm.setDefaultConfiguration(config)
    }
}
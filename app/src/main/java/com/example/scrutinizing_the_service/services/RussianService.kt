package com.example.scrutinizing_the_service.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.IInterface
import android.os.Parcel
import java.io.FileDescriptor

class RussianService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
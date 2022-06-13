package io.cloudwalk.pos.systemservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import io.cloudwalk.loglibrary.Log;

public class SystemService extends Service {
    private static final String
            TAG = SystemService.class.getSimpleName();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");

        return SystemAbstractionLayer.getInstance();
    }
}

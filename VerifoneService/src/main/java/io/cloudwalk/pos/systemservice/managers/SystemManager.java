package io.cloudwalk.pos.systemservice.managers;

import io.cloudwalk.loglibrary.Log;
import io.cloudwalk.pos.systemlibrary.ISystemManager;

public class SystemManager extends ISystemManager.Stub {
    private static final String
            TAG = SystemManager.class.getSimpleName();

    private static final SystemManager
            sSystemManager = new SystemManager();

    private SystemManager() {
        Log.d(TAG, "SystemManager");
    }

    public static SystemManager getInstance() {
        // Log.d(TAG, "getInstance");

        return sSystemManager;
    }
}

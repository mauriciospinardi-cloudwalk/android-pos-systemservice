package io.cloudwalk.pos.systemservice;

import android.os.Bundle;

import java.util.concurrent.Semaphore;

import io.cloudwalk.loglibrary.Log;
import io.cloudwalk.pos.systemlibrary.ISystemManager;
import io.cloudwalk.pos.systemlibrary.ISystemService;
import io.cloudwalk.pos.systemservice.managers.SystemManager;

public class SystemAbstractionLayer extends ISystemService.Stub {
    private static final String
            TAG = SystemAbstractionLayer.class.getSimpleName();

    private static final SystemAbstractionLayer
            sSystemAbstractionLayer = new SystemAbstractionLayer();

    private static final Semaphore
            sSemaphore = new Semaphore(1, true);

    /**
     * Constructor.
     */
    private SystemAbstractionLayer() {
        Log.d(TAG, "SystemAbstractionLayer");

        /* Nothing to do */
    }

    /**
     * @return {@link SystemAbstractionLayer}
     */
    public static SystemAbstractionLayer getInstance() {
        // Log.d(TAG, "getInstance");

        return sSystemAbstractionLayer;
    }

    /**
     * @return {@link ISystemManager}
     */
    @Override
    public ISystemManager getSystemManager(Bundle bundle) {
        // Log.d(TAG, "getSystemManager");

        try {
            sSemaphore.acquireUninterruptibly();

            String version = (bundle != null) ? bundle.getString("version", "") : "";

            switch (version) {
                // case...
                // case...

                default:
                    return SystemManager.getInstance();
            }
        } finally {
            sSemaphore.release();
        }
    }
}

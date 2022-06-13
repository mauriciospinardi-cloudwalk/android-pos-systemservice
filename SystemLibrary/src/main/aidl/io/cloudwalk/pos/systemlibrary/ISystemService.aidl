package io.cloudwalk.pos.systemlibrary;

import io.cloudwalk.pos.systemlibrary.ISystemManager;

interface ISystemService {
    ISystemManager getSystemManager(inout Bundle bundle);
}

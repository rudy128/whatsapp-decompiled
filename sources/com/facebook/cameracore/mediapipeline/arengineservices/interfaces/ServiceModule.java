package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.CXC;
import com.facebook.jni.HybridData;

public abstract class ServiceModule {
    public HybridData mHybridData;

    public abstract ServiceConfiguration createConfiguration(CXC cxc);
}

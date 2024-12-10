package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.BQN;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public abstract class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final BQN mConfiguration;

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);
}

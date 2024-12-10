package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.BQT;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final BQT mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }

    public MotionDataProviderConfigurationHybrid(BQT bqt) {
        this.mConfiguration = bqt;
        MotionDataSourceWrapper motionDataSourceWrapper = new MotionDataSourceWrapper(bqt.A00);
        this.mMotionDataSourceWrapper = motionDataSourceWrapper;
        this.mHybridData = initHybrid(motionDataSourceWrapper);
    }
}

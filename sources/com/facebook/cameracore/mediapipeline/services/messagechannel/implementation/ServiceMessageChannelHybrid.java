package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.C24532C8d;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class ServiceMessageChannelHybrid extends ServiceConfiguration {
    public static final C24532C8d Companion = new Object();

    public static final native HybridData initHybrid(ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid, int i);
}

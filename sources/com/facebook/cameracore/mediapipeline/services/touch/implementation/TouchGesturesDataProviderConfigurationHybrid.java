package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.BQV;
import X.C24538C8j;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class TouchGesturesDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C24538C8j Companion = new Object();
    public final BQV configuration;
    public final TouchGesturesDelegateWrapper delegate;

    public static final native HybridData initHybrid(TouchGesturesDelegateWrapper touchGesturesDelegateWrapper);

    public TouchGesturesDataProviderConfigurationHybrid(BQV bqv) {
        this.configuration = bqv;
        TouchGesturesDelegateWrapper touchGesturesDelegateWrapper = new TouchGesturesDelegateWrapper();
        this.delegate = touchGesturesDelegateWrapper;
        bqv.A00.A03.add(touchGesturesDelegateWrapper);
        this.mHybridData = initHybrid(touchGesturesDelegateWrapper);
    }
}

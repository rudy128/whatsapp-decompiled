package com.facebook.cameracore.mediapipeline.services.avatars;

import X.AnonymousClass1A8;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class AvatarsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AvatarsDataProviderConfigurationHybrid $redex_init_class = null;

    public static native HybridData initHybrid(String str, String str2, int i, AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge, AvatarsNativeInputDelegate avatarsNativeInputDelegate);

    static {
        AnonymousClass1A8.A06("avatarsdataprovider");
    }
}

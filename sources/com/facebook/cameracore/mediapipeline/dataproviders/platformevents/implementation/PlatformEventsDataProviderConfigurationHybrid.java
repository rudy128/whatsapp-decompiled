package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.BQX;
import X.C18070vi;
import X.C8X;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C8X Companion = new Object();
    public final BQX configuration;
    public final PlatformEventsServiceObjectsWrapper objectsWrapper;

    public PlatformEventsDataProviderConfigurationHybrid(BQX bqx) {
        C18070vi.A0d(bqx, 1);
        this.configuration = bqx;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = new PlatformEventsServiceObjectsWrapper(bqx.A01, bqx.A00);
        this.objectsWrapper = platformEventsServiceObjectsWrapper;
        this.mHybridData = initHybrid(platformEventsServiceObjectsWrapper);
    }

    public static final native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);
}

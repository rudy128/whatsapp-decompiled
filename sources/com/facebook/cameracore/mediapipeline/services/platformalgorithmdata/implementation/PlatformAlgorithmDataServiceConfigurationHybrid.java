package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation;

import X.AnonymousClass000;
import X.BQQ;
import X.C18070vi;
import X.C24536C8h;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class PlatformAlgorithmDataServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C24536C8h Companion = new Object();
    public final BQQ configuration;
    public final PlatformAlgorithmDataSourceHybrid dataSource;

    public PlatformAlgorithmDataServiceConfigurationHybrid(BQQ bqq) {
        C18070vi.A0d(bqq, 1);
        this.configuration = bqq;
        throw AnonymousClass000.A0s("getDataSource");
    }

    public static final native HybridData initHybrid(PlatformAlgorithmDataSourceHybrid platformAlgorithmDataSourceHybrid);

    public final PlatformAlgorithmDataSourceHybrid getDataSource() {
        return this.dataSource;
    }
}

package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.AnonymousClass000;
import X.BQO;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final BQO mConfiguration;

    public static native HybridData initHybrid(ExternalAssetLocalDataSource externalAssetLocalDataSource);

    public ExternalAssetProviderConfigurationHybrid(BQO bqo) {
        this.mConfiguration = bqo;
        throw AnonymousClass000.A0s("getAssetDataSource");
    }

    public void destroy() {
        super.destroy();
    }
}

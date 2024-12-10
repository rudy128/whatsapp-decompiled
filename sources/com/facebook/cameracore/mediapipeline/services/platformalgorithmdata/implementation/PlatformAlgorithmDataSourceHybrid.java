package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation;

import X.C18070vi;
import X.C24537C8i;
import X.C28427E0s;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public final class PlatformAlgorithmDataSourceHybrid implements C28427E0s {
    public static final C24537C8i Companion = new Object();
    public final PlatformAlgorithmDataSource dataSource;
    public final HybridData mHybridData = initHybrid();

    public PlatformAlgorithmDataSourceHybrid(PlatformAlgorithmDataSource platformAlgorithmDataSource) {
        C18070vi.A0d(platformAlgorithmDataSource, 1);
        this.dataSource = platformAlgorithmDataSource;
        platformAlgorithmDataSource.registerListener(this);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void nativeCloseSession();

    public final native void nativeUpdateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSourceHybrid platformAlgorithmAlwaysOnDataSourceHybrid);

    public final native void nativeUpdateFrameInReplay(PlatformAlgorithmAlwaysOnDataSourceHybrid platformAlgorithmAlwaysOnDataSourceHybrid);

    public void onFrameUpdate(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        nativeUpdateFrame(j, j2, (PlatformAlgorithmAlwaysOnDataSourceHybrid) platformAlgorithmAlwaysOnDataSource);
    }

    public void onCloseSession() {
        nativeCloseSession();
    }

    public void onFrameUpdate(PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        C18070vi.A0d(platformAlgorithmAlwaysOnDataSource, 0);
        nativeUpdateFrameInReplay((PlatformAlgorithmAlwaysOnDataSourceHybrid) platformAlgorithmAlwaysOnDataSource);
    }
}

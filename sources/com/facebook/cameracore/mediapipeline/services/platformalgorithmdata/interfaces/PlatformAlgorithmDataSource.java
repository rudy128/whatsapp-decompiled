package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces;

import X.C28427E0s;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public interface PlatformAlgorithmDataSource {
    void closeSession();

    void registerListener(C28427E0s e0s);

    void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}

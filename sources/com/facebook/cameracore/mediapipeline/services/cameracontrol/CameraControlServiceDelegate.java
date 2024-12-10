package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C24232Bxm;
import X.C24233Bxn;

public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(C24232Bxm bxm);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(C24233Bxn bxn);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(C24232Bxm bxm);

    void updateFocusMode(C24233Bxn bxn);
}

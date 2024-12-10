package com.whatsapp.voipcalling.camera;

import X.C24156BwM;
import android.hardware.camera2.CameraDevice;

public class VoipCameraApi2$StopCameraRunnable implements Runnable {
    public final CameraDevice closingCameraDevice;

    public void run() {
        this.closingCameraDevice.close();
        C24156BwM.A0K.set(false);
    }

    public VoipCameraApi2$StopCameraRunnable(CameraDevice cameraDevice) {
        this.closingCameraDevice = cameraDevice;
    }
}

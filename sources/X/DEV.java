package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class DEV implements E9T {
    public final CameraCaptureSession A00;

    public void BEY(CaptureRequest captureRequest, E9A e9a) {
        BFJ bfj;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (e9a != null) {
            bfj = new BFJ(e9a, this);
        } else {
            bfj = null;
        }
        cameraCaptureSession.capture(captureRequest, bfj, (Handler) null);
    }

    public boolean Bei() {
        return false;
    }

    public void CKN(CaptureRequest captureRequest, E9A e9a) {
        BFJ bfj;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (e9a != null) {
            bfj = new BFJ(e9a, this);
        } else {
            bfj = null;
        }
        cameraCaptureSession.setRepeatingRequest(captureRequest, bfj, (Handler) null);
    }

    public static void A00(CameraDevice cameraDevice, C26816DEy dEy, List list, Executor executor) {
        long j;
        BFL bfl = new BFL(dEy);
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CPZ cpz = (CPZ) list.get(i);
            OutputConfiguration outputConfiguration = new OutputConfiguration(cpz.A02);
            outputConfiguration.setStreamUseCase(cpz.A01);
            if (cpz.A00 != 1) {
                j = 1;
            } else {
                j = 2;
            }
            outputConfiguration.setDynamicRangeProfile(j);
            A13.add(outputConfiguration);
        }
        List emptyList = Collections.emptyList();
        int size2 = emptyList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A13.add(new OutputConfiguration((Surface) emptyList.get(i2)));
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(0, A13, executor, bfl));
    }

    public void BAM() {
        this.A00.abortCaptures();
    }

    public void close() {
        this.A00.close();
    }

    public DEV(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }

    public static void A01(CameraDevice cameraDevice, C26816DEy dEy, List list, Executor executor, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A13.add(((CPZ) list.get(i)).A02);
        }
        if (Build.VERSION.SDK_INT < 33 || !z) {
            cameraDevice.createCaptureSession(A13, new BFL(dEy), (Handler) null);
        } else {
            A00(cameraDevice, dEy, list, executor);
        }
    }
}

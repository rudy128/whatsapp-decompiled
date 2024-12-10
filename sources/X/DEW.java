package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class DEW implements E9T {
    public final CameraExtensionSession A00;
    public final Executor A01;

    public void BAM() {
    }

    public boolean Bei() {
        return true;
    }

    public void BEY(CaptureRequest captureRequest, E9A e9a) {
        this.A00.capture(captureRequest, this.A01, new BFO(e9a, this));
    }

    public void CKN(CaptureRequest captureRequest, E9A e9a) {
        this.A00.setRepeatingRequest(captureRequest, this.A01, new BFO(e9a, this));
    }

    public void close() {
        try {
            this.A00.close();
        } catch (CameraAccessException unused) {
            C26175Cts.A02("Camera2ExtensionSession", "CameraAccessException on close()!");
        }
    }

    public DEW(CameraExtensionSession cameraExtensionSession, Executor executor) {
        this.A00 = cameraExtensionSession;
        this.A01 = executor;
    }

    public static void A01(CameraDevice cameraDevice, C26816DEy dEy, List list, Executor executor, int i) {
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A13.add(new OutputConfiguration(((CPZ) list.get(i2)).A02));
        }
        cameraDevice.createExtensionSession(new ExtensionSessionConfiguration(i, A13, executor, new BFP(dEy, executor)));
    }
}

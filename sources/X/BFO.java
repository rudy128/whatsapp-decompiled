package X;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

public class BFO extends CameraExtensionSession.ExtensionCaptureCallback {
    public E9A A00;
    public final CKG A01 = new CKG();
    public final CVD A02 = new Object();
    public final /* synthetic */ DEW A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CVD, java.lang.Object] */
    public BFO(E9A e9a, DEW dew) {
        this.A03 = dew;
        this.A00 = e9a;
    }

    public void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        E9A e9a = this.A00;
        if (e9a != null) {
            e9a.Bnw(this.A01);
        }
    }

    public void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        E9A e9a = this.A00;
        if (e9a != null) {
            e9a.BxW(i);
        }
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        CVD cvd = this.A02;
        cvd.A00 = totalCaptureResult;
        E9A e9a = this.A00;
        if (e9a != null) {
            e9a.Bnu(this.A03, cvd);
        }
    }

    public void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        E9A e9a = this.A00;
        if (e9a != null) {
            e9a.Bnu(this.A03, this.A02);
        }
    }

    public void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        E9A e9a = this.A00;
        if (e9a != null) {
            e9a.Bnz(this.A03);
        }
    }
}

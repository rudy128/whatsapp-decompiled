package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

public class BFJ extends CameraCaptureSession.CaptureCallback {
    public final E9A A00;
    public final CKG A01 = new CKG();
    public final CVD A02 = new Object();
    public final /* synthetic */ DEV A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CVD, java.lang.Object] */
    public BFJ(E9A e9a, DEV dev) {
        this.A03 = dev;
        this.A00 = e9a;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        CVD cvd = this.A02;
        cvd.A00 = totalCaptureResult;
        this.A00.Bnu(this.A03, cvd);
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        CKG ckg = this.A01;
        ckg.A00 = captureFailure.getReason();
        this.A00.Bnw(ckg);
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.A00.Bnz(this.A03);
    }
}

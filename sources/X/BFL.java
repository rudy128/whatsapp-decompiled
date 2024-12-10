package X;

import android.hardware.camera2.CameraCaptureSession;

public class BFL extends CameraCaptureSession.StateCallback {
    public DEV A00;
    public final /* synthetic */ C26816DEy A01;

    public BFL(C26816DEy dEy) {
        this.A01 = dEy;
    }

    private DEV A00(CameraCaptureSession cameraCaptureSession) {
        DEV dev = this.A00;
        if (dev != null && dev.A00 == cameraCaptureSession) {
            return dev;
        }
        DEV dev2 = new DEV(cameraCaptureSession);
        this.A00 = dev2;
        return dev2;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C26816DEy dEy = this.A01;
        A00(cameraCaptureSession);
        if (dEy.A03 == 1) {
            dEy.A03 = 0;
            dEy.A05 = false;
            dEy.A01.A01();
        }
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C26816DEy dEy = this.A01;
        DEV A002 = A00(cameraCaptureSession);
        if (dEy.A03 == 1) {
            dEy.A03 = 0;
            dEy.A05 = true;
            dEy.A04 = A002;
            dEy.A01.A01();
        }
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        C26816DEy dEy = this.A01;
        A00(cameraCaptureSession);
        CKF ckf = dEy.A00;
        if (ckf != null) {
            ckf.A00.A0O.A00(new C22896BUh(), "camera_session_active", new C27132DVt((Object) ckf, 14));
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        C26816DEy dEy = this.A01;
        DEV A002 = A00(cameraCaptureSession);
        if (dEy.A03 == 2) {
            dEy.A03 = 0;
            dEy.A05 = AnonymousClass000.A0i();
            dEy.A04 = A002;
            dEy.A01.A01();
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        C26816DEy dEy = this.A01;
        DEV A002 = A00(cameraCaptureSession);
        if (dEy.A03 == 3) {
            dEy.A03 = 0;
            dEy.A05 = AnonymousClass000.A0i();
            dEy.A04 = A002;
            dEy.A01.A01();
        }
    }
}

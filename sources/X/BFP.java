package X;

import android.hardware.camera2.CameraExtensionSession;
import java.util.concurrent.Executor;

public class BFP extends CameraExtensionSession.StateCallback {
    public DEW A00;
    public final /* synthetic */ C26816DEy A01;
    public final /* synthetic */ Executor A02;

    public BFP(C26816DEy dEy, Executor executor) {
        this.A01 = dEy;
        this.A02 = executor;
    }

    public void onClosed(CameraExtensionSession cameraExtensionSession) {
        C26816DEy dEy = this.A01;
        Executor executor = this.A02;
        DEW dew = this.A00;
        if (dew == null || dew.A00 != cameraExtensionSession) {
            dew = new DEW(cameraExtensionSession, executor);
            this.A00 = dew;
        }
        if (dEy.A03 == 2) {
            dEy.A03 = 0;
            dEy.A05 = AnonymousClass000.A0i();
            dEy.A04 = dew;
            dEy.A01.A01();
        }
    }

    public void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        C26816DEy dEy = this.A01;
        Executor executor = this.A02;
        DEW dew = this.A00;
        if (dew == null || dew.A00 != cameraExtensionSession) {
            this.A00 = new DEW(cameraExtensionSession, executor);
        }
        if (dEy.A03 == 1) {
            dEy.A03 = 0;
            dEy.A05 = false;
            dEy.A01.A01();
        }
    }

    public void onConfigured(CameraExtensionSession cameraExtensionSession) {
        C26816DEy dEy = this.A01;
        Executor executor = this.A02;
        DEW dew = this.A00;
        if (dew == null || dew.A00 != cameraExtensionSession) {
            dew = new DEW(cameraExtensionSession, executor);
            this.A00 = dew;
        }
        if (dEy.A03 == 1) {
            dEy.A03 = 0;
            dEy.A05 = true;
            dEy.A04 = dew;
            dEy.A01.A01();
        }
    }
}

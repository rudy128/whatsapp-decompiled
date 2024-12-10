package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

public class CY3 {
    public final /* synthetic */ LiteCameraView A00;

    public CY3(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    public void A00() {
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0M = false;
        liteCameraView.A0c = false;
        Runnable runnable = liteCameraView.A0E;
        if (runnable != null) {
            liteCameraView.A03.CGP(runnable);
            liteCameraView.A0E = null;
        }
        Runnable runnable2 = liteCameraView.A0D;
        if (runnable2 != null) {
            liteCameraView.A09.CGF(runnable2);
            liteCameraView.A0D = null;
        }
    }

    public void A01(Exception exc) {
        C28598E9p e9p;
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0M = false;
        boolean Bga = liteCameraView.Bga();
        liteCameraView.A0c = false;
        Runnable runnable = liteCameraView.A0E;
        if (runnable != null) {
            liteCameraView.A03.CGP(runnable);
            liteCameraView.A0E = null;
        }
        Runnable runnable2 = liteCameraView.A0D;
        if (runnable2 != null) {
            liteCameraView.A09.CGF(runnable2);
            liteCameraView.A0D = null;
        }
        C17900vP.A0Y(exc, "LiteCamera/onRecordingError: ", AnonymousClass000.A10());
        LiteCameraView.A04(liteCameraView, exc, "/onRecordingError/");
        if (!Bga && (e9p = liteCameraView.A06) != null) {
            e9p.BnT(exc, 4);
        }
    }
}

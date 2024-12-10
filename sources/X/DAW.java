package X;

import android.graphics.Bitmap;
import java.util.Map;

public final class DAW implements E7R {
    public final /* synthetic */ C24986CSm A00;
    public final /* synthetic */ E7R A01;
    public final /* synthetic */ C22810BPy A02;

    public void A00(Bitmap bitmap, C24851CMu cMu) {
        C18070vi.A0d(bitmap, 0);
        C22810BPy bPy = this.A02;
        bPy.A06.BSH("Lite-Controller-Thread").post(new C21468AkZ(bitmap, this.A00, this.A01, cMu, bPy));
        EDJ edj = bPy.A04;
        if (edj != null) {
            int hashCode = bPy.hashCode();
            C26294Cx6.A04("PhotoCaptureControllerImpl", "logTakePhotoFinished QPL CAPTURE_PHOTO");
            edj.Bi9("photo_capture_finished", "PhotoCaptureControllerImpl", (Map) null, (long) hashCode);
        }
    }

    public void Bnv(Exception exc) {
        C2X buq;
        C18070vi.A0d(exc, 0);
        C22810BPy bPy = this.A02;
        C22810BPy.A00(bPy);
        C26379Cyf.A03(this.A01, exc);
        EDJ edj = bPy.A04;
        if (edj != null) {
            int hashCode = bPy.hashCode();
            if (exc instanceof C2X) {
                buq = (C2X) exc;
            } else {
                buq = new BUQ((Throwable) exc);
            }
            C9R.A00(buq, edj, "medium", hashCode);
        }
    }

    public DAW(C24986CSm cSm, E7R e7r, C22810BPy bPy) {
        this.A02 = bPy;
        this.A00 = cSm;
        this.A01 = e7r;
    }

    public void Bnt() {
        C22810BPy bPy = this.A02;
        EDJ edj = bPy.A04;
        if (edj != null) {
            C9R.A00(new BUQ("Photo capture cancelled"), edj, "low", bPy.hashCode());
        }
    }
}

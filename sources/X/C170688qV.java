package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.8qV  reason: invalid class name and case insensitive filesystem */
public final class C170688qV extends C25871Py {
    public boolean A00;
    public final AnonymousClass1HQ A01;
    public final C18030ve A02;
    public final VoipCameraManager A03;

    public void A01() {
        boolean A0T = C40811vJ.A0T(this.A02);
        if (A0T != this.A00) {
            C17900vP.A0n("CallingABPropObserver isHammerheadEnabled changed to ", AnonymousClass000.A10(), A0T);
            this.A00 = A0T;
            if (this.A03.hasBeenQueriedByDriver.get()) {
                Log.i("CallingABPropObserver refresh capture devs");
                Voip.refreshCaptureDevice();
            }
        }
    }

    public C170688qV(AnonymousClass1HQ r2, C18030ve r3, VoipCameraManager voipCameraManager) {
        C18070vi.A0o(r3, r2, voipCameraManager);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = voipCameraManager;
        this.A00 = C40811vJ.A0T(r3);
    }
}

package X;

import com.whatsapp.camera.CameraActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.5s4  reason: invalid class name and case insensitive filesystem */
public abstract class C114835s4 extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            CameraActivity cameraActivity = (CameraActivity) this;
            AnonymousClass1K1 r3 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r3, cameraActivity);
            AnonymousClass1FB.A0M(A0A, cameraActivity);
            AnonymousClass10G r4 = A0A.A00;
            C109005cf.A0d(A0A, r4, cameraActivity);
            C109005cf.A0e(A0A, r4, cameraActivity, r4.A5A);
            cameraActivity.A02 = C108965cb.A0K(A0A);
            cameraActivity.A00 = (AnonymousClass2Y7) r3.A3x.get();
            cameraActivity.A0D = (C133846pb) r4.A7f.get();
            cameraActivity.A04 = (C133276oU) r3.A0T.get();
            cameraActivity.A06 = (C88184Yq) r4.A15.get();
            cameraActivity.A09 = AnonymousClass10E.A84(A0A);
            cameraActivity.A0B = (C32511hJ) A0A.A4O.get();
            cameraActivity.A0J = r3.A5c;
            cameraActivity.A0G = C000200d.A00(r4.ADC);
            cameraActivity.A08 = (AnonymousClass1Cd) A0A.A6i.get();
            cameraActivity.A0H = AnonymousClass3MX.A11(A0A);
            cameraActivity.A0I = C000200d.A00(r4.AEC);
            cameraActivity.A0E = AnonymousClass1K1.A1b(r3);
            cameraActivity.A0F = (C58752lC) A0A.AAC.get();
            cameraActivity.A0A = AnonymousClass3MY.A0Z(A0A);
            cameraActivity.A07 = AnonymousClass3Ma.A0b(A0A);
            cameraActivity.A01 = (C32531hL) A0A.ABm.get();
            cameraActivity.A0C = (WhatsAppLibLoader) A0A.ABy.get();
        }
    }

    public C114835s4() {
        AnonymousClass79Z.A00(this, 29);
    }
}

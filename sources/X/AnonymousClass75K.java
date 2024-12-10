package X;

import android.hardware.Camera;

/* renamed from: X.75K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass75K implements Camera.ErrorCallback {
    public final /* synthetic */ C109835e5 A00;

    public final void onError(int i, Camera camera) {
        C109835e5 r2 = this.A00;
        C17900vP.A0k("qrview/startcamera camera error:", AnonymousClass000.A10(), i);
        if (i == 100) {
            AnonymousClass7RB.A00(r2.A04, r2, 26);
            AnonymousClass7RB.A00(r2.A04, r2, 27);
        } else if (i == 2) {
            r2.A03 = null;
            C109835e5.A02(r2, i);
        }
    }

    public /* synthetic */ AnonymousClass75K(C109835e5 r1) {
        this.A00 = r1;
    }
}

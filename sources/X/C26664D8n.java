package X;

import android.os.Handler;

/* renamed from: X.D8n  reason: case insensitive filesystem */
public final class C26664D8n implements E7N {
    public final /* synthetic */ C22774BOn A00;

    public C26664D8n(C22774BOn bOn) {
        this.A00 = bOn;
    }

    public void C0y() {
        this.A00.A0A = true;
    }

    public void C9T(long j, int i, long j2) {
        C25047CVb cVb = this.A00.A0E;
        Handler handler = cVb.A00;
        if (handler != null) {
            handler.post(new C98594rP(cVb, i, 0, j, j2));
        }
    }
}

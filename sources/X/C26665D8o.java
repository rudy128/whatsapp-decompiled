package X;

import android.os.Handler;

/* renamed from: X.D8o  reason: case insensitive filesystem */
public final class C26665D8o implements E7N {
    public final /* synthetic */ BOG A00;

    public C26665D8o(BOG bog) {
        this.A00 = bog;
    }

    public void C0y() {
        this.A00.A0B = true;
    }

    public void C9T(long j, int i, long j2) {
        C25047CVb cVb = this.A00.A0I;
        Handler handler = cVb.A00;
        if (handler != null) {
            handler.post(new C98594rP(cVb, i, 0, j, j2));
        }
    }
}

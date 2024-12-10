package X;

import android.os.Handler;

/* renamed from: X.CVb  reason: case insensitive filesystem */
public final class C25047CVb {
    public final Handler A00;
    public final D9R A01;

    public void A00(CU1 cu1) {
        synchronized (cu1) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            BE7.A19(handler, this, cu1, 39);
        }
    }

    public C25047CVb(Handler handler, D9R d9r) {
        this.A00 = d9r == null ? null : handler;
        this.A01 = d9r;
    }
}

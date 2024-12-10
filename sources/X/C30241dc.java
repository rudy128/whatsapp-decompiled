package X;

import android.os.SystemClock;

/* renamed from: X.1dc  reason: invalid class name and case insensitive filesystem */
public final class C30241dc implements C24411Kf {
    public long A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public C30241dc(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public /* synthetic */ void BlT() {
    }

    public void onAppBackgrounded() {
        this.A02.get();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis >= this.A00 + 5000) {
            this.A00 = uptimeMillis;
            if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A01.get(), 7156)) {
                ((AnonymousClass18K) this.A03.get()).CHJ(true);
            }
        }
    }
}

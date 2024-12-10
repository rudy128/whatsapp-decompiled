package X;

import android.os.SystemClock;

/* renamed from: X.1dG  reason: invalid class name and case insensitive filesystem */
public final class C30021dG implements C24411Kf {
    public final /* synthetic */ C29971dB A00;

    public C30021dG(C29971dB r1) {
        this.A00 = r1;
    }

    public void BlT() {
        this.A00.A00 = -1;
    }

    public void onAppBackgrounded() {
        C29971dB r3 = this.A00;
        r3.A00 = SystemClock.elapsedRealtime();
        r3.A07 = false;
        r3.A08 = false;
        C18030ve r2 = r3.A0C;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 4027) && C18020vd.A05(r1, r2, 3206)) {
            r3.A0D.A03(true);
        }
    }
}

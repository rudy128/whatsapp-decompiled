package X;

import android.os.Handler;

/* renamed from: X.4R6  reason: invalid class name */
public class AnonymousClass4R6 {
    public AnonymousClass49P A00;
    public String A01;
    public final AnonymousClass5Z6 A02;
    public final C24921Me A03;
    public final AnonymousClass1E9 A04;
    public final AnonymousClass10I A05;

    public void A00() {
        AnonymousClass49P r2 = this.A00;
        boolean z = true;
        if (r2 != null) {
            z = false;
            r2.A0B(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            this.A00 = null;
        }
        AnonymousClass49P r1 = new AnonymousClass49P(this.A03, this, this.A04, z);
        this.A00 = r1;
        AnonymousClass3MW.A1T(r1, this.A05, 0);
    }

    public AnonymousClass4R6(C24921Me r1, AnonymousClass5Z6 r2, AnonymousClass1E9 r3, AnonymousClass10I r4) {
        this.A05 = r4;
        this.A03 = r1;
        this.A04 = r3;
        this.A02 = r2;
    }
}

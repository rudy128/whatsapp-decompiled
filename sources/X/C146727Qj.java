package X;

import android.view.View;

/* renamed from: X.7Qj  reason: invalid class name and case insensitive filesystem */
public final class C146727Qj implements Runnable {
    public boolean A00;
    public boolean A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public long A07;
    public boolean A08;
    public final View A09;
    public final C1419877s A0A;

    public final void A00(float f, float f2, float f3, float f4, long j) {
        if (!this.A00) {
            this.A02 = f3;
            this.A03 = f4;
            this.A05 = f2;
            this.A07 = System.currentTimeMillis();
            this.A04 = f;
            this.A08 = AnonymousClass000.A1R((f2 > f ? 1 : (f2 == f ? 0 : -1)));
            this.A06 = (f2 - f) / ((float) j);
            this.A00 = true;
            this.A01 = false;
            this.A09.post(this);
        }
    }

    public void run() {
        if (!this.A01) {
            float currentTimeMillis = this.A04 + (this.A06 * ((float) (System.currentTimeMillis() - this.A07)));
            C1419877s r4 = this.A0A;
            C1419877s.A02(r4, currentTimeMillis, this.A02, this.A03);
            float f = this.A05;
            if (currentTimeMillis == f || this.A08 == AnonymousClass000.A1R((currentTimeMillis > f ? 1 : (currentTimeMillis == f ? 0 : -1)))) {
                C1419877s.A02(r4, f, this.A02, this.A03);
                this.A00 = false;
                this.A01 = true;
            }
            if (!this.A01) {
                this.A09.post(this);
            }
        }
    }

    public C146727Qj(View view, C1419877s r2) {
        this.A09 = view;
        this.A0A = r2;
    }
}

package X;

import android.os.SystemClock;

/* renamed from: X.1dW  reason: invalid class name and case insensitive filesystem */
public final class C30181dW implements C24411Kf {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public final AnonymousClass11P A06;

    public C30181dW(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 1);
        this.A06 = r2;
    }

    public void BlT() {
        this.A05 = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        long max = Math.max(this.A02, this.A00);
        if (max != 0) {
            this.A03 += uptimeMillis - max;
        }
        this.A00 = uptimeMillis;
    }

    public void onAppBackgrounded() {
        this.A05 = false;
        long uptimeMillis = SystemClock.uptimeMillis();
        long max = Math.max(this.A02, this.A00);
        if (max != 0) {
            this.A04 += uptimeMillis - max;
        }
        this.A00 = uptimeMillis;
    }

    public void A00() {
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = SystemClock.uptimeMillis();
    }
}

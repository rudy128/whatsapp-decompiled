package X;

import android.app.Notification;

/* renamed from: X.Ak3  reason: case insensitive filesystem */
public class C21436Ak3 implements Runnable {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C21436Ak3(C31281fJ r2, C62652rk r3, int i, boolean z, boolean z2) {
        this.A02 = r2;
        this.A04 = z;
        this.A01 = i;
        this.A05 = z2;
        this.A03 = r3;
    }

    public final void run() {
        if (this.A00 != 0) {
            boolean z = this.A04;
            ((AnonymousClass10T) this.A02).notifyAllObservers(new C20732AWn((C62652rk) this.A03, this.A01, z, this.A05));
            return;
        }
        A99 a99 = (A99) this.A02;
        int i = this.A01;
        C138686xW r4 = (C138686xW) this.A03;
        boolean z2 = this.A05;
        boolean z3 = this.A04;
        Notification A06 = a99.A2H.A06(a99.A1r, r4, a99.A2J, i, z2);
        String str = r4.A06;
        C27301Vn r1 = a99.A2d;
        if (z3) {
            ((AnonymousClass1Vo) r1).BkS(str, 27, A06);
        } else {
            r1.BkR(23, A06);
        }
    }

    public C21436Ak3(C138686xW r2, A99 a99, int i, boolean z, boolean z2) {
        this.A02 = a99;
        this.A01 = i;
        this.A03 = r2;
        this.A05 = z;
        this.A04 = z2;
    }
}

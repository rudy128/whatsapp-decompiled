package X;

import java.util.Arrays;

/* renamed from: X.CbB  reason: case insensitive filesystem */
public final class C25215CbB {
    public int A00;
    public int A01 = 0;
    public CJ4[] A02 = new CJ4[100];
    public int A03;
    public final int A04;

    public C25215CbB(int i) {
        C26056CrS.A02(AnonymousClass000.A1R(i));
        this.A04 = i;
    }

    public synchronized int A00() {
        return this.A00 * this.A04;
    }

    public synchronized void A01() {
        int i = this.A03;
        int i2 = this.A04;
        int A042 = BE8.A04(((i + i2) - 1) / i2, this.A00);
        int i3 = this.A01;
        if (A042 < i3) {
            Arrays.fill(this.A02, A042, i3, (Object) null);
            this.A01 = A042;
        }
    }

    public synchronized void A02(int i) {
        boolean A1U = AnonymousClass000.A1U(i, this.A03);
        this.A03 = i;
        if (A1U) {
            A01();
        }
    }
}

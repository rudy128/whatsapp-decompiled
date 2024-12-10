package X;

import java.util.concurrent.CancellationException;

public final class A1P {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public AnonymousClass1OB A0I;
    public boolean A0J;
    public boolean A0K;
    public final C136746uK A0L;
    public final C136746uK A0M;
    public final C136746uK A0N;
    public final C136746uK A0O;
    public final C136746uK A0P;
    public final C136746uK A0Q;
    public final C18600wl A0R;
    public final C18600wl A0S;
    public final AnonymousClass1DC A0T;

    public final void A02(AnonymousClass6RY r3) {
        C18070vi.A0d(r3, 0);
        this.A08 = r3.value | this.A08;
    }

    public static final void A00(A1P a1p) {
        a1p.A0N.A01();
        a1p.A0O.A01();
        a1p.A0P.A01();
        a1p.A0D = 0;
        a1p.A0E = 0;
        a1p.A0B = 0;
        a1p.A0A = 0;
        a1p.A0G = 0;
        AnonymousClass1OB r4 = a1p.A0I;
        if (r4 != null && r4.Be2()) {
            r4.BEM((CancellationException) null);
        }
        a1p.A0I = null;
        a1p.A08 = 0;
        a1p.A0J = false;
        a1p.A0H = 0;
        a1p.A0Q.A01();
        a1p.A06 = 0;
        a1p.A07 = 0;
        a1p.A02 = 0;
        a1p.A04 = 0;
        a1p.A09 = 0;
        a1p.A0K = false;
        a1p.A00 = 0;
        a1p.A01 = 0;
        a1p.A03 = 0;
        a1p.A0F = 0;
    }

    public final void A01(int i) {
        int i2;
        if (i == -100) {
            i2 = 4;
        } else if (i == -1) {
            i2 = 1;
        } else if (i == 670007) {
            i2 = 16;
        } else if (i != -14) {
            i2 = 2;
            if (i != -13) {
                i2 = 128;
            }
        } else {
            i2 = 8;
        }
        this.A02 |= i2;
        this.A04 = i2;
    }

    public A1P(C136746uK r2, C136746uK r3, C136746uK r4, C136746uK r5, C136746uK r6, C136746uK r7, AnonymousClass1DC r8, C18600wl r9, C18600wl r10) {
        C18070vi.A0w(r9, r2, r3, r10, r4);
        C18070vi.A0q(r5, r6, r7);
        C18070vi.A0d(r8, 9);
        this.A0S = r9;
        this.A0P = r2;
        this.A0M = r3;
        this.A0R = r10;
        this.A0O = r4;
        this.A0N = r5;
        this.A0Q = r6;
        this.A0L = r7;
        this.A0T = r8;
    }
}

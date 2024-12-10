package X;

/* renamed from: X.7Fc  reason: invalid class name and case insensitive filesystem */
public final class C143867Fc implements C201511a {
    public boolean A00;
    public final C18140vp A01;

    public C143867Fc(C18140vp r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public int A01(int i, boolean z) {
        int i2 = 2;
        if (z) {
            if (i > 2) {
                if (i > 8) {
                    i2 = 3;
                }
                return ((i + i2) - 1) / i2;
            } else if (i <= 0) {
                return 0;
            } else {
                return i;
            }
        } else if (i <= 2) {
            return 1;
        } else {
            return i > 8 ? 3 : 2;
        }
    }

    public int A02(int i, boolean z) {
        int i2 = 2;
        if (z) {
            if (i <= 2) {
                return 1;
            }
            return i > 8 ? 3 : 2;
        } else if (i > 2) {
            if (i > 8) {
                i2 = 3;
            }
            return ((i + i2) - 1) / i2;
        } else if (i <= 0) {
            return 0;
        } else {
            return i;
        }
    }

    public /* synthetic */ int A00(int i, int i2, boolean z) {
        int A02 = A02(i, z);
        int i3 = 4;
        if (4 > A02) {
            i3 = A02;
            if (A02 <= 0) {
                return 0;
            }
        }
        double d = (double) i2;
        double d2 = 1.0d;
        if (C108975cc.A1D(i, 12)) {
            d2 = 1.0d - 0.04d;
        }
        return (int) ((d * d2) / ((double) i3));
    }
}

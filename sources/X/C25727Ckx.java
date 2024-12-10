package X;

/* renamed from: X.Ckx  reason: case insensitive filesystem */
public final class C25727Ckx {
    public C26002CqJ A00;
    public C26289Cwp A01;
    public boolean A02;
    public final DS5 A03;

    public static int A00(C25727Ckx ckx, int i, int i2, int i3) {
        boolean A032;
        boolean z = ckx.A02;
        DS5 ds5 = ckx.A03;
        if (z) {
            A032 = ds5.A03(i2, i);
        } else {
            A032 = ds5.A03(i, i2);
        }
        int i4 = i3 << 1;
        if (A032) {
            return i4 | 1;
        }
        return i4;
    }

    public C26002CqJ A01() {
        C26002CqJ cqJ = this.A00;
        if (cqJ == null) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 6; i3++) {
                i2 = A00(this, i3, 8, i2);
            }
            int A002 = A00(this, 8, 7, A00(this, 8, 8, A00(this, 7, 8, i2)));
            int i4 = 5;
            do {
                A002 = A00(this, 8, i4, A002);
                i4--;
            } while (i4 >= 0);
            int i5 = this.A03.A00;
            int i6 = i5 - 7;
            for (int i7 = i5 - 1; i7 >= i6; i7--) {
                i = A00(this, 8, i7, i);
            }
            for (int i8 = i5 - 8; i8 < i5; i8++) {
                i = A00(this, i8, 8, i);
            }
            cqJ = C26002CqJ.A00(A002, i);
            if (cqJ == null) {
                cqJ = C26002CqJ.A00(A002 ^ 21522, i ^ 21522);
            }
            this.A00 = cqJ;
            if (cqJ == null) {
                throw C23675Bni.A00();
            }
        }
        return cqJ;
    }

    public C26289Cwp A02() {
        int i;
        C26289Cwp cwp = this.A01;
        if (cwp != null) {
            return cwp;
        }
        int i2 = this.A03.A00;
        int i3 = (i2 - 17) / 4;
        if (i3 <= 6) {
            return C26289Cwp.A03(i3);
        }
        int i4 = i2 - 11;
        int i5 = 5;
        int i6 = 0;
        int i7 = 5;
        int i8 = 0;
        do {
            int i9 = i2 - 9;
            i = i9;
            while (i9 >= i4) {
                i8 = A00(this, i9, i7, i8);
                i9--;
            }
            i7--;
        } while (i7 >= 0);
        C26289Cwp A022 = C26289Cwp.A02(i8);
        if (A022 == null || (A022.A01 * 4) + 17 != i2) {
            do {
                for (int i10 = i; i10 >= i4; i10--) {
                    i6 = A00(this, i5, i10, i6);
                }
                i5--;
            } while (i5 >= 0);
            A022 = C26289Cwp.A02(i6);
            if (A022 == null || (A022.A01 * 4) + 17 != i2) {
                throw C23675Bni.A00();
            }
        }
        this.A01 = A022;
        return A022;
    }

    public C25727Ckx(DS5 ds5) {
        int i = ds5.A00;
        if (i < 21 || (i & 3) != 1) {
            throw C23675Bni.A00();
        }
        this.A03 = ds5;
    }
}

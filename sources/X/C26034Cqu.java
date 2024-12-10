package X;

/* renamed from: X.Cqu  reason: case insensitive filesystem */
public final class C26034Cqu {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public static int A00(C26034Cqu cqu) {
        int i = 0;
        int i2 = 0;
        while (!cqu.A06()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = cqu.A03(i2);
        }
        return i3 + i;
    }

    public static boolean A02(C26034Cqu cqu, int i) {
        if (2 > i || i >= cqu.A01) {
            return false;
        }
        byte[] bArr = cqu.A03;
        if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
            return true;
        }
        return false;
    }

    public static void A01(C26034Cqu cqu) {
        boolean z;
        int i;
        int i2 = cqu.A02;
        if (i2 < 0 || (i2 >= (i = cqu.A01) && !(i2 == i && cqu.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C26056CrS.A03(z);
    }

    public int A03(int i) {
        int i2;
        int i3 = this.A00 + i;
        this.A00 = i3;
        int i4 = 0;
        while (true) {
            i2 = 2;
            if (i3 <= 8) {
                break;
            }
            i3 -= 8;
            this.A00 = i3;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            i4 |= (bArr[i5] & 255) << i3;
            if (!A02(this, i5 + 1)) {
                i2 = 1;
            }
            this.A02 = i5 + i2;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int i7 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i6] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.A00 = 0;
            if (!A02(this, i6 + 1)) {
                i2 = 1;
            }
            this.A02 = i6 + i2;
        }
        A01(this);
        return i7;
    }

    public void A04() {
        int i = 1;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            int i3 = this.A02;
            if (A02(this, i3 + 1)) {
                i = 2;
            }
            this.A02 = i3 + i;
        }
        A01(this);
    }

    public void A05(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.A02 = i4;
        int i5 = this.A00 + (i - (i3 * 8));
        this.A00 = i5;
        if (i5 > 7) {
            i4++;
            this.A02 = i4;
            this.A00 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > i4) {
                A01(this);
                return;
            } else if (A02(this, i2)) {
                i4++;
                this.A02 = i4;
                i2 += 2;
            }
        }
    }

    public boolean A06() {
        boolean A1O = AnonymousClass000.A1O(this.A03[this.A02] & (128 >> this.A00));
        A04();
        return A1O;
    }
}

package X;

/* renamed from: X.CtI  reason: case insensitive filesystem */
public class C26151CtI {
    public int A00;
    public byte[] A01 = new byte[64];

    public static void A01(C26151CtI ctI, C26151CtI ctI2) {
        ctI2.A0A(ctI.A01, 0, ctI.A00);
    }

    public static void A00(C26151CtI ctI, int i) {
        int i2 = ctI.A00;
        byte[] bArr = ctI.A01;
        int length = bArr.length;
        if (i2 <= length) {
            int i3 = length * 2;
            int i4 = i + i2;
            if (i3 <= i4) {
                i3 = i4;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            ctI.A01 = bArr2;
            return;
        }
        throw AnonymousClass8BR.A0v("Internal error");
    }

    public static void A02(C26151CtI ctI, byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
        ctI.A00 = i3 + 1;
    }

    public void A03(int i) {
        int i2 = this.A00;
        if (i2 + 1 > this.A01.length) {
            A00(this, 1);
        }
        this.A01[i2] = (byte) i;
        this.A00 = i2 + 1;
    }

    public void A04(int i) {
        int i2 = this.A00;
        if (i2 + 4 > this.A01.length) {
            A00(this, 4);
        }
        byte[] bArr = this.A01;
        int i3 = i2 + 1;
        int A0A = BE6.A0A(i >>> 24, bArr, i2, i3);
        bArr[i3] = (byte) (i >>> 16);
        A02(this, bArr, A0A, i);
    }

    public void A05(int i) {
        int i2 = this.A00;
        if (i2 + 2 > this.A01.length) {
            A00(this, 2);
        }
        A02(this, this.A01, i2, i);
    }

    public final void A06(int i, int i2) {
        int i3 = this.A00;
        if (i3 + 2 > this.A01.length) {
            A00(this, 2);
        }
        byte[] bArr = this.A01;
        int i4 = i3 + 1;
        int A0A = BE6.A0A(i, bArr, i3, i4);
        bArr[i4] = (byte) i2;
        this.A00 = A0A;
    }

    public final void A07(int i, int i2) {
        int i3 = this.A00;
        if (i3 + 3 > this.A01.length) {
            A00(this, 3);
        }
        byte[] bArr = this.A01;
        bArr[i3] = (byte) i;
        A02(this, bArr, i3 + 1, i2);
    }

    public final void A08(int i, int i2, int i3) {
        int i4 = this.A00;
        if (i4 + 5 > this.A01.length) {
            A00(this, 5);
        }
        byte[] bArr = this.A01;
        int i5 = i4 + 1;
        int A0A = BE6.A0A(i, bArr, i4, i5);
        int A0A2 = BE6.A0A(i2 >>> 8, bArr, i5, A0A);
        bArr[A0A] = (byte) i2;
        A02(this, bArr, A0A2, i3);
    }

    public void A0A(byte[] bArr, int i, int i2) {
        if (this.A00 + i2 > this.A01.length) {
            A00(this, i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.A01, this.A00, i2);
        }
        this.A00 += i2;
    }

    public final void A09(String str, int i, int i2) {
        byte[] bArr;
        int A0A;
        int length = str.length();
        int i3 = i;
        for (int i4 = i; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt >= 1) {
                if (charAt <= 127) {
                    i3++;
                } else if (charAt > 2047) {
                    i3 += 3;
                }
            }
            i3 += 2;
        }
        if (i3 <= i2) {
            int i5 = this.A00;
            int i6 = (i5 - i) - 2;
            if (i6 >= 0) {
                BE7.A12(i3 >>> 8, this.A01, i6, i3);
            }
            if ((i5 + i3) - i > this.A01.length) {
                A00(this, i3 - i);
            }
            int i7 = this.A00;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 >= 1) {
                    if (charAt2 <= 127) {
                        bArr = this.A01;
                        A0A = i7 + 1;
                    } else if (charAt2 > 2047) {
                        bArr = this.A01;
                        int i8 = i7 + 1;
                        i7 = BE6.A0A(((charAt2 >> 12) & 15) | 224, bArr, i7, i8);
                        A0A = BE6.A0A(((charAt2 >> 6) & 63) | 128, bArr, i8, i7);
                        charAt2 = (charAt2 & '?') | 128;
                    }
                    bArr[i7] = (byte) charAt2;
                    i7 = A0A;
                    i++;
                }
                byte[] bArr2 = this.A01;
                int i9 = i7 + 1;
                i7 = BE6.A0A(((charAt2 >> 6) & 31) | 192, bArr2, i7, i9);
                bArr2[i9] = (byte) ((charAt2 & '?') | 128);
                i++;
            }
            this.A00 = i7;
            return;
        }
        throw AnonymousClass000.A0k("UTF8 string too large");
    }
}

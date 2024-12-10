package X;

public abstract class DZO implements E8N, EEP {
    public int A00;
    public long A01;
    public final byte[] A02;

    public DZO() {
        this.A02 = new byte[4];
        this.A00 = 0;
    }

    public DZO(DZO dzo) {
        this.A02 = new byte[4];
        A0R(dzo);
    }

    public static int A01(int i, int i2) {
        return ((i >>> 25) | (i << 7)) + i2;
    }

    public static int A02(int i, int i2) {
        return ((i >>> 26) | (i << 6)) + i2;
    }

    public static int A06(int i, int i2, int i3) {
        return (i & i2) | (i3 & (i2 ^ -1));
    }

    public static int A08(int i, int i2, int i3, int i4) {
        return i4 + (((i2 ^ -1) & i3) | (i & i2));
    }

    public static int A09(int i, int i2, int i3, int i4) {
        return i4 + ((i ^ i2) ^ i3);
    }

    public static int A0A(int i, int i2, int i3, int i4) {
        return ((i >>> i2) | i3) + i4;
    }

    public static int A0B(int i, int i2, int i3, int i4, int i5) {
        return i4 + ((i & i2) | (i3 & (i2 ^ -1))) + i5;
    }

    public static int A0C(int i, int i2, int i3, int i4, int i5) {
        return i4 + ((i ^ i2) ^ i3) + i5;
    }

    public void A0R(DZO dzo) {
        System.arraycopy(dzo.A02, 0, this.A02, 0, 4);
        this.A00 = dzo.A00;
        this.A01 = dzo.A01;
    }

    public int BNv() {
        return 64;
    }

    public void CQK(byte b) {
        byte[] bArr = this.A02;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == 4) {
            A0S(bArr, 0);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void reset() {
        this.A01 = 0;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A02;
            if (i < 4) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.A00;
        int i5 = 0;
        if (i4 != 0) {
            while (true) {
                if (i5 >= max) {
                    i3 = i5;
                    break;
                }
                byte[] bArr2 = this.A02;
                int i6 = i4;
                i4++;
                this.A00 = i4;
                int i7 = i5 + 1;
                BE6.A1P(bArr, bArr2, i5 + i, i6);
                if (i4 == 4) {
                    A0S(bArr2, 0);
                    this.A00 = 0;
                    i4 = 0;
                    i3 = i7;
                    break;
                }
                i5 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            A0S(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.A02;
            int i9 = i4;
            i4++;
            this.A00 = i4;
            BE6.A1P(bArr, bArr3, i3 + i, i9);
            i3++;
        }
        this.A01 += (long) max;
    }

    public static int A00(int i) {
        return (i >>> 22) | (i << 10);
    }

    public static int A03(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 17) | (i4 << 15)) + i3;
    }

    public static int A04(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 21) | (i4 << 11)) + i3;
    }

    public static int A05(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 23) | (i4 << 9)) + i3;
    }

    public static int A07(int i, int i2, int i3, int i4) {
        return i4 + ((i2 | (i ^ -1)) ^ i3);
    }

    public static int A0D(int i, int i2, int i3, int i4, int i5) {
        return i4 + ((i2 | (i ^ -1)) ^ i3) + i5;
    }

    public static void A0E(int[] iArr, int i) {
        int i2 = iArr[i - 2];
        int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
        int i4 = iArr[i - 15];
        iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
    }

    public void A0Q() {
        int i;
        long j = this.A01 << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            CQK(b);
            if (this.A00 == 0) {
                break;
            }
            b = 0;
        }
        if (this instanceof C28393Dyd) {
            C28393Dyd dyd = (C28393Dyd) this;
            int i2 = dyd.A00;
            if (i2 > 14) {
                dyd.A03[i2] = 0;
                dyd.A00 = i2 + 1;
                dyd.A0T();
            }
            while (true) {
                i = dyd.A00;
                if (i >= 14) {
                    break;
                }
                dyd.A03[i] = 0;
                dyd.A00 = i + 1;
            }
            int[] iArr = dyd.A03;
            int i3 = i + 1;
            iArr[i] = AnonymousClass8BR.A02(j);
            dyd.A00 = i3 + 1;
            iArr[i3] = (int) j;
        } else if (this instanceof C28396Dyg) {
            C28396Dyg dyg = (C28396Dyg) this;
            if (dyg.A00 > 14) {
                dyg.A0T();
            }
            int[] iArr2 = dyg.A01;
            iArr2[14] = AnonymousClass8BR.A02(j);
            iArr2[15] = (int) j;
        } else if (this instanceof C28395Dyf) {
            C28395Dyf dyf = (C28395Dyf) this;
            if (dyf.A00 > 14) {
                dyf.A0T();
            }
            int[] iArr3 = dyf.A01;
            iArr3[14] = AnonymousClass8BR.A02(j);
            iArr3[15] = (int) j;
        } else if (this instanceof C28397Dyh) {
            C28397Dyh dyh = (C28397Dyh) this;
            if (dyh.A00 > 14) {
                dyh.A0T();
            }
            int[] iArr4 = dyh.A01;
            iArr4[14] = AnonymousClass8BR.A02(j);
            iArr4[15] = (int) j;
        } else if (this instanceof C28398Dyi) {
            C28398Dyi dyi = (C28398Dyi) this;
            if (dyi.A00 > 14) {
                dyi.A0T();
            }
            int[] iArr5 = dyi.A01;
            iArr5[14] = (int) (-1 & j);
            iArr5[15] = AnonymousClass8BR.A02(j);
        } else {
            C28394Dye dye = (C28394Dye) this;
            if (dye.A00 > 14) {
                dye.A0T();
            }
            int[] iArr6 = dye.A01;
            iArr6[14] = (int) (-1 & j);
            iArr6[15] = AnonymousClass8BR.A02(j);
        }
        A0T();
    }

    public void A0S(byte[] bArr, int i) {
        if (this instanceof C28393Dyd) {
            C28393Dyd dyd = (C28393Dyd) this;
            int i2 = i + 1;
            int A05 = BEB.A05((bArr[i] & 255) << 24, bArr, (bArr[i2] & 255) << 16, i2);
            int[] iArr = dyd.A03;
            int i3 = dyd.A00;
            iArr[i3] = A05;
            int i4 = i3 + 1;
            dyd.A00 = i4;
            if (i4 >= 16) {
                dyd.A0T();
            }
        } else if (this instanceof C28396Dyg) {
            C28396Dyg dyg = (C28396Dyg) this;
            int i5 = i + 1;
            int A052 = BEB.A05(bArr[i] << 24, bArr, (bArr[i5] & 255) << 16, i5);
            int[] iArr2 = dyg.A01;
            int i6 = dyg.A00;
            iArr2[i6] = A052;
            int i7 = i6 + 1;
            dyg.A00 = i7;
            if (i7 == 16) {
                dyg.A0T();
            }
        } else if (this instanceof C28395Dyf) {
            C28395Dyf dyf = (C28395Dyf) this;
            int i8 = i + 1;
            int A053 = BEB.A05(bArr[i] << 24, bArr, (bArr[i8] & 255) << 16, i8);
            int[] iArr3 = dyf.A01;
            int i9 = dyf.A00;
            iArr3[i9] = A053;
            int i10 = i9 + 1;
            dyf.A00 = i10;
            if (i10 == 16) {
                dyf.A0T();
            }
        } else if (this instanceof C28397Dyh) {
            C28397Dyh dyh = (C28397Dyh) this;
            int i11 = i + 1;
            int A054 = BEB.A05(bArr[i] << 24, bArr, (bArr[i11] & 255) << 16, i11);
            int[] iArr4 = dyh.A01;
            int i12 = dyh.A00;
            iArr4[i12] = A054;
            int i13 = i12 + 1;
            dyh.A00 = i13;
            if (i13 == 16) {
                dyh.A0T();
            }
        } else if (this instanceof C28398Dyi) {
            C28398Dyi dyi = (C28398Dyi) this;
            int[] iArr5 = dyi.A01;
            int i14 = dyi.A00;
            int i15 = i14 + 1;
            dyi.A00 = i15;
            iArr5[i14] = ((bArr[i + 3] & 255) << 24) | BE7.A09(bArr, i + 1, bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
            if (i15 == 16) {
                dyi.A0T();
            }
        } else {
            C28394Dye dye = (C28394Dye) this;
            int[] iArr6 = dye.A01;
            int i16 = dye.A00;
            int i17 = i16 + 1;
            dye.A00 = i17;
            iArr6[i16] = ((bArr[i + 3] & 255) << 24) | BE7.A09(bArr, i + 1, bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
            if (i17 == 16) {
                dye.A0T();
            }
        }
    }

    public void A0T() {
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C28393Dyd dyd = (C28393Dyd) this;
        int i8 = 0;
        do {
            iArr = dyd.A02;
            i8 = BE6.A0L(dyd.A03, iArr, i8);
        } while (i8 < 16);
        int i9 = 16;
        do {
            int i10 = iArr[i9 - 3];
            int i11 = (i10 >>> 17) | (i10 << 15);
            int i12 = iArr[i9 - 13];
            int i13 = i11 ^ (iArr[i9 - 16] ^ iArr[i9 - 9]);
            iArr[i9] = (((i13 ^ ((i13 << 15) | (i13 >>> 17))) ^ ((i13 << 23) | (i13 >>> 9))) ^ ((i12 >>> 25) | (i12 << 7))) ^ iArr[i9 - 6];
            i9++;
        } while (i9 < 68);
        int[] iArr3 = dyd.A01;
        int i14 = iArr3[0];
        int i15 = i14;
        int i16 = iArr3[1];
        int i17 = iArr3[2];
        int i18 = iArr3[3];
        int i19 = iArr3[4];
        int i20 = iArr3[5];
        int i21 = iArr3[6];
        int i22 = iArr3[7];
        int i23 = 0;
        do {
            int i24 = (i14 << 12) | (i14 >>> 20);
            iArr2 = C28393Dyd.A04;
            int i25 = i24 + i19 + iArr2[i23];
            int i26 = (i25 << 7) | (i25 >>> 25);
            int i27 = iArr[i23];
            int i28 = ((i14 ^ i16) ^ i17) + i18 + (i24 ^ i26) + (iArr[i23 + 4] ^ i27);
            i = i21;
            int i29 = ((i19 ^ i20) ^ i21) + i22 + i26 + i27;
            int i30 = (i20 << 19) | (i20 >>> 13);
            i2 = (i29 ^ ((i29 << 9) | (i29 >>> 23))) ^ ((i29 << 17) | (i29 >>> 15));
            i23++;
            i20 = i19;
            i19 = i2;
            i18 = i17;
            i17 = (i16 << 9) | (i16 >>> 23);
            i22 = i21;
            i21 = i30;
            i16 = i14;
            i14 = i28;
        } while (i23 < 16);
        int i31 = 16;
        do {
            int i32 = (i14 << 12) | (i14 >>> 20);
            int i33 = i32 + i2 + iArr2[i31];
            int i34 = (i33 << 7) | (i33 >>> 25);
            int i35 = i34 ^ i32;
            int i36 = iArr[i31];
            i3 = i17;
            i4 = ((i14 & i17) | (i14 & i16) | (i16 & i17)) + i18 + i35 + (i36 ^ iArr[i31 + 4]);
            i5 = i21;
            int A08 = BE8.A08(i20, i2, i21) + i + i34 + i36;
            i6 = (i16 >>> 23) | (i16 << 9);
            i7 = (i20 << 19) | (i20 >>> 13);
            i2 = (A08 ^ ((A08 << 9) | (A08 >>> 23))) ^ ((A08 << 17) | (A08 >>> 15));
            i31++;
            i20 = i19;
            i19 = i2;
            i18 = i3;
            i17 = i6;
            i16 = i14;
            i14 = i4;
            i = i21;
            i21 = i7;
        } while (i31 < 64);
        iArr3[0] = i4 ^ i15;
        iArr3[1] = iArr3[1] ^ i16;
        iArr3[2] = iArr3[2] ^ i6;
        iArr3[3] = iArr3[3] ^ i3;
        iArr3[4] = iArr3[4] ^ i2;
        iArr3[5] = iArr3[5] ^ i20;
        iArr3[6] = i7 ^ iArr3[6];
        iArr3[7] = iArr3[7] ^ i5;
        dyd.A00 = 0;
    }
}

package X;

public class DYa implements E9Y {
    public int A00;
    public int A01;
    public E9Y A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public boolean A08;

    public int BNR() {
        return this.A02.BNR();
    }

    public void reset() {
        this.A01 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A04;
            if (i != bArr.length) {
                if (this.A03) {
                    bArr[i] = 0;
                } else {
                    bArr[i] = this.A06[i];
                }
                i++;
            } else {
                this.A02.reset();
                return;
            }
        }
    }

    public String BMl() {
        String str;
        boolean z = this.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        String BMl = this.A02.BMl();
        if (z) {
            A10.append(BMl);
            str = "/PGPCFBwithIV";
        } else {
            A10.append(BMl);
            str = "/PGPCFB";
        }
        return AnonymousClass000.A0y(str, A10);
    }

    public void BdC(E3O e3o, boolean z) {
        E9Y e9y;
        this.A08 = z;
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A06;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            e9y = this.A02;
            e3o = dYm.A00;
        } else {
            reset();
            e9y = this.A02;
        }
        e9y.BdC(e3o, true);
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = this.A03;
        boolean z2 = this.A08;
        int i6 = i;
        int i7 = i2;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (z) {
            if (z2) {
                i3 = this.A00;
                if (i + i3 <= bArr3.length) {
                    int i8 = this.A01;
                    if (i8 == 0) {
                        int i9 = i3 * 2;
                        if (i9 + i2 + 2 <= bArr4.length) {
                            E9Y e9y = this.A02;
                            byte[] bArr5 = this.A04;
                            byte[] bArr6 = this.A05;
                            e9y.CCe(bArr5, bArr6, 0, 0);
                            for (int i10 = 0; i10 < i3; i10++) {
                                BE6.A1Q(this.A05, bArr4, i10, this.A06[i10], i2 + i10);
                            }
                            System.arraycopy(bArr4, i7, bArr5, 0, i3);
                            e9y.CCe(bArr5, bArr6, 0, 0);
                            int i11 = i2 + i3;
                            byte[] bArr7 = this.A06;
                            byte b = bArr7[i3 - 2];
                            byte[] bArr8 = this.A05;
                            BE6.A1Q(bArr8, bArr4, 0, b, i11);
                            BE6.A1Q(bArr8, bArr4, 1, bArr7[i3 - 1], i11 + 1);
                            System.arraycopy(bArr4, i2 + 2, bArr5, 0, i3);
                            e9y.CCe(bArr5, bArr6, 0, 0);
                            for (int i12 = 0; i12 < i3; i12++) {
                                BE6.A1Q(this.A05, bArr4, i12, bArr[i + i12], i11 + 2 + i12);
                            }
                            System.arraycopy(bArr4, i11 + 2, bArr5, 0, i3);
                            i4 = i9 + 2;
                            i5 = this.A01 + i4;
                        } else {
                            throw new C28380DyQ("output buffer too short");
                        }
                    } else if (i8 >= i3 + 2) {
                        if (i3 + i2 <= bArr4.length) {
                            E9Y e9y2 = this.A02;
                            byte[] bArr9 = this.A04;
                            e9y2.CCe(bArr9, this.A05, 0, 0);
                            for (int i13 = 0; i13 < i3; i13++) {
                                BE6.A1Q(this.A05, bArr4, i13, bArr[i + i13], i2 + i13);
                            }
                            System.arraycopy(bArr4, i7, bArr9, 0, i3);
                        } else {
                            throw new C28380DyQ("output buffer too short");
                        }
                    }
                } else {
                    throw C28387DyX.A01();
                }
            } else {
                int i14 = this.A00;
                if (i + i14 > bArr3.length) {
                    throw C28387DyX.A01();
                } else if (i2 + i14 <= bArr4.length) {
                    int i15 = this.A01;
                    if (i15 == 0) {
                        for (int i16 = 0; i16 < i14; i16++) {
                            BE6.A1P(bArr3, this.A04, i + i16, i16);
                        }
                        this.A02.CCe(this.A04, this.A05, 0, 0);
                        this.A01 += i14;
                        return 0;
                    } else if (i15 == i14) {
                        byte[] bArr10 = this.A07;
                        System.arraycopy(bArr3, i6, bArr10, 0, i14);
                        byte[] bArr11 = this.A04;
                        i4 = i14 - 2;
                        System.arraycopy(bArr11, 2, bArr11, 0, i4);
                        int i17 = i14 - 2;
                        BE6.A1P(bArr10, bArr11, 0, i17);
                        BE6.A1P(bArr10, bArr11, 1, i14 - 1);
                        this.A02.CCe(bArr11, this.A05, 0, 0);
                        for (int i18 = 0; i18 < i17; i18++) {
                            BE6.A1Q(this.A05, bArr4, i18, bArr10[i18 + 2], i2 + i18);
                        }
                        System.arraycopy(bArr10, 2, bArr11, 0, i4);
                        i5 = this.A01 + 2;
                    } else {
                        if (i15 >= i14 + 2) {
                            byte[] bArr12 = this.A07;
                            System.arraycopy(bArr3, i6, bArr12, 0, i14);
                            byte b2 = bArr12[0];
                            int i19 = i14 - 2;
                            byte[] bArr13 = this.A05;
                            BE6.A1Q(bArr13, bArr4, i19, b2, i7);
                            BE6.A1Q(bArr13, bArr4, i14 - 1, bArr12[1], i2 + 1);
                            byte[] bArr14 = this.A04;
                            System.arraycopy(bArr12, 0, bArr14, i19, 2);
                            this.A02.CCe(bArr14, this.A05, 0, 0);
                            for (int i20 = 0; i20 < i14 - 2; i20++) {
                                BE6.A1Q(this.A05, bArr4, i20, bArr12[i20 + 2], i2 + i20 + 2);
                            }
                            System.arraycopy(bArr12, 2, bArr14, 0, i19);
                        }
                        return i14;
                    }
                } else {
                    throw C28380DyQ.A00();
                }
            }
            this.A01 = i5;
            return i4;
        }
        i3 = this.A00;
        int i21 = i + i3;
        int length = bArr3.length;
        if (z2) {
            if (i21 > length) {
                throw C28387DyX.A01();
            } else if (i3 + i2 <= bArr4.length) {
                E9Y e9y3 = this.A02;
                byte[] bArr15 = this.A04;
                e9y3.CCe(bArr15, this.A05, 0, 0);
                for (int i22 = 0; i22 < i3; i22++) {
                    BE6.A1Q(this.A05, bArr4, i22, bArr[i + i22], i2 + i22);
                }
                for (int i23 = 0; i23 < i3; i23++) {
                    BE6.A1P(bArr4, bArr15, i2 + i23, i23);
                }
            } else {
                throw C28380DyQ.A00();
            }
        } else if (i21 > length) {
            throw C28387DyX.A01();
        } else if (i3 + i2 <= bArr4.length) {
            E9Y e9y4 = this.A02;
            byte[] bArr16 = this.A04;
            e9y4.CCe(bArr16, this.A05, 0, 0);
            for (int i24 = 0; i24 < i3; i24++) {
                BE6.A1Q(this.A05, bArr4, i24, bArr[i + i24], i2 + i24);
            }
            for (int i25 = 0; i25 < i3; i25++) {
                BE6.A1P(bArr3, bArr16, i + i25, i25);
            }
        } else {
            throw C28380DyQ.A00();
        }
        return i3;
    }
}

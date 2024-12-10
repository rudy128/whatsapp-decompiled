package X;

public class DZ0 implements EEQ {
    public int A00;
    public int A01;
    public E9Y A02;
    public E3O A03;
    public C24170Bwe A04 = new C24170Bwe(this);
    public C24170Bwe A05 = new C24170Bwe(this);
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;

    public byte[] BUI() {
        int i = this.A01;
        byte[] bArr = new byte[i];
        System.arraycopy(this.A08, 0, bArr, 0, i);
        return bArr;
    }

    public int BVw(int i) {
        int size = i + this.A05.size();
        boolean z = this.A06;
        int i2 = this.A01;
        if (z) {
            return size + i2;
        }
        int i3 = size;
        int i4 = size - i2;
        if (i3 < i2) {
            return 0;
        }
        return i4;
    }

    public E9Y Bax() {
        return this.A02;
    }

    public int Bb2(int i) {
        return 0;
    }

    public void CCd(byte[] bArr, int i, int i2) {
        this.A04.write(bArr, i, i2);
    }

    public int CCg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length >= i + i2) {
            this.A05.write(bArr, i, i2);
            return 0;
        }
        throw new C28387DyX("Input buffer too short");
    }

    private void A00(byte[] bArr, byte[] bArr2, int i, int i2) {
        int length;
        int length2;
        int length3;
        int i3;
        int i4 = i;
        int i5 = i2;
        E9Y e9y = this.A02;
        int i6 = this.A01 * 8;
        if (i6 % 8 == 0) {
            DYb dYb = new DYb(e9y);
            int i7 = i6 / 8;
            int BNR = e9y.BNR();
            byte[] bArr3 = new byte[BNR];
            byte[] bArr4 = new byte[BNR];
            E3O e3o = this.A03;
            for (int i8 = 0; i8 < BNR; i8++) {
                bArr4[i8] = 0;
            }
            dYb.reset();
            dYb.BdC(e3o, true);
            byte[] bArr5 = new byte[16];
            C24170Bwe bwe = this.A04;
            int size = bwe.size();
            byte[] bArr6 = this.A07;
            if (bArr6 == null) {
                length = 0;
            } else {
                length = bArr6.length;
            }
            if (size + length > 0) {
                bArr5[0] = (byte) (bArr5[0] | 64);
            }
            int i9 = 2;
            byte b = (byte) (bArr5[0] | ((((i7 - 2) / 2) & 7) << 3));
            bArr5[0] = b;
            byte[] bArr7 = this.A09;
            int length4 = bArr7.length;
            BE6.A1N(bArr5, b, ((15 - length4) - 1) & 7, 0);
            System.arraycopy(bArr7, 0, bArr5, 1, length4);
            int i10 = i5;
            int i11 = 1;
            while (i10 > 0) {
                bArr5[16 - i11] = (byte) (i10 & 255);
                i10 >>>= 8;
                i11++;
            }
            int i12 = 0;
            int i13 = 16;
            int BNR2 = dYb.A01.BNR();
            if (16 > BNR2) {
                System.arraycopy(bArr5, 0, bArr4, 0, BNR2);
                dYb.CCe(bArr4, bArr3, 0, 0);
                i13 = 16 - BNR2;
                i12 = BNR2;
                while (i13 > BNR2) {
                    dYb.CCe(bArr5, bArr3, i12, 0);
                    i13 -= BNR2;
                    i12 += BNR2;
                }
            }
            System.arraycopy(bArr5, i12, bArr4, 0, i13);
            int size2 = bwe.size();
            byte[] bArr8 = this.A07;
            if (bArr8 == null) {
                length2 = 0;
            } else {
                length2 = bArr8.length;
            }
            if (size2 + length2 > 0) {
                int size3 = bwe.size();
                byte[] bArr9 = this.A07;
                if (bArr9 == null) {
                    length3 = 0;
                } else {
                    length3 = bArr9.length;
                }
                int i14 = size3 + length3;
                if (i14 < 65280) {
                    byte b2 = (byte) (i14 >> 8);
                    if (i13 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i13 = 0;
                    }
                    int i15 = i13 + 1;
                    bArr4[i13] = b2;
                    byte b3 = (byte) i14;
                    if (i15 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i15 = 0;
                    }
                    i3 = i15 + 1;
                    bArr4[i15] = b3;
                } else {
                    if (i13 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i13 = 0;
                    }
                    int i16 = i13 + 1;
                    bArr4[i13] = -1;
                    if (i16 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i16 = 0;
                    }
                    int i17 = i16 + 1;
                    bArr4[i16] = -2;
                    byte b4 = (byte) (i14 >> 24);
                    if (i17 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i17 = 0;
                    }
                    int i18 = i17 + 1;
                    bArr4[i17] = b4;
                    byte b5 = (byte) (i14 >> 16);
                    if (i18 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArr4[i18] = b5;
                    byte b6 = (byte) (i14 >> 8);
                    if (i19 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i19 = 0;
                    }
                    int i20 = i19 + 1;
                    bArr4[i19] = b6;
                    byte b7 = (byte) i14;
                    if (i20 == BNR) {
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i20 = 0;
                    }
                    i3 = i20 + 1;
                    bArr4[i20] = b7;
                    i9 = 6;
                }
                byte[] bArr10 = this.A07;
                if (bArr10 != null) {
                    int length5 = bArr10.length;
                    int i21 = 0;
                    int i22 = BNR2 - i3;
                    if (length5 > i22) {
                        System.arraycopy(bArr10, 0, bArr4, i3, i22);
                        dYb.CCe(bArr4, bArr3, 0, 0);
                        i3 = 0;
                        length5 -= i22;
                        i21 = i22;
                        while (length5 > BNR2) {
                            dYb.CCe(bArr10, bArr3, i21, 0);
                            length5 -= BNR2;
                            i21 += BNR2;
                        }
                    }
                    System.arraycopy(bArr10, i21, bArr4, i3, length5);
                    i3 += length5;
                }
                if (bwe.size() > 0) {
                    byte[] A002 = bwe.A00();
                    int size4 = bwe.size();
                    int i23 = 0;
                    if (size4 >= 0) {
                        int i24 = BNR2 - i3;
                        if (size4 > i24) {
                            System.arraycopy(A002, 0, bArr4, i3, i24);
                            dYb.CCe(bArr4, bArr3, 0, 0);
                            i3 = 0;
                            size4 -= i24;
                            i23 = i24;
                            while (size4 > BNR2) {
                                dYb.CCe(A002, bArr3, i23, 0);
                                size4 -= BNR2;
                                i23 += BNR2;
                            }
                        }
                        System.arraycopy(A002, i23, bArr4, i3, size4);
                        i3 += size4;
                    } else {
                        throw AnonymousClass000.A0k("Can't have a negative input length!");
                    }
                }
                int i25 = (i9 + i14) % 16;
                if (i25 != 0) {
                    while (i25 != 16) {
                        int i26 = i13;
                        if (i13 == BNR) {
                            dYb.CCe(bArr4, bArr3, 0, 0);
                            i26 = 0;
                        }
                        i13 = i26 + 1;
                        bArr4[i26] = 0;
                        i25++;
                    }
                }
            }
            if (i2 >= 0) {
                int i27 = BNR2 - i13;
                byte[] bArr11 = bArr;
                if (i5 > i27) {
                    System.arraycopy(bArr11, i4, bArr4, i13, i27);
                    dYb.CCe(bArr4, bArr3, 0, 0);
                    i13 = 0;
                    i5 = i2 - i27;
                    i4 = i + i27;
                    while (i5 > BNR2) {
                        dYb.CCe(bArr11, bArr3, i4, 0);
                        i5 -= BNR2;
                        i4 += BNR2;
                    }
                }
                System.arraycopy(bArr11, i4, bArr4, i13, i5);
                for (int i28 = i13 + i5; i28 < BNR2; i28++) {
                    bArr4[i28] = 0;
                }
                dYb.CCe(bArr4, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr2, 0, i7);
                for (int i29 = 0; i29 < BNR; i29++) {
                    bArr4[i29] = 0;
                }
                dYb.reset();
                return;
            }
            throw AnonymousClass000.A0k("Can't have a negative input length!");
        }
        throw AnonymousClass000.A0k("MAC size must be multiple of 8");
    }

    public int BJ4(byte[] bArr, int i) {
        int i2;
        C24170Bwe bwe = this.A05;
        byte[] A002 = bwe.A00();
        int size = bwe.size();
        if (this.A03 != null) {
            byte[] bArr2 = this.A09;
            int length = bArr2.length;
            int i3 = 15 - length;
            if (i3 >= 4 || size < (1 << (i3 * 8))) {
                int i4 = this.A00;
                byte[] bArr3 = new byte[i4];
                bArr3[0] = (byte) ((i3 - 1) & 7);
                System.arraycopy(bArr2, 0, bArr3, 1, length);
                E9Y e9y = this.A02;
                C28392Dyc dyc = new C28392Dyc(e9y);
                dyc.BdC(new DYm(this.A03, bArr3), this.A06);
                boolean z = this.A06;
                int i5 = this.A01;
                if (z) {
                    i2 = i5 + size;
                    if (bArr.length >= i2 + i) {
                        byte[] bArr4 = this.A08;
                        A00(A002, bArr4, 0, size);
                        byte[] bArr5 = new byte[i4];
                        dyc.CCe(bArr4, bArr5, 0, 0);
                        int i6 = 0;
                        int i7 = i;
                        while (i6 < size - i4) {
                            dyc.CCe(A002, bArr, i6, i7);
                            i7 += i4;
                            i6 += i4;
                        }
                        byte[] bArr6 = new byte[i4];
                        int i8 = size - i6;
                        System.arraycopy(A002, i6, bArr6, 0, i8);
                        dyc.CCe(bArr6, bArr6, 0, 0);
                        System.arraycopy(bArr6, 0, bArr, i7, i8);
                        System.arraycopy(bArr5, 0, bArr, i + size, this.A01);
                    } else {
                        throw new C28380DyQ("Output buffer too short.");
                    }
                } else if (size >= i5) {
                    int i9 = size - i5;
                    if (bArr.length >= i9 + i) {
                        byte[] bArr7 = this.A08;
                        System.arraycopy(A002, i9, bArr7, 0, i5);
                        dyc.CCe(bArr7, bArr7, 0, 0);
                        for (int i10 = this.A01; i10 != bArr7.length; i10++) {
                            bArr7[i10] = 0;
                        }
                        int i11 = 0;
                        int i12 = i;
                        while (i11 < i9 - i4) {
                            dyc.CCe(A002, bArr, i11, i12);
                            i12 += i4;
                            i11 += i4;
                        }
                        byte[] bArr8 = new byte[i4];
                        int i13 = i9 - i11;
                        System.arraycopy(A002, i11, bArr8, 0, i13);
                        dyc.CCe(bArr8, bArr8, 0, 0);
                        System.arraycopy(bArr8, 0, bArr, i12, i13);
                        byte[] bArr9 = new byte[i4];
                        A00(bArr, bArr9, i, i9);
                        if (AnonymousClass1C2.A01(bArr7, bArr9)) {
                            i2 = i9;
                        } else {
                            throw new C28379DyP("mac check in CCM failed");
                        }
                    } else {
                        throw new C28380DyQ("Output buffer too short.");
                    }
                } else {
                    throw new C28379DyP("data too short");
                }
                e9y.reset();
                this.A04.reset();
                bwe.reset();
                return i2;
            }
            throw AnonymousClass000.A0n("CCM packet too large for choice of q.");
        }
        throw AnonymousClass000.A0n("CCM cipher unitialized.");
    }

    public void BdC(E3O e3o, boolean z) {
        E3O e3o2;
        int length;
        this.A06 = z;
        if (e3o instanceof DYn) {
            DYn dYn = (DYn) e3o;
            this.A09 = AnonymousClass1C2.A02(dYn.A03);
            this.A07 = AnonymousClass1C2.A02(dYn.A02);
            int i = dYn.A00;
            if (!z || (i >= 32 && i <= 128 && (i & 15) == 0)) {
                this.A01 = i >>> 3;
                e3o2 = dYn.A01;
            } else {
                throw AnonymousClass000.A0k("tag length in octets must be one of {4,6,8,10,12,14,16}");
            }
        } else if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            this.A09 = dYm.A01;
            this.A07 = null;
            this.A01 = 8;
            e3o2 = dYm.A00;
        } else {
            throw BEB.A0T(e3o, "invalid parameters passed to CCM: ", AnonymousClass000.A10());
        }
        if (e3o2 != null) {
            this.A03 = e3o2;
        }
        byte[] bArr = this.A09;
        if (bArr == null || (length = bArr.length) < 7 || length > 13) {
            throw AnonymousClass000.A0k("nonce must have length from 7 to 13 octets");
        }
        this.A02.reset();
        this.A04.reset();
        this.A05.reset();
    }

    public DZ0(E9Y e9y) {
        this.A02 = e9y;
        int BNR = e9y.BNR();
        this.A00 = BNR;
        this.A08 = new byte[BNR];
        if (BNR != 16) {
            throw AnonymousClass000.A0k("cipher required with a block size of 16.");
        }
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A02);
        return AnonymousClass000.A0y("/CCM", A10);
    }
}

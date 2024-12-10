package X;

public abstract class DYf implements E9Y, E3P {
    public final E9Y A00;

    public DYf(E9Y e9y) {
        this.A00 = e9y;
    }

    public byte A00(byte b) {
        byte[] bArr;
        byte b2;
        int i;
        int i2;
        byte[] bArr2;
        byte b3;
        int i3;
        byte[] bArr3;
        byte b4;
        if (this instanceof C28392Dyc) {
            C28392Dyc dyc = (C28392Dyc) this;
            int i4 = dyc.A00;
            if (i4 == 0) {
                E9Y e9y = dyc.A05;
                byte[] bArr4 = dyc.A02;
                byte[] bArr5 = dyc.A03;
                e9y.CCe(bArr4, bArr5, 0, 0);
                int i5 = dyc.A00;
                dyc.A00 = i5 + 1;
                return (byte) (b ^ bArr5[i5]);
            }
            byte[] bArr6 = dyc.A03;
            int i6 = i4 + 1;
            dyc.A00 = i6;
            byte b5 = (byte) (b ^ bArr6[i4]);
            byte[] bArr7 = dyc.A02;
            int length = bArr7.length;
            if (i6 != length) {
                return b5;
            }
            dyc.A00 = 0;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                b4 = (byte) (bArr7[length] + 1);
                bArr7[length] = b4;
            } while (b4 == 0);
            byte[] bArr8 = dyc.A01;
            int length2 = bArr8.length;
            if (length2 >= dyc.A04) {
                return b5;
            }
            int i7 = 0;
            while (i7 != length2) {
                if (bArr7[i7] == bArr8[i7]) {
                    i7++;
                } else {
                    throw AnonymousClass000.A0n("Counter in CTR/SIC mode out of range.");
                }
            }
            return b5;
        }
        if (this instanceof C28388DyY) {
            C28388DyY dyY = (C28388DyY) this;
            i2 = 0;
            if (dyY.A00 == 0) {
                dyY.A05.CCe(dyY.A02, dyY.A01, 0, 0);
            }
            bArr2 = dyY.A01;
            int i8 = dyY.A00;
            int i9 = i8 + 1;
            dyY.A00 = i9;
            b3 = (byte) (b ^ bArr2[i8]);
            i3 = dyY.A04;
            if (i9 != i3) {
                return b3;
            }
            dyY.A00 = 0;
            bArr3 = dyY.A02;
        } else if (this instanceof C28390Dya) {
            C28390Dya dya = (C28390Dya) this;
            i2 = 0;
            if (dya.A02 == 0) {
                if (dya.A03) {
                    dya.A03 = false;
                    E9Y e9y2 = dya.A08;
                    byte[] bArr9 = dya.A05;
                    byte[] bArr10 = dya.A04;
                    e9y2.CCe(bArr9, bArr10, 0, 0);
                    dya.A00 = ((bArr10[3] << 24) & -16777216) + ((bArr10[2] << 16) & 16711680) + ((bArr10[1] << 8) & 65280) + (bArr10[0] & 255);
                    dya.A01 = ((bArr10[7] << 24) & -16777216) + ((bArr10[6] << 16) & 16711680) + ((bArr10[5] << 8) & 65280) + (bArr10[4] & 255);
                }
                int i10 = dya.A00 + 16843009;
                dya.A00 = i10;
                int i11 = dya.A01 + 16843012;
                dya.A01 = i11;
                if (i11 < 16843012 && i11 > 0) {
                    i11++;
                    dya.A01 = i11;
                }
                byte[] bArr11 = dya.A05;
                bArr11[3] = (byte) (i10 >>> 24);
                bArr11[2] = (byte) (i10 >>> 16);
                bArr11[1] = (byte) (i10 >>> 8);
                bArr11[0] = (byte) i10;
                bArr11[7] = (byte) (i11 >>> 24);
                bArr11[6] = (byte) (i11 >>> 16);
                bArr11[5] = (byte) (i11 >>> 8);
                bArr11[4] = (byte) i11;
                dya.A08.CCe(bArr11, dya.A04, 0, 0);
            }
            bArr2 = dya.A04;
            int i12 = dya.A02;
            int i13 = i12 + 1;
            dya.A02 = i13;
            b3 = (byte) (b ^ bArr2[i12]);
            i3 = dya.A07;
            if (i13 != i3) {
                return b3;
            }
            dya.A02 = 0;
            bArr3 = dya.A05;
        } else if (this instanceof C28391Dyb) {
            C28391Dyb dyb = (C28391Dyb) this;
            long j = dyb.A00;
            if (j > 0 && j % 1024 == 0) {
                C28389DyZ dyZ = dyb.A03;
                E9Y e9y3 = dyZ.A00;
                e9y3.BdC(dyb.A01, false);
                byte[] bArr12 = new byte[32];
                byte[] bArr13 = C28391Dyb.A04;
                e9y3.CCe(bArr13, bArr12, 0, 0);
                e9y3.CCe(bArr13, bArr12, 8, 8);
                e9y3.CCe(bArr13, bArr12, 16, 16);
                e9y3.CCe(bArr13, bArr12, 24, 24);
                C27190DYo dYo = new C27190DYo(bArr12);
                dyb.A01 = dYo;
                e9y3.BdC(dYo, true);
                byte[] A02 = AnonymousClass1C2.A02(dyZ.A05);
                e9y3.CCe(A02, A02, 0, 0);
                dyZ.BdC(new DYm(dyb.A01, A02), dyb.A02);
            }
            dyb.A00++;
            return dyb.A03.A00(b);
        } else {
            C28389DyZ dyZ2 = (C28389DyZ) this;
            boolean z = dyZ2.A03;
            int i14 = dyZ2.A01;
            if (z) {
                if (i14 == 0) {
                    dyZ2.A02.CCe(dyZ2.A05, dyZ2.A04, 0, 0);
                }
                byte[] bArr14 = dyZ2.A04;
                int i15 = dyZ2.A01;
                b2 = (byte) (b ^ bArr14[i15]);
                bArr = dyZ2.A06;
                int i16 = i15 + 1;
                dyZ2.A01 = i16;
                bArr[i15] = b2;
                i = dyZ2.A00;
                if (i16 != i) {
                    return b2;
                }
            } else {
                if (i14 == 0) {
                    dyZ2.A02.CCe(dyZ2.A05, dyZ2.A04, 0, 0);
                }
                bArr = dyZ2.A06;
                int i17 = dyZ2.A01;
                bArr[i17] = b;
                byte[] bArr15 = dyZ2.A04;
                int i18 = i17 + 1;
                dyZ2.A01 = i18;
                b2 = (byte) (b ^ bArr15[i17]);
                i = dyZ2.A00;
                if (i18 != i) {
                    return b2;
                }
            }
            dyZ2.A01 = 0;
            byte[] bArr16 = dyZ2.A05;
            int length3 = bArr16.length - i;
            System.arraycopy(bArr16, i, bArr16, 0, length3);
            System.arraycopy(bArr, 0, bArr16, length3, i);
            return b2;
        }
        int length4 = bArr3.length - i3;
        System.arraycopy(bArr3, i3, bArr3, i2, length4);
        System.arraycopy(bArr2, i2, bArr3, length4, i3);
        return b3;
    }

    public void A01(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new C28387DyX("input buffer too small");
        } else if (i3 + i2 > bArr2.length) {
            throw C28380DyQ.A00();
        } else {
            while (i < i4) {
                bArr2[i3] = A00(bArr[i]);
                i3++;
                i++;
            }
        }
    }
}

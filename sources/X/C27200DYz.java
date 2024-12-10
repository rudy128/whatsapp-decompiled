package X;

/* renamed from: X.DYz  reason: case insensitive filesystem */
public class C27200DYz implements E9M {
    public E9Y A00;
    public C27190DYo A01;
    public byte[] A02 = null;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;

    public C27200DYz(E9Y e9y) {
        byte[] bArr = {-90, 89, 89, -90};
        this.A04 = bArr;
        this.A05 = bArr;
        this.A00 = e9y;
    }

    public String BMl() {
        return this.A00.BMl();
    }

    public byte[] CSI(byte[] bArr, int i) {
        if (this.A03) {
            byte[] bArr2 = new byte[8];
            byte[] bArr3 = new byte[4];
            int i2 = i;
            C26210Cuo.A02(bArr3, i2, 0);
            byte[] bArr4 = this.A05;
            int i3 = 0;
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            System.arraycopy(bArr3, 0, bArr2, this.A05.length, 4);
            byte[] bArr5 = new byte[i2];
            System.arraycopy(bArr, 0, bArr5, 0, i2);
            int i4 = (8 - (i % 8)) % 8;
            int i5 = i + i4;
            byte[] bArr6 = new byte[i5];
            System.arraycopy(bArr5, 0, bArr6, 0, i2);
            if (i4 != 0) {
                System.arraycopy(new byte[i4], 0, bArr6, i2, i4);
            }
            if (i5 == 8) {
                byte[] bArr7 = new byte[16];
                System.arraycopy(bArr2, 0, bArr7, 0, 8);
                System.arraycopy(bArr6, 0, bArr7, 8, i5);
                E9Y e9y = this.A00;
                e9y.BdC(this.A01, true);
                do {
                    e9y.CCe(bArr7, bArr7, i3, i3);
                    i3 += e9y.BNR();
                } while (i3 < 16);
                return bArr7;
            }
            E9Y e9y2 = this.A00;
            DYm dYm = new DYm(this.A01, bArr2);
            byte[] bArr8 = dYm.A01;
            E3O e3o = dYm.A00;
            int length = bArr8.length;
            if (length == 8) {
                int i6 = i5 / 8;
                if (i6 * 8 == i5) {
                    byte[] bArr9 = new byte[(i5 + 8)];
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 0, bArr9, 0, length);
                    System.arraycopy(bArr6, 0, bArr9, length, i5);
                    e9y2.BdC(e3o, true);
                    int i7 = 0;
                    do {
                        for (int i8 = 1; i8 <= i6; i8++) {
                            System.arraycopy(bArr9, 0, bArr10, 0, length);
                            System.arraycopy(bArr9, i8 * 8, bArr10, length, 8);
                            e9y2.CCe(bArr10, bArr10, 0, 0);
                            int i9 = (i6 * i7) + i8;
                            int i10 = 1;
                            while (i9 != 0) {
                                int i11 = length - i10;
                                BE6.A1O(bArr10, (byte) i9, bArr10[i11], i11);
                                i9 >>>= 8;
                                i10++;
                            }
                            System.arraycopy(bArr10, 0, bArr9, 0, 8);
                            System.arraycopy(bArr10, 8, bArr9, i8 * 8, 8);
                        }
                        i7++;
                    } while (i7 != 6);
                    return bArr9;
                }
                throw new C28387DyX("wrap data must be a multiple of 8 bytes");
            }
            throw AnonymousClass000.A0k("IV not equal to 8");
        }
        throw AnonymousClass000.A0n("not set for wrapping");
    }

    public void BdC(E3O e3o, boolean z) {
        this.A03 = z;
        if (e3o instanceof DYi) {
            e3o = ((DYi) e3o).A01;
        }
        if (e3o instanceof C27190DYo) {
            this.A01 = (C27190DYo) e3o;
            this.A05 = this.A04;
        } else if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            this.A05 = bArr;
            this.A01 = (C27190DYo) dYm.A00;
            if (bArr.length != 4) {
                throw AnonymousClass000.A0k("IV length not equal to 4");
            }
        }
    }

    public byte[] CQG(byte[] bArr, int i) {
        byte[] bArr2;
        int i2 = i;
        if (!this.A03) {
            int i3 = i / 8;
            if (i3 * 8 != i2) {
                throw new C28379DyP("unwrap data must be a multiple of 8 bytes");
            } else if (i3 > 1) {
                byte[] bArr3 = new byte[i2];
                byte[] bArr4 = bArr;
                System.arraycopy(bArr4, 0, bArr3, 0, i2);
                byte[] bArr5 = new byte[i2];
                if (i3 == 2) {
                    E9Y e9y = this.A00;
                    e9y.BdC(this.A01, false);
                    for (int i4 = 0; i4 < i2; i4 += e9y.BNR()) {
                        e9y.CCe(bArr3, bArr5, i4, i4);
                    }
                    byte[] bArr6 = new byte[8];
                    this.A02 = bArr6;
                    System.arraycopy(bArr5, 0, bArr6, 0, 8);
                    int length = this.A02.length;
                    int i5 = i - length;
                    bArr2 = new byte[i5];
                    System.arraycopy(bArr5, length, bArr2, 0, i5);
                } else {
                    int i6 = i - 8;
                    bArr2 = new byte[i6];
                    byte[] bArr7 = new byte[8];
                    byte[] bArr8 = new byte[16];
                    System.arraycopy(bArr4, 0, bArr7, 0, 8);
                    System.arraycopy(bArr4, 8, bArr2, 0, i6);
                    E9Y e9y2 = this.A00;
                    e9y2.BdC(this.A01, false);
                    int i7 = (i / 8) - 1;
                    int i8 = 5;
                    do {
                        int i9 = i7;
                        while (i9 >= 1) {
                            System.arraycopy(bArr7, 0, bArr8, 0, 8);
                            System.arraycopy(bArr2, (i9 - 1) * 8, bArr8, 8, 8);
                            int i10 = (i7 * i8) + i9;
                            int i11 = 1;
                            while (i10 != 0) {
                                int i12 = 8 - i11;
                                BE6.A1O(bArr8, (byte) i10, bArr8[i12], i12);
                                i10 >>>= 8;
                                i11++;
                            }
                            e9y2.CCe(bArr8, bArr8, 0, 0);
                            System.arraycopy(bArr8, 0, bArr7, 0, 8);
                            i9--;
                            System.arraycopy(bArr8, 8, bArr2, i9 * 8, 8);
                        }
                        i8--;
                    } while (i8 >= 0);
                    this.A02 = bArr7;
                }
                int i13 = 4;
                byte[] bArr9 = new byte[4];
                byte[] bArr10 = new byte[4];
                System.arraycopy(this.A02, 0, bArr9, 0, 4);
                System.arraycopy(this.A02, 4, bArr10, 0, 4);
                int A052 = BEB.A05(bArr10[0] << 24, bArr10, (bArr10[1] & 255) << 16, 1);
                boolean A012 = AnonymousClass1C2.A01(bArr9, this.A05);
                int length2 = bArr2.length;
                if (A052 <= length2 - 8) {
                    A012 = false;
                }
                if (A052 > length2) {
                    A012 = false;
                }
                int i14 = length2 - A052;
                if (i14 >= 8 || i14 < 0) {
                    A012 = false;
                } else {
                    i13 = i14;
                }
                byte[] bArr11 = new byte[i13];
                System.arraycopy(bArr2, length2 - i13, bArr11, 0, i13);
                if (!AnonymousClass1C2.A01(bArr11, new byte[i13]) || !A012) {
                    throw new C28379DyP("checksum failed");
                }
                byte[] bArr12 = new byte[A052];
                System.arraycopy(bArr2, 0, bArr12, 0, A052);
                return bArr12;
            } else {
                throw new C28379DyP("unwrap data must be at least 16 bytes");
            }
        } else {
            throw AnonymousClass000.A0n("not set for unwrapping");
        }
    }
}

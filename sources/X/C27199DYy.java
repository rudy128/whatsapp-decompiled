package X;

/* renamed from: X.DYy  reason: case insensitive filesystem */
public class C27199DYy implements E9M {
    public E9Y A00;
    public C27190DYo A01;
    public boolean A02;
    public byte[] A03 = {-90, -90, -90, -90, -90, -90, -90, -90};

    public String BMl() {
        return this.A00.BMl();
    }

    public byte[] CSI(byte[] bArr, int i) {
        if (this.A02) {
            int i2 = i / 8;
            if (i2 * 8 == i) {
                byte[] bArr2 = this.A03;
                int length = bArr2.length;
                byte[] bArr3 = new byte[(length + i)];
                byte[] bArr4 = new byte[(length + 8)];
                System.arraycopy(bArr2, 0, bArr3, 0, length);
                System.arraycopy(bArr, 0, bArr3, this.A03.length, i);
                E9Y e9y = this.A00;
                e9y.BdC(this.A01, true);
                int i3 = 0;
                do {
                    for (int i4 = 1; i4 <= i2; i4++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.A03.length);
                        System.arraycopy(bArr3, i4 * 8, bArr4, this.A03.length, 8);
                        e9y.CCe(bArr4, bArr4, 0, 0);
                        int i5 = (i2 * i3) + i4;
                        int i6 = 1;
                        while (i5 != 0) {
                            int length2 = this.A03.length - i6;
                            BE6.A1O(bArr4, (byte) i5, bArr4[length2], length2);
                            i5 >>>= 8;
                            i6++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i4 * 8, 8);
                    }
                    i3++;
                } while (i3 != 6);
                return bArr3;
            }
            throw new C28387DyX("wrap data must be a multiple of 8 bytes");
        }
        throw AnonymousClass000.A0n("not set for wrapping");
    }

    public C27199DYy() {
        DYe dYe = new DYe();
        this.A00 = dYe;
    }

    public void BdC(E3O e3o, boolean z) {
        this.A02 = z;
        if (e3o instanceof DYi) {
            e3o = ((DYi) e3o).A01;
        }
        if (e3o instanceof C27190DYo) {
            this.A01 = (C27190DYo) e3o;
        } else if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            this.A03 = bArr;
            this.A01 = (C27190DYo) dYm.A00;
            if (bArr.length != 8) {
                throw AnonymousClass000.A0k("IV not equal to 8");
            }
        }
    }

    public byte[] CQG(byte[] bArr, int i) {
        int i2 = i;
        if (!this.A02) {
            int i3 = i / 8;
            if (i3 * 8 == i2) {
                int length = this.A03.length;
                byte[] bArr2 = new byte[(i - length)];
                byte[] bArr3 = new byte[length];
                byte[] bArr4 = new byte[(length + 8)];
                byte[] bArr5 = bArr;
                System.arraycopy(bArr5, 0, bArr3, 0, length);
                int length2 = this.A03.length;
                System.arraycopy(bArr5, 0 + length2, bArr2, 0, i - length2);
                E9Y e9y = this.A00;
                e9y.BdC(this.A01, false);
                int i4 = i3 - 1;
                int i5 = 5;
                do {
                    int i6 = i4;
                    while (i6 >= 1) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.A03.length);
                        System.arraycopy(bArr2, (i6 - 1) * 8, bArr4, this.A03.length, 8);
                        int i7 = (i4 * i5) + i6;
                        int i8 = 1;
                        while (i7 != 0) {
                            int length3 = this.A03.length - i8;
                            BE6.A1O(bArr4, (byte) i7, bArr4[length3], length3);
                            i7 >>>= 8;
                            i8++;
                        }
                        e9y.CCe(bArr4, bArr4, 0, 0);
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        i6--;
                        System.arraycopy(bArr4, 8, bArr2, i6 * 8, 8);
                    }
                    i5--;
                } while (i5 >= 0);
                if (AnonymousClass1C2.A01(bArr3, this.A03)) {
                    return bArr2;
                }
                throw new C28379DyP("checksum failed");
            }
            throw new C28379DyP("unwrap data must be a multiple of 8 bytes");
        }
        throw AnonymousClass000.A0n("not set for unwrapping");
    }
}

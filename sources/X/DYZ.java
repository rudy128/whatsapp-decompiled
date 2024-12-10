package X;

public class DYZ implements E9Y {
    public int A00;
    public int A01;
    public E9Y A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public boolean A06;

    public int BNR() {
        return this.A02.BNR();
    }

    public void BdC(E3O e3o, boolean z) {
        this.A06 = z;
        reset();
        this.A02.BdC(e3o, true);
    }

    public void reset() {
        this.A01 = 0;
        byte[] bArr = this.A05;
        byte[] bArr2 = this.A03;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.A02.reset();
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = this.A06;
        int i3 = this.A00;
        int i4 = i + i3;
        int length = bArr.length;
        if (z) {
            if (i4 > length) {
                throw C28387DyX.A01();
            } else if (i2 + i3 <= bArr2.length) {
                int i5 = this.A01;
                int i6 = 2;
                if (i5 > i3) {
                    byte[] bArr3 = this.A03;
                    byte b = bArr[i];
                    byte[] bArr4 = this.A04;
                    byte b2 = (byte) (b ^ bArr4[i3 - 2]);
                    bArr2[i2] = b2;
                    bArr3[i3 - 2] = b2;
                    byte b3 = (byte) (bArr[i + 1] ^ bArr4[i3 - 1]);
                    bArr2[i2 + 1] = b3;
                    bArr3[i3 - 1] = b3;
                    this.A02.CCe(bArr3, bArr4, 0, 0);
                    while (i6 < i3) {
                        int i7 = i6 - 2;
                        byte b4 = (byte) (bArr[i + i6] ^ this.A04[i7]);
                        bArr2[i2 + i6] = b4;
                        bArr3[i7] = b4;
                        i6++;
                    }
                } else if (i5 == 0) {
                    E9Y e9y = this.A02;
                    byte[] bArr5 = this.A03;
                    e9y.CCe(bArr5, this.A04, 0, 0);
                    for (int i8 = 0; i8 < i3; i8++) {
                        byte b5 = (byte) (bArr[i + i8] ^ this.A04[i8]);
                        bArr2[i2 + i8] = b5;
                        bArr5[i8] = b5;
                    }
                } else if (i5 == i3) {
                    E9Y e9y2 = this.A02;
                    byte[] bArr6 = this.A03;
                    byte[] bArr7 = this.A04;
                    e9y2.CCe(bArr6, bArr7, 0, 0);
                    byte b6 = bArr[i];
                    byte[] bArr8 = this.A04;
                    BE6.A1Q(bArr8, bArr2, 0, b6, i2);
                    BE6.A1Q(bArr8, bArr2, 1, bArr[i + 1], i2 + 1);
                    int i9 = i3 - 2;
                    System.arraycopy(bArr6, 2, bArr6, 0, i9);
                    System.arraycopy(bArr2, i2, bArr6, i9, 2);
                    e9y2.CCe(bArr6, bArr7, 0, 0);
                    while (i6 < i3) {
                        int i10 = i6 - 2;
                        byte b7 = (byte) (bArr[i + i6] ^ this.A04[i10]);
                        bArr2[i2 + i6] = b7;
                        bArr6[i10] = b7;
                        i6++;
                    }
                }
                return i3;
            } else {
                throw C28380DyQ.A00();
            }
        } else if (i4 > length) {
            throw C28387DyX.A01();
        } else if (i2 + i3 <= bArr2.length) {
            int i11 = this.A01;
            int i12 = 2;
            if (i11 > i3) {
                byte b8 = bArr[i];
                byte[] bArr9 = this.A03;
                bArr9[i3 - 2] = b8;
                byte[] bArr10 = this.A04;
                BE6.A1Q(bArr10, bArr2, i3 - 2, b8, i2);
                byte b9 = bArr[i + 1];
                bArr9[i3 - 1] = b9;
                BE6.A1Q(bArr10, bArr2, i3 - 1, b9, i2 + 1);
                this.A02.CCe(bArr9, bArr10, 0, 0);
                while (i12 < i3) {
                    byte b10 = bArr[i + i12];
                    int i13 = i12 - 2;
                    bArr9[i13] = b10;
                    BE6.A1Q(this.A04, bArr2, i13, b10, i2 + i12);
                    i12++;
                }
            } else if (i11 == 0) {
                E9Y e9y3 = this.A02;
                byte[] bArr11 = this.A03;
                e9y3.CCe(bArr11, this.A04, 0, 0);
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i + i14;
                    BE6.A1P(bArr, bArr11, i15, i14);
                    BE6.A1O(bArr2, bArr[i15], this.A04[i14], i14);
                }
            } else if (i11 == i3) {
                E9Y e9y4 = this.A02;
                byte[] bArr12 = this.A03;
                byte[] bArr13 = this.A04;
                e9y4.CCe(bArr12, bArr13, 0, 0);
                byte b11 = bArr[i];
                byte b12 = bArr[i + 1];
                byte[] bArr14 = this.A04;
                BE6.A1Q(bArr14, bArr2, 0, b11, i2);
                BE6.A1Q(bArr14, bArr2, 1, b12, i2 + 1);
                System.arraycopy(bArr12, 2, bArr12, 0, i3 - 2);
                bArr12[i3 - 2] = b11;
                bArr12[i3 - 1] = b12;
                e9y4.CCe(bArr12, bArr13, 0, 0);
                while (i12 < i3) {
                    byte b13 = bArr[i + i12];
                    int i16 = i12 - 2;
                    bArr12[i16] = b13;
                    BE6.A1Q(this.A04, bArr2, i16, b13, i2 + i12);
                    i12++;
                }
            }
            return i3;
        } else {
            throw C28380DyQ.A00();
        }
        this.A01 += i3;
        return i3;
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A02);
        return AnonymousClass000.A0y("/OpenPGPCFB", A10);
    }
}

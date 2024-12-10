package X;

/* renamed from: X.CaD  reason: case insensitive filesystem */
public abstract class C25162CaD {
    public final int A00;
    public final int A01;

    public byte[] A00() {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof C23671Bne) {
            C23671Bne bne = (C23671Bne) this;
            int i4 = bne.A01;
            int i5 = bne.A00;
            int i6 = bne.A01;
            if (i4 == i6 && i5 == bne.A00) {
                return bne.A02;
            }
            i3 = i4 * i5;
            bArr = new byte[i3];
            i = 0 * i6;
            i2 = 0;
            if (i4 == i6) {
                bArr2 = bne.A02;
            } else {
                while (i2 < i5) {
                    System.arraycopy(bne.A02, i, bArr, i2 * i4, i4);
                    i += i6;
                    i2++;
                }
                return bArr;
            }
        } else if (this instanceof C23672Bnf) {
            C23672Bnf bnf = (C23672Bnf) this;
            int i7 = bnf.A01;
            int i8 = bnf.A00;
            int i9 = bnf.A01;
            if (i7 == i9 && i8 == bnf.A00) {
                return bnf.A04;
            }
            i3 = i7 * i8;
            bArr = new byte[i3];
            i = (bnf.A03 * i9) + bnf.A02;
            i2 = 0;
            if (i7 == i9) {
                bArr2 = bnf.A04;
            } else {
                while (i2 < i8) {
                    System.arraycopy(bnf.A04, i, bArr, i2 * i7, i7);
                    i += i9;
                    i2++;
                }
                return bArr;
            }
        } else {
            C23670Bnd bnd = (C23670Bnd) this;
            byte[] A002 = bnd.A00.A00();
            int i10 = bnd.A01 * bnd.A00;
            byte[] bArr3 = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr3[i11] = (byte) (255 - (A002[i11] & 255));
            }
            return bArr3;
        }
        System.arraycopy(bArr2, i, bArr, i2, i3);
        return bArr;
    }

    public byte[] A01(byte[] bArr, int i) {
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof C23671Bne) {
            C23671Bne bne = (C23671Bne) this;
            if (i < 0 || i >= bne.A00) {
                throw AnonymousClass000.A0k("Requested row is outside the image: ".concat(String.valueOf(i)));
            }
            i2 = bne.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = i * bne.A01;
            bArr2 = bne.A02;
        } else if (this instanceof C23672Bnf) {
            C23672Bnf bnf = (C23672Bnf) this;
            if (i < 0 || i >= bnf.A00) {
                throw AnonymousClass000.A0k("Requested row is outside the image: ".concat(String.valueOf(i)));
            }
            i2 = bnf.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = ((i + bnf.A03) * bnf.A01) + bnf.A02;
            bArr2 = bnf.A04;
        } else {
            C23670Bnd bnd = (C23670Bnd) this;
            byte[] A012 = bnd.A00.A01(bArr, i);
            int i4 = bnd.A01;
            for (int i5 = 0; i5 < i4; i5++) {
                A012[i5] = (byte) (255 - (A012[i5] & 255));
            }
            return A012;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i2);
        return bArr;
    }

    public final String toString() {
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder A0t = BE6.A0t((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(bArr, i3);
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4] & 255;
                char c = '#';
                if (b >= 64) {
                    c = '+';
                    if (b >= 128) {
                        c = ' ';
                        if (b < 192) {
                            c = '.';
                        }
                    }
                }
                A0t.append(c);
            }
            A0t.append(10);
        }
        return A0t.toString();
    }

    public C25162CaD(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}

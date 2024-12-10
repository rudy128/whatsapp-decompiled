package X;

/* renamed from: X.DYw  reason: case insensitive filesystem */
public class C27197DYw implements E3P {
    public static final int[] A08;
    public static final byte[] A09 = AnonymousClass1Bo.A03("expand 32-byte k");
    public static final byte[] A0A = AnonymousClass1Bo.A03("expand 16-byte k");
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public boolean A04 = false;
    public byte[] A05 = new byte[64];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];

    public static int A00(int i, int i2, int i3) {
        return i3 ^ Integer.rotateLeft(i + i2, 18);
    }

    public static int A01(int i, int i2, int i3, int i4) {
        return i4 ^ Integer.rotateLeft(i + i2, i3);
    }

    static {
        byte[] A032 = AnonymousClass1Bo.A03("expand 16-byte kexpand 32-byte k");
        int i = 0;
        int[] iArr = new int[8];
        int i2 = 0;
        do {
            C26210Cuo.A05(A032, iArr, i, i2);
            i += 4;
            i2++;
        } while (i2 < 8);
        A08 = iArr;
    }

    public static void A02(int[] iArr, int[] iArr2) {
        int i = 20;
        int[] iArr3 = iArr;
        int A0I = BE6.A0I(iArr3);
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = 9;
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = 13;
        int i16 = iArr[13];
        int i17 = iArr[14];
        int i18 = iArr[15];
        do {
            int rotateLeft = Integer.rotateLeft(A0I + i14, 7) ^ i5;
            int A012 = A01(rotateLeft, A0I, i10, i9);
            int A013 = A01(A012, rotateLeft, i15, i14);
            int rotateLeft2 = Integer.rotateLeft(A013 + A012, 18) ^ A0I;
            int i19 = i6;
            int A014 = A01(i19, i2, 7, i11);
            int A015 = A01(A014, i19, i10, i16);
            int A016 = A01(A015, A014, i15, i2);
            int rotateLeft3 = Integer.rotateLeft(A016 + A015, 18) ^ i6;
            int i20 = i12;
            int A017 = A01(i20, i7, 7, i17);
            int A018 = A01(A017, i20, i10, i3);
            int rotateLeft4 = i7 ^ Integer.rotateLeft(A018 + A017, 13);
            int A002 = A00(rotateLeft4, A018, i12);
            int i21 = i18;
            int A019 = A01(i21, i13, 7, i4);
            int A0110 = A01(A019, i21, i10, i8);
            int rotateLeft5 = i13 ^ Integer.rotateLeft(A0110 + A019, 13);
            int A003 = A00(rotateLeft5, A0110, i18);
            i2 = A01(rotateLeft2, A019, 7, A016);
            i3 = A01(i2, rotateLeft2, i10, A018);
            i4 = A019 ^ Integer.rotateLeft(i3 + i2, 13);
            A0I = A00(i4, i3, rotateLeft2);
            i7 = A01(rotateLeft3, rotateLeft, 7, rotateLeft4);
            i8 = A01(i7, rotateLeft3, i10, A0110);
            i5 = Integer.rotateLeft(i8 + i7, 13) ^ rotateLeft;
            i6 = A00(i5, i8, rotateLeft3);
            i13 = A01(A002, A014, 7, rotateLeft5);
            i9 = Integer.rotateLeft(i13 + A002, i10) ^ A012;
            i15 = 13;
            i11 = A014 ^ Integer.rotateLeft(i9 + i13, 13);
            i12 = A00(i11, i9, A002);
            i14 = A01(A003, A017, 7, A013);
            i16 = A015 ^ Integer.rotateLeft(i14 + A003, 9);
            i17 = A01(i16, i14, 13, A017);
            i18 = A00(i17, i16, A003);
            i -= 2;
            i10 = 9;
        } while (i > 0);
        int[] iArr4 = iArr2;
        BE6.A1A(0, A0I, iArr3, iArr4);
        BE6.A1A(1, i2, iArr3, iArr4);
        BE6.A1A(2, i3, iArr3, iArr4);
        BE6.A1A(3, i4, iArr3, iArr4);
        BE6.A1A(4, i5, iArr3, iArr4);
        BE6.A1A(5, i6, iArr3, iArr4);
        BE6.A1A(6, i7, iArr3, iArr4);
        BE6.A1A(7, i8, iArr3, iArr4);
        BE6.A1A(8, i9, iArr3, iArr4);
        BE6.A1A(9, i11, iArr3, iArr4);
        BE6.A1A(10, i12, iArr3, iArr4);
        BE6.A1A(11, i13, iArr3, iArr4);
        BE6.A1A(12, i14, iArr3, iArr4);
        BE6.A1A(13, i16, iArr3, iArr4);
        BE6.A1A(14, i17, iArr3, iArr4);
        BE6.A1A(15, i18, iArr3, iArr4);
    }

    public void A03(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (!this.A04) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("XSalsa20");
            throw AnonymousClass000.A0o(" not initialised", A10);
        } else if (i + i2 > bArr.length) {
            throw C28387DyX.A01();
        } else if (i3 + i2 <= bArr2.length) {
            int i4 = this.A00 + i2;
            this.A00 = i4;
            if (i4 < i2 && i4 >= 0) {
                int i5 = this.A01 + 1;
                this.A01 = i5;
                if (i5 == 0) {
                    int i6 = this.A02 + 1;
                    this.A02 = i6;
                    if ((i6 & 32) != 0) {
                        throw new C28386DyW("2^70 byte limit per IV would be exceeded; Change IV");
                    }
                }
            }
            for (int i7 = 0; i7 < i2; i7++) {
                byte[] bArr3 = this.A05;
                int i8 = this.A03;
                int i9 = i7 + i;
                BE6.A1Q(bArr, bArr2, i9, bArr3[i8], i7 + i3);
                int i10 = (i8 + 1) & 63;
                this.A03 = i10;
                if (i10 == 0) {
                    int[] iArr = this.A06;
                    int i11 = iArr[8] + 1;
                    iArr[8] = i11;
                    if (i11 == 0) {
                        BE6.A1R(iArr, 9);
                    }
                    int[] iArr2 = this.A07;
                    A02(iArr, iArr2);
                    int i12 = 0;
                    int i13 = 0;
                    do {
                        BEB.A1T(bArr3, iArr2[i13], i12);
                        i12 += 4;
                        i13++;
                    } while (i13 < 16);
                }
            }
        } else {
            throw C28380DyQ.A00();
        }
    }
}

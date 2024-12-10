package X;

import java.util.Arrays;

/* renamed from: X.CsI  reason: case insensitive filesystem */
public abstract class C26098CsI {
    public static final int A00;
    public static final int A01;
    public static final int A02;
    public static final int A03;
    public static final byte[] A04 = new byte[16];
    public static final byte[] A05;

    static {
        byte[] bytes = "expand 32-byte k".getBytes();
        A05 = bytes;
        A00 = BEB.A0A(bytes, 0);
        A02 = BEB.A0A(bytes, 4);
        A03 = BEB.A0A(bytes, 8);
        A01 = BEB.A0A(bytes, 12);
    }

    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        byte[] A012 = A01(bArr, bArr2);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = A04;
        int[] iArr = new int[16];
        int A0A = BEB.A0A(bArr4, 0);
        int A0A2 = BEB.A0A(bArr4, 4);
        int A0A3 = BEB.A0A(bArr4, 8);
        int A0A4 = BEB.A0A(bArr4, 12);
        int i = A00;
        iArr[0] = i;
        C26210Cuo.A05(A012, iArr, 0, 1);
        C26210Cuo.A05(A012, iArr, 4, 2);
        C26210Cuo.A05(A012, iArr, 8, 3);
        C26210Cuo.A05(A012, iArr, 12, 4);
        int i2 = A02;
        iArr[5] = i2;
        iArr[6] = A0A;
        iArr[7] = A0A2;
        iArr[8] = A0A3;
        iArr[9] = A0A4;
        int i3 = A03;
        iArr[10] = i3;
        C26210Cuo.A05(A012, iArr, 16, 11);
        C26210Cuo.A05(A012, iArr, 20, 12);
        iArr[13] = BEB.A0A(A012, 24);
        iArr[14] = BEB.A0A(A012, 28);
        int i4 = A01;
        iArr[15] = i4;
        C27197DYw.A02(iArr, iArr);
        int i5 = iArr[0] - i;
        iArr[0] = i5;
        iArr[5] = iArr[5] - i2;
        iArr[10] = iArr[10] - i3;
        iArr[15] = iArr[15] - i4;
        iArr[6] = iArr[6] - A0A;
        iArr[7] = iArr[7] - A0A2;
        iArr[8] = iArr[8] - A0A3;
        int i6 = iArr[9] - A0A4;
        iArr[9] = i6;
        BEB.A1T(bArr3, i5, 0);
        BEB.A1T(bArr3, iArr[5], 4);
        BEB.A1T(bArr3, iArr[10], 8);
        BEB.A1T(bArr3, iArr[15], 12);
        BEB.A1T(bArr3, iArr[6], 16);
        BEB.A1T(bArr3, iArr[7], 20);
        BEB.A1T(bArr3, iArr[8], 24);
        BEB.A1T(bArr3, i6, 28);
        return bArr3;
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        int[] iArr = new int[8];
        int i = 0;
        do {
            iArr[i] = BEB.A0A(bArr2, i * 4);
            i++;
        } while (i < 8);
        iArr[0] = iArr[0] & -8;
        int i2 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i2;
        iArr[7] = i2 | 1073741824;
        int[] iArr2 = new int[10];
        byte[] bArr4 = bArr;
        C26292Cx1.A02(bArr4, iArr2, 0, 0);
        C26292Cx1.A02(bArr4, iArr2, 16, 5);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr3 = new int[10];
        int i3 = 0;
        int i4 = 0;
        do {
            i4 = BE6.A0L(iArr2, iArr3, i4);
        } while (i4 < 10);
        int[] iArr4 = new int[10];
        iArr4[0] = 1;
        int[] iArr5 = new int[10];
        iArr5[0] = 1;
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int i5 = 254;
        int i6 = 1;
        while (true) {
            C26292Cx1.A0F(iArr5, iArr6, iArr7, iArr5);
            C26292Cx1.A0F(iArr3, iArr4, iArr6, iArr3);
            C26292Cx1.A0D(iArr7, iArr3, iArr7);
            C26292Cx1.A0D(iArr5, iArr6, iArr5);
            C26292Cx1.A0A(iArr6, iArr6);
            C26292Cx1.A0A(iArr3, iArr3);
            C26292Cx1.A0E(iArr6, iArr3, iArr8);
            C26292Cx1.A09(iArr8, iArr4);
            C26292Cx1.A0C(iArr4, iArr3, iArr4);
            C26292Cx1.A0D(iArr4, iArr8, iArr4);
            C26292Cx1.A0D(iArr3, iArr6, iArr3);
            C26292Cx1.A0F(iArr7, iArr5, iArr5, iArr6);
            C26292Cx1.A0A(iArr5, iArr5);
            C26292Cx1.A0A(iArr6, iArr6);
            C26292Cx1.A0D(iArr6, iArr2, iArr6);
            i5--;
            int i7 = (iArr[i5 >>> 5] >>> (i5 & 31)) & 1;
            int i8 = i6 ^ i7;
            int i9 = 0;
            int i10 = -i8;
            do {
                int i11 = iArr3[i9];
                int i12 = iArr5[i9];
                int i13 = (i11 ^ i12) & i10;
                iArr3[i9] = i11 ^ i13;
                iArr5[i9] = i12 ^ i13;
                i9++;
            } while (i9 < 10);
            int i14 = 0;
            int i15 = -i8;
            do {
                int i16 = iArr4[i14];
                int i17 = iArr6[i14];
                int i18 = (i16 ^ i17) & i15;
                iArr4[i14] = i16 ^ i18;
                iArr6[i14] = i17 ^ i18;
                i14++;
            } while (i14 < 10);
            if (i5 < 3) {
                break;
            }
            i6 = i7;
        }
        do {
            int[] iArr9 = new int[10];
            int[] iArr10 = new int[10];
            C26292Cx1.A0F(iArr3, iArr4, iArr9, iArr10);
            C26292Cx1.A0A(iArr9, iArr9);
            C26292Cx1.A0A(iArr10, iArr10);
            C26292Cx1.A0D(iArr9, iArr10, iArr3);
            C26292Cx1.A0E(iArr9, iArr10, iArr9);
            C26292Cx1.A09(iArr9, iArr4);
            C26292Cx1.A0C(iArr4, iArr10, iArr4);
            C26292Cx1.A0D(iArr4, iArr9, iArr4);
            i3++;
        } while (i3 < 3);
        C26292Cx1.A08(iArr4, iArr4);
        C26292Cx1.A0D(iArr3, iArr4, iArr3);
        C26292Cx1.A05(iArr3);
        C26292Cx1.A03(bArr3, iArr3, 0, 0);
        C26292Cx1.A03(bArr3, iArr3, 5, 16);
        return bArr3;
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i) {
        byte[][] bArr6 = new byte[4][];
        boolean A1X = BE7.A1X(A01(bArr2, bArr4), A01(bArr, bArr4), bArr6);
        AnonymousClass001.A1R(bArr2, bArr3, bArr6);
        byte[] A002 = C20058A5h.A00(A8G.A05(bArr6), bArr5, 64);
        if (i != A1X) {
            return Arrays.copyOfRange(A002, 32, 64);
        }
        return Arrays.copyOfRange(A002, 0, 32);
    }
}

package X;

/* renamed from: X.DyS  reason: case insensitive filesystem */
public class C28382DyS extends C24485C6c {
    public int A00;
    public int A01;
    public C28599E9q A02;

    public static byte[] A00(C28382DyS dyS, int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int length;
        int length2;
        C28382DyS dyS2 = dyS;
        int i3 = dyS2.A01;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        for (int i4 = 0; i4 != i3; i4++) {
            bArr3[i4] = (byte) i;
        }
        byte[] bArr5 = dyS2.A02;
        if (bArr5 == null || (length2 = bArr5.length) == 0) {
            bArr = new byte[0];
        } else {
            int i5 = i3 * (((length2 + i3) - 1) / i3);
            bArr = new byte[i5];
            for (int i6 = 0; i6 != i5; i6++) {
                BE6.A1P(bArr5, bArr, i6 % length2, i6);
            }
        }
        byte[] bArr6 = dyS2.A01;
        if (bArr6 == null || (length = bArr6.length) == 0) {
            bArr2 = new byte[0];
        } else {
            int i7 = i3 * (((length + i3) - 1) / i3);
            bArr2 = new byte[i7];
            for (int i8 = 0; i8 != i7; i8++) {
                BE6.A1P(bArr6, bArr2, i8 % length, i8);
            }
        }
        int length3 = bArr.length;
        int length4 = bArr2.length;
        int i9 = length3 + length4;
        byte[] bArr7 = new byte[i9];
        System.arraycopy(bArr, 0, bArr7, 0, length3);
        System.arraycopy(bArr2, 0, bArr7, length3, length4);
        byte[] bArr8 = new byte[i3];
        int i10 = dyS2.A00;
        int i11 = ((i2 + i10) - 1) / i10;
        byte[] bArr9 = new byte[i10];
        for (int i12 = 1; i12 <= i11; i12++) {
            C28599E9q e9q = dyS2.A02;
            e9q.update(bArr3, 0, i3);
            e9q.update(bArr7, 0, i9);
            e9q.BJ6(bArr9, 0);
            for (int i13 = 1; i13 < dyS2.A00; i13++) {
                e9q.update(bArr9, 0, i10);
                e9q.BJ6(bArr9, 0);
            }
            for (int i14 = 0; i14 != i3; i14++) {
                BE6.A1P(bArr9, bArr8, i14 % i10, i14);
            }
            for (int i15 = 0; i15 != i9 / i3; i15++) {
                int i16 = i3 * i15;
                int i17 = (i3 + i16) - 1;
                int i18 = (bArr8[i3 - 1] & 255) + (bArr7[i17] & 255) + 1;
                bArr7[i17] = (byte) i18;
                int i19 = i18 >>> 8;
                for (int i20 = i3 - 2; i20 >= 0; i20--) {
                    int i21 = i16 + i20;
                    int i22 = i19 + (bArr8[i20] & 255) + (bArr7[i21] & 255);
                    bArr7[i21] = (byte) i22;
                    i19 = i22 >>> 8;
                }
            }
            int i23 = (i12 - 1) * i10;
            if (i12 == i11) {
                System.arraycopy(bArr9, 0, bArr4, i23, i2 - ((i12 - 1) * i10));
            } else {
                System.arraycopy(bArr9, 0, bArr4, i23, i10);
            }
        }
        return bArr4;
    }
}

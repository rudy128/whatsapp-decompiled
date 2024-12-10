package X;

/* renamed from: X.Cuo  reason: case insensitive filesystem */
public abstract class C26210Cuo {
    public static void A02(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        BE7.A12(i >>> 8, bArr, i3 + 1, i);
    }

    public static int A00(byte[] bArr, int i) {
        return BEB.A0A(bArr, i);
    }

    public static int A01(byte[] bArr, int[] iArr, int i, int i2) {
        int A00 = A00(bArr, i);
        iArr[i2] = A00;
        return A00;
    }

    public static void A03(byte[] bArr, int i, long j) {
        A02(bArr, AnonymousClass8BR.A02(j), i);
        A02(bArr, AnonymousClass000.A0H(j), i + 4);
    }

    public static void A05(byte[] bArr, int[] iArr, int i, int i2) {
        iArr[i2] = A00(bArr, i);
    }

    public static void A04(byte[] bArr, int i, long j) {
        BEB.A1T(bArr, (int) (4294967295L & j), i);
        BEB.A1T(bArr, AnonymousClass8BR.A02(j), i + 4);
    }
}

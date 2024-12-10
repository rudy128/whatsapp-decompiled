package X;

/* renamed from: X.DPa  reason: case insensitive filesystem */
public abstract class C27004DPa implements C28474E2p {
    public static byte[] A00(byte[] bArr, long j) {
        byte[] bArr2 = {(byte) ((int) (j >> 56)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 40)), (byte) AnonymousClass000.A0G(j), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 8)), (byte) ((int) j)};
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i = length - 8;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = i; i2 < length; i2++) {
            BE6.A1Q(bArr2, bArr3, i2 - i, bArr[i2], i2);
        }
        return bArr3;
    }
}

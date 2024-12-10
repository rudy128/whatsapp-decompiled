package X;

import java.io.OutputStream;

/* renamed from: X.Cd3  reason: case insensitive filesystem */
public abstract class C25299Cd3 {
    public static void A00(OutputStream outputStream, int i) {
        A01(outputStream, 2, (long) i);
    }

    public static void A01(OutputStream outputStream, int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }
}

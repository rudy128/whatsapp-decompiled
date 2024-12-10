package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.Cov  reason: case insensitive filesystem */
public abstract class C25931Cov {
    public static final byte[] A00 = A01("WEBP");
    public static final byte[] A01 = A01("RIFF");
    public static final byte[] A02 = A01("VP8L");
    public static final byte[] A03 = A01("VP8X");
    public static final byte[] A04 = A01("VP8 ");

    public static boolean A00(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 != null) {
            int length = bArr2.length;
            if (length + i <= bArr.length) {
                int i2 = 0;
                while (i2 < length) {
                    if (bArr[i2 + i] == bArr2[i2]) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw BE6.A0o("ASCII not found!", e);
        }
    }
}

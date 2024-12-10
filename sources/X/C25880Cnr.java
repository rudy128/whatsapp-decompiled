package X;

/* renamed from: X.Cnr  reason: case insensitive filesystem */
public abstract class C25880Cnr {
    public static void A00(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (b2 > -65 || BE8.A05(b, b2) != 0 || b3 > -65 || b4 > -65) {
            throw BE6.A0c("Protocol message had invalid UTF-8.");
        }
        BEB.A0j(((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6), b4 & 63, cArr, i);
    }

    public static void A01(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw BE6.A0c("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void A02(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || b2 > -65) {
            throw BE6.A0c("Protocol message had invalid UTF-8.");
        }
        BE9.A14(b, b2, cArr, i);
    }
}

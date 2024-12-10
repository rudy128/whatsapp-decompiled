package X;

/* renamed from: X.CfA  reason: case insensitive filesystem */
public abstract class C25408CfA {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public static String A00(byte[] bArr) {
        StringBuilder A0t = BE6.A0t(r5 + r5);
        for (byte b : bArr) {
            char[] cArr = A00;
            A0t.append(cArr[(b >> 4) & 15]);
            A0t.append(cArr[b & 15]);
        }
        return A0t.toString();
    }
}

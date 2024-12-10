package X;

/* renamed from: X.Dyn  reason: case insensitive filesystem */
public abstract class C28403Dyn extends C27190DYo {
    public static void A00(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            BE6.A1N(bArr, (((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1, b & 254, i);
        }
    }
}

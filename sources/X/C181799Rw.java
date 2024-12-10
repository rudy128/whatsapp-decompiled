package X;

/* renamed from: X.9Rw  reason: invalid class name and case insensitive filesystem */
public abstract class C181799Rw {
    public static String A00(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        for (int i2 = 0; i2 < i; i2++) {
            A10.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) (Math.random() * 62.0d)));
        }
        return A10.toString();
    }
}

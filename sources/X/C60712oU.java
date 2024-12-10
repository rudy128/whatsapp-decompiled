package X;

/* renamed from: X.2oU  reason: invalid class name and case insensitive filesystem */
public abstract class C60712oU {
    public static volatile int A00;

    public static boolean A00() {
        if (A00 != 0) {
            return false;
        }
        synchronized (C60712oU.class) {
            if (A00 == 0) {
                A00 = -1;
            }
        }
        return false;
    }

    public C60712oU() {
        throw AnonymousClass04E.createAndThrow();
    }
}

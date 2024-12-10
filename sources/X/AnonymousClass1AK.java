package X;

/* renamed from: X.1AK  reason: invalid class name */
public class AnonymousClass1AK {
    public static AnonymousClass1AI A00;

    public static boolean A01(String str) {
        AnonymousClass1AI r0;
        synchronized (AnonymousClass1AK.class) {
            r0 = A00;
            if (r0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return r0.Bhp(str);
    }

    public static void A00(String str) {
        A01(str);
    }
}

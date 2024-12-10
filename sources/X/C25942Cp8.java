package X;

/* renamed from: X.Cp8  reason: case insensitive filesystem */
public final class C25942Cp8 {
    public static C25942Cp8 A01;
    public static final C23087Bb2 A02 = new C23087Bb2(0, 0, 0, false, false);
    public C23087Bb2 A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Cp8] */
    public static synchronized C25942Cp8 A00() {
        C25942Cp8 cp8;
        synchronized (C25942Cp8.class) {
            C25942Cp8 cp82 = A01;
            cp8 = cp82;
            if (cp82 == null) {
                ? obj = new Object();
                A01 = obj;
                cp8 = obj;
            }
        }
        return cp8;
    }
}

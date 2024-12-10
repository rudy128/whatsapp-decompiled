package X;

/* renamed from: X.9PL  reason: invalid class name */
public abstract class AnonymousClass9PL {
    public static final int A00(String str) {
        if (str == null || AnonymousClass1YF.A0T(str) || "approved".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("deleted".equalsIgnoreCase(str)) {
            return 3;
        }
        return 1;
    }
}

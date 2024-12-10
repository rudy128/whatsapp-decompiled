package X;

/* renamed from: X.026  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass026 {
    public static /* synthetic */ boolean A00(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static boolean A01(Object obj, boolean z) {
        return A00(obj, Boolean.valueOf(z));
    }
}

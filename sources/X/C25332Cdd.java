package X;

/* renamed from: X.Cdd  reason: case insensitive filesystem */
public abstract class C25332Cdd {
    public static boolean A01(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean A00(Object obj, long j) {
        return A01(obj, Long.valueOf(j));
    }
}

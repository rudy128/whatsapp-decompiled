package X;

/* renamed from: X.Ce2  reason: case insensitive filesystem */
public abstract class C25343Ce2 {
    public static Number A00(double d) {
        int i = (int) d;
        if (((double) i) == d) {
            return Integer.valueOf(i);
        }
        return Double.valueOf(d);
    }

    public static boolean A01(Object obj) {
        String obj2;
        if (obj instanceof Number) {
            return AnonymousClass000.A1O(AnonymousClass000.A0M(obj));
        }
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1Y(obj);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Expected Number or Boolean: ");
        if (obj == null) {
            obj2 = "null";
        } else {
            obj2 = obj.toString();
        }
        throw AnonymousClass001.A12(obj2, A10);
    }
}

package X;

/* renamed from: X.C8v  reason: case insensitive filesystem */
public abstract class C24550C8v {
    public static boolean A00(float f) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(1.0f);
        if (!isNaN) {
            if (isNaN2 || C108945cZ.A00(1.0f, f) >= 1.0E-5f) {
                return false;
            }
            return true;
        } else if (isNaN2) {
            return true;
        } else {
            return false;
        }
    }
}

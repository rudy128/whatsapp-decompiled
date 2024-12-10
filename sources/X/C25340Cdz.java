package X;

/* renamed from: X.Cdz  reason: case insensitive filesystem */
public abstract class C25340Cdz {
    public static int A00(DOZ doz, DFL dfl) {
        return A01(doz, dfl, 0);
    }

    public static int A01(DOZ doz, DFL dfl, int i) {
        try {
            if (doz.A03) {
                String A0d = BE7.A0d(dfl);
                if (A0d != null) {
                    return A90.A04(A0d);
                }
                return i;
            }
            String A0e = BE7.A0e(dfl);
            if (A0e != null) {
                return A90.A04(A0e);
            }
            return i;
        } catch (AnonymousClass9HX unused) {
            C25913CoX.A01("ThemedColorUtils", "Error parsing themed color");
            return i;
        }
    }
}

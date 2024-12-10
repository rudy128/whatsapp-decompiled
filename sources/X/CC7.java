package X;

public abstract class CC7 {
    public static final float A00(DFL dfl, int i) {
        String A0D = dfl.A0D(i);
        if (A0D != null) {
            try {
                return A90.A01(A0D);
            } catch (AnonymousClass9HX unused) {
                C25913CoX.A01("BloksModelUtils", AnonymousClass001.A1H("Error parsing pixel value ", A0D, AnonymousClass000.A10()));
            }
        }
        return 0.0f;
    }
}

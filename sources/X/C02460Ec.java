package X;

/* renamed from: X.0Ec  reason: invalid class name and case insensitive filesystem */
public abstract class C02460Ec {
    public static void A00(StringBuilder sb, float f) {
        String valueOf;
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, (double) max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - ((float) i) >= 0.5f) {
            i++;
        }
        float f3 = ((float) i) / pow;
        if (max > 0) {
            valueOf = String.valueOf(f3);
        } else {
            valueOf = String.valueOf((int) f3);
        }
        sb.append(valueOf);
    }
}

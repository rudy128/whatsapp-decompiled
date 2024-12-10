package X;

/* renamed from: X.2oO  reason: invalid class name and case insensitive filesystem */
public abstract class C60652oO {
    public static final String A01(long j) {
        if (j >= 0) {
            String l = Long.toString(j, 10);
            C18070vi.A0X(l);
            return l;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (10 * j2);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        String l2 = Long.toString(j2, 10);
        C18070vi.A0X(l2);
        A10.append(l2);
        String l3 = Long.toString(j3, 10);
        C18070vi.A0X(l3);
        return AnonymousClass000.A0y(l3, A10);
    }

    public static final double A00(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * 2.0d);
    }
}

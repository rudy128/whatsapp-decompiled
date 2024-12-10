package X;

/* renamed from: X.2pJ  reason: invalid class name and case insensitive filesystem */
public final class C61212pJ {
    public final C65312wC A00;

    public C61212pJ(C65312wC r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(C61212pJ r2, Short sh, int i) {
        short shortValue = sh.shortValue();
        if (shortValue == 2 || shortValue == 3) {
            r2.A00.markerEnd(i, shortValue);
        } else if (shortValue == 1) {
            r2.A00.markerStart(i);
        }
    }
}

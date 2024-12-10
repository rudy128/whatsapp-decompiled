package X;

/* renamed from: X.AhE  reason: case insensitive filesystem */
public final class C21267AhE implements C22470B9c {
    public static final C21267AhE A00 = new C21267AhE();

    public final Object BCF(C29621ca r5, C62672rm r6) {
        C178169Cb A05;
        AnonymousClass9EJ A03;
        int A17 = C18070vi.A17(r5, r6);
        if (!r6.A09(r5, "message")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "plaintext";
        if (!r6.A0A(r5, strArr) || (A05 = A96.A05(r5, r6)) == null || (A03 = A96.A03(r5, r6)) == null) {
            return null;
        }
        return new C24161BwT(r5, A03, A05, A96.A06(r5, r6));
    }
}

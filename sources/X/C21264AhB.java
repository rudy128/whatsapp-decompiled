package X;

/* renamed from: X.AhB  reason: case insensitive filesystem */
public final class C21264AhB implements C22470B9c {
    public static final C21264AhB A00 = new C21264AhB();

    public final Object BCF(C29621ca r8, C62672rm r9) {
        C178169Cb A04;
        boolean A17 = C18070vi.A17(r8, r9);
        if (!r9.A09(r8, "message") || (A04 = A96.A04(r8, r9)) == null) {
            return null;
        }
        C178169Cb A06 = A96.A06(r8, r9);
        C22470B9c[] b9cArr = new C22470B9c[2];
        b9cArr[0] = C21262Ah9.A00;
        Object A062 = r9.A06(r8, "NewsletterText|NewsletterMedia", C18070vi.A0O(C21263AhA.A00, b9cArr, A17 ? 1 : 0), new String[0]);
        if (A062 != null) {
            return new C24161BwT(r8, A04, A06, (C28544E6s) A062);
        }
        return null;
    }
}

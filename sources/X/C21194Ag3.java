package X;

/* renamed from: X.Ag3  reason: case insensitive filesystem */
public final class C21194Ag3 implements C22470B9c {
    public static final C21194Ag3 A00 = new C21194Ag3();

    public final Object BCF(C29621ca r13, C62672rm r14) {
        C29621ca r5 = r13;
        C62672rm r4 = r14;
        boolean A17 = C18070vi.A17(r13, r14);
        if (!AnonymousClass8BR.A1R(r13, r14)) {
            return null;
        }
        String[] A1U = AnonymousClass8BS.A1U(A17 ? 1 : 0);
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        String str = (String) r4.A05(r5, String.class, A0i, A0j, "service-unavailable", A1U, false);
        if (str == null) {
            return null;
        }
        Number number = (Number) r4.A05(r5, Long.TYPE, A0i, A0j, 503L, AnonymousClass8BS.A1S(A17), false);
        if (number != null) {
            return new C178309Cp(r13, str, number.longValue());
        }
        return null;
    }
}

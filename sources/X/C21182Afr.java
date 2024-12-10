package X;

/* renamed from: X.Afr  reason: case insensitive filesystem */
public final class C21182Afr implements C22470B9c {
    public static final C21182Afr A00 = new C21182Afr();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        C178399Cy A02;
        C29621ca r4 = r12;
        C62672rm r3 = r13;
        boolean A17 = C18070vi.A17(r12, r13);
        if (!r13.A09(r12, "state")) {
            return null;
        }
        if (r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "succeed", AnonymousClass8BS.A1a(A17 ? 1 : 0, 0), false) == null || (A02 = A6w.A02(r12, r13)) == null) {
            return null;
        }
        return new C178569Dp(r12, A02);
    }
}

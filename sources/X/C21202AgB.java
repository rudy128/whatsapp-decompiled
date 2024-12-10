package X;

/* renamed from: X.AgB  reason: case insensitive filesystem */
public final class C21202AgB implements C22470B9c {
    public static final C21202AgB A00 = new C21202AgB();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        C29621ca r4 = r12;
        C62672rm r3 = r13;
        boolean A17 = C18070vi.A17(r12, r13);
        if (!r13.A09(r12, "group")) {
            return null;
        }
        String str = (String) r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "409", AnonymousClass8BS.A1b(A17 ? 1 : 0, 0), false);
        if (str != null) {
            return new C178269Cl(r12, str, A17);
        }
        return null;
    }
}

package X;

/* renamed from: X.Agn  reason: case insensitive filesystem */
public final class C21240Agn implements C22470B9c {
    public static final C21240Agn A00 = new C21240Agn();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        C29621ca r4 = r12;
        C62672rm r3 = r13;
        boolean A17 = C18070vi.A17(r12, r13);
        if (!r13.A09(r12, "participant")) {
            return null;
        }
        String str = (String) r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "406", AnonymousClass8BS.A1b(A17 ? 1 : 0, 0), false);
        if (str != null) {
            return new C178179Cc(r12, str);
        }
        return null;
    }
}

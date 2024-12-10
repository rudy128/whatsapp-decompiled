package X;

/* renamed from: X.AgH  reason: case insensitive filesystem */
public final class C21208AgH implements C22470B9c {
    public static final C21208AgH A00 = new C21208AgH();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        C29621ca r4 = r12;
        C62672rm r3 = r13;
        int A17 = C18070vi.A17(r12, r13);
        if (!r13.A09(r12, "picture")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "status";
        String str = (String) r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "204", strArr, false);
        if (str != null) {
            return new C178279Cm(r12, str, 3);
        }
        return null;
    }
}

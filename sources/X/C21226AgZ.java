package X;

/* renamed from: X.AgZ  reason: case insensitive filesystem */
public final class C21226AgZ implements C22470B9c {
    public static final C21226AgZ A00 = new C21226AgZ();

    public final Object BCF(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        boolean A17 = C18070vi.A17(r11, r12);
        if (!r12.A09(r11, "member_add_mode")) {
            return null;
        }
        if (r3.A04(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "all_member_add", AnonymousClass8BS.A1V(A17 ? 1 : 0)) != null) {
            return new AnonymousClass9CU(r11);
        }
        return null;
    }
}

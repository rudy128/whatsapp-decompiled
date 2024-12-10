package X;

/* renamed from: X.Ag8  reason: case insensitive filesystem */
public final class C21199Ag8 implements C22470B9c {
    public static final C21199Ag8 A00 = new C21199Ag8();

    public final Object BCF(C29621ca r20, C62672rm r21) {
        C29621ca r4 = r20;
        C62672rm r3 = r21;
        int A17 = C18070vi.A17(r4, r3);
        if (!r3.A09(r4, "group")) {
            return null;
        }
        Class<String> cls = String.class;
        String str = (String) r3.A05(r4, cls, AnonymousClass8BV.A0b(), AnonymousClass8BV.A0e(), (Object) null, AnonymousClass8BS.A1W(A17, 0), false);
        if (str == null) {
            return null;
        }
        String[] strArr = new String[A17];
        String str2 = (String) r3.A05(r4, cls, AnonymousClass8BW.A0Z("error", strArr, 0), AnonymousClass8BU.A0j(), "404", strArr, false);
        if (str2 != null) {
            return new C178649Dx(r4, str, str2);
        }
        return null;
    }
}

package X;

/* renamed from: X.AhL  reason: case insensitive filesystem */
public final class C21274AhL implements C22470B9c {
    public static final C21274AhL A00 = new C21274AhL();

    public final Object BCF(C29621ca r19, C62672rm r20) {
        C29621ca r3 = r19;
        C62672rm r2 = r20;
        int A17 = C18070vi.A17(r3, r2);
        if (!r2.A09(r3, "config")) {
            return null;
        }
        Class<String> cls = String.class;
        if (r2.A05(r3, cls, C108975cc.A0X(), AnonymousClass8BV.A0k(), (Object) null, AnonymousClass8BS.A1W(A17, 0), false) == null) {
            return null;
        }
        String[] strArr = new String[A17];
        if (r2.A05(r3, cls, AnonymousClass8BW.A0Z("platform", strArr, 0), AnonymousClass8BU.A0j(), "ent", strArr, false) != null) {
            return new AnonymousClass9EP(r3);
        }
        return null;
    }
}

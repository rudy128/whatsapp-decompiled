package X;

/* renamed from: X.Ag6  reason: case insensitive filesystem */
public final class C21197Ag6 implements C22470B9c {
    public static final C21197Ag6 A00 = new C21197Ag6();

    public final Object BCF(C29621ca r21, C62672rm r22) {
        C29621ca r5 = r21;
        C62672rm r4 = r22;
        int A17 = C18070vi.A17(r5, r4);
        if (!r4.A09(r5, "group")) {
            return null;
        }
        Class<String> cls = String.class;
        if (r4.A05(r5, cls, AnonymousClass8BV.A0b(), AnonymousClass8BV.A0e(), (Object) null, AnonymousClass8BS.A1W(A17, 0), false) == null) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "size";
        C62672rm r12 = r4;
        C29621ca r13 = r5;
        if (r12.A05(r13, Long.TYPE, C17890vO.A0L(), 19999L, (Object) null, strArr, false) == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        if (r12.A05(r13, cls, AnonymousClass8BW.A0Z("truncated", strArr2, 0), AnonymousClass8BU.A0j(), "true", strArr2, false) != null) {
            return new C178639Dw(r5);
        }
        return null;
    }
}

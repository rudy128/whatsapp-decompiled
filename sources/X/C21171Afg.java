package X;

/* renamed from: X.Afg  reason: case insensitive filesystem */
public final class C21171Afg implements C22470B9c {
    public static final C21171Afg A00 = new C21171Afg();

    public final Object BCF(C29621ca r20, C62672rm r21) {
        C29621ca r7 = r20;
        C62672rm r6 = r21;
        int A17 = C18070vi.A17(r7, r6);
        if (!r6.A09(r7, "product")) {
            return null;
        }
        String[] A1W = AnonymousClass8BS.A1W(2, 0);
        A1W[A17] = "#elementValue";
        Class<String> cls = String.class;
        String str = (String) r6.A04(r7, cls, C108975cc.A0X(), AnonymousClass8BV.A0g(), (Object) null, A1W);
        if (str == null) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "status";
        if (r6.A04(r7, cls, AnonymousClass8BW.A0Z("#elementValue", strArr, A17), AnonymousClass8BU.A0j(), "deleted", strArr) != null) {
            return new C178479Dg(r7, str);
        }
        return null;
    }
}

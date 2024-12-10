package X;

/* renamed from: X.Afp  reason: case insensitive filesystem */
public final class C21180Afp implements C22470B9c {
    public static final C21180Afp A00 = new C21180Afp();

    public final Object BCF(C29621ca r23, C62672rm r24) {
        C178399Cy A02;
        C29621ca r7 = r23;
        C62672rm r6 = r24;
        int A17 = C18070vi.A17(r7, r6);
        if (!r6.A09(r7, "state")) {
            return null;
        }
        String[] A1W = AnonymousClass8BS.A1W(A17, 0);
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        String str = (String) r6.A05(r7, cls, A0i, A0j, (Object) null, A1W, false);
        if (str == null) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "parameters";
        Long A0L = C17890vO.A0L();
        Long A0l = AnonymousClass8BV.A0l();
        C62672rm r14 = r6;
        C29621ca r15 = r7;
        Class<String> cls2 = cls;
        String str2 = (String) r14.A05(r15, cls2, A0L, A0l, (Object) null, strArr, false);
        String[] strArr2 = new String[A17];
        strArr2[0] = "merge";
        String str3 = (String) r6.A05(r7, cls, A0i, A0j, (Object) null, strArr2, false);
        String[] strArr3 = new String[A17];
        strArr3[0] = "merge_param";
        String str4 = (String) r14.A05(r15, cls2, A0L, A0l, (Object) null, strArr3, false);
        String[] strArr4 = new String[A17];
        strArr4[0] = "catch";
        String str5 = (String) r6.A05(r7, cls, A0i, A0j, (Object) null, strArr4, false);
        if (r14.A05(r15, cls2, A0i, A0j, "resource", AnonymousClass8BS.A1a(A17, 0), false) == null || (A02 = A6w.A02(r7, r6)) == null) {
            return null;
        }
        return new C178619Du(r7, A02, str, str2, str3, str4, str5);
    }
}

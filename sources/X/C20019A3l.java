package X;

/* renamed from: X.A3l  reason: case insensitive filesystem */
public final class C20019A3l {
    public static final C20019A3l A00 = new Object();

    public static final AnonymousClass9DG A00(C29621ca r13, C62672rm r14) {
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r6 = r13;
        C62672rm r5 = r14;
        String str = (String) r5.A05(r6, cls, A0i, A0j, (Object) null, new String[]{"action"}, false);
        String str2 = (String) r5.A05(r6, cls, A0i, A0j, (Object) null, new String[]{"category"}, false);
        C22470B9c[] b9cArr = new C22470B9c[2];
        b9cArr[0] = C21161AfW.A00;
        Object A06 = r14.A06(r13, "BizOptOutBrandID|BizOptOutJid", C18070vi.A0O(C21162AfX.A00, b9cArr, 1), new String[0]);
        if (A06 == null) {
            return null;
        }
        return new AnonymousClass9DG(r13, (C22471B9d) A06, str, str2);
    }
}

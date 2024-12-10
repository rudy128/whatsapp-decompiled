package X;

/* renamed from: X.AfW  reason: case insensitive filesystem */
public final class C21161AfW implements C22470B9c {
    public static final C21161AfW A00 = new C21161AfW();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        int A17 = C18070vi.A17(r12, r13);
        String[] strArr = new String[A17];
        strArr[0] = "biz_opt_out_brand_id";
        String str = (String) r13.A05(r12, String.class, C108975cc.A0X(), AnonymousClass8BV.A0c(), (Object) null, strArr, false);
        if (str == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        strArr2[0] = "biz_jid";
        return new AnonymousClass9DW(AnonymousClass8BY.A0L(r12, r13, strArr2), r12, str);
    }
}

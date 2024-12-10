package X;

import android.content.Context;

/* renamed from: X.8nw  reason: invalid class name and case insensitive filesystem */
public final class C170008nw extends C196289ul {
    public final AnonymousClass1KB A00;
    public final C183989aE A01;
    public final A2A A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;

    public static final String A00(Context context, C170008nw r4, AnonymousClass1BI r5, int i, int i2) {
        String str;
        if (r5 == null || (str = r4.A04.A0I(r4.A03.A0H(r5))) == null) {
            str = context.getString(2131887824);
        }
        C18070vi.A0b(str);
        return AnonymousClass3Ma.A10(context, Integer.valueOf(i), C17890vO.A1a(str), 1, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r2 != 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r3, X.A2Y r4) {
        /*
            if (r4 == 0) goto L_0x0014
            X.9IT r0 = r4.A00
            int r2 = r0.ordinal()
            r0 = 0
            r1 = 2131887823(0x7f1206cf, float:1.9410264E38)
            if (r2 == r0) goto L_0x0017
            r0 = 1
            r1 = 2131887816(0x7f1206c8, float:1.941025E38)
            if (r2 == r0) goto L_0x0017
        L_0x0014:
            r1 = 2131887825(0x7f1206d1, float:1.9410268E38)
        L_0x0017:
            java.lang.String r0 = X.C18070vi.A0F(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170008nw.A01(android.content.Context, X.A2Y):java.lang.String");
    }

    public C170008nw(AnonymousClass1KB r1, C183989aE r2, A2A a2a, AnonymousClass1M9 r4, C24921Me r5) {
        C18070vi.A0w(r1, r4, r5, a2a, r2);
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = a2a;
        this.A01 = r2;
    }
}

package X;

import java.util.Map;

/* renamed from: X.90N  reason: invalid class name */
public final class AnonymousClass90N extends C184829ba {
    public final C198949zB A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final Map A08;

    public final String A00() {
        String str = this.A05;
        String str2 = this.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A14(A10, str);
        return AnonymousClass000.A0y(str2, A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A01(java.util.Map r6, java.util.Map r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0006
            X.1CQ r6 = X.AnonymousClass1D7.A0I()
        L_0x0006:
            java.util.Map r0 = r5.A07
            java.util.Map r4 = X.C26065Crf.A02(r6, r0)
            java.lang.String r3 = r5.A06
            if (r7 != 0) goto L_0x0014
            X.1CQ r7 = X.AnonymousClass1D7.A0I()
        L_0x0014:
            java.util.Map r0 = r5.A08
            X.CVy r2 = new X.CVy
            r2.<init>(r7)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = X.C26065Crf.A00(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C18070vi.A0z(r1, r0)
            if (r1 != 0) goto L_0x002a
        L_0x0028:
            java.util.Map r1 = r2.A01
        L_0x002a:
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r0 = X.C26065Crf.A01(r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass90N.A01(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90N(C198949zB r2, Object obj, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3) {
        super(str2, str5);
        C18070vi.A0k(str2, str3);
        C18070vi.A0d(str6, 10);
        this.A05 = str;
        this.A03 = str3;
        this.A07 = map;
        this.A04 = map2;
        this.A08 = map3;
        this.A06 = str4;
        this.A00 = r2;
        this.A02 = str6;
        this.A01 = obj;
    }
}

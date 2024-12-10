package X;

public enum C02 {
    ;
    
    public final int id;
    public final C24240Bxv zzix;
    public final C24238Bxs zziy;
    public final Class zziz;
    public final boolean zzja;

    public static C02 A00(C24238Bxs bxs, C24240Bxv bxv, String str, int i) {
        return new C02(bxs, bxv, str, i, i);
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r1 = X.BE6.A0E(r6, X.CH8.A01);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C02(java.lang.String r7, int r8, int r9) {
        /*
            r4 = this;
            r4.<init>(r7, r8)
            r4.id = r9
            r4.zziy = r5
            r4.zzix = r6
            int[] r0 = X.CH8.A00
            int r0 = X.BE6.A0E(r5, r0)
            r3 = 2
            r2 = 1
            if (r0 == r2) goto L_0x002e
            if (r0 == r3) goto L_0x002e
            r0 = 0
        L_0x0016:
            r4.zziz = r0
            X.Bxs r0 = X.C24238Bxs.A01
            if (r5 != r0) goto L_0x002c
            int[] r0 = X.CH8.A01
            int r1 = X.BE6.A0E(r6, r0)
            if (r1 == r2) goto L_0x002c
            if (r1 == r3) goto L_0x002c
            r0 = 3
            if (r1 == r0) goto L_0x002c
        L_0x0029:
            r4.zzja = r2
            return
        L_0x002c:
            r2 = 0
            goto L_0x0029
        L_0x002e:
            java.lang.Class r0 = r6.zzli
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02.<init>(X.Bxs, X.Bxv, java.lang.String, int, int):void");
    }
}

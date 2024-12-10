package X;

import java.text.NumberFormat;

/* renamed from: X.1Wz  reason: invalid class name and case insensitive filesystem */
public final class C27661Wz {
    public boolean A00;
    public final AnonymousClass1X3 A01;
    public final AnonymousClass1XC A02;
    public final C22761Dc A03;
    public final NumberFormat A04;
    public final NumberFormat A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1.equals(r2) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (android.text.format.DateFormat.is24HourFormat(r6) != false) goto L_0x0042;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27661Wz(android.content.Context r6, java.util.Locale r7) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String[] r0 = X.AnonymousClass1X0.A04
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r7)
            r4 = 1
            if (r0 == r4) goto L_0x000d
            r4 = 0
        L_0x000d:
            r5.A06 = r4
            java.lang.String r1 = "en"
            java.lang.String r0 = r7.getLanguage()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            java.lang.String r3 = r7.getCountry()
            java.lang.String r2 = "en-US"
            r1 = r2
            X.1LB r0 = X.AnonymousClass1X1.A00     // Catch:{ IllegalArgumentException -> 0x002b }
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ IllegalArgumentException -> 0x002b }
            if (r0 == 0) goto L_0x002b
            r2 = r0
        L_0x002b:
            boolean r1 = r1.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r5.A07 = r0
            int r0 = X.AnonymousClass1X0.A00(r7)
            if (r0 == 0) goto L_0x0042
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            r5.A00 = r1
            if (r4 == 0) goto L_0x0074
            X.1X3 r0 = X.AnonymousClass1X3.A03
        L_0x0049:
            r5.A01 = r0
            java.text.NumberFormat r0 = java.text.NumberFormat.getPercentInstance(r7)
            r5.A05 = r0
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r7)
            r5.A04 = r0
            android.util.SparseIntArray r0 = X.AnonymousClass1XC.A03
            android.content.res.Resources r1 = r6.getResources()
            X.1XC r0 = new X.1XC
            r0.<init>(r6, r1, r7)
            r5.A02 = r0
            android.content.res.Resources r3 = r6.getResources()
            java.util.Locale r2 = r0.A02
            X.1XG r1 = r0.A01
            X.1Dc r0 = new X.1Dc
            r0.<init>(r6, r3, r1, r2)
            r5.A03 = r0
            return
        L_0x0074:
            X.1X3 r0 = X.AnonymousClass1X3.A02
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27661Wz.<init>(android.content.Context, java.util.Locale):void");
    }
}

package X;

import android.os.Build;

/* renamed from: X.CqP  reason: case insensitive filesystem */
public class C26008CqP {
    public static C26008CqP A03 = BE6.A0T(Build.MANUFACTURER, Build.MODEL);
    public static C26008CqP A04 = new C26008CqP(Build.PRODUCT);
    public final String A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r6.A01.isEmpty() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C26008CqP
            r5 = 0
            if (r0 == 0) goto L_0x0056
            X.CqP r7 = (X.C26008CqP) r7
            java.lang.String r4 = r6.A00
            boolean r0 = r4.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r6.A01
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            java.lang.String r3 = r7.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = r7.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006c
        L_0x002a:
            if (r1 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r4)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r6.A01
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r3)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r7.A01
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            boolean r5 = r2.equals(r0)
        L_0x0056:
            return r5
        L_0x0057:
            java.lang.String r2 = r6.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0056
            boolean r5 = r2.equals(r1)
            return r5
        L_0x006c:
            r2 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26008CqP.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str;
        String str2 = this.A00;
        if (!str2.isEmpty()) {
            String str3 = this.A01;
            if (!str3.isEmpty()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(str2);
                A10.append(':');
                str = AnonymousClass000.A0y(str3, A10);
                return str.hashCode();
            }
        }
        str = this.A02;
        return str.hashCode();
    }

    public C26008CqP(String str, String str2) {
        this.A02 = "";
        this.A00 = str;
        this.A01 = str2;
    }

    public C26008CqP(String str) {
        this.A02 = str;
        this.A00 = "";
        this.A01 = "";
    }
}

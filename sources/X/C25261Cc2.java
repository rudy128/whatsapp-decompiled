package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Cc2  reason: case insensitive filesystem */
public class C25261Cc2 {
    public C26279Cwa A00 = new C26279Cwa();

    public boolean equals(Object obj) {
        if (!(obj instanceof C25261Cc2)) {
            return false;
        }
        return this.A00.equals(((C25261Cc2) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public void A00(C28322DxU dxU) {
        C1m c1m;
        try {
            C26279Cwa cwa = this.A00;
            int i = dxU.A00;
            if (i == 0) {
                Set<Object> set = cwa.A04;
                C28310DxI A01 = C28310DxI.A01(dxU.A01);
                if (!set.isEmpty()) {
                    for (Object A012 : set) {
                        if (C28310DxI.A01(A012).equals(A01)) {
                            c1m = new C1m("OtherName is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 1) {
                Set set2 = cwa.A02;
                String A02 = C28353Dxz.A02(dxU);
                if (!set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (C26279Cwa.A04(A02, C17880vN.A0v(it))) {
                            c1m = new C1m("Email address is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 2) {
                Set set3 = cwa.A01;
                String A022 = C28353Dxz.A02(dxU);
                if (!set3.isEmpty()) {
                    Iterator it2 = set3.iterator();
                    while (it2.hasNext()) {
                        String A0v = C17880vN.A0v(it2);
                        if (C26279Cwa.A06(A022, A0v) || A022.equalsIgnoreCase(A0v)) {
                            c1m = new C1m("DNS is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 4) {
                cwa.A0A(C28324DxW.A01(dxU.A01));
                return;
            } else if (i == 6) {
                Set set4 = cwa.A05;
                String A023 = C28353Dxz.A02(dxU);
                if (!set4.isEmpty()) {
                    Iterator it3 = set4.iterator();
                    while (it3.hasNext()) {
                        if (C26279Cwa.A05(A023, C17880vN.A0v(it3))) {
                            c1m = new C1m("URI is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 7) {
                Set<byte[]> set5 = cwa.A03;
                byte[] A05 = C28342Dxo.A05(dxU.A01);
                if (!set5.isEmpty()) {
                    for (byte[] A09 : set5) {
                        if (C26279Cwa.A09(A05, A09)) {
                            c1m = new C1m("IP is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            throw c1m;
        } catch (C1m e) {
            throw new C29(e.getMessage(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[Catch:{ C1m -> 0x011b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C28322DxU r6) {
        /*
            r5 = this;
            X.Cwa r2 = r5.A00     // Catch:{ C1m -> 0x011b }
            int r1 = r6.A00     // Catch:{ C1m -> 0x011b }
            if (r1 == 0) goto L_0x00e7
            r0 = 1
            if (r1 == r0) goto L_0x00b5
            r0 = 2
            if (r1 == r0) goto L_0x007d
            r0 = 4
            if (r1 == r0) goto L_0x0073
            r0 = 6
            if (r1 == r0) goto L_0x0040
            r0 = 7
            if (r1 != r0) goto L_0x011a
            java.util.Set r3 = r2.A09     // Catch:{ C1m -> 0x011b }
            X.1Bx r0 = r6.A01     // Catch:{ C1m -> 0x011b }
            byte[] r2 = X.C28342Dxo.A05(r0)     // Catch:{ C1m -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ C1m -> 0x011b }
        L_0x0023:
            boolean r0 = r1.hasNext()     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()     // Catch:{ C1m -> 0x011b }
            byte[] r0 = (byte[]) r0     // Catch:{ C1m -> 0x011b }
            boolean r0 = X.C26279Cwa.A09(r2, r0)     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x0023
            return
        L_0x0036:
            int r0 = r2.length     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x0112
            int r0 = r3.size()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x0112
            return
        L_0x0040:
            java.util.Set r3 = r2.A0B     // Catch:{ C1m -> 0x011b }
            java.lang.String r2 = X.C28353Dxz.A02(r6)     // Catch:{ C1m -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ C1m -> 0x011b }
        L_0x004c:
            boolean r0 = r1.hasNext()     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ C1m -> 0x011b }
            boolean r0 = X.C26279Cwa.A05(r2, r0)     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x004c
            return
        L_0x005d:
            int r0 = r2.length()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x006a
            int r0 = r3.size()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x006a
            return
        L_0x006a:
            java.lang.String r0 = "URI is not from a permitted subtree."
            X.C1m r1 = new X.C1m     // Catch:{ C1m -> 0x011b }
            r1.<init>(r0)     // Catch:{ C1m -> 0x011b }
            goto L_0x0119
        L_0x0073:
            X.1Bx r0 = r6.A01     // Catch:{ C1m -> 0x011b }
            X.DxW r0 = X.C28324DxW.A01(r0)     // Catch:{ C1m -> 0x011b }
            r2.A0B(r0)     // Catch:{ C1m -> 0x011b }
            return
        L_0x007d:
            java.util.Set r4 = r2.A07     // Catch:{ C1m -> 0x011b }
            java.lang.String r3 = X.C28353Dxz.A02(r6)     // Catch:{ C1m -> 0x011b }
            if (r4 == 0) goto L_0x011a
            java.util.Iterator r2 = r4.iterator()     // Catch:{ C1m -> 0x011b }
        L_0x0089:
            boolean r0 = r2.hasNext()     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ C1m -> 0x011b }
            boolean r0 = X.C26279Cwa.A06(r3, r1)     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x011a
            boolean r0 = r3.equalsIgnoreCase(r1)     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x0089
            return
        L_0x00a0:
            int r0 = r3.length()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x00ad
            int r0 = r4.size()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x00ad
            return
        L_0x00ad:
            java.lang.String r0 = "DNS is not from a permitted subtree."
            X.C1m r1 = new X.C1m     // Catch:{ C1m -> 0x011b }
            r1.<init>(r0)     // Catch:{ C1m -> 0x011b }
            goto L_0x0119
        L_0x00b5:
            java.util.Set r3 = r2.A08     // Catch:{ C1m -> 0x011b }
            java.lang.String r2 = X.C28353Dxz.A02(r6)     // Catch:{ C1m -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ C1m -> 0x011b }
        L_0x00c1:
            boolean r0 = r1.hasNext()     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ C1m -> 0x011b }
            boolean r0 = X.C26279Cwa.A04(r2, r0)     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x00c1
            return
        L_0x00d2:
            int r0 = r2.length()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x00df
            int r0 = r3.size()     // Catch:{ C1m -> 0x011b }
            if (r0 != 0) goto L_0x00df
            return
        L_0x00df:
            java.lang.String r0 = "Subject email address is not from a permitted subtree."
            X.C1m r1 = new X.C1m     // Catch:{ C1m -> 0x011b }
            r1.<init>(r0)     // Catch:{ C1m -> 0x011b }
            goto L_0x0119
        L_0x00e7:
            java.util.Set r1 = r2.A0A     // Catch:{ C1m -> 0x011b }
            X.1Bx r0 = r6.A01     // Catch:{ C1m -> 0x011b }
            X.DxI r2 = X.C28310DxI.A01(r0)     // Catch:{ C1m -> 0x011b }
            if (r1 == 0) goto L_0x011a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ C1m -> 0x011b }
        L_0x00f5:
            boolean r0 = r1.hasNext()     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r1.next()     // Catch:{ C1m -> 0x011b }
            X.DxI r0 = X.C28310DxI.A01(r0)     // Catch:{ C1m -> 0x011b }
            boolean r0 = r0.equals(r2)     // Catch:{ C1m -> 0x011b }
            if (r0 == 0) goto L_0x00f5
            return
        L_0x010a:
            java.lang.String r0 = "Subject OtherName is not from a permitted subtree."
            X.C1m r1 = new X.C1m     // Catch:{ C1m -> 0x011b }
            r1.<init>(r0)     // Catch:{ C1m -> 0x011b }
            goto L_0x0119
        L_0x0112:
            java.lang.String r0 = "IP is not from a permitted subtree."
            X.C1m r1 = new X.C1m     // Catch:{ C1m -> 0x011b }
            r1.<init>(r0)     // Catch:{ C1m -> 0x011b }
        L_0x0119:
            throw r1     // Catch:{ C1m -> 0x011b }
        L_0x011a:
            return
        L_0x011b:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.C29 r0 = new X.C29
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25261Cc2.A01(X.DxU):void");
    }
}

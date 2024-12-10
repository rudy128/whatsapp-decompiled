package X;

import java.util.Map;

/* renamed from: X.ClX  reason: case insensitive filesystem */
public class C25762ClX {
    public Map A00 = C17880vN.A11();

    private synchronized void A00() {
        C26265CwA.A02(C25762ClX.class, Integer.valueOf(this.A00.size()), "Count = %d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.DRJ A01(X.C28573E8e r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            X.C26208Cuj.A01(r8)     // Catch:{ all -> 0x0059 }
            java.util.Map r1 = r7.A00     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r1.get(r8)     // Catch:{ all -> 0x0059 }
            X.DRJ r6 = (X.DRJ) r6     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0057
            monitor-enter(r6)     // Catch:{ all -> 0x0059 }
            boolean r0 = r6.A0A()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x001b
            X.DRJ r0 = r6.A07()     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)     // Catch:{ all -> 0x0053 }
            goto L_0x0056
        L_0x001b:
            r1.remove(r8)     // Catch:{ all -> 0x0053 }
            java.lang.Class<X.ClX> r5 = X.C25762ClX.class
            java.lang.String r4 = "Found closed reference %d for key %s (%d)"
            java.lang.Object[] r3 = X.AnonymousClass8BR.A1a()     // Catch:{ all -> 0x0053 }
            int r0 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x0053 }
            X.AnonymousClass000.A1L(r3, r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r8.Bb4()     // Catch:{ all -> 0x0053 }
            r0 = 1
            r3[r0] = r1     // Catch:{ all -> 0x0053 }
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x0053 }
            X.AnonymousClass3Ma.A1S(r3, r0)     // Catch:{ all -> 0x0053 }
            X.EAY r2 = X.C26265CwA.A00     // Catch:{ all -> 0x0053 }
            r0 = 5
            boolean r0 = r2.BfN(r0)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r5.getSimpleName()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = X.BE7.A0o(r4, r3)     // Catch:{ all -> 0x0053 }
            r2.CRu(r1, r0)     // Catch:{ all -> 0x0053 }
        L_0x004f:
            monitor-exit(r6)     // Catch:{ all -> 0x0053 }
            monitor-exit(r7)
            r0 = 0
            return r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0056:
            r6 = r0
        L_0x0057:
            monitor-exit(r7)
            return r6
        L_0x0059:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25762ClX.A01(X.E8e):X.DRJ");
    }

    public synchronized void A02(C28573E8e e8e, DRJ drj) {
        boolean z = true;
        if (!drj.A0A()) {
            z = false;
        }
        C26208Cuj.A04(z);
        DRJ drj2 = (DRJ) this.A00.put(e8e, drj.A07());
        if (drj2 != null) {
            drj2.close();
        }
        A00();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r3 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r8.A0A() == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(X.C28573E8e r7, X.DRJ r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.C26208Cuj.A01(r7)     // Catch:{ all -> 0x006a }
            X.C26208Cuj.A01(r8)     // Catch:{ all -> 0x006a }
            if (r8 == 0) goto L_0x0010
            boolean r1 = r8.A0A()     // Catch:{ all -> 0x006a }
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x006a }
            java.util.Map r5 = r6.A00     // Catch:{ all -> 0x006a }
            java.lang.Object r4 = r5.get(r7)     // Catch:{ all -> 0x006a }
            X.DRJ r4 = (X.DRJ) r4     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0068
            X.DRN r0 = r4.A0B     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x002f
            X.DRN r3 = r0.A04()     // Catch:{ all -> 0x006a }
        L_0x0026:
            X.DRN r0 = r8.A0B     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0031
            X.DRN r2 = r0.A04()     // Catch:{ all -> 0x006a }
            goto L_0x0032
        L_0x002f:
            r3 = 0
            goto L_0x0026
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r3 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x0062
            java.lang.Object r1 = r3.A05()     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r2.A05()     // Catch:{ all -> 0x0050 }
            if (r1 != r0) goto L_0x005d
            r5.remove(r7)     // Catch:{ all -> 0x0050 }
            r2.close()     // Catch:{ all -> 0x006a }
            r3.close()     // Catch:{ all -> 0x006a }
            r4.close()     // Catch:{ all -> 0x006a }
            r6.A00()     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0050:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x006a }
            r3.close()     // Catch:{ all -> 0x006a }
            r4.close()     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x005b:
            if (r2 == 0) goto L_0x0065
        L_0x005d:
            r2.close()     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0065
        L_0x0062:
            r3.close()     // Catch:{ all -> 0x006a }
        L_0x0065:
            r4.close()     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r6)
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25762ClX.A03(X.E8e, X.DRJ):void");
    }
}

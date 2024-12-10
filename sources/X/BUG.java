package X;

import java.util.HashMap;

public class BUG extends C22891BUc implements ED1 {
    public EB1 A00;
    public HashMap A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final BCw A06 = new C26799DEh(this);
    public final C28561E7n A07 = new C26855DGm(this);
    public final E53 A08 = new C26857DGo(this, 1);
    public final boolean A09;
    public final CNJ A0A;
    public final CK4 A0B;
    public volatile ED4 A0C;
    public volatile C28614EAk A0D;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(X.BUG r6, java.lang.Boolean r7, java.lang.Boolean r8) {
        /*
            monitor-enter(r6)
            X.EAk r4 = r6.A0D     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x00a4
            boolean r0 = r6.A05     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x00a4
            boolean r3 = r6.A04     // Catch:{ all -> 0x00a6 }
            boolean r2 = r6.A03     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x0016
            boolean r1 = r7.booleanValue()     // Catch:{ all -> 0x00a6 }
        L_0x0013:
            r6.A04 = r1     // Catch:{ all -> 0x00a6 }
            goto L_0x0018
        L_0x0016:
            r1 = r3
            goto L_0x0013
        L_0x0018:
            if (r8 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = r2
            goto L_0x0021
        L_0x001d:
            boolean r0 = r8.booleanValue()     // Catch:{ all -> 0x00a6 }
        L_0x0021:
            r6.A03 = r0     // Catch:{ all -> 0x00a6 }
            if (r1 != r3) goto L_0x0027
            if (r0 == r2) goto L_0x00a4
        L_0x0027:
            java.util.HashMap r0 = r6.A01     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0062
            java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x00a6 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x00a6 }
        L_0x0031:
            boolean r0 = r6.A03     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0051
            r0 = 0
            X.C18070vi.A0d(r5, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "enableARCoreLightEstimation"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "enableARCoreDepth"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "enableARCoreHorizontalPlanes"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "enableARCoreVerticalPlanes"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
        L_0x0051:
            X.Csq r3 = new X.Csq     // Catch:{ all -> 0x00a6 }
            r3.<init>()     // Catch:{ all -> 0x00a6 }
            X.CKJ r2 = X.C25971Cpe.A0M     // Catch:{ all -> 0x00a6 }
            boolean r0 = r6.A04     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x0067
            boolean r1 = r6.A03     // Catch:{ all -> 0x00a6 }
            r0 = 0
            if (r1 == 0) goto L_0x0068
            goto L_0x0067
        L_0x0062:
            java.util.HashMap r5 = X.C17880vN.A11()     // Catch:{ all -> 0x00a6 }
            goto L_0x0031
        L_0x0067:
            r0 = 1
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            r3.A04(r2, r0)     // Catch:{ all -> 0x00a6 }
            X.CKJ r0 = X.C25971Cpe.A02     // Catch:{ all -> 0x00a6 }
            X.C28111Yx.A02(r5)     // Catch:{ all -> 0x00a6 }
            r3.A04(r0, r5)     // Catch:{ all -> 0x00a6 }
            X.CXe r2 = r3.A03()     // Catch:{ all -> 0x00a6 }
            r1 = 10
            X.BUm r0 = new X.BUm     // Catch:{ all -> 0x00a6 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00a6 }
            r4.Bk3(r0, r2)     // Catch:{ all -> 0x00a6 }
            boolean r0 = r6.A04     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x009a
            boolean r0 = r6.A03     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x009a
            X.CNJ r0 = r6.A0A     // Catch:{ all -> 0x00a6 }
            X.CJE r1 = r0.A00     // Catch:{ all -> 0x00a6 }
            java.lang.ref.WeakReference r0 = r1.A00     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x00a4
            r0.clear()     // Catch:{ all -> 0x00a6 }
            r0 = 0
            goto L_0x00a2
        L_0x009a:
            X.CNJ r0 = r6.A0A     // Catch:{ all -> 0x00a6 }
            X.CJE r1 = r0.A00     // Catch:{ all -> 0x00a6 }
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r0)     // Catch:{ all -> 0x00a6 }
        L_0x00a2:
            r1.A00 = r0     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r6)
            return
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUG.A00(X.BUG, java.lang.Boolean, java.lang.Boolean):void");
    }

    public C22892BUd BTg() {
        return ED1.A00;
    }

    public BUG(C28592E9h e9h) {
        super(e9h);
        CK4 ck4 = new CK4(this);
        this.A0B = ck4;
        this.A0A = new CNJ(ck4);
        this.A09 = C72453Mb.A1Y((Boolean) this.A00.BPA(C24669CEj.A00));
    }
}

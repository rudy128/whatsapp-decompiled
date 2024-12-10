package X;

public class BRM extends C26048CrF {
    public final C28659ECw A00;
    public final C22850BSc A01;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        X.C26212Cuq.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0034, B:31:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BRM(X.C28659ECw r4, X.E4W r5, X.C22850BSc r6) {
        /*
            r3 = this;
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r3.<init>()
            r3.A01 = r6
            r3.A00 = r4
            boolean r0 = X.C26212Cuq.A04()
            java.lang.String r2 = "AbstractProducerToDataSourceAdapter()->produceResult"
            java.lang.String r1 = "AbstractProducerToDataSourceAdapter()->onRequestStart"
            if (r0 != 0) goto L_0x0044
            java.util.Map r0 = r6.A0B
            r3.A04 = r0
            boolean r0 = X.C26212Cuq.A04()
            if (r0 != 0) goto L_0x0031
            r4.C3R(r6)
        L_0x0022:
            boolean r0 = X.C26212Cuq.A04()
            if (r0 != 0) goto L_0x003b
            X.BSN r0 = new X.BSN
            r0.<init>(r3)
            r5.CCn(r0, r6)
            return
        L_0x0031:
            X.C26212Cuq.A03(r1)
            r4.C3R(r6)     // Catch:{ all -> 0x008c }
            X.C26212Cuq.A01()
            goto L_0x0022
        L_0x003b:
            X.C26212Cuq.A03(r2)
            X.BSN r0 = new X.BSN     // Catch:{ all -> 0x008c }
            r0.<init>(r3)     // Catch:{ all -> 0x008c }
            goto L_0x0061
        L_0x0044:
            java.lang.String r0 = "AbstractProducerToDataSourceAdapter()"
            X.C26212Cuq.A03(r0)
            java.util.Map r0 = r6.A0B     // Catch:{ all -> 0x008c }
            r3.A04 = r0     // Catch:{ all -> 0x008c }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0065
            r4.C3R(r6)     // Catch:{ all -> 0x008c }
        L_0x0056:
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x006f
            X.BSN r0 = new X.BSN     // Catch:{ all -> 0x008c }
            r0.<init>(r3)     // Catch:{ all -> 0x008c }
        L_0x0061:
            r5.CCn(r0, r6)     // Catch:{ all -> 0x008c }
            goto L_0x007d
        L_0x0065:
            X.C26212Cuq.A03(r1)     // Catch:{ all -> 0x008c }
            r4.C3R(r6)     // Catch:{ all -> 0x0083 }
            X.C26212Cuq.A01()     // Catch:{ all -> 0x008c }
            goto L_0x0056
        L_0x006f:
            X.C26212Cuq.A03(r2)     // Catch:{ all -> 0x008c }
            X.BSN r0 = new X.BSN     // Catch:{ all -> 0x0081 }
            r0.<init>(r3)     // Catch:{ all -> 0x0081 }
            r5.CCn(r0, r6)     // Catch:{ all -> 0x0081 }
            X.C26212Cuq.A01()     // Catch:{ all -> 0x008c }
        L_0x007d:
            X.C26212Cuq.A01()
            return
        L_0x0081:
            r0 = move-exception
            goto L_0x0088
        L_0x0083:
            r0 = move-exception
            X.C26212Cuq.A01()     // Catch:{ all -> 0x008c }
            goto L_0x008b
        L_0x0088:
            X.C26212Cuq.A01()     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            X.C26212Cuq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BRM.<init>(X.ECw, X.E4W, X.BSc):void");
    }

    public static final void A00(BRM brm, Throwable th) {
        C22850BSc bSc = brm.A01;
        if (super.A09(th, bSc.BRV())) {
            brm.A00.C3M(bSc, th);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(ECs eCs, Object obj, int i) {
        DRN drn;
        DRN drn2 = (DRN) obj;
        if (drn2 != null) {
            drn = drn2.A04();
        } else {
            drn = null;
        }
        boolean A1Q = BE9.A1Q(i);
        if (super.A08(drn, eCs.BRV(), A1Q) && A1Q) {
            this.A00.C3S(this.A01);
        }
    }

    public /* bridge */ /* synthetic */ Object A03() {
        DRN drn = (DRN) super.A03();
        if (drn != null) {
            return drn.A04();
        }
        return null;
    }

    public boolean A06() {
        if (!super.A06()) {
            return false;
        }
        if (super.A07()) {
            return true;
        }
        C28659ECw eCw = this.A00;
        C22850BSc bSc = this.A01;
        eCw.C3J(bSc);
        bSc.A03();
        return true;
    }
}

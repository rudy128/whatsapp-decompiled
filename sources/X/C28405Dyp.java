package X;

/* renamed from: X.Dyp  reason: case insensitive filesystem */
public class C28405Dyp extends C27279Db8 {
    public C28404Dyo A00;
    public final Object A01;
    public volatile int A02;
    public volatile boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28405Dyp(X.C28305DxD r9, X.E3R r10) {
        /*
            r8 = this;
            r4 = r9
            X.Dx0 r0 = r9.A02     // Catch:{ Exception -> 0x005b }
            java.lang.String r3 = X.C26178Ctw.A01(r0)     // Catch:{ Exception -> 0x005b }
            X.Dx0 r0 = r9.A02     // Catch:{ Exception -> 0x004a }
            X.1Bx r0 = r0.A00     // Catch:{ Exception -> 0x004a }
            if (r0 != 0) goto L_0x000f
            r6 = 0
            goto L_0x0013
        L_0x000f:
            byte[] r6 = X.BE9.A1Z(r0)     // Catch:{ Exception -> 0x004a }
        L_0x0013:
            X.1C0 r0 = X.C28314DxM.A0K     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = r0.A01     // Catch:{ Exception -> 0x0043 }
            X.Dwo r0 = r9.A03     // Catch:{ Exception -> 0x0043 }
            X.DxH r1 = r0.A04     // Catch:{ Exception -> 0x0043 }
            if (r1 == 0) goto L_0x0036
            X.1C0 r0 = X.BE6.A19(r2)     // Catch:{ Exception -> 0x0043 }
            X.DxM r0 = X.C28309DxH.A01(r0, r1)     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x0036
            X.Dxo r0 = r0.A01     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x0036
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x0036
            X.DxE r0 = X.C28306DxE.A01(r0)     // Catch:{ Exception -> 0x0043 }
            boolean r7 = r0.A03     // Catch:{ Exception -> 0x0043 }
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r2 = r8
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r0 = X.C17880vN.A0p()
            r8.A01 = r0
            return
        L_0x0043:
            r1 = move-exception
            X.Dav r0 = new X.Dav
            r0.<init>(r1)
            throw r0
        L_0x004a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        L_0x005b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28405Dyp.<init>(X.DxD, X.E3R):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r7 = getEncoded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C28404Dyo A00() {
        /*
            r9 = this;
            java.lang.Object r1 = r9.A01
            monitor-enter(r1)
            X.Dyo r0 = r9.A00     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            byte[] r7 = r9.getEncoded()     // Catch:{ CRLException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r7 = 0
        L_0x0010:
            X.E3R r5 = r9.A02
            X.DxD r4 = r9.A01
            java.lang.String r3 = r9.A00
            byte[] r6 = r9.A04
            boolean r8 = r9.A03
            X.Dyo r2 = new X.Dyo
            r2.<init>(r3, r4, r5, r6, r7, r8)
            monitor-enter(r1)
            X.Dyo r0 = r9.A00     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            r9.A00 = r2     // Catch:{ all -> 0x0029 }
            r0 = r2
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28405Dyp.A00():X.Dyo");
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = A00().hashCode();
            this.A03 = true;
        }
        return this.A02;
    }

    public boolean equals(Object obj) {
        C28269Dwd dwd;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28405Dyp) {
            C28405Dyp dyp = (C28405Dyp) obj;
            if (!this.A03 || !dyp.A03) {
                if ((this.A00 == null || dyp.A00 == null) && (dwd = this.A01.A01) != null && !dwd.A0J(dyp.A01.A01)) {
                    return false;
                }
            } else if (this.A02 != dyp.A02) {
                return false;
            }
        }
        return A00().equals(obj);
    }
}

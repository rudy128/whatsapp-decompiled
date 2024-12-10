package X;

/* renamed from: X.AHs  reason: case insensitive filesystem */
public final class C20362AHs implements BA3 {
    public final C20076A6c A00;
    public final C19955A0m A01;
    public final C19955A0m A02;
    public final AnonymousClass8JG A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.9rH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194169rH Ba3(X.C193279pp r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.A01
            int r1 = r8.A00
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r2 = 2
            X.AHX r6 = X.A3D.A00(r0, r2)
            r0 = 1
            r6.BDB(r0, r3)
            long r0 = (long) r1
            r6.BD9(r2, r0)
            X.A6c r1 = r7.A00
            r1.A06()
            r0 = 0
            r5 = 0
            android.database.Cursor r4 = X.AnonymousClass9OB.A00(r1, r6, r0)
            java.lang.String r0 = "work_spec_id"
            int r3 = X.C196329ur.A01(r4, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "generation"
            int r2 = X.C196329ur.A01(r4, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "system_id"
            int r1 = X.C196329ur.A01(r4, r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r5 = r4.getString(r3)     // Catch:{ all -> 0x0055 }
        L_0x0040:
            int r2 = r4.getInt(r2)     // Catch:{ all -> 0x0055 }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0055 }
            X.9rH r0 = new X.9rH     // Catch:{ all -> 0x0055 }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x0055 }
            r5 = r0
        L_0x004e:
            r4.close()
            r6.A00()
            return r5
        L_0x0055:
            r0 = move-exception
            r4.close()
            r6.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20362AHs.Ba3(X.9pp):X.9rH");
    }

    public void Bde(C194169rH r3) {
        C20076A6c a6c = this.A00;
        a6c.A06();
        a6c.A07();
        try {
            this.A03.A03(r3);
            a6c.A08();
        } finally {
            C20076A6c.A02(a6c);
        }
    }

    public C20362AHs(C20076A6c a6c) {
        this.A00 = a6c;
        this.A03 = new AnonymousClass8JE(a6c, this, 2);
        this.A01 = new AnonymousClass8JH(a6c, this, 0);
        this.A02 = new AnonymousClass8JH(a6c, this, 1);
    }
}

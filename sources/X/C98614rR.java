package X;

/* renamed from: X.4rR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98614rR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C94934lQ A02;
    public final /* synthetic */ C441822l A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.4lQ r5 = r0.A02
            X.22l r7 = r0.A03
            int r8 = r0.A00
            boolean r10 = r0.A04
            int r9 = r0.A01
            r4 = 0
            X.00H r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.4Mm r1 = (X.C85204Mm) r1
            X.205 r0 = r7.A0v
            X.1BI r12 = r0.A00
            if (r12 == 0) goto L_0x0063
            X.122 r11 = r1.A00
            long r14 = r7.A0x
            r2 = 1
            long r14 = r14 + r2
            r13 = 1
            r18 = 0
            r16 = -1
            X.2dp r0 = X.AnonymousClass122.A00(r11, r12, r13, r14, r16, r18)
            android.database.Cursor r2 = r0.A00
            if (r2 == 0) goto L_0x0063
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0060
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0059 }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x0059 }
            X.206 r6 = r0.A01(r2)     // Catch:{ all -> 0x0059 }
            boolean r0 = r6 instanceof X.C441822l     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0060
            r1 = r6
            X.22l r1 = (X.C441822l) r1     // Catch:{ all -> 0x0059 }
            X.205 r0 = r1.A0v     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0055
            X.2rc r0 = X.AnonymousClass206.A00(r1)     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.A0V     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0060
        L_0x0055:
            r2.close()
            goto L_0x0064
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0060:
            r2.close()
        L_0x0063:
            r6 = r4
        L_0x0064:
            X.1KB r0 = r5.A01
            X.4re r4 = new X.4re
            r4.<init>((X.C94934lQ) r5, (X.AnonymousClass206) r6, (X.C441822l) r7, (int) r8, (int) r9, (boolean) r10)
            r0.A0J(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98614rR.run():void");
    }

    public /* synthetic */ C98614rR(C94934lQ r1, C441822l r2, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
    }
}

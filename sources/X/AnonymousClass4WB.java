package X;

/* renamed from: X.4WB  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass4WB {
    public static final AnonymousClass5WO A01(C108585bw r6) {
        return new AnonymousClass5WO(AnonymousClass1OR.A00, C25691Pg.SUSPEND, r6, -3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r11 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        X.AnonymousClass4I2.A00(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C30391dr r8, X.C108585bw r9, X.AnonymousClass1G2 r10, boolean r11) {
        /*
            boolean r0 = r8 instanceof X.C100824v8
            if (r0 == 0) goto L_0x0030
            r7 = r8
            X.4v8 r7 = (X.C100824v8) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0030
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x0036
            if (r0 != r4) goto L_0x0096
            boolean r11 = r7.Z$0
            java.lang.Object r1 = r7.L$2
            X.DXm r1 = (X.C27177DXm) r1
            java.lang.Object r9 = r7.L$1
            X.5bw r9 = (X.C108585bw) r9
            java.lang.Object r10 = r7.L$0
            X.1G2 r10 = (X.AnonymousClass1G2) r10
            goto L_0x0051
        L_0x0030:
            X.4v8 r7 = new X.4v8
            r7.<init>(r8)
            goto L_0x0012
        L_0x0036:
            boolean r11 = r7.Z$0
            java.lang.Object r1 = r7.L$2
            X.DXm r1 = (X.C27177DXm) r1
            java.lang.Object r9 = r7.L$1
            X.5bw r9 = (X.C108585bw) r9
            java.lang.Object r10 = r7.L$0
            X.1G2 r10 = (X.AnonymousClass1G2) r10
            goto L_0x0065
        L_0x0045:
            X.C30691eM.A01(r6)
            boolean r0 = r10 instanceof X.C99504sv
            if (r0 != 0) goto L_0x009b
            X.DXm r1 = r9.Bh9()     // Catch:{ all -> 0x008d }
            goto L_0x0054
        L_0x0051:
            X.C30691eM.A01(r6)     // Catch:{ all -> 0x008d }
        L_0x0054:
            r7.L$0 = r10     // Catch:{ all -> 0x008d }
            r7.L$1 = r9     // Catch:{ all -> 0x008d }
            r7.L$2 = r1     // Catch:{ all -> 0x008d }
            r7.Z$0 = r11     // Catch:{ all -> 0x008d }
            r7.label = r3     // Catch:{ all -> 0x008d }
            java.lang.Object r6 = r1.A01(r7)     // Catch:{ all -> 0x008d }
            if (r6 != r5) goto L_0x0068
            goto L_0x0083
        L_0x0065:
            X.C30691eM.A01(r6)     // Catch:{ all -> 0x008d }
        L_0x0068:
            boolean r0 = X.AnonymousClass000.A1Y(r6)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r1.A00()     // Catch:{ all -> 0x008d }
            r7.L$0 = r10     // Catch:{ all -> 0x008d }
            r7.L$1 = r9     // Catch:{ all -> 0x008d }
            r7.L$2 = r1     // Catch:{ all -> 0x008d }
            r7.Z$0 = r11     // Catch:{ all -> 0x008d }
            r7.label = r4     // Catch:{ all -> 0x008d }
            java.lang.Object r0 = r10.BJt(r0, r7)     // Catch:{ all -> 0x008d }
            if (r0 != r5) goto L_0x0054
            goto L_0x0084
        L_0x0083:
            return r5
        L_0x0084:
            return r5
        L_0x0085:
            if (r11 == 0) goto L_0x008a
            r9.BEM(r2)
        L_0x008a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x008d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            if (r11 == 0) goto L_0x009a
            X.AnonymousClass4I2.A00(r0, r9)
            throw r1
        L_0x0096:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
        L_0x009a:
            throw r1
        L_0x009b:
            X.4sv r10 = (X.C99504sv) r10
            java.lang.Throwable r1 = r10.A00
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WB.A00(X.1dr, X.5bw, X.1G2, boolean):java.lang.Object");
    }
}

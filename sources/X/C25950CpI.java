package X;

import android.graphics.Paint;

/* renamed from: X.CpI  reason: case insensitive filesystem */
public abstract class C25950CpI {
    public static final C25950CpI A03 = new C23828Bql(2);
    public static final C25950CpI A04 = new C23828Bql(0);
    public static final C25950CpI A05 = new C23828Bql(1);
    public Paint A00 = AnonymousClass3MW.A06();
    public final AnonymousClass00O A01 = new AnonymousClass00O(0);
    public final Object A02 = C17880vN.A0p();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (X.C25898Co9.A01(r6.A00, r0.toString()) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.put(r7, java.lang.Boolean.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C25950CpI r6, java.lang.String r7) {
        /*
            java.lang.Object r2 = r6.A02
            monitor-enter(r2)
            X.00O r3 = r6.A01     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r3.get(r7)     // Catch:{ all -> 0x0077 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0013:
            X.Bql r6 = (X.C23828Bql) r6
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x004e;
                default: goto L_0x001a;
            }
        L_0x001a:
            r5 = 0
        L_0x001b:
            int r0 = r7.length()
            if (r5 >= r0) goto L_0x0069
            int r4 = r7.codePointAt(r5)
            r0 = 255(0xff, float:3.57E-43)
            if (r4 <= r0) goto L_0x0048
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r0) goto L_0x003e
            char r0 = (char) r4
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x0033:
            android.graphics.Paint r0 = r6.A00
            boolean r0 = X.C25898Co9.A01(r0, r1)
            if (r0 != 0) goto L_0x0048
        L_0x003b:
            r1 = 0
        L_0x003c:
            monitor-enter(r2)
            goto L_0x006b
        L_0x003e:
            char[] r0 = java.lang.Character.toChars(r4)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x0033
        L_0x0048:
            int r0 = java.lang.Character.charCount(r4)
            int r5 = r5 + r0
            goto L_0x001b
        L_0x004e:
            android.graphics.Paint r0 = r6.A00
            boolean r1 = X.C25898Co9.A01(r0, r7)
            goto L_0x003c
        L_0x0055:
            X.00O r0 = X.C25465CgK.A02
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = r0.toString()
            android.graphics.Paint r0 = r6.A00
            boolean r0 = X.C25898Co9.A01(r0, r1)
            if (r0 == 0) goto L_0x003b
        L_0x0069:
            r1 = 1
            goto L_0x003c
        L_0x006b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0074 }
            r3.put(r7, r0)     // Catch:{ all -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            return r1
        L_0x0074:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25950CpI.A00(X.CpI, java.lang.String):boolean");
    }
}

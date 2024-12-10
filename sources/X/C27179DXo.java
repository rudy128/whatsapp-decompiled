package X;

/* renamed from: X.DXo  reason: case insensitive filesystem */
public class C27179DXo implements C23421Fz {
    public final int A00;
    public final Object A01;

    public C27179DXo(C23421Fz r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r2 = new X.C27189DXz(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r6 = r3.BFC(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        if (r6 != X.C31751g4.COROUTINE_SUSPENDED) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BFC(X.C30391dr r9, X.AnonymousClass1G2 r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00c3;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00a4;
                case 6: goto L_0x009d;
                case 7: goto L_0x0096;
                case 8: goto L_0x008f;
                case 9: goto L_0x0088;
                case 10: goto L_0x0081;
                case 11: goto L_0x007a;
                case 12: goto L_0x0073;
                case 13: goto L_0x006c;
                case 14: goto L_0x005c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r9 instanceof X.C27391Dd4
            if (r0 == 0) goto L_0x0025
            r7 = r9
            X.Dd4 r7 = (X.C27391Dd4) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r7.label = r2
        L_0x0017:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r5) goto L_0x0030
            java.lang.Object r4 = r7.L$0
            goto L_0x002b
        L_0x0025:
            X.Dd4 r7 = new X.Dd4
            r7.<init>(r8, r9)
            goto L_0x0017
        L_0x002b:
            X.C30691eM.A01(r1)     // Catch:{ Dc8 -> 0x0056 }
            goto L_0x00d6
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0035:
            X.C30691eM.A01(r1)
            java.lang.Object r4 = X.C17880vN.A0p()
            X.4rD r3 = new X.4rD
            r3.<init>()
            java.lang.Object r2 = r8.A01     // Catch:{ Dc8 -> 0x0056 }
            X.1Fz r2 = (X.C23421Fz) r2     // Catch:{ Dc8 -> 0x0056 }
            r1 = 2
            X.DXw r0 = new X.DXw     // Catch:{ Dc8 -> 0x0056 }
            r0.<init>(r4, r3, r10, r1)     // Catch:{ Dc8 -> 0x0056 }
            r7.L$0 = r4     // Catch:{ Dc8 -> 0x0056 }
            r7.label = r5     // Catch:{ Dc8 -> 0x0056 }
            java.lang.Object r0 = r2.BFC(r7, r0)     // Catch:{ Dc8 -> 0x0056 }
            if (r0 != r6) goto L_0x00d6
            return r6
        L_0x0056:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 == r4) goto L_0x00d6
            throw r1
        L_0x005c:
            X.4rD r1 = new X.4rD
            r1.<init>()
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 7
            X.DXu r2 = new X.DXu
            r2.<init>(r1, r10, r0)
            goto L_0x00cd
        L_0x006c:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 16
            goto L_0x00c8
        L_0x0073:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 15
            goto L_0x00c8
        L_0x007a:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 14
            goto L_0x00c8
        L_0x0081:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 13
            goto L_0x00c8
        L_0x0088:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 12
            goto L_0x00c8
        L_0x008f:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 11
            goto L_0x00c8
        L_0x0096:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 10
            goto L_0x00c8
        L_0x009d:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 9
            goto L_0x00c8
        L_0x00a4:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 8
            goto L_0x00c8
        L_0x00ab:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 7
            goto L_0x00c8
        L_0x00b1:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 5
            goto L_0x00c8
        L_0x00b7:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 4
            goto L_0x00c8
        L_0x00bd:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 3
            goto L_0x00c8
        L_0x00c3:
            java.lang.Object r3 = r8.A01
            X.1Fz r3 = (X.C23421Fz) r3
            r0 = 2
        L_0x00c8:
            X.DXz r2 = new X.DXz
            r2.<init>(r10, r0)
        L_0x00cd:
            java.lang.Object r6 = r3.BFC(r9, r2)
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            if (r6 != r0) goto L_0x00d6
            return r6
        L_0x00d6:
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27179DXo.BFC(X.1dr, X.1G2):java.lang.Object");
    }
}

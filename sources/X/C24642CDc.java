package X;

/* renamed from: X.CDc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C24642CDc {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C30391dr r6, X.C23421Fz r7, X.AnonymousClass1G2 r8) {
        /*
            boolean r0 = r6 instanceof X.C27369Dci
            if (r0 == 0) goto L_0x0022
            r5 = r6
            X.Dci r5 = (X.C27369Dci) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r4) goto L_0x002c
            java.lang.Object r2 = r5.L$0
            X.4rF r2 = (X.C98494rF) r2
            goto L_0x0028
        L_0x0022:
            X.Dci r5 = new X.Dci
            r5.<init>(r6)
            goto L_0x0012
        L_0x0028:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x004b }
            goto L_0x0049
        L_0x002c:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0l()
            throw r2
        L_0x0031:
            X.C30691eM.A01(r1)
            X.4rF r2 = X.C98494rF.A00()
            r1 = 6
            X.DXu r0 = new X.DXu     // Catch:{ all -> 0x004b }
            r0.<init>(r2, r8, r1)     // Catch:{ all -> 0x004b }
            r5.L$0 = r2     // Catch:{ all -> 0x004b }
            r5.label = r4     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r7.BFC(r5, r0)     // Catch:{ all -> 0x004b }
            if (r0 != r3) goto L_0x0049
            return r3
        L_0x0049:
            r0 = 0
            return r0
        L_0x004b:
            r3 = move-exception
            java.lang.Object r2 = r2.element
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0059
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0059
            throw r3
        L_0x0059:
            X.0wh r1 = r5.getContext()
            X.1OU r0 = X.AnonymousClass1OB.A00
            X.0wi r1 = r1.get(r0)
            X.1OB r1 = (X.AnonymousClass1OB) r1
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.isCancelled()
            if (r0 == 0) goto L_0x0078
            java.util.concurrent.CancellationException r0 = r1.BOI()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0078
            throw r3
        L_0x0078:
            if (r2 == 0) goto L_0x0086
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x0082
            X.C25359CeJ.A01(r2, r3)
            throw r2
        L_0x0082:
            X.C25359CeJ.A01(r3, r2)
            throw r3
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24642CDc.A00(X.1dr, X.1Fz, X.1G2):java.lang.Object");
    }
}

package X;

/* renamed from: X.Crh  reason: case insensitive filesystem */
public abstract /* synthetic */ class C26067Crh {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r0 != r3) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C30391dr r7, X.AnonymousClass1OS r8, X.C23421Fz r9) {
        /*
            boolean r0 = r7 instanceof X.C27416DdX
            if (r0 == 0) goto L_0x0026
            r6 = r7
            X.DdX r6 = (X.C27416DdX) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x006d
            java.lang.Object r3 = r6.L$2
            java.lang.Object r2 = r6.L$1
            X.4rF r2 = (X.C98494rF) r2
            java.lang.Object r8 = r6.L$0
            goto L_0x002c
        L_0x0026:
            X.DdX r6 = new X.DdX
            r6.<init>(r7)
            goto L_0x0012
        L_0x002c:
            X.C30691eM.A01(r5)     // Catch:{ Dc8 -> 0x0051 }
            goto L_0x0056
        L_0x0030:
            X.C30691eM.A01(r5)
            X.4rF r2 = X.C98494rF.A00()
            X.1I8 r0 = X.AnonymousClass4IV.A01
            r2.element = r0
            r0 = 8
            X.DXu r3 = new X.DXu
            r3.<init>(r2, r8, r0)
            r6.L$0 = r8     // Catch:{ Dc8 -> 0x0051 }
            r6.L$1 = r2     // Catch:{ Dc8 -> 0x0051 }
            r6.L$2 = r3     // Catch:{ Dc8 -> 0x0051 }
            r6.label = r1     // Catch:{ Dc8 -> 0x0051 }
            java.lang.Object r0 = r9.BFC(r6, r3)     // Catch:{ Dc8 -> 0x0051 }
            if (r0 != r4) goto L_0x0056
            return r4
        L_0x0051:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 != r3) goto L_0x0071
        L_0x0056:
            java.lang.Object r1 = r2.element
            X.1I8 r0 = X.AnonymousClass4IV.A01
            if (r1 == r0) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected at least one element matching the predicate "
            java.lang.String r0 = X.AnonymousClass001.A1E(r8, r0, r1)
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x006d:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
        L_0x0071:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26067Crh.A00(X.1dr, X.1OS, X.1Fz):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C30391dr r6, X.C36001nB r7, X.C23421Fz r8) {
        /*
            boolean r0 = r6 instanceof X.C27373Dcm
            if (r0 == 0) goto L_0x0048
            r5 = r6
            X.Dcm r5 = (X.C27373Dcm) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0048
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r3) goto L_0x0056
            java.lang.Object r2 = r5.L$0
            X.4rF r2 = (X.C98494rF) r2
            X.C30691eM.A01(r1)
        L_0x0024:
            java.lang.Object r1 = r2.element
            X.1I8 r0 = X.AnonymousClass4IV.A01
            if (r1 == r0) goto L_0x004e
            return r1
        L_0x002b:
            X.C30691eM.A01(r1)
            X.4rF r2 = X.C98494rF.A00()
            X.1I8 r0 = X.AnonymousClass4IV.A01
            r2.element = r0
            r1 = 9
            X.DXu r0 = new X.DXu
            r0.<init>(r7, r2, r1)
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r0 = r8.BFC(r5, r0)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0048:
            X.Dcm r5 = new X.Dcm
            r5.<init>(r6)
            goto L_0x0012
        L_0x004e:
            java.lang.String r1 = "Empty flow can't be reduced"
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26067Crh.A01(X.1dr, X.1nB, X.1Fz):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 != r3) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C30391dr r7, X.C23421Fz r8) {
        /*
            boolean r0 = r7 instanceof X.C27392Dd5
            if (r0 == 0) goto L_0x0024
            r6 = r7
            X.Dd5 r6 = (X.C27392Dd5) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r1) goto L_0x0061
            java.lang.Object r3 = r6.L$1
            java.lang.Object r2 = r6.L$0
            X.4rF r2 = (X.C98494rF) r2
            goto L_0x002a
        L_0x0024:
            X.Dd5 r6 = new X.Dd5
            r6.<init>(r7)
            goto L_0x0012
        L_0x002a:
            X.C30691eM.A01(r5)     // Catch:{ Dc8 -> 0x004d }
            goto L_0x0052
        L_0x002e:
            X.C30691eM.A01(r5)
            X.4rF r2 = X.C98494rF.A00()
            X.1I8 r0 = X.AnonymousClass4IV.A01
            r2.element = r0
            r0 = 19
            X.DXz r3 = new X.DXz
            r3.<init>(r2, r0)
            r6.L$0 = r2     // Catch:{ Dc8 -> 0x004d }
            r6.L$1 = r3     // Catch:{ Dc8 -> 0x004d }
            r6.label = r1     // Catch:{ Dc8 -> 0x004d }
            java.lang.Object r0 = r8.BFC(r6, r3)     // Catch:{ Dc8 -> 0x004d }
            if (r0 != r4) goto L_0x0052
            return r4
        L_0x004d:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 != r3) goto L_0x0065
        L_0x0052:
            java.lang.Object r1 = r2.element
            X.1I8 r0 = X.AnonymousClass4IV.A01
            if (r1 == r0) goto L_0x0059
            return r1
        L_0x0059:
            java.lang.String r0 = "Expected at least one element"
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x0061:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
        L_0x0065:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26067Crh.A02(X.1dr, X.1Fz):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C30391dr r7, X.C23421Fz r8) {
        /*
            boolean r0 = r7 instanceof X.C27393Dd6
            if (r0 == 0) goto L_0x0024
            r6 = r7
            X.Dd6 r6 = (X.C27393Dd6) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002e
            java.lang.Object r3 = r6.L$1
            java.lang.Object r2 = r6.L$0
            X.4rF r2 = (X.C98494rF) r2
            goto L_0x002a
        L_0x0024:
            X.Dd6 r6 = new X.Dd6
            r6.<init>(r7)
            goto L_0x0012
        L_0x002a:
            X.C30691eM.A01(r5)     // Catch:{ Dc8 -> 0x004e }
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0033:
            X.C30691eM.A01(r5)
            X.4rF r2 = X.C98494rF.A00()
            r0 = 20
            X.DXz r3 = new X.DXz
            r3.<init>(r2, r0)
            r6.L$0 = r2     // Catch:{ Dc8 -> 0x004e }
            r6.L$1 = r3     // Catch:{ Dc8 -> 0x004e }
            r6.label = r1     // Catch:{ Dc8 -> 0x004e }
            java.lang.Object r0 = r8.BFC(r6, r3)     // Catch:{ Dc8 -> 0x004e }
            if (r0 != r4) goto L_0x0054
            return r4
        L_0x004e:
            r1 = move-exception
            java.lang.Object r0 = r1.A00
            if (r0 == r3) goto L_0x0054
            throw r1
        L_0x0054:
            java.lang.Object r0 = r2.element
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26067Crh.A03(X.1dr, X.1Fz):java.lang.Object");
    }
}

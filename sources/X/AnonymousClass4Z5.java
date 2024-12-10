package X;

/* renamed from: X.4Z5  reason: invalid class name */
public abstract class AnonymousClass4Z5 {
    public static final Object A00(C30391dr r3, AnonymousClass1OS r4, long j) {
        if (j > 0) {
            return A02(r4, new AnonymousClass5WT(r3, j));
        }
        throw new C99814tV("Timed out immediately", (AnonymousClass1OB) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C30391dr r8, X.AnonymousClass1OS r9, long r10) {
        /*
            boolean r0 = r8 instanceof X.C100724uy
            if (r0 == 0) goto L_0x0023
            r7 = r8
            X.4uy r7 = (X.C100724uy) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x002d
            java.lang.Object r3 = r7.L$1
            X.4rF r3 = (X.C98494rF) r3
            goto L_0x0029
        L_0x0023:
            X.4uy r7 = new X.4uy
            r7.<init>(r8)
            goto L_0x0012
        L_0x0029:
            X.C30691eM.A01(r1)     // Catch:{ 4tV -> 0x0056 }
            return r1
        L_0x002d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0032:
            X.C30691eM.A01(r1)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            X.4rF r3 = X.C98494rF.A00()
            r7.L$0 = r9     // Catch:{ 4tV -> 0x0056 }
            r7.L$1 = r3     // Catch:{ 4tV -> 0x0056 }
            r7.J$0 = r10     // Catch:{ 4tV -> 0x0056 }
            r7.label = r4     // Catch:{ 4tV -> 0x0056 }
            X.5WT r0 = new X.5WT     // Catch:{ 4tV -> 0x0056 }
            r0.<init>(r7, r10)     // Catch:{ 4tV -> 0x0056 }
            r3.element = r0     // Catch:{ 4tV -> 0x0056 }
            java.lang.Object r1 = A02(r9, r0)     // Catch:{ 4tV -> 0x0056 }
            if (r1 != r6) goto L_0x0055
            return r6
        L_0x0055:
            return r1
        L_0x0056:
            r2 = move-exception
            X.1OB r1 = r2.A00
            java.lang.Object r0 = r3.element
            if (r1 == r0) goto L_0x005e
            throw r2
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z5.A01(X.1dr, X.1OS, long):java.lang.Object");
    }

    public static final Object A02(AnonymousClass1OS r4, AnonymousClass5WT r5) {
        Object obj;
        Object A0a;
        C30551e8.A01(new AnonymousClass3JK(C62882s9.A02(r5.A00.getContext()).Bdz(r5, r5.getContext(), r5.A00)), r5, false, true);
        try {
            if (!(r4 instanceof C30411dt)) {
                obj = C30581eB.A00(r5, r5, r4);
            } else {
                C41681wt.A04(r4, 2);
                obj = r4.invoke(r5, r5);
            }
        } catch (Throwable th) {
            obj = new C30681eL(th);
        }
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        if (obj == r2 || (A0a = r5.A0a(obj)) == AnonymousClass1OF.A00) {
            return r2;
        }
        if (!(A0a instanceof C30681eL)) {
            return AnonymousClass1OF.A01(A0a);
        }
        Throwable th2 = ((C30681eL) A0a).A00;
        if (!(th2 instanceof C99814tV) || ((C99814tV) th2).A00 != r5) {
            throw th2;
        } else if (!(obj instanceof C30681eL)) {
            return obj;
        } else {
            throw ((C30681eL) obj).A00;
        }
    }
}

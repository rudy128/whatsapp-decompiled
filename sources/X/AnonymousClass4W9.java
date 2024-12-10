package X;

/* renamed from: X.4W9  reason: invalid class name */
public abstract class AnonymousClass4W9 {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C30391dr r5, X.C18090vk r6, X.C108475bl r7) {
        /*
            boolean r0 = r5 instanceof X.C100544ug
            if (r0 == 0) goto L_0x0022
            r4 = r5
            X.4ug r4 = (X.C100544ug) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r2) goto L_0x002c
            java.lang.Object r6 = r4.L$1
            X.0vk r6 = (X.C18090vk) r6
            goto L_0x0028
        L_0x0022:
            X.4ug r4 = new X.4ug
            r4.<init>(r5)
            goto L_0x0012
        L_0x0028:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0059
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            X.C30691eM.A01(r1)
            X.0wh r1 = r4.getContext()
            X.1OU r0 = X.AnonymousClass1OB.A00
            X.0wi r0 = r1.get(r0)
            if (r0 != r7) goto L_0x0064
            r4.L$0 = r7     // Catch:{ all -> 0x005f }
            r4.L$1 = r6     // Catch:{ all -> 0x005f }
            r4.label = r2     // Catch:{ all -> 0x005f }
            X.1g7 r1 = X.C72473Md.A0m(r4)     // Catch:{ all -> 0x005f }
            X.5UT r0 = new X.5UT     // Catch:{ all -> 0x005f }
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            r7.Bdw(r0)     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r1.A0C()     // Catch:{ all -> 0x005f }
            if (r0 != r3) goto L_0x0059
            return r3
        L_0x0059:
            r6.invoke()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x005f:
            r0 = move-exception
            r6.invoke()
            throw r0
        L_0x0064:
            java.lang.String r0 = "awaitClose() can only be invoked from the producer context"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4W9.A00(X.1dr, X.0vk, X.5bl):java.lang.Object");
    }

    public static final AnonymousClass5WI A01(C18560wh r4, AnonymousClass1OS r5, AnonymousClass1OX r6, int i) {
        C25691Pg r0 = C25691Pg.SUSPEND;
        Integer num = AnonymousClass00R.A00;
        AnonymousClass5WI r02 = new AnonymousClass5WI(C30471e0.A02(r4, r6), AnonymousClass4W8.A01(r0, i));
        r02.A11(num, r02, r5);
        return r02;
    }
}

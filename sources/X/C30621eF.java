package X;

/* renamed from: X.1eF  reason: invalid class name and case insensitive filesystem */
public abstract class C30621eF {
    public static final AnonymousClass1I8 A00 = new AnonymousClass1I8("REUSABLE_CLAIMED");
    public static final AnonymousClass1I8 A01 = new AnonymousClass1I8("UNDEFINED");

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r0.A15() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (r0.A15() != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(java.lang.Object r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C30611eE
            if (r0 == 0) goto L_0x00ab
            X.1eE r11 = (X.C30611eE) r11
            r3 = r10
            java.lang.Throwable r0 = X.C30671eK.A00(r10)
            if (r0 == 0) goto L_0x0012
            X.1eL r3 = new X.1eL
            r3.<init>(r0)
        L_0x0012:
            X.0wl r1 = r11.A03
            X.1dr r7 = r11.A02
            X.0wh r0 = r7.getContext()
            boolean r0 = r1.A0C(r0)
            r5 = 1
            if (r0 == 0) goto L_0x002d
            r11.A00 = r3
            r11.A00 = r5
            X.0wh r0 = r7.getContext()
            r1.A0D(r11, r0)
            return
        L_0x002d:
            X.1IJ r4 = X.C37591po.A00()
            long r0 = r4.A00
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0044
            r11.A00 = r3
            r11.A00 = r5
            r4.A0G(r11)
            return
        L_0x0044:
            long r0 = r0 + r8
            r4.A00 = r0
            r6 = 0
            X.0wh r1 = r7.getContext()     // Catch:{ all -> 0x009e }
            X.1OU r0 = X.AnonymousClass1OB.A00     // Catch:{ all -> 0x009e }
            X.0wi r1 = r1.get(r0)     // Catch:{ all -> 0x009e }
            X.1OB r1 = (X.AnonymousClass1OB) r1     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.Be2()     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x006e
            java.util.concurrent.CancellationException r0 = r1.BOI()     // Catch:{ all -> 0x009e }
            X.1IU r0 = X.C30691eM.A00(r0)     // Catch:{ all -> 0x009e }
            r11.resumeWith(r0)     // Catch:{ all -> 0x009e }
        L_0x0067:
            boolean r0 = r4.A0I()     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x0067
            goto L_0x00a2
        L_0x006e:
            java.lang.Object r0 = r11.A01     // Catch:{ all -> 0x009e }
            X.0wh r3 = r7.getContext()     // Catch:{ all -> 0x009e }
            java.lang.Object r2 = X.C30631eG.A00(r0, r3)     // Catch:{ all -> 0x009e }
            X.1I8 r0 = X.C30631eG.A00     // Catch:{ all -> 0x009e }
            if (r2 == r0) goto L_0x0081
            X.1wp r0 = X.C30471e0.A03(r2, r7, r3)     // Catch:{ all -> 0x009e }
            goto L_0x0082
        L_0x0081:
            r0 = r6
        L_0x0082:
            r7.resumeWith(r10)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.A15()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0067
        L_0x008d:
            X.C30631eG.A02(r2, r3)     // Catch:{ all -> 0x009e }
            goto L_0x0067
        L_0x0091:
            r1 = move-exception
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.A15()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x009d
        L_0x009a:
            X.C30631eG.A02(r2, r3)     // Catch:{ all -> 0x009e }
        L_0x009d:
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            r11.A0A(r0, r6)     // Catch:{ all -> 0x00a6 }
        L_0x00a2:
            r4.A0H(r5)
            return
        L_0x00a6:
            r0 = move-exception
            r4.A0H(r5)
            throw r0
        L_0x00ab:
            r11.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30621eF.A00(java.lang.Object, X.1dr):void");
    }
}

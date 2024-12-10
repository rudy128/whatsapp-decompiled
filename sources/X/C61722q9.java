package X;

/* renamed from: X.2q9  reason: invalid class name and case insensitive filesystem */
public final class C61722q9 {
    public final AnonymousClass190 A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass1Cd A02;
    public final C24751Ln A03;
    public final C202711m A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1DL A06;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass24H A00(X.C61722q9 r13, X.C445823z r14, X.AnonymousClass1BI r15, boolean r16) {
        /*
            long r8 = r14.A0x
            if (r15 == 0) goto L_0x0011
            X.1DL r0 = r13.A06
            long r10 = r0.A09(r15)
        L_0x000a:
            X.1Cd r0 = r13.A02
            X.1at r6 = r0.get()
            goto L_0x0014
        L_0x0011:
            r10 = -1
            goto L_0x000a
        L_0x0014:
            X.11m r5 = r13.A04     // Catch:{ all -> 0x0067 }
            X.C18070vi.A0b(r6)     // Catch:{ all -> 0x0067 }
            r7 = 93
            r12 = r16
            android.database.Cursor r4 = r5.A03(r6, r7, r8, r10, r12)     // Catch:{ all -> 0x0067 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0060 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            java.util.HashMap r1 = X.C63792th.A01(r4, r7)     // Catch:{ all -> 0x0060 }
            X.212 r3 = r5.A05(r4, r1)     // Catch:{ all -> 0x0060 }
            boolean r0 = r3 instanceof X.AnonymousClass24H     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x003e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "EventResponseMessageManager/getEventResponseMessageBySender unexpected fMessageAddOn "
            X.C17900vP.A0X(r3, r0, r1)     // Catch:{ all -> 0x0060 }
            goto L_0x0059
        L_0x003e:
            X.1DL r0 = r13.A06     // Catch:{ all -> 0x0060 }
            r3.A1B(r4, r0, r1)     // Catch:{ all -> 0x0060 }
            X.205 r2 = r14.A0v     // Catch:{ all -> 0x0060 }
            X.1BI r1 = r14.A0H()     // Catch:{ all -> 0x0060 }
            X.A51 r0 = new X.A51     // Catch:{ all -> 0x0060 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0060 }
            r3.A05 = r0     // Catch:{ all -> 0x0060 }
            X.24H r3 = (X.AnonymousClass24H) r3     // Catch:{ all -> 0x0060 }
            r4.close()     // Catch:{ all -> 0x0067 }
            r6.close()
            return r3
        L_0x0059:
            r4.close()     // Catch:{ all -> 0x0067 }
            r6.close()
            return r2
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61722q9.A00(X.2q9, X.23z, X.1BI, boolean):X.24H");
    }

    public C61722q9(AnonymousClass190 r1, AnonymousClass121 r2, AnonymousClass1DL r3, AnonymousClass1Cd r4, C24751Ln r5, C202711m r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r1, r5, r4, r6);
        C18070vi.A0l(r2, r7);
        this.A06 = r3;
        this.A00 = r1;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r2;
        this.A05 = r7;
    }
}

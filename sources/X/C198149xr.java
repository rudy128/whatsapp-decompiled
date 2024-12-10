package X;

/* renamed from: X.9xr  reason: invalid class name and case insensitive filesystem */
public final class C198149xr {
    public final AnonymousClass00H A00;
    public final C35681md A01;
    public final AnonymousClass10I A02;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r10 == null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.BB1 r13, X.C198149xr r14, X.AnonymousClass22H r15, java.lang.String r16, java.lang.String r17, java.util.Map r18) {
        /*
            r8 = r15
            boolean r0 = r15.A0w()
            r7 = r13
            r5 = r14
            r2 = r17
            if (r0 != 0) goto L_0x0018
            X.10I r3 = r14.A02
            r0 = 36
            X.7Qs r1 = new X.7Qs
            r1.<init>(r0, r2, r13)
        L_0x0014:
            r3.CGF(r1)
            return
        L_0x0018:
            X.205 r9 = r15.A0v
            java.lang.String r12 = r9.A01
            X.C18070vi.A0X(r12)
            X.00H r6 = r14.A00
            java.lang.Object r0 = r6.get()
            X.9yW r0 = (X.C198549yW) r0
            r3 = r16
            if (r16 != 0) goto L_0x008d
            X.C198549yW.A00(r0)
            java.lang.Object r11 = r0.A02
            monitor-enter(r11)
            java.util.Map r13 = r0.A03     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r13.get(r12)     // Catch:{ all -> 0x00c4 }
            X.9sd r0 = (X.C194999sd) r0     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x003e
            java.util.Map r10 = r0.A03     // Catch:{ all -> 0x00c4 }
            goto L_0x003f
        L_0x003e:
            r10 = 0
        L_0x003f:
            if (r18 == 0) goto L_0x0085
            if (r10 == 0) goto L_0x0087
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x008b
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x008b
            java.util.Iterator r16 = X.AnonymousClass000.A15(r18)     // Catch:{ all -> 0x00c4 }
        L_0x0053:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x008b
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r16)     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00c4 }
            long r14 = X.C17880vN.A05(r0)     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x00c4 }
            java.util.List r0 = X.AnonymousClass8BS.A0t(r0, r10)     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x0071
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x00c4 }
        L_0x0071:
            int r1 = r0.size()     // Catch:{ all -> 0x00c4 }
            r0 = 5
            if (r1 >= r0) goto L_0x0053
            long r0 = (long) r1     // Catch:{ all -> 0x00c4 }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x0053
            r13.remove(r12)     // Catch:{ all -> 0x00c4 }
            X.1CQ r10 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x00c4 }
            goto L_0x008b
        L_0x0085:
            if (r10 != 0) goto L_0x008b
        L_0x0087:
            X.1CQ r10 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x00c4 }
        L_0x008b:
            monitor-exit(r11)
            goto L_0x00ae
        L_0x008d:
            X.C198549yW.A00(r0)
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r12)
            X.9sd r0 = (X.C194999sd) r0
            if (r0 == 0) goto L_0x00a2
            java.util.Map r0 = r0.A02
            java.util.List r1 = X.AnonymousClass8BS.A0t(r3, r0)
            if (r1 != 0) goto L_0x00a4
        L_0x00a2:
            X.0wS r1 = X.C18460wS.A00
        L_0x00a4:
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x00bf
            java.util.Map r10 = X.C108975cc.A0h(r3, r1)
        L_0x00ae:
            boolean r0 = X.AnonymousClass8BR.A1Y(r10)
            if (r0 == 0) goto L_0x00c7
            X.10I r3 = r5.A02
            r0 = 45
            X.AkY r1 = new X.AkY
            r1.<init>(r7, r10, r2, r0)
            goto L_0x0014
        L_0x00bf:
            X.1CQ r10 = X.AnonymousClass1D7.A0I()
            goto L_0x00ae
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x00c7:
            java.util.List r0 = r8.A07
            int r1 = r0.size()
            r0 = 2
            if (r1 >= r0) goto L_0x00d1
            r1 = 2
        L_0x00d1:
            r4 = 5000(0x1388, float:7.006E-42)
            if (r3 != 0) goto L_0x00d7
            int r4 = r1 * 10
        L_0x00d7:
            X.1md r5 = r5.A01
            X.1BI r10 = r9.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r10, r0)
            X.1ch r10 = (X.C29681ch) r10
            long r0 = r8.A0y
            X.AWb r12 = new X.AWb
            r12.<init>(r7, r8, r6, r3)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            X.1mZ r4 = r5.A09
            X.10F r4 = r4.A00
            X.10E r4 = r4.A00
            X.11S r5 = X.AnonymousClass10E.A17(r4)
            X.1Ln r8 = X.AnonymousClass3MZ.A0q(r4)
            X.1Me r7 = X.AnonymousClass3MZ.A0g(r4)
            X.1M9 r6 = X.AnonymousClass10E.A4z(r4)
            X.10I r13 = X.AnonymousClass10E.AL1(r4)
            X.1PY r9 = X.AnonymousClass3Ma.A0l(r4)
            X.00S r4 = r4.A7S
            java.lang.Object r11 = r4.get()
            X.5Y9 r11 = (X.AnonymousClass5Y9) r11
            X.8y9 r4 = new X.8y9
            r16 = r2
            r17 = r0
            r15 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198149xr.A00(X.BB1, X.9xr, X.22H, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public C198149xr(C35681md r1, AnonymousClass10I r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r1;
    }
}

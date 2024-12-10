package X;

/* renamed from: X.AQx  reason: case insensitive filesystem */
public final class C20587AQx implements AnonymousClass1TT {
    public final C18100vl A00;

    public byte[] BDu(C59062lh r8, String str, byte[] bArr, byte[] bArr2, long j) {
        byte[] bArr3 = bArr2;
        C18070vi.A0d(bArr2, 4);
        try {
            C198109xn r2 = (C198109xn) this.A00.getValue();
            return (byte[]) A00(r2.A01, A01(r8).A00).A00(new C21544Alr(r2, str, bArr3, bArr, (int) j)).A00;
        } catch (Exception e) {
            if (e instanceof AnonymousClass9LX) {
                throw new AnonymousClass2E3((Throwable) e);
            } else if (e instanceof AnonymousClass9LC) {
                throw new C46292Dz(e);
            } else {
                throw e;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A6U BIA(X.C55322fa r20, X.C59062lh r21) {
        /*
            r19 = this;
            r0 = 0
            r2 = r21
            X.C18070vi.A0d(r2, r0)
            r1 = r19
            X.0vl r1 = r1.A00     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r12 = r1.getValue()     // Catch:{ Exception -> 0x00a7 }
            X.9xn r12 = (X.C198109xn) r12     // Catch:{ Exception -> 0x00a7 }
            X.9bB r11 = A01(r2)     // Catch:{ Exception -> 0x00a7 }
            r4 = r20
            X.A2n r1 = r4.A01     // Catch:{ Exception -> 0x00a7 }
            byte[] r1 = r1.A00     // Catch:{ Exception -> 0x00a7 }
            X.9Xh r14 = new X.9Xh     // Catch:{ Exception -> 0x00a7 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x00a7 }
            byte[] r3 = r4.A03     // Catch:{ Exception -> 0x00a7 }
            X.2rJ r1 = r4.A00     // Catch:{ Exception -> 0x00a7 }
            java.lang.Integer r15 = X.C196659vQ.A01(r1)     // Catch:{ Exception -> 0x00a7 }
            byte[] r2 = r4.A02     // Catch:{ Exception -> 0x00a7 }
            byte[] r1 = r4.A04     // Catch:{ Exception -> 0x00a7 }
            X.9fa r8 = new X.9fa     // Catch:{ Exception -> 0x00a7 }
            r13 = r8
            r16 = r3
            r17 = r2
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00a7 }
            r7 = 1
            byte[] r6 = r8.A02     // Catch:{ Exception -> 0x00a7 }
            int r5 = r6.length     // Catch:{ Exception -> 0x00a7 }
            r1 = 48
            if (r5 < r1) goto L_0x00a1
            r1 = 3
            byte[][] r4 = new byte[r1][]     // Catch:{ Exception -> 0x00a7 }
            r3 = 16
            byte[] r1 = X.C200310o.A09(r6, r0, r3)     // Catch:{ Exception -> 0x00a7 }
            r4[r0] = r1     // Catch:{ Exception -> 0x00a7 }
            int r2 = r5 + -32
            byte[] r1 = X.C200310o.A09(r6, r3, r2)     // Catch:{ Exception -> 0x00a7 }
            r4[r7] = r1     // Catch:{ Exception -> 0x00a7 }
            byte[] r10 = X.C200310o.A09(r6, r2, r5)     // Catch:{ Exception -> 0x00a7 }
            r1 = 2
            r4[r1] = r10     // Catch:{ Exception -> 0x00a7 }
            r9 = r4[r0]     // Catch:{ Exception -> 0x00a7 }
            r7 = r4[r7]     // Catch:{ Exception -> 0x00a7 }
            X.9XK r2 = r12.A01     // Catch:{ Exception -> 0x00a7 }
            X.9dR r1 = r11.A00     // Catch:{ Exception -> 0x00a7 }
            X.9jF r1 = A00(r2, r1)     // Catch:{ Exception -> 0x00a7 }
            r13 = 3
            X.Alh r6 = new X.Alh     // Catch:{ Exception -> 0x00a7 }
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (int) r13)     // Catch:{ Exception -> 0x00a7 }
            X.9jF r1 = r1.A00(r6)     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r2 = r1.A00     // Catch:{ Exception -> 0x00a7 }
            X.9gd r2 = (X.C187949gd) r2     // Catch:{ Exception -> 0x00a7 }
            X.C18070vi.A0d(r2, r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = r2.A04     // Catch:{ Exception -> 0x00a7 }
            int r8 = r2.A00     // Catch:{ Exception -> 0x00a7 }
            X.9Xh r1 = r2.A02     // Catch:{ Exception -> 0x00a7 }
            r6 = 0
            if (r1 == 0) goto L_0x009e
            byte[] r1 = r1.A00     // Catch:{ Exception -> 0x00a7 }
            X.A2n r4 = new X.A2n     // Catch:{ Exception -> 0x00a7 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x0086:
            java.lang.Integer r1 = r2.A03     // Catch:{ Exception -> 0x00a7 }
            X.2rJ r3 = X.C196659vQ.A00(r1)     // Catch:{ Exception -> 0x00a7 }
            X.9XM r1 = r2.A01     // Catch:{ Exception -> 0x00a7 }
            if (r1 == 0) goto L_0x0096
            X.8cn r1 = r1.A00     // Catch:{ Exception -> 0x00a7 }
            byte[] r6 = r1.A0M()     // Catch:{ Exception -> 0x00a7 }
        L_0x0096:
            byte[] r7 = r2.A05     // Catch:{ Exception -> 0x00a7 }
            X.A6U r2 = new X.A6U     // Catch:{ Exception -> 0x00a7 }
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00a0
        L_0x009e:
            r4 = r6
            goto L_0x0086
        L_0x00a0:
            return r2
        L_0x00a1:
            X.9LD r1 = new X.9LD     // Catch:{ Exception -> 0x00a7 }
            r1.<init>()     // Catch:{ Exception -> 0x00a7 }
            throw r1     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            r3 = move-exception
            boolean r1 = r3 instanceof X.AnonymousClass9LX
            if (r1 != 0) goto L_0x00d8
            boolean r1 = r3 instanceof X.AnonymousClass9LC
            if (r1 != 0) goto L_0x00d2
            boolean r1 = r3 instanceof X.AnonymousClass9LD
            if (r1 != 0) goto L_0x00c8
            boolean r0 = r3 instanceof X.AnonymousClass9LI
            if (r0 == 0) goto L_0x00c7
            r0 = r3
            X.9LI r0 = (X.AnonymousClass9LI) r0
            java.lang.Throwable r1 = r0.cause
            boolean r0 = r1 instanceof X.AnonymousClass2E2
            if (r0 == 0) goto L_0x00c7
            r3 = r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.sync.exception.MutationException"
            X.C18070vi.A0z(r1, r0)
        L_0x00c7:
            throw r3
        L_0x00c8:
            X.9LD r3 = (X.AnonymousClass9LD) r3
            java.lang.String r1 = r3.message
            java.text.ParseException r2 = new java.text.ParseException
            r2.<init>(r1, r0)
            throw r2
        L_0x00d2:
            X.2Dz r2 = new X.2Dz
            r2.<init>(r3)
            throw r2
        L_0x00d8:
            X.2E3 r2 = new X.2E3
            r2.<init>((java.lang.Throwable) r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20587AQx.BIA(X.2fa, X.2lh):X.A6U");
    }

    public C55322fa BK7(A6U a6u, C59062lh r8) {
        C18070vi.A0d(r8, 0);
        try {
            C198109xn r5 = (C198109xn) this.A00.getValue();
            C184579bB A01 = A01(r8);
            C187299fa r1 = (C187299fa) A00(r5.A01, A01.A00).A00(new C21532Alf(new C187949gd(a6u), r5, A01, 1)).A00;
            C18070vi.A0d(r1, 0);
            return new C55322fa(C196659vQ.A00(r1.A01), new C19999A2n(r1.A00.A00), r1.A03, r1.A02);
        } catch (Exception e) {
            if (e instanceof AnonymousClass9LX) {
                throw new AnonymousClass2E3((Throwable) e);
            } else if (e instanceof AnonymousClass9LC) {
                throw new C46292Dz(e);
            } else {
                throw e;
            }
        }
    }

    public static C189439jF A00(AnonymousClass9XK r7, C185969dR r8) {
        try {
            C56822i5 r72 = r7.A00;
            byte[] bArr = r8.A02;
            long j = r8.A00;
            C185979dS r0 = r8.A01;
            C55252fT A002 = r72.A00(new C59372mC(new C195959uE(r0.A02, r0.A01, r0.A00), bArr, j));
            return new C189439jF(new C187289fZ(A002.A00, A002.A03, A002.A04, A002.A02, A002.A01));
        } catch (Exception e) {
            throw new AnonymousClass9LC(e);
        }
    }

    public static final C184579bB A01(C59062lh r8) {
        C183189Xh r7 = new C183189Xh(r8.A01.A00);
        C59372mC r0 = r8.A00;
        byte[] bArr = r0.A02;
        long j = r0.A00;
        C195959uE r02 = r0.A01;
        return new C184579bB(new C185969dR(new C185979dS(C29431cG.A12(r02.A02), r02.A01, r02.A00), bArr, j), r7);
    }

    public byte[] BDz(C59062lh r5, String str, byte[] bArr, long j) {
        try {
            C198109xn r3 = (C198109xn) this.A00.getValue();
            return (byte[]) A00(r3.A01, A01(r5).A00).A00(new C21543Alq(r3, str, bArr, (int) j)).A00;
        } catch (Exception e) {
            if (e instanceof AnonymousClass9LX) {
                throw new AnonymousClass2E3((Throwable) e);
            } else if (e instanceof AnonymousClass9LC) {
                throw new C46292Dz(e);
            } else {
                throw e;
            }
        }
    }

    public C20587AQx(AnonymousClass00H r2) {
        this.A00 = AnonymousClass1DF.A01(new C21915Auf(r2));
    }
}

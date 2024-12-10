package X;

/* renamed from: X.6q4  reason: invalid class name and case insensitive filesystem */
public final class C134116q4 {
    public final C18030ve A00;
    public final C32431hB A01;
    public final C24641Lc A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C151437mI(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C151447mJ(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new C151457mK(this));
    public final C218617r A0B;
    public final AnonymousClass00H A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0097, code lost:
        if (r0.length > 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c0, code lost:
        if (r1.getHeight() <= 120) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.AnonymousClass21V r9) {
        /*
            r8 = this;
            r4 = 0
            X.C18070vi.A0d(r9, r4)
            X.2rc r1 = r9.A02
            r7 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            boolean r0 = r1.A0V
            if (r0 != r3) goto L_0x0015
            boolean r0 = r1.A01()
            if (r0 != r3) goto L_0x0015
        L_0x0014:
            return r4
        L_0x0015:
            boolean r0 = r9.A16()
            if (r0 == 0) goto L_0x0014
            X.36w r0 = X.C60502o8.A00(r9)
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A0A
            if (r0 != r3) goto L_0x0026
            return r4
        L_0x0026:
            X.36v r6 = r9.A17()
            X.2rc r0 = r9.A02
            r2 = 0
            if (r0 == 0) goto L_0x0031
            java.lang.String r2 = r0.A0L
        L_0x0031:
            if (r6 == 0) goto L_0x00da
            int[] r0 = r6.A07()
            if (r0 == 0) goto L_0x00da
            java.util.List r1 = X.C200410p.A0N(r0)
            X.0vl r0 = r8.A09
            int r0 = X.C72453Mb.A0I(r0)
            java.util.List r0 = r1.subList(r4, r0)
            if (r0 == 0) goto L_0x00da
            int r5 = X.C29431cG.A0U(r0)
        L_0x004d:
            if (r2 != 0) goto L_0x006e
            X.17r r0 = r8.A0B
            java.io.File r1 = r0.A0O(r9)
            if (r1 == 0) goto L_0x006c
            boolean r0 = r1.exists()
            if (r0 != r3) goto L_0x006c
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x006d
            long r1 = r1.length()
        L_0x0067:
            long r3 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x006d
        L_0x006c:
            r7 = 1
        L_0x006d:
            return r7
        L_0x006e:
            X.00H r0 = r8.A0C
            java.lang.Object r2 = r0.get()
            X.1Sb r2 = (X.C26421Sb) r2
            X.2rc r0 = r9.A02
            if (r0 == 0) goto L_0x009a
            java.lang.String r1 = r0.A0L
            if (r1 == 0) goto L_0x009a
            X.1SS r0 = r2.A0I
            X.2h4 r0 = r0.A03(r1, r3)
            if (r0 == 0) goto L_0x009a
            r3 = -1
            long r1 = r0.A0A
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            if (r6 == 0) goto L_0x009a
            int[] r0 = r6.A07()
            if (r0 == 0) goto L_0x009a
            int r0 = r0.length
            if (r0 <= 0) goto L_0x009a
            goto L_0x0067
        L_0x009a:
            boolean r0 = r9 instanceof X.AnonymousClass21W
            if (r0 == 0) goto L_0x006c
            X.00H r0 = r8.A05
            java.lang.Object r3 = r0.get()
            X.1gV r3 = (X.C32021gV) r3
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2 = 120(0x78, float:1.68E-43)
            monitor-enter(r3)
            java.lang.String r0 = X.C32021gV.A04(r9, r0)     // Catch:{ all -> 0x00dd }
            android.graphics.Bitmap r1 = X.C32021gV.A03(r3, r0)     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00c2
            int r0 = r1.getWidth()     // Catch:{ all -> 0x00dd }
            if (r0 <= r2) goto L_0x00c2
            int r1 = r1.getHeight()     // Catch:{ all -> 0x00dd }
            r0 = 1
            if (r1 > r2) goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            monitor-exit(r3)
            if (r0 != 0) goto L_0x006d
            X.00H r0 = r8.A07
            java.lang.Object r0 = r0.get()
            X.1Nu r0 = (X.C25331Nu) r0
            byte[] r0 = r0.A05(r9)
            if (r0 == 0) goto L_0x006c
            int r1 = r0.length
            r0 = 4000(0xfa0, float:5.605E-42)
            if (r1 <= r0) goto L_0x006c
            return r7
        L_0x00da:
            r5 = 0
            goto L_0x004d
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134116q4.A01(X.21V):boolean");
    }

    public final void A00(AnonymousClass206 r4) {
        if (r4 != null) {
            ((C200710s) this.A08.getValue()).execute(new C146807Qr(this, r4, 37));
        }
    }

    public C134116q4(C218617r r2, C18030ve r3, C32431hB r4, C24641Lc r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r3, r6, r2, r5, r4);
        C18070vi.A0x(r7, r8, r9, r10, r11);
        this.A00 = r3;
        this.A03 = r6;
        this.A0B = r2;
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = r7;
        this.A04 = r8;
        this.A0C = r9;
        this.A05 = r10;
        this.A07 = r11;
    }
}

package X;

/* renamed from: X.8yA  reason: invalid class name and case insensitive filesystem */
public final class C175168yA extends AMB {
    public C22515BAy A00;
    public C22515BAy A01;
    public final AnonymousClass1CJ A02;
    public final C32991i5 A03;
    public final C29681ch A04;
    public final C58732lA A05;
    public final C35681md A06;
    public final C198699yl A07;
    public final C20131A8r A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final AnonymousClass1CJ A0C;
    public final C32991i5 A0D;
    public final C29681ch A0E;
    public final String A0F;
    public final boolean A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175168yA(X.AnonymousClass1CJ r25, X.C32991i5 r26, X.AnonymousClass1PY r27, X.C29681ch r28, X.C22515BAy r29, X.AnonymousClass5Y9 r30, X.C58732lA r31, X.C35681md r32, X.C20131A8r r33, X.AnonymousClass10I r34, java.lang.String r35, boolean r36, boolean r37) {
        /*
            r24 = this;
            r13 = 1
            r2 = r34
            X.C18070vi.A0d(r2, r13)
            r10 = r27
            r4 = r32
            r3 = r33
            X.C18070vi.A0p(r10, r4, r3)
            r0 = 5
            r6 = r30
            X.C18070vi.A0d(r6, r0)
            r9 = r25
            r8 = r26
            r5 = r31
            X.C18070vi.A0q(r5, r9, r8)
            r7 = r28
            if (r28 == 0) goto L_0x006b
            java.lang.String r1 = "JID"
        L_0x0024:
            r12 = 0
            X.9yl r11 = new X.9yl
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r14 = r37
            r15 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r24
            r0.<init>(r10, r6, r2)
            r0.A02 = r9
            r0.A03 = r8
            r0.A06 = r4
            r0.A08 = r3
            r0.A05 = r5
            r2 = r35
            r0.A0A = r2
            r0.A04 = r7
            r0.A09 = r1
            r0.A07 = r11
            r0.A0B = r14
            r3 = r29
            r0.A00 = r3
            r0.A0C = r9
            r0.A0D = r8
            r0.A0F = r2
            r0.A0E = r7
            r1 = r36
            r0.A0G = r1
            r0.A01 = r3
            return
        L_0x006b:
            java.lang.String r1 = "INVITE"
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175168yA.<init>(X.1CJ, X.1i5, X.1PY, X.1ch, X.BAy, X.5Y9, X.2lA, X.1md, X.A8r, X.10I, java.lang.String, boolean, boolean):void");
    }

    public void A01() {
        C46162Dk A032;
        if (!this.A01) {
            if (this.A0G) {
                C29681ch r1 = this.A0E;
                if (r1 != null) {
                    C29691ci A002 = AnonymousClass1CJ.A00(this.A0C, r1);
                    if (A002 instanceof C46162Dk) {
                        A032 = (C46162Dk) A002;
                    }
                } else {
                    C32991i5 r12 = this.A0D;
                    String str = this.A0F;
                    if (str == null) {
                        str = "";
                    }
                    A032 = r12.A03(str);
                }
                if (A032 != null) {
                    C22515BAy bAy = this.A01;
                    if (bAy != null) {
                        bAy.BzD(A032.A0M());
                    }
                    A032.A0M().getRawString();
                    return;
                }
            }
            super.A01();
        }
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
        this.A01 = null;
    }
}

package X;

/* renamed from: X.6oD  reason: invalid class name and case insensitive filesystem */
public final class C133126oD {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final C30141dS A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r10.A02.A01, 10743) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass8A3 r11, java.lang.String r12, java.util.List r13, java.util.List r14, boolean r15) {
        /*
            r10 = this;
            r2 = 1
            boolean r0 = X.C22781De.A03()
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            int r5 = r13.size()
            r4 = 0
        L_0x0013:
            if (r4 >= r5) goto L_0x003b
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.206 r0 = X.AnonymousClass3MW.A0k(r13, r4)
            long r0 = r0.A0I
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 + r6
            long r0 = r3.toSeconds(r0)
            int r3 = (int) r0
            if (r14 == 0) goto L_0x0039
            java.lang.Object r1 = r14.get(r4)
            X.77S r1 = (X.AnonymousClass77S) r1
        L_0x002e:
            X.6rg r0 = new X.6rg
            r0.<init>(r1, r3)
            r9.add(r0)
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0039:
            r1 = 0
            goto L_0x002e
        L_0x003b:
            X.6nT r5 = new X.6nT
            r8 = r12
            r5.<init>(r11, r10, r12, r13)
            if (r15 == 0) goto L_0x0051
            X.1dS r0 = r10.A02
            X.0ve r3 = r0.A01
            r1 = 10743(0x29f7, float:1.5054E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0072
        L_0x0051:
            java.util.ArrayList r4 = X.C29351c6.A0D(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0063
            X.C108995ce.A1Q(r4, r1)
            goto L_0x0059
        L_0x0063:
            X.1KB r3 = r10.A01
            X.00H r0 = r10.A04
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.2LI r1 = (X.AnonymousClass2LI) r1
            X.00H r0 = r10.A06
            X.AnonymousClass74B.A06(r3, r1, r0, r4, r2)
        L_0x0072:
            X.00H r0 = r10.A08
            java.lang.Object r6 = r0.get()
            X.6x0 r6 = (X.C138396x0) r6
            X.A0c r0 = X.C19945A0c.A00()
            X.BCv r0 = r0.A00
            byte[] r1 = r0.BLs()
            byte[] r0 = r0.generatePublicKey(r1)
            X.C18070vi.A0X(r0)
            X.C18070vi.A0X(r1)
            X.7Rz r7 = new X.7Rz
            r7.<init>(r0, r1)
            r2 = 0
            X.1mM r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0D
            X.6qd r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x00a3
            r0 = -5
            r5.A00(r0, r2)
            return
        L_0x00a3:
            X.77S r4 = r0.A00
            r2 = 3
            long r0 = X.C137916wE.A01
            X.705 r3 = new X.705
            r3.<init>(r2, r0)
            X.C138396x0.A00(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133126oD.A00(X.8A3, java.lang.String, java.util.List, java.util.List, boolean):void");
    }

    public C133126oD(C218617r r2, AnonymousClass1KB r3, C30141dS r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r3, r2, r4, r5, r6);
        C18070vi.A0q(r7, r8, r9);
        C18070vi.A0d(r10, 9);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A05 = r9;
        this.A03 = r10;
    }
}

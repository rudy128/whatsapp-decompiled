package X;

public class ASA implements B82 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.9tm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bju(X.C185899dK r13, java.lang.Short r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            r10 = r15
            int r0 = r12.A00
            if (r0 == 0) goto L_0x007c
            java.lang.Object r5 = r12.A02
            X.A8c r5 = (X.C20119A8c) r5
            java.lang.Object r6 = r12.A03
            X.A2N r6 = (X.A2N) r6
            int r1 = r12.A01
            java.lang.Object r8 = r12.A04
            X.BBe r8 = (X.C22521BBe) r8
            r11 = 0
            if (r16 == 0) goto L_0x0076
            X.00H r0 = r5.A0I
            X.A6h r1 = X.AnonymousClass8BR.A0V(r0)
            java.lang.String r0 = r6.A05
            int r0 = r0.hashCode()
            X.C20081A6h.A01(r1, r0)
            X.00H r0 = r5.A0L
            X.A6h r1 = X.AnonymousClass8BR.A0V(r0)
            int r0 = r5.A00
            X.C20081A6h.A01(r1, r0)
        L_0x0030:
            r7 = 0
            if (r13 == 0) goto L_0x00e8
            java.util.List r0 = r13.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0039:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.9tm r0 = (X.C195709tm) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r6.A05
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0039
            r7 = r2
        L_0x0051:
            X.9tm r7 = (X.C195709tm) r7
            if (r7 == 0) goto L_0x00e8
            java.lang.String r0 = r7.A03
            r6.A00 = r0
            boolean r0 = X.C20119A8c.A06(r5, r6, r7, r13, r8)
            if (r0 != 0) goto L_0x0075
            X.1KB r0 = r5.A02
            r9 = 17
            X.3Cr r4 = new X.3Cr
            r4.<init>((X.C20119A8c) r5, (X.A2N) r6, (X.C195709tm) r7, (X.C22521BBe) r8, (int) r9)
            r0.A0J(r4)
            X.10I r1 = r5.A0C
            X.4ra r0 = new X.4ra
            r0.<init>(r5, r6, r9)
            r1.CGF(r0)
        L_0x0075:
            return
        L_0x0076:
            X.00H r0 = r5.A0K
            X.C20081A6h.A03(r0, r14, r1)
            goto L_0x0030
        L_0x007c:
            java.lang.Object r4 = r12.A02
            X.A8c r4 = (X.C20119A8c) r4
            java.lang.Object r5 = r12.A03
            X.A2N r5 = (X.A2N) r5
            int r1 = r12.A01
            java.lang.Object r7 = r12.A04
            X.BBe r7 = (X.C22521BBe) r7
            if (r16 == 0) goto L_0x00e2
            X.00H r0 = r4.A0I
            X.A6h r1 = X.AnonymousClass8BR.A0V(r0)
            java.lang.String r0 = r5.A05
            int r0 = r0.hashCode()
            X.C20081A6h.A01(r1, r0)
            X.00H r0 = r4.A0L
            X.A6h r1 = X.AnonymousClass8BR.A0V(r0)
            int r0 = r4.A00
            X.C20081A6h.A01(r1, r0)
        L_0x00a6:
            r6 = 0
            if (r13 == 0) goto L_0x012e
            java.util.List r0 = r13.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x00af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.9tm r0 = (X.C195709tm) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r5.A05
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00af
            r6 = r2
        L_0x00c7:
            X.9tm r6 = (X.C195709tm) r6
            if (r6 == 0) goto L_0x0133
            java.lang.String r0 = r6.A03
            r5.A00 = r0
            boolean r0 = X.C20119A8c.A06(r4, r5, r6, r13, r7)
            if (r0 != 0) goto L_0x0075
            X.1KB r0 = r4.A02
            r8 = 18
            X.3Cr r3 = new X.3Cr
            r3.<init>((X.C20119A8c) r4, (X.A2N) r5, (X.C195709tm) r6, (X.C22521BBe) r7, (int) r8)
            r0.A0J(r3)
            return
        L_0x00e2:
            X.00H r0 = r4.A0K
            X.C20081A6h.A03(r0, r14, r1)
            goto L_0x00a6
        L_0x00e8:
            if (r15 != 0) goto L_0x00ec
            java.lang.String r10 = "failure"
        L_0x00ec:
            if (r13 == 0) goto L_0x0105
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0103
            X.9uT r4 = r5.A09
            com.whatsapp.jid.UserJid r0 = r6.A02
            java.lang.String r3 = r0.user
            java.lang.String r2 = r6.A05
            X.11P r0 = r5.A07
            long r0 = X.AnonymousClass11P.A01(r0)
            r4.A04(r0, r3, r2)
        L_0x0103:
            java.lang.String r10 = "extensions-invalid-extensions-id"
        L_0x0105:
            java.lang.String r7 = r6.A05
            X.C20119A8c.A05(r5, r8, r10, r7)
            X.00H r0 = r5.A0F
            java.lang.Object r1 = r0.get()
            X.A25 r1 = (X.A25) r1
            com.whatsapp.jid.UserJid r4 = r6.A02
            java.lang.String r8 = r6.A08
            java.lang.String r9 = r6.A09
            X.1PM r2 = r5.A05
            X.00H r0 = r5.A0Q
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.A0M r3 = (X.A0M) r3
            boolean r0 = r6.A0C
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r6 = "galaxy_message"
            r1.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x012e:
            if (r15 != 0) goto L_0x0135
            java.lang.String r10 = "failure"
            goto L_0x0135
        L_0x0133:
            java.lang.String r10 = "extensions-invalid-extensions-id"
        L_0x0135:
            java.lang.String r0 = r5.A05
            X.C20119A8c.A05(r4, r7, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASA.Bju(X.9dK, java.lang.Short, java.lang.String, boolean):void");
    }

    public ASA(C20119A8c a8c, A2N a2n, C22521BBe bBe, int i, int i2) {
        this.A00 = i2;
        this.A02 = a8c;
        this.A03 = a2n;
        this.A01 = i;
        this.A04 = bBe;
    }
}

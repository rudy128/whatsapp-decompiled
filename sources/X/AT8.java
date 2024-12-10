package X;

public abstract class AT8 implements B83, B85, C436820m {
    public final A89 A00;

    public static void A01(AnonymousClass8X8 r0, C163918Wv r1, C163108Ts r2, C165868bt r3, int i) {
        r3.titleCase_ = i;
        r1.A0H(r2);
        r1.A0G(r2);
        r0.A0R(r1);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.21i, X.21V] */
    /* JADX WARNING: type inference failed for: r14v2, types: [X.21V, X.21X, X.206, X.21W] */
    /* JADX WARNING: type inference failed for: r14v5, types: [X.21d, X.21c, X.206] */
    /* JADX WARNING: type inference failed for: r14v6, types: [X.21B, X.218, X.206] */
    /* JADX WARNING: type inference failed for: r14v8, types: [X.21X, X.21W] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f8, code lost:
        if (r4 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fc, code lost:
        r4 = r14.A02;
        X.C17960vV.A07(r4);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0205, code lost:
        if ((r13.bitField0_ & 32) == 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0207, code lost:
        r4.A05 = X.C20133A8t.A04(r13);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r1 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r1.maskLinkedDevices_ == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a4, code lost:
        if (r3 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a8, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ad, code lost:
        if (r3.titleCase_ != 2) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01af, code lost:
        r5 = (java.lang.String) r3.title_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b3, code lost:
        r14.A0i(r5);
        r14 = r14;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass206 CBG(X.C20077A6d r19) {
        /*
            r18 = this;
            r0 = r19
            X.8cr r2 = X.C20077A6d.A01(r0)
            boolean r1 = r2.A0R()
            if (r1 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            X.8ck r2 = r2.templateMessage_
            if (r2 != 0) goto L_0x0014
            X.8ck r2 = X.C166348ck.DEFAULT_INSTANCE
        L_0x0014:
            X.C18070vi.A0b(r2)
            r1 = r18
            boolean r3 = r1 instanceof X.AnonymousClass9AI
            if (r3 == 0) goto L_0x008b
            r8 = r1
            X.9AI r8 = (X.AnonymousClass9AI) r8
            boolean r3 = X.A89.A04(r2)
            if (r3 == 0) goto L_0x026c
            X.8ca r7 = X.A89.A01(r2)
            boolean r3 = r7.gifPlayback_
            if (r3 != 0) goto L_0x026c
            X.205 r6 = r0.A0A
            long r3 = r0.A03
            r5 = 28
            X.21w r14 = new X.21w
            r14.<init>(r6, r5, r3)
            X.A1e r3 = r8.A00
            X.C20077A6d.A02(r0, r7, r14, r3)
        L_0x003e:
            boolean r3 = r14 instanceof X.C439421n
            if (r3 == 0) goto L_0x007e
            X.A89 r5 = r1.A00
            r4 = r14
            X.21n r4 = (X.C439421n) r4
            int r1 = r2.bitField0_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0081
            X.8bt r1 = r2.hydratedTemplate_
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            X.8bt r1 = X.C165868bt.DEFAULT_INSTANCE
        L_0x0053:
            java.lang.String r7 = r1.hydratedContentText_
            int r2 = r1.bitField0_
            r2 = r2 & 64
            if (r2 == 0) goto L_0x007f
            java.lang.String r8 = r1.hydratedFooterText_
        L_0x005d:
            java.lang.String r9 = r1.templateId_
            X.0ve r2 = r5.A00
            java.util.ArrayList r12 = X.A89.A02(r2, r1)
            int r2 = r1.bitField0_
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0070
            boolean r1 = r1.maskLinkedDevices_
            r13 = 1
            if (r1 != 0) goto L_0x0071
        L_0x0070:
            r13 = 0
        L_0x0071:
            java.lang.String r10 = r0.A0F
            java.lang.String r11 = r0.A0G
            r6 = 0
            X.2k6 r5 = new X.2k6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.CL3(r5)
        L_0x007e:
            return r14
        L_0x007f:
            r8 = 0
            goto L_0x005d
        L_0x0081:
            int r3 = r2.formatCase_
            r1 = 2
            if (r3 != r1) goto L_0x0051
            java.lang.Object r1 = r2.format_
            X.8bt r1 = (X.C165868bt) r1
            goto L_0x0053
        L_0x008b:
            boolean r3 = r1 instanceof X.AnonymousClass9AH
            if (r3 == 0) goto L_0x00e6
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x00db
            X.8bV r3 = r2.A0R()
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
        L_0x009e:
            java.lang.Integer r4 = X.AnonymousClass00R.A0Y
            if (r3 != r4) goto L_0x026c
            X.205 r6 = r0.A0A
            long r3 = r0.A03
            r5 = 30
            X.220 r14 = new X.220
            r14.<init>(r6, r5, r3)
            r3 = 1
            r14.A02 = r3
            r3 = 0
            r14.A02 = r3
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x00cc
            X.8bV r5 = r2.A0R()
            int r4 = r5.titleCase_
            r3 = 5
            if (r4 != r3) goto L_0x00d8
            java.lang.Object r4 = r5.title_
        L_0x00c3:
            X.8cE r4 = (X.C166028cE) r4
        L_0x00c5:
            boolean r3 = r0.A0L
            X.C198969zD.A00(r4, r14, r3)
            goto L_0x003e
        L_0x00cc:
            X.8bt r5 = X.AnonymousClass8BS.A0K(r2)
            int r4 = r5.titleCase_
            r3 = 5
            if (r4 != r3) goto L_0x00d8
            java.lang.Object r4 = r5.title_
            goto L_0x00c3
        L_0x00d8:
            X.8cE r4 = X.C166028cE.DEFAULT_INSTANCE
            goto L_0x00c5
        L_0x00db:
            X.8bt r3 = X.AnonymousClass8BS.A0K(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
            goto L_0x009e
        L_0x00e6:
            boolean r3 = r1 instanceof X.AnonymousClass9AG
            if (r3 == 0) goto L_0x0148
            r7 = r1
            X.9AG r7 = (X.AnonymousClass9AG) r7
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x013d
            X.8bV r3 = r2.A0R()
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
        L_0x00fc:
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            if (r3 != r4) goto L_0x026c
            X.205 r6 = r0.A0A
            long r3 = r0.A03
            r5 = 25
            X.21y r14 = new X.21y
            r14.<init>(r6, r5, r3)
            X.9pi r12 = r7.A00
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x012e
            X.8bV r5 = r2.A0R()
            int r4 = r5.titleCase_
            r3 = 3
            if (r4 != r3) goto L_0x013a
            java.lang.Object r13 = r5.title_
        L_0x011d:
            X.8cc r13 = (X.C166268cc) r13
        L_0x011f:
            boolean r16 = r0.A05()
            boolean r3 = r0.A0L
            int r15 = r14.A01
            r17 = r3
            r12.A02(r13, r14, r15, r16, r17)
            goto L_0x003e
        L_0x012e:
            X.8bt r5 = X.AnonymousClass8BS.A0K(r2)
            int r4 = r5.titleCase_
            r3 = 3
            if (r4 != r3) goto L_0x013a
            java.lang.Object r13 = r5.title_
            goto L_0x011d
        L_0x013a:
            X.8cc r13 = X.C166268cc.DEFAULT_INSTANCE
            goto L_0x011f
        L_0x013d:
            X.8bt r3 = X.AnonymousClass8BS.A0K(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
            goto L_0x00fc
        L_0x0148:
            boolean r3 = r1 instanceof X.AnonymousClass9AD
            if (r3 == 0) goto L_0x01c2
            int r7 = r2.formatCase_
            boolean r3 = X.C17890vO.A1R(r7)
            r6 = 1
            if (r3 == 0) goto L_0x0186
            X.8bV r3 = r2.A0R()
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
        L_0x015f:
            java.lang.Integer r4 = X.AnonymousClass00R.A01
            if (r3 == r4) goto L_0x0164
            r6 = 0
        L_0x0164:
            r5 = 0
            if (r6 != 0) goto L_0x0191
            r3 = 1
            if (r7 != r3) goto L_0x017b
            X.8bV r3 = r2.A0R()
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
        L_0x0174:
            java.lang.Integer r4 = X.AnonymousClass00R.A0j
            if (r3 == r4) goto L_0x0191
            r14 = r5
            goto L_0x003e
        L_0x017b:
            X.8bt r3 = X.AnonymousClass8BS.A0K(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
            goto L_0x0174
        L_0x0186:
            X.8bt r3 = X.AnonymousClass8BS.A0K(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
            goto L_0x015f
        L_0x0191:
            X.205 r7 = r0.A0A
            long r3 = r0.A03
            r6 = 27
            X.21o r14 = new X.21o
            r14.<init>(r7, r6, r3)
            int r3 = r2.bitField0_
            r3 = r3 & 16
            if (r3 == 0) goto L_0x01b8
            X.8bt r3 = r2.hydratedTemplate_
            if (r3 != 0) goto L_0x01aa
        L_0x01a6:
            X.8bt r3 = X.C165868bt.DEFAULT_INSTANCE
        L_0x01a8:
            if (r3 == 0) goto L_0x003e
        L_0x01aa:
            int r6 = r3.titleCase_
            r4 = 2
            if (r6 != r4) goto L_0x01b3
            java.lang.Object r5 = r3.title_
            java.lang.String r5 = (java.lang.String) r5
        L_0x01b3:
            r14.A0i(r5)
            goto L_0x003e
        L_0x01b8:
            int r4 = r2.formatCase_
            r3 = 2
            if (r4 != r3) goto L_0x01a6
            java.lang.Object r3 = r2.format_
            X.8bt r3 = (X.C165868bt) r3
            goto L_0x01a8
        L_0x01c2:
            boolean r3 = r1 instanceof X.AnonymousClass9AF
            if (r3 == 0) goto L_0x020f
            r7 = r1
            X.9AF r7 = (X.AnonymousClass9AF) r7
            boolean r3 = X.A89.A04(r2)
            if (r3 == 0) goto L_0x026c
            X.8ca r13 = X.A89.A01(r2)
            boolean r3 = r13.gifPlayback_
            if (r3 == 0) goto L_0x026c
            X.205 r6 = r0.A0A
            long r3 = r0.A03
            r5 = 29
            X.21u r14 = new X.21u
            r14.<init>(r6, r5, r3)
            X.A1e r12 = r7.A00
            boolean r16 = r0.A05()
            boolean r3 = r0.A0L
            int r15 = r14.A01
            r17 = r3
            r12.A03(r13, r14, r15, r16, r17)
            int r5 = r14.A01
            boolean r4 = r0.A0K
            r3 = 1
            if (r5 != r3) goto L_0x01fc
            if (r4 != 0) goto L_0x01fc
            goto L_0x003e
        L_0x01fc:
            X.2rc r4 = r14.A02
            X.C17960vV.A07(r4)
            int r3 = r13.bitField0_
            r3 = r3 & 32
            if (r3 == 0) goto L_0x003e
            int r3 = X.C20133A8t.A04(r13)
            r4.A05 = r3
            goto L_0x003e
        L_0x020f:
            r7 = r1
            X.9AE r7 = (X.AnonymousClass9AE) r7
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x0261
            X.8bV r3 = r2.A0R()
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
        L_0x0221:
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            if (r3 != r4) goto L_0x026c
            X.205 r6 = r0.A0A
            long r3 = r0.A03
            r5 = 26
            X.222 r14 = new X.222
            r14.<init>(r6, r5, r3)
            X.9o8 r12 = r7.A00
            int r3 = r2.formatCase_
            r5 = 1
            if (r3 != r5) goto L_0x0252
            X.8bV r4 = r2.A0R()
            int r3 = r4.titleCase_
            if (r3 != r5) goto L_0x025e
            java.lang.Object r13 = r4.title_
        L_0x0241:
            X.8cW r13 = (X.C166208cW) r13
        L_0x0243:
            boolean r16 = r0.A05()
            boolean r3 = r0.A0L
            int r15 = r0.A00
            r17 = r3
            r12.A01(r13, r14, r15, r16, r17)
            goto L_0x003e
        L_0x0252:
            X.8bt r5 = X.AnonymousClass8BS.A0K(r2)
            int r4 = r5.titleCase_
            r3 = 1
            if (r4 != r3) goto L_0x025e
            java.lang.Object r13 = r5.title_
            goto L_0x0241
        L_0x025e:
            X.8cW r13 = X.C166208cW.DEFAULT_INSTANCE
            goto L_0x0243
        L_0x0261:
            X.8bt r3 = X.AnonymousClass8BS.A0K(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r3 = X.AnonymousClass8BY.A0S(r3)
            goto L_0x0221
        L_0x026c:
            r14 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AT8.CBG(X.A6d):X.206");
    }

    public AT8(A89 a89) {
        this.A00 = a89;
    }

    public static C165868bt A00(C23624Bmt bmt, C23624Bmt bmt2) {
        bmt.A0E();
        C165868bt r1 = (C165868bt) bmt.A00;
        C23577Bm6 A0C = bmt2.A0C();
        A0C.getClass();
        r1.title_ = A0C;
        return r1;
    }
}

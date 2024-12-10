package X;

/* renamed from: X.ANv  reason: case insensitive filesystem */
public class C20510ANv implements AnonymousClass86T {
    public final int A00;
    public final Object A01;

    public C20510ANv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.9st} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: X.9st} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.9st} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.9st} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
        r2 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r2 = r9.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bds(X.C20245ADd r24, X.AnonymousClass77B r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            int r2 = r0.A00
            java.lang.Object r1 = r0.A01
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment r1 = (com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment) r1
            r0 = 2
            r9 = r25
            X.C18070vi.A0d(r9, r0)
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r6 = r1.A02
            switch(r2) {
                case 0: goto L_0x014b;
                case 1: goto L_0x0013;
                case 2: goto L_0x014b;
                default: goto L_0x0013;
            }
        L_0x0013:
            if (r6 == 0) goto L_0x0156
            r11 = 0
        L_0x0016:
            r8 = r26
            X.ADd r15 = X.C196499vA.A01(r9, r8)
            com.whatsapp.jid.UserJid r1 = r6.A01
            r13 = 0
            r10 = r24
            if (r1 == 0) goto L_0x013e
            X.00H r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.A7x r0 = (X.C20114A7x) r0
            X.9Hv r1 = r0.A09(r1)
            X.9Hv r0 = X.C179409Hv.SMB_META_CATALOG
            if (r1 != r0) goto L_0x013e
            java.util.Map r2 = r9.A02
            X.ADo r1 = X.C196499vA.A00(r15, r10, r2)
            if (r1 == 0) goto L_0x0148
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0148
        L_0x003f:
            java.lang.String r7 = r1.A00
        L_0x0041:
            r5 = 1
            if (r7 != 0) goto L_0x013b
            java.util.Map r0 = r9.A03
            java.lang.Object r4 = r0.get(r15)
            X.1D6 r4 = (X.AnonymousClass1D6) r4
            if (r4 == 0) goto L_0x0138
            java.lang.Object r0 = r4.first
            X.ADd r0 = (X.C20245ADd) r0
        L_0x0052:
            X.ADo r0 = X.C196499vA.A00(r15, r0, r2)
            if (r0 == 0) goto L_0x0150
            java.lang.String r7 = r0.A00
            boolean r0 = r0.A02
            if (r0 != r5) goto L_0x0064
            X.1wy r1 = r6.A09
            r0 = 2
            X.AnonymousClass3MX.A1K(r1, r0)
        L_0x0064:
            X.1DS r0 = r6.A07
            java.lang.Object r1 = r0.A06()
            X.9pP r1 = (X.C193019pP) r1
            if (r1 == 0) goto L_0x00b2
            r0 = r11 ^ 1
            java.util.List r12 = r1.A00
            java.lang.Object r0 = X.C29431cG.A0f(r12, r0)
            X.9st r0 = (X.C195159st) r0
            r3 = 0
            if (r0 == 0) goto L_0x0135
            boolean r2 = r0.A04
            X.77B r1 = r0.A02
            java.lang.Integer r0 = r0.A03
            X.9st r14 = new X.9st
            r18 = r8
            r19 = r2
            r16 = r1
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x008e:
            java.lang.Object r0 = X.C29431cG.A0f(r12, r11)
            if (r4 != 0) goto L_0x0113
            r3 = r0
        L_0x0095:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            if (r14 == 0) goto L_0x009e
            r2.add(r14)
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
            r2.add(r3)
        L_0x00a3:
            if (r11 != 0) goto L_0x00a8
            X.C29421cF.A0S(r2)
        L_0x00a8:
            X.1DT r1 = r6.A08
            X.9pP r0 = new X.9pP
            r0.<init>(r2)
            r1.A0E(r0)
        L_0x00b2:
            X.1Di r0 = r6.A04
            if (r0 == 0) goto L_0x00b9
            r0.invoke(r7)
        L_0x00b9:
            com.whatsapp.jid.UserJid r12 = r6.A01
            if (r12 == 0) goto L_0x010b
            X.1D6[] r2 = new X.AnonymousClass1D6[r5]
            java.lang.String r1 = r9.A00
            java.util.List r0 = r9.A01
            java.lang.Object r0 = r0.get(r8)
            X.AD8 r0 = (X.AD8) r0
            java.lang.String r0 = r0.A00()
            X.C72463Mc.A1H(r1, r0, r2)
            java.util.LinkedHashMap r2 = X.AnonymousClass1D7.A0C(r2)
            if (r24 == 0) goto L_0x00dd
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r10.A01
            r2.put(r1, r0)
        L_0x00dd:
            X.00H r0 = r6.A0B
            java.lang.Object r11 = r0.get()
            X.A41 r11 = (X.A41) r11
            java.util.List r1 = r6.A03
            if (r1 != 0) goto L_0x00eb
            X.0wS r1 = X.C18460wS.A00
        L_0x00eb:
            java.util.List r0 = r6.A02
            if (r0 != 0) goto L_0x00f1
            X.0wS r0 = X.C18460wS.A00
        L_0x00f1:
            X.9qF r10 = new X.9qF
            r10.<init>(r1, r0)
            java.util.Map r21 = X.AnonymousClass1D7.A0F(r2)
            r22 = 48
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r14 = r13
            X.A41.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x010b:
            if (r4 != 0) goto L_0x0112
            X.1wy r0 = r6.A09
            r0.A0E(r13)
        L_0x0112:
            return
        L_0x0113:
            X.9st r0 = (X.C195159st) r0
            if (r0 == 0) goto L_0x0095
            int r19 = X.C108955ca.A09(r4)
            java.lang.Object r12 = r4.first
            X.ADd r12 = (X.C20245ADd) r12
            boolean r2 = r0.A04
            X.77B r1 = r0.A02
            java.lang.Integer r0 = r0.A03
            X.9st r3 = new X.9st
            r16 = r12
            r17 = r1
            r18 = r0
            r20 = r2
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x0095
        L_0x0135:
            r14 = r13
            goto L_0x008e
        L_0x0138:
            r0 = r13
            goto L_0x0052
        L_0x013b:
            r4 = r13
            goto L_0x0064
        L_0x013e:
            java.util.Map r2 = r9.A02
            X.ADo r1 = X.C196499vA.A00(r15, r10, r2)
            if (r1 == 0) goto L_0x0148
            goto L_0x003f
        L_0x0148:
            r7 = r13
            goto L_0x0041
        L_0x014b:
            if (r6 == 0) goto L_0x015b
            r11 = 1
            goto L_0x0016
        L_0x0150:
            X.1wy r0 = r6.A09
            X.AnonymousClass3MX.A1K(r0, r5)
            return
        L_0x0156:
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        L_0x015b:
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20510ANv.Bds(X.ADd, X.77B, int):void");
    }
}

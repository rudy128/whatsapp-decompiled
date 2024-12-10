package X;

/* renamed from: X.9o3  reason: invalid class name and case insensitive filesystem */
public final class C192249o3 {
    public final C18030ve A00;
    public final AnonymousClass1CJ A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C19998A2m r6, X.AnonymousClass206 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.AnonymousClass212
            if (r0 == 0) goto L_0x0082
            X.0ve r2 = r5.A00
            X.212 r7 = (X.AnonymousClass212) r7
            boolean r0 = r7 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x0082
            int r4 = r7.A17()
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0082
            X.8Wx r3 = r6.A01
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8cG r1 = (X.C166048cG) r1
            int r0 = X.C166048cG.BOT_MESSAGE_SECRET_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.messageAddOnDurationInSecs_ = r4
            int r1 = r7.A00
            r0 = 1
            if (r1 != r0) goto L_0x008b
            X.9Jj r0 = X.C179689Jj.STATIC
        L_0x002d:
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8cG r1 = (X.C166048cG) r1
            int r0 = r0.value
            r1.messageAddOnExpiryType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
        L_0x003d:
            X.0vf r1 = X.C18040vf.A01
            r0 = 7772(0x1e5c, float:1.0891E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x0082
            X.8X8 r4 = r6.A00
            X.8cG r1 = r4.A0G()
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            r3.A0F(r1)
            int r2 = r7.A17()
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8cG r1 = (X.C166048cG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.messageAddOnDurationInSecs_ = r2
            int r1 = r7.A00
            r0 = 1
            if (r1 != r0) goto L_0x0083
            X.9Jj r0 = X.C179689Jj.STATIC
        L_0x006f:
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8cG r1 = (X.C166048cG) r1
            int r0 = r0.value
            r1.messageAddOnExpiryType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            X.AnonymousClass8X8.A05(r3, r4)
        L_0x0082:
            return
        L_0x0083:
            r0 = 2
            if (r1 != r0) goto L_0x0089
            X.9Jj r0 = X.C179689Jj.DEPENDENT_ON_PARENT
            goto L_0x006f
        L_0x0089:
            r0 = 0
            goto L_0x006f
        L_0x008b:
            r0 = 2
            if (r1 != r0) goto L_0x003d
            X.9Jj r0 = X.C179689Jj.DEPENDENT_ON_PARENT
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192249o3.A00(X.A2m, X.206):void");
    }

    public final void A01(C19998A2m a2m, AnonymousClass206 r8) {
        if (AnonymousClass25A.A0V(this.A01, r8) && !a2m.A0D) {
            C18030ve r2 = this.A00;
            byte[] bArr = r8.A1D;
            if (bArr != null) {
                C163938Wx r1 = a2m.A01;
                int length = bArr.length;
                r1.A0G(DSQ.A01(bArr, 0, length));
                if (!C18020vd.A05(C18040vf.A01, r2, 7772)) {
                    AnonymousClass8X8 r3 = a2m.A00;
                    C166048cG A0G = r3.A0G();
                    C23624Bmt A0N = C166048cG.DEFAULT_INSTANCE.A0N();
                    A0N.A0F(A0G);
                    C163938Wx r12 = (C163938Wx) A0N;
                    r12.A0G(DSQ.A01(bArr, 0, length));
                    AnonymousClass8X8.A05(r12, r3);
                }
            }
        }
    }

    public C192249o3(AnonymousClass1CJ r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}

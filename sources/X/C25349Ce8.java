package X;

/* renamed from: X.Ce8  reason: case insensitive filesystem */
public abstract class C25349Ce8 {
    public static final void A00(C17130tn r4, AnonymousClass1OS r5, int i) {
        int i2;
        C18070vi.A0d(r5, 0);
        r4.COC(-811729059);
        if ((i & 6) == 0) {
            i2 = AnonymousClass000.A09(r4.BEh(r5) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.BZO()) {
            A01(r4, r5, ((i2 << 3) & 112) | 6, false);
        } else {
            r4.CNR();
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A06 = new C27158DWt(r5, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if ((((android.content.res.Configuration) r5.BFh(X.AnonymousClass0PK.A00)).uiMode & 48) == 32) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r22, X.AnonymousClass1OS r23, int r24, boolean r25) {
        /*
            r12 = 1
            r0 = -45772415(0xfffffffffd459181, float:-1.6413338E37)
            r5 = r22
            r5.COC(r0)
            r3 = r24
            r0 = r24 & 6
            r11 = 2
            r2 = r25
            if (r0 != 0) goto L_0x00de
            boolean r0 = r5.BEg(r2)
            int r1 = X.AnonymousClass000.A09(r0)
            r1 = r1 | r24
        L_0x001c:
            r0 = r24 & 48
            r4 = r23
            if (r0 != 0) goto L_0x0027
            int r0 = X.AnonymousClass001.A0b(r5, r4)
            r1 = r1 | r0
        L_0x0027:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L_0x0044
            boolean r0 = r5.BZO()
            if (r0 == 0) goto L_0x0044
            r5.CNR()
        L_0x0036:
            X.0Vf r1 = r5.BKF()
            if (r1 == 0) goto L_0x0043
            X.DWw r0 = new X.DWw
            r0.<init>(r4, r3, r2)
            r1.A06 = r0
        L_0x0043:
            return
        L_0x0044:
            r0 = 1728649753(0x67091a19, float:6.474456E23)
            r5.COB(r0)
            r7 = 0
            if (r25 != 0) goto L_0x005e
            X.07W r0 = X.AnonymousClass0PK.A00
            java.lang.Object r0 = r5.BFh(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            int r0 = r0.uiMode
            r6 = r0 & 48
            r1 = 32
            r0 = 0
            if (r6 != r1) goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            X.AnonymousClass0VR.A0U(r5)
            X.Cgl r1 = new X.Cgl
            r1.<init>(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00d8
            X.BqC r10 = new X.BqC
            r10.<init>()
        L_0x0070:
            r23 = 255(0xff, float:3.57E-43)
            r14 = 0
            X.Ciq r9 = new X.Ciq
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r13 = r9
            r15 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r25 = 1023(0x3ff, float:1.434E-42)
            X.Ciy r13 = new X.Ciy
            r23 = r14
            r24 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.CCw r8 = new X.CCw
            r8.<init>()
            r0 = 5
            X.0Hd[] r6 = new X.C03230Hd[r0]
            X.07W r0 = X.CG7.A00
            X.0Hd r0 = r0.A03(r10)
            r6[r7] = r0
            X.07W r0 = X.CGA.A00
            X.0Hd r0 = r0.A03(r13)
            r6[r12] = r0
            X.07W r0 = X.CG9.A00
            X.0Hd r0 = r0.A03(r9)
            r6[r11] = r0
            X.07W r0 = X.CG6.A00
            X.0Hd r1 = r0.A03(r1)
            r0 = 3
            r6[r0] = r1
            X.07W r0 = X.CG8.A00
            X.0Hd r1 = r0.A03(r8)
            r0 = 4
            r6[r0] = r1
            X.DWg r1 = new X.DWg
            r1.<init>(r13, r4, r7)
            r0 = -856611263(0xffffffffccf12641, float:-1.26431752E8)
            X.04D r1 = X.AnonymousClass0LC.A00(r5, r1, r0)
            r0 = 48
            X.AnonymousClass0PZ.A04(r5, r1, r6, r0)
            goto L_0x0036
        L_0x00d8:
            X.BqD r10 = new X.BqD
            r10.<init>()
            goto L_0x0070
        L_0x00de:
            r1 = r3
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25349Ce8.A01(X.0tn, X.1OS, int, boolean):void");
    }
}

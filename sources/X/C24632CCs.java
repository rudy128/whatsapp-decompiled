package X;

/* renamed from: X.CCs  reason: case insensitive filesystem */
public abstract class C24632CCs {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r8.BEf(r7) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if ((r27 & 16) != 0) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C03550Is r22, X.C17130tn r23, X.C17090tj r24, X.C18090vk r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            r7 = r22
            r14 = r29
            r9 = r24
            r0 = 1865463570(0x6f30b712, float:5.469068E28)
            r8 = r23
            r8.COC(r0)
            r20 = r27
            r2 = r27 & 1
            r1 = r26
            r0 = r26 | 6
            r13 = r28
            if (r2 != 0) goto L_0x0028
            r0 = r26 & 6
            if (r0 != 0) goto L_0x010a
            boolean r0 = r8.BEg(r13)
            int r0 = X.AnonymousClass000.A09(r0)
            r0 = r0 | r26
        L_0x0028:
            r2 = r27 & 2
            r10 = r25
            if (r2 == 0) goto L_0x00ff
            r0 = r0 | 48
        L_0x0030:
            r6 = r27 & 4
            if (r6 == 0) goto L_0x00f4
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r5 = r27 & 8
            if (r5 == 0) goto L_0x00e9
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003c:
            r2 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x004f
            r2 = r27 & 16
            if (r2 != 0) goto L_0x004c
            boolean r3 = r8.BEf(r7)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x004e
        L_0x004c:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x004e:
            r0 = r0 | r2
        L_0x004f:
            r3 = r0 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r2) goto L_0x0078
            boolean r2 = r8.BZO()
            if (r2 == 0) goto L_0x0078
            r8.CNR()
        L_0x005e:
            X.0Vf r0 = r8.BKF()
            if (r0 == 0) goto L_0x0077
            X.DXA r15 = new X.DXA
            r16 = r7
            r17 = r9
            r18 = r10
            r19 = r1
            r21 = r13
            r22 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r0.A06 = r15
        L_0x0077:
            return
        L_0x0078:
            r8.CNl()
            r2 = r26 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x00a5
            boolean r2 = r8.BQS()
            if (r2 != 0) goto L_0x00a5
            r8.CNR()
            r2 = r27 & 16
            if (r2 == 0) goto L_0x0090
        L_0x008f:
            r0 = r0 & r4
        L_0x0090:
            r8.BKA()
            r2 = r0 & 14
            int r11 = X.AnonymousClass001.A0F(r0, r2)
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r11 = r11 | r0
            r12 = 32
            r6 = 0
            X.AnonymousClass0EE.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x005e
        L_0x00a5:
            if (r6 == 0) goto L_0x00a9
            X.0WC r9 = X.C17090tj.A00
        L_0x00a9:
            if (r5 == 0) goto L_0x00ac
            r14 = 1
        L_0x00ac:
            r2 = r27 & 16
            if (r2 == 0) goto L_0x0090
            r2 = -557303694(0xffffffffdec83872, float:-7.2137034E18)
            r8.COB(r2)
            r2 = -248863715(0xfffffffff12aa41d, float:-8.4497364E29)
            r8.COB(r2)
            X.07W r2 = X.CG7.A00
            long r22 = X.C26257Cw2.A06(r8, r2)
            long r24 = X.C26257Cw2.A05(r8, r2)
            long r26 = X.C26257Cw2.A04(r8, r2)
            long r28 = X.C26257Cw2.A04(r8, r2)
            r2 = -351083046(0xffffffffeb12e5da, float:-1.7758861E26)
            r8.COB(r2)
            X.0Is r7 = new X.0Is
            r21 = r7
            r21.<init>(r22, r24, r26, r28)
            r3 = r8
            X.0VR r3 = (X.AnonymousClass0VR) r3
            r2 = 0
            X.AnonymousClass0VR.A0R(r3, r2)
            X.AnonymousClass0VR.A0R(r3, r2)
            X.AnonymousClass0VR.A0R(r3, r2)
            goto L_0x008f
        L_0x00e9:
            r2 = r1 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x003c
            int r2 = X.AnonymousClass001.A0j(r8, r14)
            r0 = r0 | r2
            goto L_0x003c
        L_0x00f4:
            r2 = r1 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0036
            int r2 = X.AnonymousClass001.A0S(r8, r9)
            r0 = r0 | r2
            goto L_0x0036
        L_0x00ff:
            r2 = r26 & 48
            if (r2 != 0) goto L_0x0030
            int r2 = X.AnonymousClass001.A0b(r8, r10)
            r0 = r0 | r2
            goto L_0x0030
        L_0x010a:
            r0 = r1
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24632CCs.A00(X.0Is, X.0tn, X.0tj, X.0vk, int, int, boolean, boolean):void");
    }
}

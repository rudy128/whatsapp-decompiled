package X;

/* renamed from: X.CsF  reason: case insensitive filesystem */
public abstract class C26095CsF {
    public static final long A00 = C05100Qk.A04;
    public static final long A01 = C05100Qk.A01;
    public static final long A02 = C26054CrP.A02(14);
    public static final long A03 = C26054CrP.A02(0);

    public static final Object A02(float f, Object obj, Object obj2) {
        return ((double) f) >= 0.5d ? obj2 : obj;
    }

    public static final long A00(float f, long j, long j2) {
        if (C26054CrP.A03(j) || C26054CrP.A03(j2)) {
            return ((C26130Cst) A02(f, new C26130Cst(j), new C26130Cst(j2))).A00;
        }
        if (C26054CrP.A03(j) || C26054CrP.A03(j2)) {
            throw AnonymousClass000.A0k("Cannot perform operation for Unspecified type.");
        } else if (C26130Cst.A00(j) == C26130Cst.A00(j2)) {
            return C26054CrP.A01(AnonymousClass000.A00(1.0f - f, AnonymousClass001.A01(j), f, AnonymousClass001.A01(j2)), j & 1095216660480L);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Cannot perform operation for ");
            A10.append(C25759ClU.A00(C26130Cst.A00(j)));
            A10.append(" and ");
            A10.append(C25759ClU.A00(C26130Cst.A00(j2)));
            throw AnonymousClass000.A0j(A10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r44 == r0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r42 == r0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r24.equals(r7.A03) != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r22.equals(r7.A05) != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        if (r23.equals(r7.A04) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (r25 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C26053CrN A01(X.C03380Hv r25, X.AnonymousClass0NG r26, X.C02000Cg r27, X.C25706Ckc r28, X.C26053CrN r29, X.C24693CGf r30, X.C25823Cma r31, X.C25824Cmb r32, X.DSF r33, X.DUE r34, X.C25825Cmc r35, X.C25827Cme r36, X.C26040Cr4 r37, java.lang.String r38, float r39, long r40, long r42, long r44, long r46) {
        /*
            r20 = r42
            r18 = r44
            r14 = r30
            r11 = r33
            r2 = r46
            r13 = r31
            r12 = r32
            r4 = r38
            r8 = r35
            r5 = r37
            r10 = r34
            r6 = r36
            r24 = r26
            r23 = r27
            r22 = r28
            boolean r0 = X.C26054CrP.A03(r20)
            r0 = r0 ^ 1
            r7 = r29
            r9 = r25
            r15 = r39
            if (r0 == 0) goto L_0x0034
            long r0 = r7.A01
            X.ClU[] r16 = X.C26130Cst.A02
            int r16 = (r42 > r0 ? 1 : (r42 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x00f2
        L_0x0034:
            if (r25 != 0) goto L_0x0046
            long r16 = X.C05100Qk.A05
            int r0 = (r40 > r16 ? 1 : (r40 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            X.EBX r0 = r7.A0D
            long r16 = r0.BOw()
            int r0 = (r40 > r16 ? 1 : (r40 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x01b2
        L_0x0046:
            if (r31 == 0) goto L_0x0050
            X.Cma r0 = r7.A07
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x0050:
            if (r33 == 0) goto L_0x005a
            X.DSF r0 = r7.A09
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x005a:
            if (r30 == 0) goto L_0x0060
            X.CGf r0 = r7.A06
            if (r14 != r0) goto L_0x00f2
        L_0x0060:
            boolean r0 = X.C26054CrP.A03(r18)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0070
            long r0 = r7.A02
            X.ClU[] r16 = X.C26130Cst.A02
            int r16 = (r44 > r0 ? 1 : (r44 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x00f2
        L_0x0070:
            if (r36 == 0) goto L_0x007a
            X.Cme r0 = r7.A0C
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x007a:
            X.EBX r1 = r7.A0D
            X.0Hv r0 = r1.BNh()
            boolean r0 = X.C18070vi.A18(r9, r0)
            if (r0 == 0) goto L_0x00f2
            if (r25 == 0) goto L_0x0090
            float r0 = r1.BMz()
            int r0 = (r39 > r0 ? 1 : (r39 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00f4
        L_0x0090:
            if (r32 == 0) goto L_0x009a
            X.Cmb r0 = r7.A08
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x009a:
            if (r38 == 0) goto L_0x00a4
            java.lang.String r0 = r7.A0F
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x00a4:
            if (r35 == 0) goto L_0x00ae
            X.Cmc r0 = r7.A0B
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x00ae:
            if (r37 == 0) goto L_0x00b8
            X.Cr4 r0 = r7.A0E
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x00b8:
            if (r34 == 0) goto L_0x00c2
            X.DUE r0 = r7.A0A
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x00c2:
            long r16 = X.C05100Qk.A05
            int r0 = (r46 > r16 ? 1 : (r46 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            long r0 = r7.A00
            int r16 = (r46 > r0 ? 1 : (r46 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x00f2
        L_0x00ce:
            if (r26 == 0) goto L_0x00da
            X.0NG r1 = r7.A03
            r0 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f2
        L_0x00da:
            if (r28 == 0) goto L_0x00e6
            X.Ckc r1 = r7.A05
            r0 = r22
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f2
        L_0x00e6:
            if (r27 == 0) goto L_0x01b8
            X.0Cg r1 = r7.A04
            r0 = r23
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b8
        L_0x00f2:
            if (r25 == 0) goto L_0x01b2
        L_0x00f4:
            X.Cpb r0 = X.EBX.A00
            X.EBX r9 = r0.A01(r9, r15)
        L_0x00fa:
            X.EBX r0 = r7.A0D
            boolean r15 = r9 instanceof X.D6A
            boolean r1 = r0 instanceof X.D6A
            if (r15 == 0) goto L_0x019d
            if (r1 == 0) goto L_0x0125
            r1 = r9
            X.D6A r1 = (X.D6A) r1
            X.09d r1 = r1.A00
            float r15 = r9.BMz()
            X.Dfq r9 = new X.Dfq
            r9.<init>(r0)
            boolean r0 = java.lang.Float.isNaN(r15)
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r9.invoke()
            float r15 = X.AnonymousClass000.A04(r0)
        L_0x0120:
            X.D6A r9 = new X.D6A
            r9.<init>(r1, r15)
        L_0x0125:
            if (r30 != 0) goto L_0x0129
            X.CGf r14 = r7.A06
        L_0x0129:
            boolean r0 = X.C26054CrP.A03(r20)
            if (r0 == 0) goto L_0x0133
            long r0 = r7.A01
            r20 = r0
        L_0x0133:
            if (r33 != 0) goto L_0x0137
            X.DSF r11 = r7.A09
        L_0x0137:
            if (r31 != 0) goto L_0x013b
            X.Cma r13 = r7.A07
        L_0x013b:
            if (r32 != 0) goto L_0x013f
            X.Cmb r12 = r7.A08
        L_0x013f:
            if (r38 != 0) goto L_0x0143
            java.lang.String r4 = r7.A0F
        L_0x0143:
            boolean r0 = X.C26054CrP.A03(r18)
            if (r0 == 0) goto L_0x014d
            long r0 = r7.A02
            r18 = r0
        L_0x014d:
            if (r35 != 0) goto L_0x0151
            X.Cmc r8 = r7.A0B
        L_0x0151:
            if (r37 != 0) goto L_0x0155
            X.Cr4 r5 = r7.A0E
        L_0x0155:
            if (r34 != 0) goto L_0x0159
            X.DUE r10 = r7.A0A
        L_0x0159:
            long r15 = X.C05100Qk.A05
            int r0 = (r46 > r15 ? 1 : (r46 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0161
            long r2 = r7.A00
        L_0x0161:
            if (r36 != 0) goto L_0x0165
            X.Cme r6 = r7.A0C
        L_0x0165:
            if (r26 != 0) goto L_0x016b
            X.0NG r0 = r7.A03
            r24 = r0
        L_0x016b:
            X.Ckc r0 = r7.A05
            if (r0 == 0) goto L_0x0171
            r22 = r0
        L_0x0171:
            if (r27 != 0) goto L_0x0177
            X.0Cg r0 = r7.A04
            r23 = r0
        L_0x0177:
            X.CrN r25 = new X.CrN
            r38 = r4
            r39 = r20
            r41 = r18
            r43 = r2
            r28 = r22
            r29 = r14
            r30 = r13
            r31 = r12
            r32 = r11
            r33 = r10
            r34 = r8
            r35 = r6
            r36 = r9
            r37 = r5
            r26 = r24
            r27 = r23
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43)
            return r25
        L_0x019d:
            if (r1 == 0) goto L_0x01a1
            r9 = r0
            goto L_0x0125
        L_0x01a1:
            X.Dfr r1 = new X.Dfr
            r1.<init>(r0)
            X.D6B r0 = X.D6B.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0125
            X.EBX r9 = r1.this$0
            goto L_0x0125
        L_0x01b2:
            X.EBX r9 = X.C25969Cpb.A00(r40)
            goto L_0x00fa
        L_0x01b8:
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26095CsF.A01(X.0Hv, X.0NG, X.0Cg, X.Ckc, X.CrN, X.CGf, X.Cma, X.Cmb, X.DSF, X.DUE, X.Cmc, X.Cme, X.Cr4, java.lang.String, float, long, long, long, long):X.CrN");
    }
}

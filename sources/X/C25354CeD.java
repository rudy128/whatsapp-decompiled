package X;

/* renamed from: X.CeD  reason: case insensitive filesystem */
public abstract class C25354CeD {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r6.BEf(r18) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
        if (r14.length() > 0) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r34, X.C17090tj r35, X.AnonymousClass9IB r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, X.C22821Di r40, int r41, int r42) {
        /*
            r5 = r40
            r18 = r39
            r14 = r38
            r9 = r36
            r15 = r37
            r19 = r35
            r0 = 1763977403(0x692428bb, float:1.2403511E25)
            r6 = r34
            r6.COC(r0)
            r13 = r42 & 1
            r4 = r41
            r8 = r41 | 6
            if (r13 != 0) goto L_0x0029
            r0 = r41 & 6
            r8 = r4
            if (r0 != 0) goto L_0x0029
            r0 = r19
            int r8 = X.AnonymousClass001.A0Q(r6, r0)
            r8 = r8 | r41
        L_0x0029:
            r11 = r42 & 2
            if (r11 == 0) goto L_0x01de
            r8 = r8 | 48
        L_0x002f:
            r7 = r42 & 4
            if (r7 == 0) goto L_0x01d3
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0035:
            r3 = r42 & 8
            if (r3 == 0) goto L_0x01c8
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x003b:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0050
            r0 = r42 & 16
            if (r0 != 0) goto L_0x004d
            r0 = r18
            boolean r1 = r6.BEf(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x004f
        L_0x004d:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004f:
            r8 = r8 | r0
        L_0x0050:
            r2 = r42 & 32
            r12 = 131072(0x20000, float:1.83671E-40)
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r2 != 0) goto L_0x0060
            r0 = r41 & r0
            if (r0 != 0) goto L_0x0061
            int r0 = X.AnonymousClass001.A0e(r6, r5)
        L_0x0060:
            r8 = r8 | r0
        L_0x0061:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r8
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x0091
            boolean r0 = r6.BZO()
            if (r0 == 0) goto L_0x0091
            r6.CNR()
        L_0x0073:
            X.0Vf r1 = r6.BKF()
            if (r1 == 0) goto L_0x0090
            X.DXI r0 = new X.DXI
            r34 = r0
            r35 = r19
            r36 = r9
            r37 = r15
            r38 = r14
            r39 = r18
            r40 = r5
            r41 = r4
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42)
            r1.A06 = r0
        L_0x0090:
            return
        L_0x0091:
            r6.CNl()
            r0 = r41 & 1
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = 0
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r6.BQS()
            if (r0 != 0) goto L_0x01a2
            r6.CNR()
            r0 = r42 & 16
            if (r0 == 0) goto L_0x00aa
            r8 = r8 & r1
        L_0x00aa:
            r6.BKA()
            r0 = 99131368(0x5e89fe8, float:2.1875915E-35)
            java.lang.Object r11 = X.AnonymousClass000.A0u(r6, r0)
            java.lang.Object r3 = X.AnonymousClass0MH.A00
            r17 = 0
            if (r11 != r3) goto L_0x00ce
            int r0 = r15.length()
            long r0 = X.C25858CnM.A02(r0, r0)
            X.CvE r2 = new X.CvE
            r2.<init>((java.lang.String) r15, (long) r0)
            X.08V r11 = X.AnonymousClass0Q9.A02(r2)
            r6.CRH(r11)
        L_0x00ce:
            X.0uU r11 = (X.C17330uU) r11
            r7 = r6
            X.0VR r7 = (X.AnonymousClass0VR) r7
            X.AnonymousClass0VR.A0R(r7, r10)
            r0 = 99136211(0x5e8b2d3, float:2.1882865E-35)
            java.lang.Object r2 = X.AnonymousClass000.A0u(r6, r0)
            if (r2 != r3) goto L_0x00e7
            X.0Mr r2 = new X.0Mr
            r2.<init>()
            r6.CRH(r2)
        L_0x00e7:
            X.0Mr r2 = (X.C04310Mr) r2
            X.AnonymousClass0VR.A0R(r7, r10)
            androidx.compose.ui.focus.FocusRequesterElement r1 = new androidx.compose.ui.focus.FocusRequesterElement
            r1.<init>(r2)
            r0 = r19
            X.0tj r24 = r0.CP5(r1)
            java.lang.Object r13 = r11.getValue()
            X.CvE r13 = (X.C26224CvE) r13
            X.9IB r0 = X.AnonymousClass9IB.ERROR
            if (r9 == r0) goto L_0x0109
            int r0 = r14.length()
            r40 = 0
            if (r0 <= 0) goto L_0x010b
        L_0x0109:
            r40 = 1
        L_0x010b:
            r1 = 6
            X.DWa r16 = new X.DWa
            r0 = r16
            r0.<init>(r1)
            r0 = 99147743(0x5e8dfdf, float:2.1899412E-35)
            r6.COB(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r8
            if (r0 != r12) goto L_0x011f
            r10 = 1
        L_0x011f:
            java.lang.Object r1 = r6.CER()
            if (r10 != 0) goto L_0x0127
            if (r1 != r3) goto L_0x0130
        L_0x0127:
            r0 = 3
            X.DWc r1 = new X.DWc
            r1.<init>(r5, r11, r0)
            r6.CRH(r1)
        L_0x0130:
            X.1Di r1 = (X.C22821Di) r1
            r10 = 0
            X.AnonymousClass0VR.A0R(r7, r10)
            r0 = 3
            X.DWe r12 = new X.DWe
            r12.<init>(r11, r0)
            r0 = -1917561930(0xffffffff8db453b6, float:-1.1113509E-30)
            X.04D r31 = X.AnonymousClass0LC.A00(r6, r12, r0)
            r12 = 2
            X.DWi r0 = new X.DWi
            r0.<init>(r11, r9, r14, r12)
            r11 = -1681392107(0xffffffff9bc7fe15, float:-3.3085985E-22)
            X.04D r32 = X.AnonymousClass0LC.A00(r6, r0, r11)
            int r0 = r8 >> 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r11
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r8
            r36 = 221184(0x36000, float:3.09945E-40)
            r37 = 212144(0x33cb0, float:2.97277E-40)
            r22 = r17
            r28 = r17
            r34 = r10
            r38 = r10
            r39 = r10
            r41 = r10
            r20 = r17
            r29 = r16
            r30 = r1
            r33 = r10
            r35 = r0
            r21 = r17
            r23 = r6
            r25 = r13
            r26 = r18
            r27 = r14
            X.C24624CCk.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.1Wu r8 = X.C27621Wu.A00
            r0 = 99161911(0x5e91737, float:2.1919742E-35)
            java.lang.Object r1 = X.AnonymousClass000.A0u(r6, r0)
            if (r1 != r3) goto L_0x0198
            com.whatsapp.profile.compose.UsernameInputFieldKt$UsernameInputField$6$1 r1 = new com.whatsapp.profile.compose.UsernameInputFieldKt$UsernameInputField$6$1
            r0 = r17
            r1.<init>(r2, r0)
            r6.CRH(r1)
        L_0x0198:
            X.1OS r1 = (X.AnonymousClass1OS) r1
            X.AnonymousClass0VR.A0R(r7, r10)
            X.AnonymousClass0QC.A04(r6, r8, r1)
            goto L_0x0073
        L_0x01a2:
            if (r13 == 0) goto L_0x01a6
            X.0WC r19 = X.C17090tj.A00
        L_0x01a6:
            if (r11 == 0) goto L_0x01aa
            java.lang.String r15 = "CoolUser"
        L_0x01aa:
            if (r7 == 0) goto L_0x01ae
            X.9IB r9 = X.AnonymousClass9IB.NONE
        L_0x01ae:
            if (r3 == 0) goto L_0x01b2
            java.lang.String r14 = "This username is available"
        L_0x01b2:
            r0 = r42 & 16
            if (r0 == 0) goto L_0x01be
            r0 = 2131897687(0x7f122d57, float:1.943027E38)
            java.lang.String r18 = X.AnonymousClass0LT.A00(r6, r0)
            r8 = r8 & r1
        L_0x01be:
            if (r2 == 0) goto L_0x00aa
            r0 = 5
            X.DWa r5 = new X.DWa
            r5.<init>(r0)
            goto L_0x00aa
        L_0x01c8:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003b
            int r0 = X.AnonymousClass001.A0T(r6, r14)
            r8 = r8 | r0
            goto L_0x003b
        L_0x01d3:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0035
            int r0 = X.AnonymousClass001.A0S(r6, r9)
            r8 = r8 | r0
            goto L_0x0035
        L_0x01de:
            r0 = r41 & 48
            if (r0 != 0) goto L_0x002f
            int r0 = X.AnonymousClass001.A0R(r6, r15)
            r8 = r8 | r0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25354CeD.A00(X.0tn, X.0tj, X.9IB, java.lang.String, java.lang.String, java.lang.String, X.1Di, int, int):void");
    }

    public static final void A01(C17130tn r18, AnonymousClass9IB r19, String str, String str2, int i) {
        int i2;
        C17130tn r9 = r18;
        r9.COC(37890843);
        int i3 = i;
        AnonymousClass9IB r2 = r19;
        if ((i & 6) == 0) {
            i2 = AnonymousClass001.A0Z(r9, r2) | i;
        } else {
            i2 = i3;
        }
        String str3 = str;
        if ((i & 48) == 0) {
            i2 |= AnonymousClass001.A0R(r9, str3);
        }
        String str4 = str2;
        if ((i3 & 384) == 0) {
            i2 |= AnonymousClass001.A0S(r9, str4);
        }
        if ((i2 & 147) != 146 || !r9.BZO()) {
            int ordinal = r2.ordinal();
            if (ordinal == 0) {
                r9.COB(-1124924195);
            } else if (ordinal == 1) {
                r9.COB(-1124922370);
                C24630CCq.A00(r9, (C17090tj) null, C24265ByO.SMALL, 48, 1);
            } else if (ordinal == 2) {
                r9.COB(-512728899);
                AnonymousClass0WC r7 = C17090tj.A00;
                long j = CIM.A00;
                C17130tn r15 = r9;
                String str5 = str3;
                C24623CCj.A00(r15, C05130Qo.A08(r7, 24.0f), AnonymousClass0LS.A00(r9, 2131233240), str5, i2 & 112, 0, C26257Cw2.A06(r9, CG7.A00));
            } else if (ordinal == 3) {
                r9.COB(-512415613);
                AnonymousClass0WC r8 = C17090tj.A00;
                long j2 = CIM.A00;
                C24623CCj.A00(r9, C05130Qo.A08(r8, 24.0f), AnonymousClass0LS.A00(r9, 2131233287), str4, (i2 >> 3) & 112, 0, C26257Cw2.A07(r9, CG7.A00));
            } else {
                r9.COB(-1124925084);
                AnonymousClass0VR.A0U(r9);
                throw AnonymousClass3MW.A14();
            }
            AnonymousClass0VR.A0U(r9);
        } else {
            r9.CNR();
        }
        C05660Vf BKF = r9.BKF();
        if (BKF != null) {
            BKF.A06 = new C27164DWz(r2, str3, str4, i3);
        }
    }
}

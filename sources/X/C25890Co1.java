package X;

/* renamed from: X.Co1  reason: case insensitive filesystem */
public abstract class C25890Co1 {
    public static final C03540Ir A00(C17130tn r10, C24263ByM byM, C24290Byn byn) {
        C03540Ir r2;
        AnonymousClass0VR r0;
        long j;
        long j2;
        long j3;
        long j4;
        C17130tn r02 = r10;
        r10.COB(43714753);
        int ordinal = byM.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            r10.COB(39039785);
            int ordinal2 = byn.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    r10.COB(39631513);
                    AnonymousClass07W r4 = CG7.A00;
                    C26257Cw2 A0g = BE6.A0g(r10, r4);
                    if (A0g instanceof BqD) {
                        j3 = ((BqD) A0g).A06;
                    } else {
                        j3 = ((BqC) A0g).A06;
                    }
                    j = C26257Cw2.A04(r10, r4);
                    j4 = C26257Cw2.A06(r10, r4);
                    j2 = BE6.A0g(r10, r4).A08();
                } else if (ordinal2 == 2 || ordinal2 == 3) {
                    r10.COB(40093630);
                    AnonymousClass07W r22 = CG7.A00;
                    j3 = C26257Cw2.A01(r10, r22);
                    j = C26257Cw2.A04(r10, r22);
                    j4 = C05100Qk.A04;
                    j2 = j4;
                } else {
                    r10.COB(1248185337);
                    AnonymousClass0VR.A0U(r10);
                    throw AnonymousClass3MW.A14();
                }
                r02.COB(999008085);
                r2 = new C03540Ir(j4, j3, j2, j);
                r0 = (AnonymousClass0VR) r02;
            } else {
                r10.COB(1248189802);
                long A00 = AnonymousClass0FW.A00(r10, 2131103089);
                long A002 = AnonymousClass0FW.A00(r10, 2131103091);
                AnonymousClass07W r23 = CG7.A00;
                long A08 = BE6.A0g(r10, r23).A08();
                long A04 = C26257Cw2.A04(r10, r23);
                r02.COB(999008085);
                r2 = new C03540Ir(A00, A002, A08, A04);
                r0 = (AnonymousClass0VR) r02;
                z = false;
            }
            AnonymousClass0VR.A0R(r0, z);
        } else if (ordinal == 1) {
            r10.COB(1248232212);
            AnonymousClass07W r24 = CG7.A00;
            long A02 = C26257Cw2.A02(r10, r24);
            long A07 = C26257Cw2.A07(r10, r24);
            long A022 = C26257Cw2.A02(r10, r24);
            long A042 = C26257Cw2.A04(r10, r24);
            r02.COB(999008085);
            r2 = new C03540Ir(A02, A07, A022, A042);
            r0 = (AnonymousClass0VR) r02;
        } else {
            r10.COB(1248183951);
            AnonymousClass0VR.A0U(r10);
            throw AnonymousClass3MW.A14();
        }
        AnonymousClass0VR.A0R(r0, z);
        AnonymousClass0VR.A0R(r0, z);
        AnonymousClass0VR.A0R(r0, z);
        return r2;
    }

    public static final void A02(C17130tn r8, C17090tj r9, C04640Oe r10, String str, int i, int i2) {
        C17090tj r5 = r9;
        C17130tn r4 = r8;
        r8.COC(655471331);
        int i3 = i | 6;
        C04640Oe r6 = r10;
        if ((i2 & 1) == 0) {
            if ((i & 6) == 0) {
                i3 = AnonymousClass001.A0a(r8, r10) | i;
            } else {
                i3 = i;
            }
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass001.A0R(r8, str);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AnonymousClass001.A0S(r8, r9);
        }
        if ((i3 & 147) != 146 || !r8.BZO()) {
            if (i4 != 0) {
                r5 = C17090tj.A00;
            }
            C04040Lp.A00(r4, r5, r6, str2, (i3 & 14) | (i3 & 112) | (i3 & 896), 8, 0);
        } else {
            r8.CNR();
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A06 = new DX2(r5, r6, str2, i, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r17, X.C17090tj r18, X.C04640Oe r19, X.C24263ByM r20, X.C24264ByN r21, X.C24290Byn r22, java.lang.String r23, X.C18090vk r24, int r25, int r26) {
        /*
            r6 = r21
            r8 = r20
            r4 = r22
            r13 = r18
            r10 = 0
            r9 = r19
            X.C18070vi.A0d(r9, r10)
            r1 = 1
            r5 = r23
            X.C18070vi.A0d(r5, r1)
            r0 = 2
            r11 = r24
            X.C18070vi.A0d(r11, r0)
            r0 = 199819766(0xbe901f6, float:8.9751286E-32)
            r3 = r17
            r3.COC(r0)
            r0 = r26 & 1
            r2 = r25
            if (r0 == 0) goto L_0x0156
            r7 = r25 | 6
        L_0x002a:
            r0 = r26 & 2
            if (r0 == 0) goto L_0x014b
            r7 = r7 | 48
        L_0x0030:
            r0 = r26 & 4
            if (r0 == 0) goto L_0x0140
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r18 = r26 & 8
            if (r18 == 0) goto L_0x0135
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x003c:
            r17 = r26 & 16
            if (r17 == 0) goto L_0x0126
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0042:
            r16 = r26 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x011b
            r7 = r7 | r15
        L_0x0049:
            r14 = r26 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r14 != 0) goto L_0x0057
            r0 = r25 & r0
            if (r0 != 0) goto L_0x0058
            int r0 = X.AnonymousClass001.A0W(r3, r6)
        L_0x0057:
            r7 = r7 | r0
        L_0x0058:
            r12 = 599187(0x92493, float:8.3964E-40)
            r12 = r12 & r7
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r0) goto L_0x008a
            boolean r0 = r3.BZO()
            if (r0 == 0) goto L_0x008a
            r3.CNR()
        L_0x006a:
            X.0Vf r1 = r3.BKF()
            if (r1 == 0) goto L_0x0089
            X.DXK r0 = new X.DXK
            r18 = r13
            r19 = r9
            r20 = r8
            r21 = r6
            r22 = r4
            r23 = r5
            r24 = r11
            r25 = r2
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A06 = r0
        L_0x0089:
            return
        L_0x008a:
            if (r18 == 0) goto L_0x008e
            X.0WC r13 = X.C17090tj.A00
        L_0x008e:
            if (r17 == 0) goto L_0x0092
            X.Byn r4 = X.C24290Byn.Borderless
        L_0x0092:
            if (r16 == 0) goto L_0x0096
            X.ByM r8 = X.C24263ByM.Default
        L_0x0096:
            if (r14 == 0) goto L_0x009a
            X.ByN r6 = X.C24264ByN.Normal
        L_0x009a:
            X.Byn r0 = X.C24290Byn.Outlined
            r14 = 6
            if (r4 != r0) goto L_0x00eb
            r0 = -957450527(0xffffffffc6ee76e1, float:-30523.44)
            r3.COB(r0)
            X.0Ir r17 = A00(r3, r8, r4)
            long r0 = X.CIM.A00
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A03(r3, r0)
            X.09Y r12 = new X.09Y
            r12.<init>(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.0JY r15 = new X.0JY
            r15.<init>(r12, r0)
            X.DWi r1 = new X.DWi
            r1.<init>(r9, r6, r5, r10)
            r0 = -1158866958(0xffffffffbaed17f2, float:-0.0018088801)
            X.04D r22 = X.AnonymousClass0LC.A00(r3, r1, r0)
            int r0 = r7 >> 6
            r23 = r0 & 14
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r23 = r23 | r0
            int r7 = r7 >> r14
            r0 = r7 & 112(0x70, float:1.57E-43)
            r23 = r23 | r0
            r16 = 0
            r24 = 76
            r20 = r16
            r25 = r10
            r18 = r3
            r19 = r13
            r21 = r11
            X.AnonymousClass0L6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x00e7:
            X.AnonymousClass0VR.A0U(r3)
            goto L_0x006a
        L_0x00eb:
            r0 = -957009490(0xffffffffc6f531ae, float:-31384.84)
            r3.COB(r0)
            X.0Ir r16 = A00(r3, r8, r4)
            X.DWi r12 = new X.DWi
            r12.<init>(r9, r6, r5, r1)
            r0 = 1401297847(0x53861bb7, float:1.15198119E12)
            X.04D r20 = X.AnonymousClass0LC.A00(r3, r12, r0)
            int r0 = r7 >> 6
            r21 = r0 & 14
            r21 = r21 | r15
            int r7 = r7 >> r14
            r0 = r7 & 112(0x70, float:1.57E-43)
            r21 = r21 | r0
            r15 = 0
            r22 = 20
            r17 = r3
            r18 = r13
            r19 = r11
            r23 = r10
            X.AnonymousClass0L6.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00e7
        L_0x011b:
            r0 = r25 & r15
            if (r0 != 0) goto L_0x0049
            int r0 = X.AnonymousClass001.A0V(r3, r8)
            r7 = r7 | r0
            goto L_0x0049
        L_0x0126:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0042
            boolean r0 = r3.BEf(r4)
            int r0 = X.AnonymousClass000.A08(r0)
            r7 = r7 | r0
            goto L_0x0042
        L_0x0135:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003c
            int r0 = X.AnonymousClass001.A0T(r3, r13)
            r7 = r7 | r0
            goto L_0x003c
        L_0x0140:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0036
            int r0 = X.AnonymousClass001.A0c(r3, r11)
            r7 = r7 | r0
            goto L_0x0036
        L_0x014b:
            r0 = r25 & 48
            if (r0 != 0) goto L_0x0030
            int r0 = X.AnonymousClass001.A0R(r3, r5)
            r7 = r7 | r0
            goto L_0x0030
        L_0x0156:
            r0 = r25 & 6
            if (r0 != 0) goto L_0x0166
            boolean r0 = r3.BEh(r9)
            int r7 = X.AnonymousClass000.A09(r0)
            r7 = r7 | r25
            goto L_0x002a
        L_0x0166:
            r7 = r2
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25890Co1.A01(X.0tn, X.0tj, X.0Oe, X.ByM, X.ByN, X.Byn, java.lang.String, X.0vk, int, int):void");
    }
}

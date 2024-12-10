package X;

/* renamed from: X.Co0  reason: case insensitive filesystem */
public abstract class C25889Co0 {
    public static final C17090tj A00(C17090tj r2, C24264ByN byN) {
        float f;
        int ordinal = byN.ordinal();
        if (ordinal == 0) {
            long j = CIM.A00;
            f = 48.0f;
        } else if (ordinal == 1) {
            long j2 = CIM.A00;
            f = 40.0f;
        } else if (ordinal == 2) {
            long j3 = CIM.A00;
            f = 56.0f;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return C05130Qo.A06(r2, f);
    }

    public static final void A02(C17130tn r28, C04640Oe r29, String str, int i) {
        int i2;
        C17130tn r7 = r28;
        r7.COC(1623888942);
        int i3 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = AnonymousClass001.A0Z(r7, str2) | i;
        } else {
            i2 = i3;
        }
        C04640Oe r1 = r29;
        if ((i & 48) == 0) {
            i2 |= AnonymousClass001.A0b(r7, r1);
        }
        if ((i2 & 19) != 18 || !r7.BZO()) {
            r7.COB(-1355564919);
            if (r29 != null) {
                AnonymousClass0WC r3 = C17090tj.A00;
                long j = CIM.A00;
                C04040Lp.A00(r7, C05130Qo.A08(r3, 18.0f), r1, (String) null, ((i2 >> 3) & 14) | 432, 8, 0);
                C02280Dk.A00(r7, C05130Qo.A08(r3, 8.0f));
            }
            AnonymousClass0VR.A0R((AnonymousClass0VR) r7, false);
            AnonymousClass0PA.A01(r7, (C17090tj) null, BE7.A0S(r7).A03, (C24693CGf) null, (C25823Cma) null, (DSF) null, (C26018CqZ) null, (C25827Cme) null, str2, (C22821Di) null, 2, 1, 0, i2 & 14, 3120, 55294, 0, 0, 0, 0, false);
        } else {
            r7.CNR();
        }
        C05660Vf BKF = r7.BKF();
        if (BKF != null) {
            BKF.A06 = new C27160DWv(r1, str2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r27, X.C17090tj r28, X.C04640Oe r29, X.C24263ByM r30, X.C24264ByN r31, X.C24290Byn r32, java.lang.String r33, X.C18090vk r34, int r35, int r36, boolean r37) {
        /*
            r10 = r30
            r7 = r31
            r21 = r32
            r11 = r37
            r8 = r29
            r9 = r28
            r12 = 0
            r6 = r33
            X.C18070vi.A0d(r6, r12)
            r2 = 1
            r13 = r34
            X.C18070vi.A0d(r13, r2)
            r0 = -91284862(0xfffffffffa8f1a82, float:-3.7151805E35)
            r1 = r27
            r1.COC(r0)
            r5 = r36
            r3 = r36 & 1
            r4 = r35
            r0 = r35 | 6
            if (r3 != 0) goto L_0x0034
            r0 = r35 & 6
            if (r0 != 0) goto L_0x0222
            int r0 = X.AnonymousClass001.A0Q(r1, r6)
            r0 = r0 | r35
        L_0x0034:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0217
            r0 = r0 | 48
        L_0x003a:
            r20 = r36 & 4
            if (r20 == 0) goto L_0x020c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0040:
            r19 = r36 & 8
            if (r19 == 0) goto L_0x0201
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r18 = r36 & 16
            if (r18 == 0) goto L_0x01f2
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x004c:
            r17 = r36 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r17 != 0) goto L_0x005c
            r3 = r35 & r3
            if (r3 != 0) goto L_0x005d
            r3 = r21
            int r3 = X.AnonymousClass001.A0V(r1, r3)
        L_0x005c:
            r0 = r0 | r3
        L_0x005d:
            r16 = r36 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x006b
            r3 = r35 & r3
            if (r3 != 0) goto L_0x006c
            int r3 = X.AnonymousClass001.A0W(r1, r7)
        L_0x006b:
            r0 = r0 | r3
        L_0x006c:
            r14 = r5 & 128(0x80, float:1.794E-43)
            r15 = 12582912(0xc00000, float:1.7632415E-38)
            if (r14 != 0) goto L_0x0080
            r3 = r35 & r15
            if (r3 != 0) goto L_0x0081
            boolean r3 = r1.BEf(r10)
            r15 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0080
            r15 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0080:
            r0 = r0 | r15
        L_0x0081:
            r15 = 4793491(0x492493, float:6.717112E-39)
            r15 = r15 & r0
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r15 != r3) goto L_0x00b5
            boolean r3 = r1.BZO()
            if (r3 == 0) goto L_0x00b5
            r1.CNR()
        L_0x0093:
            X.0Vf r1 = r1.BKF()
            if (r1 == 0) goto L_0x00b4
            X.DXN r0 = new X.DXN
            r14 = r0
            r15 = r9
            r16 = r8
            r17 = r10
            r18 = r7
            r19 = r21
            r20 = r6
            r21 = r13
            r22 = r4
            r23 = r5
            r24 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.A06 = r0
        L_0x00b4:
            return
        L_0x00b5:
            if (r20 == 0) goto L_0x00b9
            X.0WC r9 = X.C17090tj.A00
        L_0x00b9:
            if (r19 == 0) goto L_0x00bc
            r8 = 0
        L_0x00bc:
            if (r18 == 0) goto L_0x00bf
            r11 = 1
        L_0x00bf:
            if (r17 == 0) goto L_0x00c3
            X.Byn r21 = X.C24290Byn.Filled
        L_0x00c3:
            if (r16 == 0) goto L_0x00c7
            X.ByN r7 = X.C24264ByN.Normal
        L_0x00c7:
            if (r14 == 0) goto L_0x00cb
            X.ByM r10 = X.C24263ByM.Default
        L_0x00cb:
            int r3 = r21.ordinal()
            r14 = 6
            if (r3 == r2) goto L_0x016a
            if (r3 == r12) goto L_0x0181
            r2 = 2
            if (r3 == r2) goto L_0x012e
            r2 = 3
            if (r3 != r2) goto L_0x0225
            r2 = 55189008(0x34a1e10, float:5.9396975E-37)
            r1.COB(r2)
            X.0tj r28 = A00(r9, r7)
            X.0Ip r25 = X.C25347Ce6.A01(r1, r10)
            long r2 = X.CIM.A00
            X.07W r2 = X.CG7.A00
            long r2 = X.C26257Cw2.A03(r1, r2)
            X.09Y r12 = new X.09Y
            r12.<init>(r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            X.0JY r2 = new X.0JY
            r2.<init>(r12, r3)
            r3 = 3
            X.DWm r12 = new X.DWm
            r12.<init>(r8, r6, r3)
            r3 = 1247602387(0x4a5ce6d3, float:3619252.8)
            X.04D r31 = X.AnonymousClass0LC.A00(r1, r12, r3)
            int r3 = r0 >> 3
            r32 = r3 & 14
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r32 | r3
            int r0 = r0 >> r14
            r0 = r0 & 896(0x380, float:1.256E-42)
            r32 = r32 | r0
            r23 = 0
            r33 = 424(0x1a8, float:5.94E-43)
            r26 = r23
            r29 = r23
            r24 = r23
            r34 = r11
            r30 = r13
            r22 = r2
            X.C04440Nk.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0129:
            X.AnonymousClass0VR.A0T(r1)
            goto L_0x0093
        L_0x012e:
            r2 = 54899034(0x345b15a, float:5.8096686E-37)
            r1.COB(r2)
            X.0tj r28 = A00(r9, r7)
            X.0Ip r25 = X.C25347Ce6.A01(r1, r10)
            r2 = 2
            X.DWm r3 = new X.DWm
            r3.<init>(r8, r6, r2)
            r2 = -1606440961(0xffffffffa03fa7ff, float:-1.6233915E-19)
            X.04D r31 = X.AnonymousClass0LC.A00(r1, r3, r2)
            int r2 = r0 >> 3
            r32 = r2 & 14
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r32 | r2
            int r0 = r0 >> r14
            r0 = r0 & 896(0x380, float:1.256E-42)
            r32 = r32 | r0
            r22 = 0
            r33 = 488(0x1e8, float:6.84E-43)
            r24 = r22
            r26 = r22
            r29 = r22
            r23 = r22
            r34 = r11
            r30 = r13
            X.C04440Nk.A02(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0129
        L_0x016a:
            r2 = 54360936(0x33d7b68, float:5.568377E-37)
            r1.COB(r2)
            X.0tj r28 = A00(r9, r7)
            X.0Ip r25 = X.C25347Ce6.A00(r1)
            X.DWm r3 = new X.DWm
            r3.<init>(r8, r6, r12)
            r2 = -80315414(0xfffffffffb367bea, float:-9.475113E35)
            goto L_0x01cc
        L_0x0181:
            r3 = 54627753(0x3418da9, float:5.688022E-37)
            r1.COB(r3)
            X.0tj r28 = A00(r9, r7)
            r3 = 583135383(0x22c1f097, float:5.256749E-18)
            r1.COB(r3)
            r3 = 2131103089(0x7f060d71, float:1.7818634E38)
            long r30 = X.AnonymousClass0FW.A00(r1, r3)
            r3 = 2131103091(0x7f060d73, float:1.7818638E38)
            long r32 = X.AnonymousClass0FW.A00(r1, r3)
            X.07W r3 = X.CG7.A00
            X.Cw2 r12 = X.BE6.A0g(r1, r3)
            long r34 = r12.A08()
            long r36 = X.C26257Cw2.A04(r1, r3)
            r3 = -339300779(0xffffffffebc6ae55, float:-4.8038114E26)
            r1.COB(r3)
            X.0Ip r25 = new X.0Ip
            r29 = r25
            r29.<init>(r30, r32, r34, r36)
            r12 = r1
            X.0VR r12 = (X.AnonymousClass0VR) r12
            r3 = 0
            X.AnonymousClass0VR.A0R(r12, r3)
            X.AnonymousClass0VR.A0R(r12, r3)
            X.DWm r3 = new X.DWm
            r3.<init>(r8, r6, r2)
            r2 = -1776532717(0xffffffff961c4313, float:-1.2622745E-25)
        L_0x01cc:
            X.04D r31 = X.AnonymousClass0LC.A00(r1, r3, r2)
            int r2 = r0 >> 3
            r32 = r2 & 14
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r32 | r2
            int r0 = r0 >> r14
            r0 = r0 & 896(0x380, float:1.256E-42)
            r32 = r32 | r0
            r22 = 0
            r33 = 488(0x1e8, float:6.84E-43)
            r24 = r22
            r26 = r22
            r29 = r22
            r23 = r22
            r34 = r11
            r30 = r13
            X.C04440Nk.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0129
        L_0x01f2:
            r3 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r1.BEg(r11)
            int r3 = X.AnonymousClass000.A08(r3)
            r0 = r0 | r3
            goto L_0x004c
        L_0x0201:
            r3 = r4 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0046
            int r3 = X.AnonymousClass001.A0d(r1, r8)
            r0 = r0 | r3
            goto L_0x0046
        L_0x020c:
            r3 = r4 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0040
            int r3 = X.AnonymousClass001.A0S(r1, r9)
            r0 = r0 | r3
            goto L_0x0040
        L_0x0217:
            r3 = r35 & 48
            if (r3 != 0) goto L_0x003a
            int r3 = X.AnonymousClass001.A0b(r1, r13)
            r0 = r0 | r3
            goto L_0x003a
        L_0x0222:
            r0 = r4
            goto L_0x0034
        L_0x0225:
            r0 = -552436159(0xffffffffdf127e41, float:-1.0555946E19)
            r1.COB(r0)
            X.AnonymousClass0VR.A0U(r1)
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25889Co0.A01(X.0tn, X.0tj, X.0Oe, X.ByM, X.ByN, X.Byn, java.lang.String, X.0vk, int, int, boolean):void");
    }
}

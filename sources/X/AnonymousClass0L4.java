package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0L4  reason: invalid class name */
public abstract class AnonymousClass0L4 {
    public static final AnonymousClass1OS A00(C16120rk r12, C16130rl r13, AnonymousClass0tB r14, LazyListState lazyListState, C17130tn r16, C16330s5 r17, C16340s6 r18, C18090vk r19, int i, boolean z, boolean z2) {
        C17130tn r3 = r16;
        r3.COB(183156450);
        int i2 = 0;
        LazyListState lazyListState2 = lazyListState;
        AnonymousClass0tB r8 = r14;
        boolean z3 = z;
        boolean z4 = z2;
        C16330s5 r10 = r17;
        C16340s6 r11 = r18;
        C16120rk r6 = r12;
        C16130rl r7 = r13;
        Object[] objArr = {lazyListState, r14, Boolean.valueOf(z3), Boolean.valueOf(z4), r17, r18, r12, r13};
        r3.COB(-568225417);
        boolean z5 = false;
        do {
            z5 |= r3.BEf(objArr[i2]);
            i2++;
        } while (i2 < 8);
        Object CER = r3.CER();
        if (z5 || CER == AnonymousClass0MH.A00) {
            CER = new C14720pT(r6, r7, r8, lazyListState2, r10, r11, r19, i, z4, z3);
            AnonymousClass0VR.A0V(r3, CER);
        }
        AnonymousClass0VR r32 = (AnonymousClass0VR) r3;
        AnonymousClass0VR.A0R(r32, false);
        AnonymousClass1OS r5 = (AnonymousClass1OS) CER;
        AnonymousClass0VR.A0R(r32, false);
        return r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C16080rg r42, X.C16120rk r43, X.C16130rl r44, X.AnonymousClass0tB r45, androidx.compose.foundation.lazy.LazyListState r46, X.C17130tn r47, X.C16330s5 r48, X.C16340s6 r49, X.C17090tj r50, X.C22821Di r51, int r52, int r53, int r54, int r55, boolean r56, boolean r57, boolean r58) {
        /*
            r12 = r52
            r20 = r48
            r41 = r44
            r40 = r49
            r0 = 620764179(0x25001c13, float:1.1111742E-16)
            r4 = r47
            r4.COC(r0)
            r1 = r55
            r0 = r55 & 1
            r3 = r53
            r39 = r50
            if (r0 == 0) goto L_0x02a6
            r7 = r53 | 6
        L_0x001c:
            r0 = r55 & 2
            r5 = r46
            if (r0 == 0) goto L_0x029b
            r7 = r7 | 48
        L_0x0024:
            r0 = r55 & 4
            r16 = 256(0x100, float:3.59E-43)
            r17 = r45
            if (r0 == 0) goto L_0x028e
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r0 = r55 & 8
            r37 = r56
            if (r0 == 0) goto L_0x0281
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r6 = r55 & 16
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r57
            if (r6 == 0) goto L_0x0272
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0041:
            r6 = r55 & 32
            r2 = 458752(0x70000, float:6.42848E-40)
            if (r6 == 0) goto L_0x0266
            r2 = 196608(0x30000, float:2.75506E-40)
        L_0x0049:
            r7 = r7 | r2
        L_0x004a:
            r6 = r55 & 64
            r2 = 3670016(0x380000, float:5.142788E-39)
            r36 = r58
            if (r6 == 0) goto L_0x0254
            r6 = 1572864(0x180000, float:2.204052E-39)
        L_0x0054:
            r7 = r7 | r6
        L_0x0055:
            r9 = r1 & 128(0x80, float:1.794E-43)
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            if (r9 == 0) goto L_0x024a
            r2 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x005d:
            r7 = r7 | r2
        L_0x005e:
            r8 = r1 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 != 0) goto L_0x0070
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r53
            if (r2 != 0) goto L_0x0071
            r2 = r20
            int r2 = X.AnonymousClass001.A0Y(r4, r2)
        L_0x0070:
            r7 = r7 | r2
        L_0x0071:
            r10 = r1 & 512(0x200, float:7.175E-43)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            if (r10 != 0) goto L_0x0087
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r53
            if (r2 != 0) goto L_0x0088
            r2 = r41
            boolean r2 = r4.BEf(r2)
            int r2 = X.AnonymousClass000.A06(r2)
        L_0x0087:
            r7 = r7 | r2
        L_0x0088:
            r11 = r1 & 1024(0x400, float:1.435E-42)
            r2 = r54
            if (r11 == 0) goto L_0x0239
            r15 = r54 | 6
        L_0x0090:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            r14 = r43
            if (r13 == 0) goto L_0x022e
            r15 = r15 | 48
        L_0x0098:
            r6 = r1 & 4096(0x1000, float:5.74E-42)
            r38 = r51
            if (r6 == 0) goto L_0x021c
            r15 = r15 | 384(0x180, float:5.38E-43)
        L_0x00a0:
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r7
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x00e5
            r7 = r15 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r7 != r6) goto L_0x00e5
            boolean r6 = r4.BZO()
            if (r6 == 0) goto L_0x00e5
            r4.CNR()
            r15 = r14
        L_0x00b9:
            X.0Vf r6 = r4.BKF()
            if (r6 == 0) goto L_0x00e4
            X.0o5 r4 = new X.0o5
            r21 = r39
            r22 = r38
            r23 = r12
            r24 = r3
            r25 = r2
            r26 = r1
            r27 = r37
            r28 = r0
            r29 = r36
            r13 = r4
            r14 = r42
            r16 = r41
            r18 = r5
            r19 = r20
            r20 = r40
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.A03(r4)
        L_0x00e4:
            return
        L_0x00e5:
            if (r9 == 0) goto L_0x00e8
            r12 = 0
        L_0x00e8:
            r15 = 0
            if (r8 == 0) goto L_0x00ed
            r20 = r15
        L_0x00ed:
            if (r10 == 0) goto L_0x00f1
            r41 = r15
        L_0x00f1:
            if (r11 == 0) goto L_0x00f5
            r40 = r15
        L_0x00f5:
            if (r13 != 0) goto L_0x00f8
            r15 = r14
        L_0x00f8:
            r6 = r38
            X.0vk r22 = X.C02300Dm.A00(r5, r4, r6)
            r6 = 596174919(0x2388e847, float:1.4843523E-17)
            r4.COB(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r6 = X.AnonymousClass001.A1Z(r4, r5, r6)
            java.lang.Object r10 = r4.CER()
            if (r6 != 0) goto L_0x0116
            java.lang.Object r6 = X.AnonymousClass0MH.A00
            if (r10 != r6) goto L_0x011e
        L_0x0116:
            X.0V9 r10 = new X.0V9
            r10.<init>(r5, r0)
            r4.CRH(r10)
        L_0x011e:
            r9 = r4
            X.0VR r9 = (X.AnonymousClass0VR) r9
            r6 = 0
            X.AnonymousClass0VR.A0R(r9, r6)
            X.0sj r10 = (X.C16620sj) r10
            X.AnonymousClass0VR.A0R(r9, r6)
            r6 = 773894976(0x2e20b340, float:3.6538994E-11)
            java.lang.Object r11 = X.AnonymousClass001.A1C(r4, r6)
            java.lang.Object r8 = X.AnonymousClass0MH.A00
            if (r11 != r8) goto L_0x0143
            X.1OR r6 = X.AnonymousClass1OR.A00
            X.1OX r6 = X.AnonymousClass0QC.A00(r4, r6)
            X.0Vk r11 = new X.0Vk
            r11.<init>(r6)
            r4.CRH(r11)
        L_0x0143:
            r7 = 0
            X.AnonymousClass0VR.A0R(r9, r7)
            X.0Vk r11 = (X.C05710Vk) r11
            X.1OX r6 = r11.A00()
            X.AnonymousClass0VR.A0R(r9, r7)
            r5.A0E(r6)
            r16 = r41
            r18 = r5
            r19 = r4
            r21 = r40
            r23 = r12
            r24 = r37
            r25 = r0
            X.1OS r33 = A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.0t9 r24 = X.AnonymousClass0L2.A00(r4)
            if (r57 == 0) goto L_0x0218
            X.0CI r7 = X.AnonymousClass0CI.Vertical
        L_0x016d:
            X.0uY r11 = r5.A0N
            r6 = r39
            X.0tj r11 = r6.CP5(r11)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r6 = r5.A0G
            X.0tj r28 = r11.CP5(r6)
            r25 = r7
            r26 = r10
            r27 = r4
            r29 = r22
            r30 = r36
            r31 = r37
            X.0tj r10 = X.C02360Ds.A00(r25, r26, r27, r28, r29, r30, r31)
            X.0CI r6 = X.AnonymousClass0CI.Vertical
            if (r7 != r6) goto L_0x0214
            X.0tj r6 = X.AnonymousClass0GQ.A01
        L_0x0191:
            X.0tj r29 = r10.CP5(r6)
            r6 = -1877443446(0xffffffff90187c8a, float:-3.0072656E-29)
            r4.COB(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            boolean r10 = X.AnonymousClass001.A1Z(r4, r5, r6)
            java.lang.Object r6 = r4.CER()
            if (r10 != 0) goto L_0x01ab
            if (r6 != r8) goto L_0x01b3
        L_0x01ab:
            X.0V3 r6 = new X.0V3
            r6.<init>(r5, r12)
            r4.CRH(r6)
        L_0x01b3:
            r8 = 0
            X.AnonymousClass0VR.A0R(r9, r8)
            X.0V3 r6 = (X.AnonymousClass0V3) r6
            X.AnonymousClass0VR.A0R(r9, r8)
            X.0H2 r10 = r5.A0H
            X.07W r9 = X.AnonymousClass0OD.A06
            java.lang.Object r8 = r4.BFh(r9)
            X.By4 r8 = (X.C24246By4) r8
            r26 = r10
            r27 = r6
            r28 = r4
            r30 = r8
            r32 = r36
            X.0tj r8 = X.C02310Dn.A00(r25, r26, r27, r28, r29, r30, r31, r32)
            X.0tj r6 = r24.BR8()
            X.0tj r8 = r8.CP5(r6)
            java.lang.Object r9 = r4.BFh(r9)
            X.By4 r9 = (X.C24246By4) r9
            r6 = r37
            boolean r31 = X.AnonymousClass0L2.A01(r7, r9, r6)
            X.0uI r9 = r5.A0D
            X.0ta r25 = X.AnonymousClass0MN.A01
            X.1Di r6 = androidx.compose.foundation.gestures.ScrollableKt.A04
            androidx.compose.foundation.gestures.ScrollableElement r6 = new androidx.compose.foundation.gestures.ScrollableElement
            r23 = r6
            r26 = r42
            r27 = r7
            r28 = r5
            r29 = r9
            r30 = r36
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.0tj r31 = r8.CP5(r6)
            X.0H3 r6 = r5.A0I
            r34 = 0
            r29 = r6
            r30 = r4
            r35 = r34
            r32 = r22
            X.C02330Dp.A00(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x00b9
        L_0x0214:
            X.0tj r6 = X.AnonymousClass0GQ.A00
            goto L_0x0191
        L_0x0218:
            X.0CI r7 = X.AnonymousClass0CI.Horizontal
            goto L_0x016d
        L_0x021c:
            r6 = r2 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x00a0
            r6 = r38
            boolean r6 = r4.BEh(r6)
            if (r6 != 0) goto L_0x022a
            r16 = 128(0x80, float:1.794E-43)
        L_0x022a:
            r15 = r15 | r16
            goto L_0x00a0
        L_0x022e:
            r6 = r54 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0098
            int r6 = X.AnonymousClass001.A0R(r4, r14)
            r15 = r15 | r6
            goto L_0x0098
        L_0x0239:
            r6 = r54 & 14
            if (r6 != 0) goto L_0x0247
            r6 = r40
            int r6 = X.AnonymousClass001.A0Q(r4, r6)
            r15 = r54 | r6
            goto L_0x0090
        L_0x0247:
            r15 = r2
            goto L_0x0090
        L_0x024a:
            r2 = r53 & r2
            if (r2 != 0) goto L_0x005e
            int r2 = X.AnonymousClass001.A0N(r4, r12)
            goto L_0x005d
        L_0x0254:
            r2 = r53 & r2
            if (r2 != 0) goto L_0x0055
            r2 = r36
            boolean r2 = r4.BEg(r2)
            r6 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x0054
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0054
        L_0x0266:
            r2 = r53 & r2
            if (r2 != 0) goto L_0x004a
            r2 = r42
            int r2 = X.AnonymousClass001.A0V(r4, r2)
            goto L_0x0049
        L_0x0272:
            r2 = r53 & r2
            if (r2 != 0) goto L_0x0041
            boolean r2 = r4.BEg(r0)
            int r2 = X.AnonymousClass000.A08(r2)
            r7 = r7 | r2
            goto L_0x0041
        L_0x0281:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0036
            r0 = r37
            int r0 = X.AnonymousClass001.A0j(r4, r0)
            r7 = r7 | r0
            goto L_0x0036
        L_0x028e:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002e
            r0 = r17
            int r0 = X.AnonymousClass001.A0S(r4, r0)
            r7 = r7 | r0
            goto L_0x002e
        L_0x029b:
            r0 = r53 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0024
            int r0 = X.AnonymousClass001.A0R(r4, r5)
            r7 = r7 | r0
            goto L_0x0024
        L_0x02a6:
            r0 = r53 & 14
            if (r0 != 0) goto L_0x02b4
            r0 = r39
            int r7 = X.AnonymousClass001.A0Z(r4, r0)
            r7 = r7 | r53
            goto L_0x001c
        L_0x02b4:
            r7 = r3
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0L4.A01(X.0rg, X.0rk, X.0rl, X.0tB, androidx.compose.foundation.lazy.LazyListState, X.0tn, X.0s5, X.0s6, X.0tj, X.1Di, int, int, int, int, boolean, boolean, boolean):void");
    }
}

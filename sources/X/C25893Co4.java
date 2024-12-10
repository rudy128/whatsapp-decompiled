package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.Alignment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel;

/* renamed from: X.Co4  reason: case insensitive filesystem */
public abstract class C25893Co4 {
    public static final void A00(C17130tn r19, C17090tj r20, UsernameNavigationViewModel usernameNavigationViewModel, UsernameSettingsViewModel usernameSettingsViewModel, int i, int i2) {
        C17090tj r5 = r20;
        UsernameSettingsViewModel usernameSettingsViewModel2 = usernameSettingsViewModel;
        C18070vi.A0d(usernameSettingsViewModel2, 1);
        UsernameNavigationViewModel usernameNavigationViewModel2 = usernameNavigationViewModel;
        C18070vi.A0d(usernameNavigationViewModel2, 2);
        C17130tn r8 = r19;
        r8.COC(-161652819);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r8, r5) | i;
            } else {
                i6 = i5;
            }
        }
        if ((i2 & 2) != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0b(r8, usernameSettingsViewModel2);
        }
        if ((i2 & 4) != 0) {
            i6 |= 384;
        } else if ((i5 & 384) == 0) {
            i6 |= AnonymousClass001.A0c(r8, usernameNavigationViewModel2);
        }
        if ((i6 & 147) != 146 || !r8.BZO()) {
            if (i4 != 0) {
                r5 = C17090tj.A00;
            }
            C17330uU A01 = C25298Cd2.A01(r8, (AnonymousClass1G1) usernameSettingsViewModel2.A03.getValue());
            C24633CCt.A00(r8, (C17090tj) null, AnonymousClass0LC.A00(r8, new C27145DWg(A01, usernameNavigationViewModel2, 1), 69622811), (AnonymousClass1OS) null, (AnonymousClass1OS) null, (AnonymousClass1OS) null, AnonymousClass0LC.A00(r8, new C27152DWn(r5, A01, usernameNavigationViewModel2, 1), 1993166821), 0, 100663344, 253, 0, 0);
        } else {
            r8.CNR();
        }
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A06 = new C27150DWl((Object) r5, (Object) usernameNavigationViewModel2, (Object) usernameSettingsViewModel2, i5, i3, 1);
        }
    }

    public static final void A02(C17130tn r26, C17090tj r27, C18090vk r28, C18090vk r29, int i, int i2) {
        C18090vk r11 = r29;
        C18090vk r12 = r28;
        C17090tj r13 = r27;
        C17130tn r14 = r26;
        r14.COC(1677534295);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r14, r13) | i;
            } else {
                i6 = i5;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0b(r14, r12);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i6 |= 384;
        } else if ((i5 & 384) == 0) {
            i6 |= AnonymousClass001.A0c(r14, r11);
        }
        if ((i6 & 147) != 146 || !r14.BZO()) {
            if (i4 != 0) {
                r13 = C17090tj.A00;
            }
            if (i7 != 0) {
                r12 = new DWU(14);
            }
            if (i8 != 0) {
                r11 = new DWU(15);
            }
            C17090tj A01 = C03880Kz.A01(C03880Kz.A00(r14), r13.CP5(C05130Qo.A00));
            C16870tM A0R = BEA.A0R(r14, AnonymousClass0MX.A00);
            AnonymousClass0VR r3 = (AnonymousClass0VR) r14;
            int i9 = r3.A01;
            C17350uW BPs = r14.BPs();
            C18090vk r1 = C05030Qc.A00;
            AnonymousClass04D A012 = AnonymousClass0LO.A01(A01);
            BEA.A19(r14, r3, r1);
            BE9.A18(r14, A0R, BPs);
            AnonymousClass1OS r2 = C05030Qc.A01;
            if (r3.A0K || !BE9.A1R(r14, i9)) {
                BE9.A19(r14, r2, i9);
            }
            BEB.A0r(r14, A012);
            AnonymousClass0WC r22 = C17090tj.A00;
            AnonymousClass07W r15 = CG8.A00;
            r14.BFh(r15);
            C02230Df.A00(r14, (Alignment) null, AnonymousClass0Q7.A04(r22, 32.0f), (AnonymousClass0HD) null, AnonymousClass0LS.A00(r14, 2131233508), (C17050tf) null, AnonymousClass0LT.A00(r14, 2131897687), 0.0f, 0, 120);
            r14.BFh(r15);
            long A00 = C26018CqZ.A00(r14, AnonymousClass0Q7.A05(r22, 24.0f, 0.0f), AnonymousClass0LT.A00(r14, 2131897701));
            String A002 = AnonymousClass0LT.A00(r14, 2131897700);
            r14.BFh(r15);
            r14.BFh(r15);
            C25348Ce7.A01(r14, AnonymousClass0Q7.A05(r22, 24.0f, 16.0f), C26251Cvq.A01(BE7.A0S(r14).A02, 3, 16744447, A00), (C26251Cvq) null, A002, r11, (i6 >> 3) & 112, 112, A00, A00);
            C02280Dk.A00(r14, new LayoutWeightElement());
            String A003 = AnonymousClass0LT.A00(r14, 2131897696);
            r14.BFh(r15);
            C25889Co0.A01(r14, AnonymousClass0Q7.A04(r22, 16.0f).CP5(C05130Qo.A01), (C04640Oe) null, (C24263ByM) null, (C24264ByN) null, (C24290Byn) null, A003, r12, i6 & 112, 248, false);
            BEA.A18(r14, r3);
        } else {
            r14.CNR();
        }
        C05660Vf BKF = r14.BKF();
        if (BKF != null) {
            BKF.A06 = new C27150DWl((Object) r13, (Object) r11, (Object) r12, i5, i3, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17130tn r33, X.C17090tj r34, X.C82804Cd r35, java.lang.String r36, java.lang.String r37, X.C18090vk r38, X.C18090vk r39, X.C18090vk r40, int r41, int r42) {
        /*
            r7 = r40
            r8 = r39
            r13 = r38
            r18 = r37
            r20 = r35
            r19 = r36
            r14 = r34
            r0 = -1253910087(0xffffffffb542d9b9, float:-7.258746E-7)
            r1 = r33
            r1.COC(r0)
            r32 = r42
            r16 = r42 & 1
            r4 = 1
            r2 = r41
            r0 = r41 | 6
            if (r16 != 0) goto L_0x002b
            r0 = r41 & 6
            if (r0 != 0) goto L_0x0282
            int r0 = X.AnonymousClass001.A0Q(r1, r14)
            r0 = r0 | r41
        L_0x002b:
            r15 = r42 & 2
            if (r15 == 0) goto L_0x0275
            r0 = r0 | 48
        L_0x0031:
            r12 = r42 & 4
            if (r12 == 0) goto L_0x0268
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0037:
            r11 = r42 & 8
            if (r11 == 0) goto L_0x025b
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003d:
            r10 = r42 & 16
            if (r10 == 0) goto L_0x024c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0043:
            r9 = r42 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x0241
            r0 = r0 | r17
        L_0x004b:
            r6 = r42 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            if (r6 != 0) goto L_0x005f
            r3 = r41 & r5
            if (r3 != 0) goto L_0x0060
            boolean r3 = r1.BEh(r7)
            r5 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x005f
            r5 = 1048576(0x100000, float:1.469368E-39)
        L_0x005f:
            r0 = r0 | r5
        L_0x0060:
            r5 = 599187(0x92493, float:8.3964E-40)
            r5 = r5 & r0
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r3) goto L_0x0092
            boolean r3 = r1.BZO()
            if (r3 == 0) goto L_0x0092
            r1.CNR()
        L_0x0072:
            X.0Vf r1 = r1.BKF()
            if (r1 == 0) goto L_0x0091
            X.DXM r0 = new X.DXM
            r23 = r0
            r24 = r14
            r25 = r20
            r26 = r19
            r27 = r18
            r28 = r13
            r29 = r8
            r30 = r7
            r31 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.A06 = r0
        L_0x0091:
            return
        L_0x0092:
            if (r16 == 0) goto L_0x0096
            X.0WC r14 = X.C17090tj.A00
        L_0x0096:
            if (r15 == 0) goto L_0x009a
            java.lang.String r19 = "@CoolUser"
        L_0x009a:
            if (r12 == 0) goto L_0x009e
            X.4Cd r20 = X.C82804Cd.USERNAME
        L_0x009e:
            if (r11 == 0) goto L_0x00a2
            java.lang.String r18 = "314"
        L_0x00a2:
            if (r10 == 0) goto L_0x00ab
            r3 = 16
            X.DWU r13 = new X.DWU
            r13.<init>(r3)
        L_0x00ab:
            if (r9 == 0) goto L_0x00b4
            r3 = 17
            X.DWU r8 = new X.DWU
            r8.<init>(r3)
        L_0x00b4:
            if (r6 == 0) goto L_0x00bd
            r3 = 18
            X.DWU r7 = new X.DWU
            r7.<init>(r3)
        L_0x00bd:
            r9 = 0
            r6 = 0
            X.0Ua r5 = X.C03880Kz.A00(r1)
            int r3 = r20.ordinal()
            if (r3 == r9) goto L_0x023c
            if (r3 != r4) goto L_0x0285
            r11 = 2131897688(0x7f122d58, float:1.9430273E38)
        L_0x00ce:
            r15 = 0
            androidx.compose.foundation.layout.FillElement r3 = X.C05130Qo.A00
            X.0tj r3 = r14.CP5(r3)
            X.0tj r16 = X.C03880Kz.A01(r5, r3)
            X.0s5 r3 = X.AnonymousClass0MX.A00
            X.0tM r12 = X.BEA.A0R(r1, r3)
            r4 = r1
            X.0VR r4 = (X.AnonymousClass0VR) r4
            int r10 = r4.A01
            X.0uW r9 = r1.BPs()
            X.0vk r5 = X.C05030Qc.A00
            X.04D r3 = X.AnonymousClass0LO.A01(r16)
            X.BEA.A19(r1, r4, r5)
            X.BE9.A18(r1, r12, r9)
            X.1OS r9 = X.C05030Qc.A01
            boolean r5 = r4.A0K
            if (r5 != 0) goto L_0x0100
            boolean r5 = X.BE9.A1R(r1, r10)
            if (r5 != 0) goto L_0x0103
        L_0x0100:
            X.BE9.A19(r1, r9, r10)
        L_0x0103:
            X.BEB.A0r(r1, r3)
            X.0WC r3 = X.C17090tj.A00
            X.07W r5 = X.CG8.A00
            X.0tj r23 = X.BE9.A0P(r1, r5, r3)
            r9 = 2131897687(0x7f122d57, float:1.943027E38)
            java.lang.String r27 = X.AnonymousClass0LT.A00(r1, r9)
            r9 = 2131233508(0x7f080ae4, float:1.8083155E38)
            X.0Oe r25 = X.AnonymousClass0LS.A00(r1, r9)
            r30 = 120(0x78, float:1.68E-43)
            r9 = 0
            r24 = r15
            r26 = r15
            r21 = r1
            r22 = r15
            r28 = r9
            r29 = r6
            X.C02230Df.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.BFh(r5)
            r12 = 2
            r10 = 1103101952(0x41c00000, float:24.0)
            X.0tj r22 = X.AnonymousClass0Q7.A05(r3, r10, r9)
            r10 = 3
            X.CqZ r9 = new X.CqZ
            r9.<init>(r10)
            int r10 = r0 >> 3
            r25 = r10 & 14
            r41 = 0
            r26 = 4
            r23 = r9
            r24 = r19
            r27 = r41
            X.C26231CvN.A05(r21, r22, r23, r24, r25, r26, r27)
            r9 = 2131897698(0x7f122d62, float:1.9430293E38)
            java.lang.String r27 = X.AnonymousClass0LT.A00(r1, r9)
            X.Byn r26 = X.C24290Byn.Borderless
            r1.BFh(r5)
            r10 = 1082130432(0x40800000, float:4.0)
            r9 = 0
            X.0tj r22 = X.AnonymousClass0Q7.A06(r3, r9, r10, r9, r9)
            int r9 = r0 >> 9
            r29 = r9 & 112(0x70, float:1.57E-43)
            r29 = r29 | r17
            r30 = 216(0xd8, float:3.03E-43)
            r25 = r15
            r23 = r15
            r28 = r13
            r31 = r6
            r24 = r15
            X.C25889Co0.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.BFh(r5)
            r9 = 1090519040(0x41000000, float:8.0)
            r5 = 0
            X.0tj r5 = X.AnonymousClass0Q7.A05(r3, r5, r9)
            r16 = 0
            X.C24622CCi.A00(r1, r5, r15, r6, r12)
            r5 = -1690755555(0xffffffff9b391e1d, float:-1.5312571E-22)
            r1.COB(r5)
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r0
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r5) goto L_0x0195
            r16 = 1
        L_0x0195:
            java.lang.Object r10 = r1.CER()
            if (r16 != 0) goto L_0x019f
            java.lang.Object r5 = X.AnonymousClass0MH.A00
            if (r10 != r5) goto L_0x01a9
        L_0x019f:
            r5 = 15
            X.DWX r10 = new X.DWX
            r10.<init>(r8, r5)
            r1.CRH(r10)
        L_0x01a9:
            X.0vk r10 = (X.C18090vk) r10
            X.AnonymousClass0VR.A0R(r4, r6)
            X.1Di r5 = X.AnonymousClass0O1.A00
            X.0ph r9 = new X.0ph
            r9.<init>(r10)
            X.0tj r34 = X.C04470Nn.A01(r3, r5, r9)
            r9 = 2131233235(0x7f0809d3, float:1.8082602E38)
            X.0Oe r35 = X.AnonymousClass0LS.A00(r1, r9)
            r9 = 2131897691(0x7f122d5b, float:1.9430279E38)
            java.lang.String r36 = X.AnonymousClass0LT.A00(r1, r9)
            java.lang.String r37 = X.AnonymousClass0LT.A00(r1, r11)
            r40 = 48
            r38 = r15
            r39 = r6
            X.C24627CCn.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r9 = -1690743309(0xffffffff9b394df3, float:-1.5328028E-22)
            r1.COB(r9)
            r9 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r9
            r9 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = X.AnonymousClass000.A1T(r0, r9)
            java.lang.Object r9 = r1.CER()
            if (r0 != 0) goto L_0x01ed
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r9 != r0) goto L_0x01f7
        L_0x01ed:
            r0 = 16
            X.DWX r9 = new X.DWX
            r9.<init>(r7, r0)
            r1.CRH(r9)
        L_0x01f7:
            X.0vk r9 = (X.C18090vk) r9
            X.AnonymousClass0VR.A0R(r4, r6)
            X.0ph r0 = new X.0ph
            r0.<init>(r9)
            X.0tj r34 = X.C04470Nn.A01(r3, r5, r0)
            r0 = 2131233387(0x7f080a6b, float:1.808291E38)
            X.0Oe r35 = X.AnonymousClass0LS.A00(r1, r0)
            r0 = 2131897694(0x7f122d5e, float:1.9430285E38)
            java.lang.String r36 = X.AnonymousClass0LT.A00(r1, r0)
            r0 = 2131897692(0x7f122d5c, float:1.943028E38)
            java.lang.String r37 = X.AnonymousClass0LT.A00(r1, r0)
            r0 = -1690732120(0xffffffff9b3979a8, float:-1.534215E-22)
            r1.COB(r0)
            r38 = r18
            boolean r0 = X.AnonymousClass1YF.A0T(r18)
            if (r0 == 0) goto L_0x022f
            r0 = 2131897693(0x7f122d5d, float:1.9430283E38)
            java.lang.String r38 = X.AnonymousClass0LT.A00(r1, r0)
        L_0x022f:
            X.AnonymousClass0VR.A0R(r4, r6)
            r40 = 16
            X.C24627CCn.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.BEA.A18(r1, r4)
            goto L_0x0072
        L_0x023c:
            r11 = 2131897689(0x7f122d59, float:1.9430275E38)
            goto L_0x00ce
        L_0x0241:
            r3 = r41 & r17
            if (r3 != 0) goto L_0x004b
            int r3 = X.AnonymousClass001.A0e(r1, r8)
            r0 = r0 | r3
            goto L_0x004b
        L_0x024c:
            r3 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0043
            boolean r3 = r1.BEh(r13)
            int r3 = X.AnonymousClass000.A08(r3)
            r0 = r0 | r3
            goto L_0x0043
        L_0x025b:
            r3 = r2 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x003d
            r3 = r18
            int r3 = X.AnonymousClass001.A0T(r1, r3)
            r0 = r0 | r3
            goto L_0x003d
        L_0x0268:
            r3 = r2 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0037
            r3 = r20
            int r3 = X.AnonymousClass001.A0S(r1, r3)
            r0 = r0 | r3
            goto L_0x0037
        L_0x0275:
            r3 = r41 & 48
            if (r3 != 0) goto L_0x0031
            r3 = r19
            int r3 = X.AnonymousClass001.A0R(r1, r3)
            r0 = r0 | r3
            goto L_0x0031
        L_0x0282:
            r0 = r2
            goto L_0x002b
        L_0x0285:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25893Co4.A01(X.0tn, X.0tj, X.4Cd, java.lang.String, java.lang.String, X.0vk, X.0vk, X.0vk, int, int):void");
    }
}

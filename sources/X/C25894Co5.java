package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.Alignment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;

/* renamed from: X.Co5  reason: case insensitive filesystem */
public abstract class C25894Co5 {
    public static final void A00(C17130tn r18, C17090tj r19, UsernameNavigationViewModel usernameNavigationViewModel, UsernamePinSetViewModel usernamePinSetViewModel, int i, int i2) {
        C17090tj r4 = r19;
        UsernamePinSetViewModel usernamePinSetViewModel2 = usernamePinSetViewModel;
        C18070vi.A0d(usernamePinSetViewModel2, 0);
        UsernameNavigationViewModel usernameNavigationViewModel2 = usernameNavigationViewModel;
        C18070vi.A0d(usernameNavigationViewModel2, 1);
        C17130tn r7 = r18;
        r7.COC(-311180869);
        int i3 = i2;
        int i4 = i;
        int i5 = i | 6;
        if ((i2 & 1) == 0) {
            if ((i & 6) == 0) {
                i5 = AnonymousClass001.A0a(r7, usernamePinSetViewModel2) | i;
            } else {
                i5 = i4;
            }
        }
        if ((i2 & 2) != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= AnonymousClass001.A0b(r7, usernameNavigationViewModel2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i4 & 384) == 0) {
            i5 |= AnonymousClass001.A0S(r7, r4);
        }
        if ((i5 & 147) != 146 || !r7.BZO()) {
            if (i6 != 0) {
                r4 = C17090tj.A00;
            }
            C24633CCt.A00(r7, (C17090tj) null, AnonymousClass0LC.A00(r7, new C27143DWe(usernameNavigationViewModel2, 4), -1133717719), (AnonymousClass1OS) null, (AnonymousClass1OS) null, (AnonymousClass1OS) null, AnonymousClass0LC.A00(r7, new C27152DWn(r4, C25298Cd2.A01(r7, (AnonymousClass1G1) usernamePinSetViewModel2.A05.getValue()), usernameNavigationViewModel2, 2), -679422477), 0, 100663344, 253, 0, 0);
        } else {
            r7.CNR();
        }
        C05660Vf BKF = r7.BKF();
        if (BKF != null) {
            BKF.A06 = new C27150DWl(r4, usernameNavigationViewModel2, usernamePinSetViewModel2, i4, i3, 2);
        }
    }

    public static final void A01(C17130tn r23, C17090tj r24, String str, C18090vk r26, C18090vk r27, C18090vk r28, int i, int i2) {
        C18090vk r8 = r28;
        C18090vk r9 = r27;
        C18090vk r13 = r26;
        String str2 = str;
        C17090tj r14 = r24;
        C17130tn r0 = r23;
        r0.COC(1238008909);
        int i3 = i2 & 1;
        int i4 = i;
        int i5 = i | 6;
        if (i3 == 0) {
            if ((i & 6) == 0) {
                i5 = AnonymousClass001.A0Q(r0, r14) | i;
            } else {
                i5 = i4;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= AnonymousClass001.A0R(r0, str2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i4 & 384) == 0) {
            i5 |= AnonymousClass001.A0c(r0, r13);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i5 |= AnonymousClass001.A0d(r0, r9);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i5 |= AnonymousClass000.A08(r0.BEh(r8) ? 1 : 0);
        }
        if ((i5 & 9363) != 9362 || !r0.BZO()) {
            if (i3 != 0) {
                r14 = C17090tj.A00;
            }
            if (i6 != 0) {
                str2 = "867";
            }
            if (i7 != 0) {
                r13 = new DWU(21);
            }
            if (i8 != 0) {
                r9 = new DWU(22);
            }
            if (i9 != 0) {
                r8 = new DWU(23);
            }
            C17090tj A01 = C03880Kz.A01(C03880Kz.A00(r0), r14.CP5(C05130Qo.A00));
            C16870tM A0R = BEA.A0R(r0, AnonymousClass0MX.A00);
            AnonymousClass0VR r5 = (AnonymousClass0VR) r0;
            int i10 = r5.A01;
            C17350uW BPs = r0.BPs();
            C18090vk r2 = C05030Qc.A00;
            AnonymousClass04D A012 = AnonymousClass0LO.A01(A01);
            BEA.A19(r0, r5, r2);
            BE9.A18(r0, A0R, BPs);
            AnonymousClass1OS r3 = C05030Qc.A01;
            if (r5.A0K || !BE9.A1R(r0, i10)) {
                BE9.A19(r0, r3, i10);
            }
            BEB.A0r(r0, A012);
            AnonymousClass0WC r32 = C17090tj.A00;
            AnonymousClass07W r22 = CG8.A00;
            C17130tn r18 = r0;
            C02230Df.A00(r18, (Alignment) null, BE9.A0P(r0, r22, r32), (AnonymousClass0HD) null, AnonymousClass0LS.A00(r0, 2131233509), (C17050tf) null, AnonymousClass0LT.A00(r0, 2131897694), 0.0f, 0, 120);
            r0.BFh(r22);
            C26231CvN.A05(r18, AnonymousClass0Q7.A05(r32, 24.0f, 0.0f), (C26018CqZ) null, str2, (i5 >> 3) & 14, 12, 0);
            String A00 = AnonymousClass0LT.A00(r0, 2131897713);
            r0.BFh(r22);
            r0.BFh(r22);
            C25348Ce7.A01(r18, AnonymousClass0Q7.A05(r32, 24.0f, 16.0f), C26251Cvq.A01(BE7.A0S(r0).A02, 3, 16744447, 0), (C26251Cvq) null, A00, r8, (i5 >> 9) & 112, 112, 0, 0);
            r0.BFh(r22);
            C24622CCi.A00(r0, AnonymousClass0Q7.A05(r32, 0.0f, 8.0f), (C24323BzK) null, 0, 2);
            C24626CCm.A00(r18, (C17090tj) null, AnonymousClass0LS.A00(r0, 2131233389), AnonymousClass0LT.A00(r0, 2131897709), r13, (i5 << 9) & 458752, 26, 0, 0);
            C04640Oe A002 = AnonymousClass0LS.A00(r0, 2131233231);
            AnonymousClass07W r33 = CG7.A00;
            int i11 = (i5 << 6) & 458752;
            C18090vk r222 = r9;
            C24626CCm.A00(r18, (C17090tj) null, A002, AnonymousClass0LT.A00(r0, 2131897714), r222, i11, 2, C26257Cw2.A07(r0, r33), C26257Cw2.A07(r0, r33));
            BEA.A18(r0, r5);
        } else {
            r0.CNR();
        }
        C05660Vf BKF = r0.BKF();
        if (BKF != null) {
            BKF.A06 = new DXC(r14, str2, r13, r9, r8, i4, i2);
        }
    }

    public static final void A02(C17130tn r26, C17090tj r27, C18090vk r28, C18090vk r29, int i, int i2) {
        C18090vk r11 = r29;
        C18090vk r12 = r28;
        C17090tj r13 = r27;
        C17130tn r14 = r26;
        r14.COC(-1162087767);
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
                r12 = new DWU(19);
            }
            if (i8 != 0) {
                r11 = new DWU(20);
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
            C02230Df.A00(r14, (Alignment) null, AnonymousClass0Q7.A04(r22, 32.0f), (AnonymousClass0HD) null, AnonymousClass0LS.A00(r14, 2131233509), (C17050tf) null, AnonymousClass0LT.A00(r14, 2131897694), 0.0f, 0, 120);
            r14.BFh(r15);
            long A00 = C26018CqZ.A00(r14, AnonymousClass0Q7.A05(r22, 24.0f, 0.0f), AnonymousClass0LT.A00(r14, 2131897712));
            String A002 = AnonymousClass0LT.A00(r14, 2131897711);
            r14.BFh(r15);
            r14.BFh(r15);
            C25348Ce7.A01(r14, AnonymousClass0Q7.A05(r22, 24.0f, 16.0f), C26251Cvq.A01(BE7.A0S(r14).A02, 3, 16744447, A00), (C26251Cvq) null, A002, r11, (i6 >> 3) & 112, 112, A00, A00);
            C02280Dk.A00(r14, new LayoutWeightElement());
            String A003 = AnonymousClass0LT.A00(r14, 2131897710);
            r14.BFh(r15);
            C25889Co0.A01(r14, AnonymousClass0Q7.A04(r22, 16.0f).CP5(C05130Qo.A01), (C04640Oe) null, (C24263ByM) null, (C24264ByN) null, (C24290Byn) null, A003, r12, i6 & 112, 248, false);
            BEA.A18(r14, r3);
        } else {
            r14.CNR();
        }
        C05660Vf BKF = r14.BKF();
        if (BKF != null) {
            BKF.A06 = new C27150DWl((Object) r13, (Object) r11, (Object) r12, i5, i3, 3);
        }
    }
}

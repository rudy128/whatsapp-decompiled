package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.focus.FocusRequesterElement;
import com.whatsapp.profile.compose.UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel;

/* renamed from: X.CeE  reason: case insensitive filesystem */
public abstract class C25355CeE {
    public static final void A00(C17130tn r47, UsernameNavigationViewModel usernameNavigationViewModel, UsernamePinEntryViewModel usernamePinEntryViewModel, String str, int i) {
        int i2;
        String str2;
        String str3 = str;
        C18070vi.A0d(str3, 0);
        UsernamePinEntryViewModel usernamePinEntryViewModel2 = usernamePinEntryViewModel;
        C18070vi.A0d(usernamePinEntryViewModel2, 1);
        UsernameNavigationViewModel usernameNavigationViewModel2 = usernameNavigationViewModel;
        C18070vi.A0d(usernameNavigationViewModel2, 2);
        C17130tn r0 = r47;
        r0.COC(-40153382);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = AnonymousClass001.A0Z(r0, str3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= AnonymousClass001.A0b(r0, usernamePinEntryViewModel2);
        }
        if ((i3 & 384) == 0) {
            i2 |= AnonymousClass001.A0c(r0, usernameNavigationViewModel2);
        }
        if ((i2 & 147) != 146 || !r0.BZO()) {
            C17330uU A01 = C25298Cd2.A01(r0, (AnonymousClass1G1) usernamePinEntryViewModel2.A04.getValue());
            Object A0u = AnonymousClass000.A0u(r0, 2042738650);
            Object obj = AnonymousClass0MH.A00;
            if (A0u == obj) {
                A0u = new C04310Mr();
                r0.CRH(A0u);
            }
            C04310Mr r6 = (C04310Mr) A0u;
            AnonymousClass0VR r2 = (AnonymousClass0VR) r0;
            AnonymousClass0VR.A0R(r2, false);
            C16750sx r15 = (C16750sx) r0.BFh(AnonymousClass0OD.A08);
            boolean z = ((C139836zW) A01.getValue()).A00;
            boolean z2 = ((C139836zW) A01.getValue()).A01;
            String A00 = AnonymousClass0LT.A00(r0, 2131897704);
            Object A0u2 = AnonymousClass000.A0u(r0, 2042749132);
            if (A0u2 == obj) {
                A0u2 = AnonymousClass0Q9.A02(new C26224CvE("", C26260Cw5.A01));
                r0.CRH(A0u2);
            }
            C17330uU r5 = (C17330uU) A0u2;
            AnonymousClass0VR.A0R(r2, false);
            AnonymousClass0WC r14 = C17090tj.A00;
            FillElement fillElement = C05130Qo.A01;
            AnonymousClass07W r8 = CG8.A00;
            C17090tj A0P = BE9.A0P(r0, r8, fillElement);
            C16870tM A0R = BEA.A0R(r0, AnonymousClass0MX.A00);
            int i4 = r2.A01;
            C17350uW BPs = r0.BPs();
            C18090vk r3 = C05030Qc.A00;
            AnonymousClass04D A012 = AnonymousClass0LO.A01(A0P);
            BEA.A19(r0, r2, r3);
            BE9.A18(r0, A0R, BPs);
            AnonymousClass1OS r4 = C05030Qc.A01;
            if (r2.A0K || !BE9.A1R(r0, i4)) {
                BE9.A19(r0, r4, i4);
            }
            BEB.A0r(r0, A012);
            C17130tn r23 = r0;
            C02230Df.A00(r23, (Alignment) null, (C17090tj) null, (AnonymousClass0HD) null, AnonymousClass0LS.A00(r0, 2131233509), (C17050tf) null, AnonymousClass0LT.A00(r0, 2131897694), 0.0f, 0, 124);
            r0.BFh(r8);
            r0.BFh(r8);
            C26231CvN.A05(r23, AnonymousClass0Q7.A06(r14, 0.0f, 24.0f, 0.0f, 16.0f), (C26018CqZ) null, AnonymousClass0LT.A01(r0, BE7.A1b(str3), 2131897708), 0, 12, 0);
            String A002 = AnonymousClass0LT.A00(r0, 2131897707);
            C26251Cvq A013 = C26251Cvq.A01(BE7.A0S(r0).A02, 3, 16744447, 0);
            boolean A1V = BE7.A1V(r0, usernameNavigationViewModel2, 468938763);
            Object CER = r0.CER();
            if (A1V || CER == obj) {
                CER = BE8.A0s(r0, usernameNavigationViewModel2, 29);
            }
            AnonymousClass0VR.A0R(r2, false);
            C25348Ce7.A01(r23, (C17090tj) null, A013, (C26251Cvq) null, A002, (C18090vk) ((AnonymousClass1JH) CER), 0, 116, 0, 0);
            r0.BFh(r8);
            C17090tj CP5 = AnonymousClass0Q7.A06(fillElement, 0.0f, 24.0f, 0.0f, 0.0f).CP5(new FocusRequesterElement(r6));
            C26224CvE cvE = (C26224CvE) r5.getValue();
            if (z) {
                str2 = A00;
            } else {
                str2 = "";
            }
            String A003 = AnonymousClass0LT.A00(r0, 2131897706);
            String A004 = AnonymousClass0LT.A00(r0, 2131897705);
            C04610Ob r142 = new C04610Ob(7);
            boolean A1V2 = BE7.A1V(r0, usernamePinEntryViewModel2, 468966316) | AnonymousClass000.A1T(i2 & 14, 4);
            Object CER2 = r0.CER();
            if (A1V2 || CER2 == obj) {
                CER2 = new AnonymousClass7S9(r5, usernamePinEntryViewModel2, str3, 1);
                r0.CRH(CER2);
            }
            AnonymousClass0VR.A0R(r2, false);
            AnonymousClass0PT r13 = new AnonymousClass0PT((C22821Di) CER2);
            C27139DWa dWa = new C27139DWa(8);
            Object A0u3 = AnonymousClass000.A0u(r0, 468957648);
            if (A0u3 == obj) {
                A0u3 = new C27140DWb(r5, 5);
                r0.CRH(A0u3);
            }
            AnonymousClass0VR.A0R(r2, false);
            C24624CCk.A00(r13, r142, (AnonymousClass0NY) null, r0, CP5, cvE, A003, str2, A004, dWa, (C22821Di) A0u3, (AnonymousClass1OS) null, AnonymousClass0LC.A00(r0, new C27163DWy(A00, z2, z), -348921078), 0, 0, 905969664, 1769472, 30896, false, false, z, false);
            BEA.A18(r0, r2);
            C27621Wu r42 = C27621Wu.A00;
            r0.COB(2042816857);
            boolean BEf = r0.BEf(r15);
            Object CER3 = r0.CER();
            if (BEf || CER3 == obj) {
                CER3 = new UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1(r6, r15, (C30391dr) null);
                r0.CRH(CER3);
            }
            AnonymousClass0VR.A0R(r2, false);
            AnonymousClass0QC.A04(r0, r42, (AnonymousClass1OS) CER3);
        } else {
            r0.CNR();
        }
        C05660Vf BKF = r0.BKF();
        if (BKF != null) {
            BKF.A06 = new DX1(usernameNavigationViewModel2, usernamePinEntryViewModel2, str3, i3);
        }
    }

    public static final void A01(C17130tn r12, String str, int i, boolean z, boolean z2) {
        int i2;
        String str2 = str;
        C18070vi.A0d(str, 2);
        C17130tn r6 = r12;
        r12.COC(-1192648968);
        if ((i & 6) == 0) {
            i2 = AnonymousClass000.A09(r12.BEg(z) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        boolean z3 = z2;
        if ((i & 48) == 0) {
            i2 |= AnonymousClass000.A0A(r12.BEg(z3) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AnonymousClass001.A0S(r12, str);
        }
        if ((i2 & 147) != 146 || !r12.BZO()) {
            if (z) {
                r12.COB(-591770853);
                C24630CCq.A00(r12, (C17090tj) null, C24265ByO.SMALL, 48, 1);
            } else if (z2) {
                r12.COB(-591668119);
                AnonymousClass0WC r4 = C17090tj.A00;
                long j = CIM.A00;
                C24623CCj.A00(r6, C05130Qo.A08(r4, 24.0f), AnonymousClass0LS.A00(r12, 2131233287), str2, (i2 >> 3) & 112, 0, C26257Cw2.A07(r12, CG7.A00));
            } else {
                r12.COB(-591421142);
            }
            AnonymousClass0VR.A0T(r6);
        } else {
            r12.CNR();
        }
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A06 = new DX0(str2, i, z, z3);
        }
    }
}

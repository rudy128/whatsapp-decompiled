package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Alignment;
import com.whatsapp.contact.picker.invite.compose.perf.render.OnFirstContentDrawModifierElement;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.CCy  reason: case insensitive filesystem */
public abstract class C24638CCy {
    public static final void A00(C17130tn r27, InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, C36711oL r29, C18090vk r30, C18090vk r31, C18090vk r32, C22821Di r33, int i, boolean z) {
        int i2;
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel2 = inviteNonWhatsAppContactPickerViewModel;
        C18090vk r26 = r30;
        C22821Di r23 = r33;
        boolean A1U = AnonymousClass8BX.A1U(inviteNonWhatsAppContactPickerViewModel2, r23, r26);
        C18090vk r25 = r31;
        C18090vk r24 = r32;
        C18070vi.A0g(r25, 3, r24);
        C17130tn r3 = r27;
        r3.COC(-1429825205);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = AnonymousClass000.A09(r3.BEh(inviteNonWhatsAppContactPickerViewModel2) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= AnonymousClass001.A0b(r3, r23);
        }
        if ((i3 & 384) == 0) {
            i2 |= AnonymousClass001.A0c(r3, r26);
        }
        if ((i3 & 3072) == 0) {
            i2 |= AnonymousClass001.A0d(r3, r25);
        }
        C36711oL r272 = r29;
        if ((i3 & 24576) == 0) {
            i2 |= AnonymousClass000.A08(r3.BEh(r272) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            i2 |= AnonymousClass001.A0e(r3, r24);
        }
        boolean z2 = z;
        if ((1572864 & i) == 0) {
            int i4 = 524288;
            if (r3.BEg(z2)) {
                i4 = 1048576;
            }
            i2 |= i4;
        }
        if ((599187 & i2) != 599186 || !r3.BZO()) {
            C23421Fz A01 = C87324Vd.A01(inviteNonWhatsAppContactPickerViewModel2.A08);
            r3.COB(-1485997211);
            C17130tn r9 = r3;
            C17330uU A00 = C25298Cd2.A00(r9, C23401Fx.STARTED, ((AnonymousClass1F9) r3.BFh(AnonymousClass0PK.A03)).getLifecycle(), 0, AnonymousClass1OR.A00, A01);
            AnonymousClass0VR r4 = (AnonymousClass0VR) r3;
            AnonymousClass0VR.A0R(r4, false);
            FillElement fillElement = C05130Qo.A00;
            r3.COB(181873309);
            boolean A1T = AnonymousClass000.A1T(i2 & 458752, A7Y.A0F);
            Object CER = r3.CER();
            if (A1T || CER == AnonymousClass0MH.A00) {
                CER = new C27713Djv(r24);
                r3.CRH(CER);
            }
            C18090vk r7 = (C18090vk) CER;
            AnonymousClass0VR.A0R(r4, false);
            int A0G = C72453Mb.A0G(fillElement, r7, 0);
            C17090tj CP5 = fillElement.CP5(new OnFirstContentDrawModifierElement(r7));
            r3.COB(733328855);
            C16870tM A002 = C04870Pg.A00(r3, AnonymousClass0MX.A08, false);
            r3.COB(-1323940314);
            int i5 = r4.A01;
            C17350uW BPs = r3.BPs();
            C18090vk r12 = C05030Qc.A00;
            AnonymousClass04D A012 = AnonymousClass0LO.A01(CP5);
            int i6 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            BEA.A19(r3, r4, r12);
            AnonymousClass1OS r11 = C05030Qc.A02;
            AnonymousClass0EM.A00(r3, A002, r11);
            AnonymousClass1OS r10 = C05030Qc.A03;
            AnonymousClass0EM.A00(r3, BPs, r10);
            AnonymousClass1OS r92 = C05030Qc.A01;
            if (r4.A0K || !BE9.A1R(r3, i5)) {
                BE9.A19(r3, r92, i5);
            }
            A012.invoke(new AnonymousClass0OT(r3), r3, Integer.valueOf((i6 >> 3) & 112));
            r3.COB(2058660585);
            int A0M = AnonymousClass000.A0M(A00.getValue());
            if (A0M == 0) {
                r3.COB(-563158099);
                Alignment alignment = AnonymousClass0MX.A05;
                r3.COB(733328855);
                C16870tM A003 = C04870Pg.A00(r3, alignment, false);
                r3.COB(-1323940314);
                int i7 = r4.A01;
                C17350uW BPs2 = r3.BPs();
                AnonymousClass04D A013 = AnonymousClass0LO.A01(fillElement);
                int i8 = ((((54 << 3) & 112) << 9) & 7168) | 6;
                BEA.A19(r3, r4, r12);
                AnonymousClass0EM.A00(r3, A003, r11);
                AnonymousClass0EM.A00(r3, BPs2, r10);
                if (r4.A0K || !BE9.A1R(r3, i7)) {
                    BE9.A19(r3, r92, i7);
                }
                A013.invoke(new AnonymousClass0OT(r3), r3, Integer.valueOf((i8 >> 3) & 112));
                r3.COB(2058660585);
                C24630CCq.A00(r3, (C17090tj) null, (C24265ByO) null, 0, 3);
                BEA.A18(r3, r4);
            } else if (A0M == A1U) {
                r3.COB(-562955545);
                boolean z3 = true;
                if (!C18070vi.A19(inviteNonWhatsAppContactPickerViewModel2.A04.A06(), A1U)) {
                    if (!C18020vd.A05(C18040vf.A02, inviteNonWhatsAppContactPickerViewModel2.A0J, 5868)) {
                        z3 = false;
                    }
                }
                int i9 = i2 >> 3;
                C24639CCz.A00(r3, (C17090tj) null, r26, r25, (i9 & 112) | (i9 & 896) | ((i2 >> 6) & 57344), 8, z3, z2);
            } else if (A0M == A0G) {
                r3.COB(-562622822);
                CD0.A00(r3, (C17090tj) null, inviteNonWhatsAppContactPickerViewModel2, r272, r26, r23, (i2 & 14) | (i2 & 112) | (i2 & 896) | ((i2 >> 6) & 57344) | ((i2 << 3) & 458752), 8, z2);
            } else if (A0M != 3) {
                r3.COB(-562137858);
            } else {
                r3.COB(-562276428);
                String str = inviteNonWhatsAppContactPickerViewModel2.A00;
                if (str == null) {
                    str = "";
                }
                C24637CCx.A00(r3, (C17090tj) null, str, r26, (i2 >> 3) & 112, 4);
            }
            AnonymousClass0VR.A0R(r4, false);
            BEA.A18(r3, r4);
        } else {
            r3.CNR();
        }
        C05660Vf BKF = r3.BKF();
        if (BKF != null) {
            BKF.A06 = new C28195DtD(inviteNonWhatsAppContactPickerViewModel2, r272, r26, r25, r24, r23, i3, z2);
        }
    }
}

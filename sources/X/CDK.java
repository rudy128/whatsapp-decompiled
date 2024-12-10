package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

public abstract class CDK {
    public static final void A00(C17130tn r19, C17090tj r20, UsernameNavigationViewModel usernameNavigationViewModel, UsernameSetViewModel usernameSetViewModel, int i, int i2) {
        int i3;
        C17090tj r3 = r20;
        UsernameSetViewModel usernameSetViewModel2 = usernameSetViewModel;
        C18070vi.A0d(usernameSetViewModel2, 1);
        UsernameNavigationViewModel usernameNavigationViewModel2 = usernameNavigationViewModel;
        C18070vi.A0d(usernameNavigationViewModel2, 2);
        C17130tn r8 = r19;
        r8.COC(-129649889);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        int i7 = i | 6;
        if (i5 == 0) {
            if ((i & 6) == 0) {
                i7 = AnonymousClass001.A0Q(r8, r3) | i;
            } else {
                i7 = i6;
            }
        }
        if ((i2 & 2) != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            i7 |= AnonymousClass001.A0b(r8, usernameSetViewModel2);
        }
        if ((i2 & 4) != 0) {
            i7 |= 384;
        } else if ((i6 & 384) == 0) {
            i7 |= AnonymousClass001.A0c(r8, usernameNavigationViewModel2);
        }
        if ((i7 & 147) != 146 || !r8.BZO()) {
            if (i5 != 0) {
                r3 = C17090tj.A00;
            }
            C05400Ua A00 = C03880Kz.A00(r8);
            C17330uU A01 = C25298Cd2.A01(r8, (AnonymousClass1G1) usernameSetViewModel2.A0C.getValue());
            Object A0u = AnonymousClass000.A0u(r8, 1022743298);
            if (A0u == AnonymousClass0MH.A00) {
                A0u = Boolean.valueOf(AnonymousClass000.A1R(((C25796Cm8) A01.getValue()).A03.length()));
                r8.CRH(A0u);
            }
            boolean A1Y = AnonymousClass000.A1Y(A0u);
            AnonymousClass0VR r6 = (AnonymousClass0VR) r8;
            AnonymousClass0VR.A0R(r6, false);
            if (A1Y) {
                r8.COB(1640382055);
                i3 = 2131897695;
            } else {
                r8.COB(1640470343);
                i3 = 2131897696;
            }
            String A002 = AnonymousClass0LT.A00(r8, i3);
            AnonymousClass0VR.A0R(r6, false);
            C24633CCt.A00(r8, (C17090tj) null, AnonymousClass0LC.A00(r8, new C27146DWh(usernameNavigationViewModel2, A002, 1), 701149837), (AnonymousClass1OS) null, (AnonymousClass1OS) null, (AnonymousClass1OS) null, AnonymousClass0LC.A00(r8, new C27153DWo(A00, A01, r3, usernameSetViewModel2, 1), -172626089), 0, 100663344, 253, 0, 0);
        } else {
            r8.CNR();
        }
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A06 = new C27150DWl((Object) r3, (Object) usernameNavigationViewModel2, (Object) usernameSetViewModel2, i6, i4, 5);
        }
    }
}

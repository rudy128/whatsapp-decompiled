package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameShareViewModel;

public abstract class CDL {
    public static final void A00(C17130tn r18, C17090tj r19, UsernameNavigationViewModel usernameNavigationViewModel, UsernameShareViewModel usernameShareViewModel, int i, int i2) {
        C17090tj r3 = r19;
        UsernameShareViewModel usernameShareViewModel2 = usernameShareViewModel;
        C18070vi.A0d(usernameShareViewModel2, 1);
        UsernameNavigationViewModel usernameNavigationViewModel2 = usernameNavigationViewModel;
        C18070vi.A0d(usernameNavigationViewModel2, 2);
        C17130tn r7 = r18;
        r7.COC(-1291411614);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r7, r3) | i;
            } else {
                i6 = i5;
            }
        }
        if ((i2 & 2) != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0b(r7, usernameShareViewModel2);
        }
        if ((i2 & 4) != 0) {
            i6 |= 384;
        } else if ((i5 & 384) == 0) {
            i6 |= AnonymousClass001.A0c(r7, usernameNavigationViewModel2);
        }
        if ((i6 & 147) != 146 || !r7.BZO()) {
            if (i4 != 0) {
                r3 = C17090tj.A00;
            }
            C24633CCt.A00(r7, (C17090tj) null, AnonymousClass0LC.A00(r7, new C27143DWe(usernameNavigationViewModel2, 5), -1048718256), (AnonymousClass1OS) null, (AnonymousClass1OS) null, (AnonymousClass1OS) null, AnonymousClass0LC.A00(r7, new C27153DWo(C03880Kz.A00(r7), C25298Cd2.A01(r7, (AnonymousClass1G1) usernameShareViewModel2.A05.getValue()), r3, usernameShareViewModel2, 2), 1689702810), 0, 100663344, 253, 0, 0);
        } else {
            r7.CNR();
        }
        C05660Vf BKF = r7.BKF();
        if (BKF != null) {
            BKF.A06 = new C27150DWl((Object) r3, (Object) usernameNavigationViewModel2, (Object) usernameShareViewModel2, i5, i3, 6);
        }
    }
}

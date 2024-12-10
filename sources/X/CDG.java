package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel;

public abstract class CDG {
    public static final void A00(C17130tn r17, UsernameNavigationViewModel usernameNavigationViewModel, UsernameStartConversationWithSettingsViewModel usernameStartConversationWithSettingsViewModel, int i) {
        int i2;
        UsernameStartConversationWithSettingsViewModel usernameStartConversationWithSettingsViewModel2 = usernameStartConversationWithSettingsViewModel;
        C18070vi.A0d(usernameStartConversationWithSettingsViewModel2, 0);
        UsernameNavigationViewModel usernameNavigationViewModel2 = usernameNavigationViewModel;
        C18070vi.A0d(usernameNavigationViewModel2, 1);
        C17130tn r7 = r17;
        r7.COC(1840016758);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = AnonymousClass000.A09(r7.BEh(usernameStartConversationWithSettingsViewModel2) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= AnonymousClass001.A0b(r7, usernameNavigationViewModel2);
        }
        if ((i2 & 19) != 18 || !r7.BZO()) {
            C17330uU A01 = C25298Cd2.A01(r7, (AnonymousClass1G1) usernameStartConversationWithSettingsViewModel2.A04.getValue());
            C24633CCt.A00(r7, (C17090tj) null, AnonymousClass0LC.A00(r7, new C27143DWe(usernameNavigationViewModel2, 2), -1046923576), (AnonymousClass1OS) null, (AnonymousClass1OS) null, (AnonymousClass1OS) null, AnonymousClass0LC.A00(r7, new C27152DWn(C03880Kz.A00(r7), A01, usernameStartConversationWithSettingsViewModel2, 0), 502096958), 0, 100663344, 253, 0, 0);
        } else {
            r7.CNR();
        }
        C05660Vf BKF = r7.BKF();
        if (BKF != null) {
            BKF.A06 = new C27162DWx(usernameNavigationViewModel2, usernameStartConversationWithSettingsViewModel2, i3);
        }
    }
}

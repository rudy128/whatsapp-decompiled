package X;

import com.whatsapp.bridge.wfs.ui.LinkedUsersActivity;
import com.whatsapp.registration.EULA;
import com.whatsapp.settings.SettingsTabActivity;

/* renamed from: X.4m0  reason: invalid class name and case insensitive filesystem */
public class C95294m0 implements AnonymousClass11V {
    public final int A00;
    public final Object A01;

    public C95294m0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BxE() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((C166668dO) obj).A04 = true;
                return;
            case 1:
                ((LinkedUsersActivity) obj).A06 = true;
                return;
            case 2:
                ((EULA) obj).A0q = true;
                return;
            default:
                SettingsTabActivity settingsTabActivity = (SettingsTabActivity) obj;
                settingsTabActivity.A1H = true;
                C59932n7 r2 = (C59932n7) settingsTabActivity.A0j.get();
                r2.A01 = false;
                r2.A00 = null;
                r2.A04.A1r((String) null, (String) null);
                return;
        }
    }
}

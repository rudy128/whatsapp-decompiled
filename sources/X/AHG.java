package X;

import androidx.preference.Preference;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.settings.SettingsJidNotificationFragment;

public class AHG implements B6V {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AHG(WaRingtonePreference waRingtonePreference, SettingsJidNotificationFragment settingsJidNotificationFragment, int i) {
        this.A00 = i;
        this.A01 = settingsJidNotificationFragment;
        this.A02 = waRingtonePreference;
    }

    public final boolean C1R(Preference preference, Object obj) {
        int i = this.A00;
        SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) this.A01;
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) this.A02;
        String obj2 = obj.toString();
        waRingtonePreference.A01 = obj2;
        waRingtonePreference.A0H(C217217d.A06(preference.A05, obj2));
        AnonymousClass1Nb r1 = settingsJidNotificationFragment.A06;
        AnonymousClass1BI r0 = settingsJidNotificationFragment.A05;
        if (i != 0) {
            r1.A0k(r0, obj2);
            return true;
        }
        r1.A0m(r0, obj2);
        return true;
    }
}

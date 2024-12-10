package X;

import com.whatsapp.settings.SettingsNetworkUsage;
import java.util.TimerTask;

/* renamed from: X.4tT  reason: invalid class name and case insensitive filesystem */
public class C99794tT extends TimerTask {
    public final /* synthetic */ SettingsNetworkUsage A00;

    public C99794tT(SettingsNetworkUsage settingsNetworkUsage) {
        this.A00 = settingsNetworkUsage;
    }

    public void run() {
        SettingsNetworkUsage settingsNetworkUsage = this.A00;
        settingsNetworkUsage.A00.post(new C98844ro((Object) settingsNetworkUsage, 6));
    }
}

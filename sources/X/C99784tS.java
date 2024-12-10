package X;

import com.whatsapp.settings.SettingsDataUsageActivity;
import java.util.TimerTask;

/* renamed from: X.4tS  reason: invalid class name and case insensitive filesystem */
public class C99784tS extends TimerTask {
    public final /* synthetic */ SettingsDataUsageActivity A00;

    public C99784tS(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A00 = settingsDataUsageActivity;
    }

    public void run() {
        SettingsDataUsageActivity settingsDataUsageActivity = this.A00;
        settingsDataUsageActivity.A04.post(new C98844ro((Object) settingsDataUsageActivity, 4));
    }
}

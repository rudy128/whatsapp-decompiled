package X;

import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.49X  reason: invalid class name */
public class AnonymousClass49X extends A34 {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final /* synthetic */ SettingsDataUsageActivity A01;

    public AnonymousClass49X(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A01 = settingsDataUsageActivity;
    }

    public void A0F() {
        Log.i("settings-data-usage-activity/load storage size task/started");
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        if (settingsDataUsageActivity.A03 == -1) {
            settingsDataUsageActivity.A0B.setText(2131887610);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Log.i("settings-data-usage-activity/load storage size task/background");
        if (this.A00.get()) {
            return null;
        }
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        return Long.valueOf(C31141f5.A00(settingsDataUsageActivity.A04, settingsDataUsageActivity.A0N));
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Number number = (Number) obj;
        Log.i("settings-data-usage-activity/load storage size task/fetch completed");
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
            long longValue = number.longValue();
            settingsDataUsageActivity.A03 = longValue;
            settingsDataUsageActivity.A0B.setText(C88584aA.A04(settingsDataUsageActivity.A00, longValue));
        }
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;

public class AHJ implements B6W {
    public final int A00;
    public final Object A01;

    public AHJ(SettingsChatHistoryFragment settingsChatHistoryFragment, int i) {
        this.A00 = i;
        this.A01 = settingsChatHistoryFragment;
    }

    public final void C1S() {
        C166668dO r1;
        int i;
        switch (this.A00) {
            case 0:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A01;
                if (settingsChatHistoryFragment.A07.A02()) {
                    settingsChatHistoryFragment.A0D.get();
                    int i2 = 2131892427;
                    if (AnonymousClass11Z.A00()) {
                        i2 = 2131892426;
                    }
                    C166668dO r0 = settingsChatHistoryFragment.A00;
                    if (r0 != null) {
                        r0.BhQ(i2);
                        return;
                    }
                    return;
                }
                Context A1n = settingsChatHistoryFragment.A1n();
                C18070vi.A0d(A1n, 1);
                Intent A0B = C72483Me.A0B(A1n, "com.whatsapp.contact.picker.ContactPicker", 1);
                A0B.putExtra("email_history", true);
                settingsChatHistoryFragment.startActivityForResult(A0B, 10);
                return;
            case 1:
                r1 = ((WaPreferenceFragment) this.A01).A00;
                i = 4;
                break;
            case 2:
                r1 = ((WaPreferenceFragment) this.A01).A00;
                i = 3;
                break;
            default:
                r1 = ((WaPreferenceFragment) this.A01).A00;
                i = 5;
                break;
        }
        AnonymousClass4Yv.A01(r1, i);
    }
}

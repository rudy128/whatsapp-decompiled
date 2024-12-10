package X;

import com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4h7  reason: invalid class name and case insensitive filesystem */
public final class C92324h7 implements C108195bI {
    public final /* synthetic */ SettingsPrivacyCameraEffectsViewModel A00;

    public C92324h7(SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel) {
        this.A00 = settingsPrivacyCameraEffectsViewModel;
    }

    public void Bsl() {
        Log.e("SettingsPrivacyCameraEffectsViewModel/onPreferenceClicked/onError");
        AnonymousClass3MY.A1Y(this.A00.A04, true);
    }

    public void Bzd() {
        Log.i("SettingsPrivacyCameraEffectsViewModel/onPreferenceClicked/onOptIn");
    }

    public void onDismiss() {
        Log.i("SettingsPrivacyCameraEffectsViewModel/onPreferenceClicked/onDismiss");
    }
}

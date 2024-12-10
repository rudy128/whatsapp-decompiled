package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.settings.SettingsRowPrivacyLinearLayout;

/* renamed from: X.3OR  reason: invalid class name */
public class AnonymousClass3OR extends Animation {
    public final /* synthetic */ SettingsRowPrivacyLinearLayout A00;

    public AnonymousClass3OR(SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout) {
        this.A00 = settingsRowPrivacyLinearLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A00;
        settingsRowPrivacyLinearLayout.A00 = 1.0f - f;
        settingsRowPrivacyLinearLayout.invalidate();
    }
}

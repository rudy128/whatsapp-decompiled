package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.profile.SettingsRowPhotoOrInitialText;
import com.whatsapp.settings.SettingsRowIconText;
import com.whatsapp.settings.SettingsRowNoticeView;

/* renamed from: X.3Qc  reason: invalid class name and case insensitive filesystem */
public abstract class C73153Qc extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A00() {
        if (this instanceof SettingsRowNoticeView) {
            SettingsRowNoticeView settingsRowNoticeView = (SettingsRowNoticeView) this;
            if (!settingsRowNoticeView.A01) {
                settingsRowNoticeView.A01 = true;
                settingsRowNoticeView.A04 = C72473Md.A0S(AnonymousClass3MX.A0T(settingsRowNoticeView));
            }
        } else if (this instanceof SettingsRowPhotoOrInitialText) {
            SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) this;
            if (!settingsRowPhotoOrInitialText.A00) {
                settingsRowPhotoOrInitialText.A00 = true;
                settingsRowPhotoOrInitialText.A04 = C72473Md.A0S(AnonymousClass3MX.A0T(settingsRowPhotoOrInitialText));
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((SettingsRowIconText) this).A04 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C73153Qc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}

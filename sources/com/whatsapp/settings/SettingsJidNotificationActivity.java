package com.whatsapp.settings;

import X.AGE;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1CM;
import X.AnonymousClass1L7;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8dN;
import X.C000200d;
import X.C137116uw;
import X.C18020vd;
import X.C18040vf;
import X.C30361do;
import X.C34001jj;
import android.os.Bundle;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment;
import com.whatsapp.settings.notificationsandsounds.Hilt_AdvancedNotificationSettingsFragment;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

public class SettingsJidNotificationActivity extends AnonymousClass8dN {
    public AnonymousClass00H A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A01 = AnonymousClass10E.A12(r1);
            this.A02 = AnonymousClass3MY.A0Z(r1);
            this.A00 = (AnonymousClass1L7) r1.A3t.get();
            this.A04 = C000200d.A00(r1.A0J);
            this.A01 = AnonymousClass3Ma.A0a(r1);
            this.A03 = (AnonymousClass1CM) r1.A9V.get();
            this.A00 = AnonymousClass8BT.A0h(r1);
        }
    }

    public void A3K() {
        int i;
        C30361do A0u = AnonymousClass3MX.A0u(this.A00);
        WaPreferenceFragment waPreferenceFragment = this.A0A;
        if (waPreferenceFragment instanceof AdvancedNotificationSettingsFragment) {
            i = 95;
        } else {
            boolean z = waPreferenceFragment instanceof NotificationsAndSoundsFragment;
            i = 94;
            if (z) {
                i = 93;
            }
        }
        A0u.A02((AnonymousClass1BI) null, i);
    }

    public SettingsJidNotificationActivity(int i) {
        this.A01 = false;
        AGE.A00(this, 35);
    }

    public void onCreate(Bundle bundle) {
        WaPreferenceFragment hilt_SettingsJidNotificationFragment;
        super.onCreate(bundle);
        setContentView(2131626519);
        if (bundle == null) {
            boolean A1a = AnonymousClass3MY.A1a(getIntent(), "advanced_settings");
            if (!C18020vd.A05(C18040vf.A02, this.A01, 7628)) {
                hilt_SettingsJidNotificationFragment = new Hilt_SettingsJidNotificationFragment();
            } else if (A1a) {
                hilt_SettingsJidNotificationFragment = new Hilt_AdvancedNotificationSettingsFragment();
            } else {
                hilt_SettingsJidNotificationFragment = new NotificationsAndSoundsFragment();
            }
            this.A0A = hilt_SettingsJidNotificationFragment;
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0D(this.A0A, "preferenceFragment", 2131434018);
            A0H.A00(false);
            return;
        }
        setTitle(bundle.getCharSequence("settingsJidNotificationFragment"));
        this.A0A = (WaPreferenceFragment) getSupportFragmentManager().A0P(bundle, "preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsJidNotificationFragment", getTitle());
    }

    public SettingsJidNotificationActivity() {
        this(0);
    }
}

package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1NM;
import X.AnonymousClass1NN;
import X.AnonymousClass1Q1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5Z0;
import X.AnonymousClass9VV;
import X.C000200d;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C108975cc;
import X.C17880vN;
import X.C24051Ir;
import X.C25161Nd;
import X.C32531hL;
import X.C36241nZ;
import X.C36741oO;
import X.C55502fs;
import X.C72453Mb;
import X.C87884Xl;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceFragmentCompat;
import com.whatsapp.settings.Hilt_SettingsChatHistoryFragment;
import com.whatsapp.settings.Hilt_SettingsJidNotificationFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.settings.SettingsJidNotificationFragment;
import com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment;
import com.whatsapp.settings.notificationsandsounds.Hilt_AdvancedNotificationSettingsFragment;
import com.whatsapp.settings.notificationsandsounds.Hilt_NotificationsAndSoundsFragment;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

public abstract class Hilt_WaPreferenceFragment extends PreferenceFragmentCompat implements AnonymousClass009 {
    public ContextWrapper A00;
    public boolean A01;
    public final Object A02 = C17880vN.A0p();
    public volatile C008803x A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A00()
            r2.A26()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Hilt_WaPreferenceFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A26() {
        if (this instanceof Hilt_NotificationsAndSoundsFragment) {
            Hilt_NotificationsAndSoundsFragment hilt_NotificationsAndSoundsFragment = (Hilt_NotificationsAndSoundsFragment) this;
            if (!hilt_NotificationsAndSoundsFragment.A00) {
                hilt_NotificationsAndSoundsFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_NotificationsAndSoundsFragment);
                NotificationsAndSoundsFragment notificationsAndSoundsFragment = (NotificationsAndSoundsFragment) hilt_NotificationsAndSoundsFragment;
                C36241nZ r3 = (C36241nZ) A0S;
                AnonymousClass10E r2 = r3.A2Q;
                notificationsAndSoundsFragment.A04 = AnonymousClass10E.A8r(r2);
                notificationsAndSoundsFragment.A02 = (AnonymousClass1Q1) r2.A2A.get();
                notificationsAndSoundsFragment.A08 = AnonymousClass3MZ.A11(r2);
                notificationsAndSoundsFragment.A03 = (AnonymousClass1NN) r2.A2q.get();
                notificationsAndSoundsFragment.A00 = (AnonymousClass9VV) r3.A11.get();
                notificationsAndSoundsFragment.A01 = (AnonymousClass5Z0) r3.A2O.A1Q.get();
                notificationsAndSoundsFragment.A0A = C000200d.A00(r2.A00.A55);
                notificationsAndSoundsFragment.A0B = AnonymousClass3MW.A0s(r2);
                notificationsAndSoundsFragment.A09 = AnonymousClass10E.AL1(r2);
            }
        } else if (this instanceof Hilt_AdvancedNotificationSettingsFragment) {
            Hilt_AdvancedNotificationSettingsFragment hilt_AdvancedNotificationSettingsFragment = (Hilt_AdvancedNotificationSettingsFragment) this;
            if (!hilt_AdvancedNotificationSettingsFragment.A00) {
                hilt_AdvancedNotificationSettingsFragment.A00 = true;
                C008903z A0S2 = AnonymousClass3MX.A0S(hilt_AdvancedNotificationSettingsFragment);
                AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment = (AdvancedNotificationSettingsFragment) hilt_AdvancedNotificationSettingsFragment;
                AnonymousClass10E r1 = ((C36241nZ) A0S2).A2Q;
                advancedNotificationSettingsFragment.A04 = AnonymousClass3MZ.A11(r1);
                advancedNotificationSettingsFragment.A00 = AnonymousClass10E.A12(r1);
                advancedNotificationSettingsFragment.A05 = (C55502fs) r1.A00.A89.get();
                advancedNotificationSettingsFragment.A06 = AnonymousClass10E.AL1(r1);
                advancedNotificationSettingsFragment.A01 = AnonymousClass10E.A6Q(r1);
            }
        } else if (this instanceof Hilt_SettingsJidNotificationFragment) {
            Hilt_SettingsJidNotificationFragment hilt_SettingsJidNotificationFragment = (Hilt_SettingsJidNotificationFragment) this;
            if (!hilt_SettingsJidNotificationFragment.A00) {
                hilt_SettingsJidNotificationFragment.A00 = true;
                C008903z A0S3 = AnonymousClass3MX.A0S(hilt_SettingsJidNotificationFragment);
                SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) hilt_SettingsJidNotificationFragment;
                AnonymousClass10E r12 = ((C36241nZ) A0S3).A2Q;
                settingsJidNotificationFragment.A04 = AnonymousClass3Ma.A0f(r12);
                settingsJidNotificationFragment.A00 = AnonymousClass3MZ.A0N(r12);
                settingsJidNotificationFragment.A02 = AnonymousClass10E.A4z(r12);
                settingsJidNotificationFragment.A07 = C108975cc.A0O(r12);
                settingsJidNotificationFragment.A06 = AnonymousClass3MZ.A11(r12);
                settingsJidNotificationFragment.A01 = (C32531hL) r12.ABm.get();
                settingsJidNotificationFragment.A03 = AnonymousClass10E.A6Q(r12);
            }
        } else {
            Hilt_SettingsChatHistoryFragment hilt_SettingsChatHistoryFragment = (Hilt_SettingsChatHistoryFragment) this;
            if (!hilt_SettingsChatHistoryFragment.A00) {
                hilt_SettingsChatHistoryFragment.A00 = true;
                C008903z A0S4 = AnonymousClass3MX.A0S(hilt_SettingsChatHistoryFragment);
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) hilt_SettingsChatHistoryFragment;
                AnonymousClass10E r32 = ((C36241nZ) A0S4).A2Q;
                settingsChatHistoryFragment.A01 = AnonymousClass10E.A17(r32);
                settingsChatHistoryFragment.A09 = AnonymousClass3MY.A0Z(r32);
                settingsChatHistoryFragment.A0C = AnonymousClass10E.AL1(r32);
                settingsChatHistoryFragment.A02 = AnonymousClass3MZ.A0S(r32);
                settingsChatHistoryFragment.A03 = AnonymousClass3MZ.A0U(r32);
                settingsChatHistoryFragment.A0D = C000200d.A00(r32.AAV);
                settingsChatHistoryFragment.A04 = AnonymousClass10E.A4z(r32);
                AnonymousClass10G r13 = r32.A00;
                settingsChatHistoryFragment.A06 = (C87884Xl) r13.A9j.get();
                settingsChatHistoryFragment.A07 = (AnonymousClass1NM) r32.A6D.get();
                settingsChatHistoryFragment.A05 = (C25161Nd) r32.A2v.get();
                settingsChatHistoryFragment.A00 = AnonymousClass10E.A12(r32);
                settingsChatHistoryFragment.A0B = (C36741oO) r13.A1L.get();
                settingsChatHistoryFragment.A08 = AnonymousClass10E.A8r(r32);
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C008803x(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A26();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}

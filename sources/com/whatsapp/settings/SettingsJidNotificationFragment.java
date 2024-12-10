package com.whatsapp.settings;

import X.AHG;
import X.AHH;
import X.AnonymousClass129;
import X.AnonymousClass1BI;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1Nb;
import X.AnonymousClass1YL;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.B6V;
import X.C161608Gm;
import X.C18000vb;
import X.C217217d;
import X.C22971Dz;
import X.C28281Zt;
import X.C32531hL;
import X.C42551yM;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.util.Log;

public class SettingsJidNotificationFragment extends Hilt_SettingsJidNotificationFragment {
    public AnonymousClass1L9 A00;
    public C32531hL A01;
    public AnonymousClass1M9 A02;
    public C18000vb A03;
    public AnonymousClass1KW A04;
    public AnonymousClass1BI A05;
    public AnonymousClass1Nb A06;
    public AnonymousClass129 A07;

    public void A1w(int i, int i2, Intent intent) {
        Object obj = "";
        if (i == 1) {
            if (intent != null) {
                Object parcelableExtra = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                Preference BLF = BLF("jid_message_tone");
                B6V b6v = BLF.A0A;
                if (parcelableExtra != null) {
                    obj = parcelableExtra;
                }
                b6v.C1R(BLF, obj);
                return;
            }
        } else if (i == 2 && intent != null) {
            Object parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            Preference BLF2 = BLF("jid_call_ringtone");
            B6V b6v2 = BLF2.A0A;
            if (parcelableExtra2 != null) {
                obj = parcelableExtra2;
            }
            b6v2.C1R(BLF2, obj);
            return;
        }
        super.A1w(i, i2, intent);
    }

    public static void A00(SettingsJidNotificationFragment settingsJidNotificationFragment) {
        C42551yM A0a = settingsJidNotificationFragment.A06.A0a(settingsJidNotificationFragment.A05);
        settingsJidNotificationFragment.A27(2132279306);
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) settingsJidNotificationFragment.BLF("jid_message_tone");
        String A072 = A0a.A07();
        waRingtonePreference.A00 = 7;
        waRingtonePreference.A02 = true;
        waRingtonePreference.A03 = true;
        waRingtonePreference.A01 = A072;
        waRingtonePreference.A0H(C217217d.A06(settingsJidNotificationFragment.A00, A072));
        waRingtonePreference.A0A = new AHG(waRingtonePreference, settingsJidNotificationFragment, 0);
        ListPreference listPreference = (ListPreference) settingsJidNotificationFragment.BLF("jid_message_vibrate");
        AnonymousClass8BW.A15(listPreference, A0a.A08());
        AHH.A01(listPreference, settingsJidNotificationFragment, 0);
        ListPreference listPreference2 = (ListPreference) settingsJidNotificationFragment.BLF("jid_message_popup");
        if (Build.VERSION.SDK_INT >= 29) {
            int A002 = C28281Zt.A00(settingsJidNotificationFragment.A00, 2130971172, AnonymousClass1YL.A00(settingsJidNotificationFragment.A1n(), 2130971190, 2131102526));
            PreferenceGroup preferenceGroup = (PreferenceGroup) settingsJidNotificationFragment.BLF("notification");
            PreferenceGroup.A00(listPreference2, preferenceGroup);
            preferenceGroup.A06();
            C161608Gm r2 = new C161608Gm(settingsJidNotificationFragment.A00, settingsJidNotificationFragment, A002);
            AnonymousClass8BY.A0k(listPreference2, r2);
            boolean z = listPreference2.A0P;
            if (r2.A0P != z) {
                r2.A0P = z;
                r2.A05();
            }
            preferenceGroup.A0T(r2);
            r2.A0S(listPreference2.A00);
            r2.A0H(r2.A05.getString(2131894705));
        } else {
            AnonymousClass8BW.A15(listPreference2, A0a.A06());
            AHH.A01(listPreference2, settingsJidNotificationFragment, 1);
        }
        ListPreference listPreference3 = (ListPreference) settingsJidNotificationFragment.BLF("jid_message_light");
        listPreference3.A0T(settingsJidNotificationFragment.A03.A0R(SettingsNotifications.A0z));
        AnonymousClass8BW.A15(listPreference3, A0a.A05());
        AHH.A01(listPreference3, settingsJidNotificationFragment, 2);
        TwoStatePreference twoStatePreference = (TwoStatePreference) settingsJidNotificationFragment.BLF("jid_use_high_priority_notifications");
        twoStatePreference.A0S(!A0a.A0C());
        AHH.A01(twoStatePreference, settingsJidNotificationFragment, 3);
        if (C22971Dz.A0e(settingsJidNotificationFragment.A05)) {
            Preference BLF = settingsJidNotificationFragment.BLF("jid_call");
            if (BLF != null) {
                PreferenceScreen preferenceScreen = settingsJidNotificationFragment.A01.A06;
                PreferenceGroup.A00(BLF, preferenceScreen);
                preferenceScreen.A06();
            }
        } else {
            WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) settingsJidNotificationFragment.BLF("jid_call_ringtone");
            String A032 = A0a.A03();
            waRingtonePreference2.A00 = 1;
            waRingtonePreference2.A02 = true;
            waRingtonePreference2.A03 = true;
            waRingtonePreference2.A01 = A032;
            waRingtonePreference2.A0H(C217217d.A06(settingsJidNotificationFragment.A00, A032));
            waRingtonePreference2.A0A = new AHG(waRingtonePreference2, settingsJidNotificationFragment, 1);
            ListPreference listPreference4 = (ListPreference) settingsJidNotificationFragment.BLF("jid_call_vibrate");
            AnonymousClass8BW.A15(listPreference4, A0a.A04());
            AHH.A01(listPreference4, settingsJidNotificationFragment, 4);
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) settingsJidNotificationFragment.BLF("jid_use_custom");
        twoStatePreference2.A0S(A0a.A0V);
        AHH.A01(twoStatePreference2, settingsJidNotificationFragment, 5);
        A01(settingsJidNotificationFragment);
    }

    public static void A01(SettingsJidNotificationFragment settingsJidNotificationFragment) {
        boolean z = settingsJidNotificationFragment.A06.A0a(settingsJidNotificationFragment.A05).A0V;
        settingsJidNotificationFragment.BLF("jid_message_tone").A0M(z);
        settingsJidNotificationFragment.BLF("jid_message_vibrate").A0M(z);
        settingsJidNotificationFragment.BLF("jid_message_popup").A0M(z);
        settingsJidNotificationFragment.BLF("jid_message_light").A0M(z);
        settingsJidNotificationFragment.BLF("jid_use_high_priority_notifications").A0M(z);
        if (!C22971Dz.A0e(settingsJidNotificationFragment.A05)) {
            settingsJidNotificationFragment.BLF("jid_call_ringtone").A0M(z);
            settingsJidNotificationFragment.BLF("jid_call_vibrate").A0M(z);
        }
    }

    public boolean C1T(Preference preference) {
        String str = preference.A0J;
        if (str.equals("jid_message_tone")) {
            startActivityForResult(((WaRingtonePreference) preference).A0R(), 1);
            return true;
        } else if (!str.equals("jid_call_ringtone")) {
            return super.C1T(preference);
        } else {
            startActivityForResult(((WaRingtonePreference) preference).A0R(), 2);
            return true;
        }
    }

    public void A1v() {
        super.A1v();
        AnonymousClass1Nb r2 = this.A06;
        AnonymousClass1BI r1 = this.A05;
        r2.A0K.get();
        if (AnonymousClass1Nb.A0D(r2, r1.getRawString())) {
            Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
            this.A01.A06.A0S();
            A00(this);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A1Z(true);
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 2131432618, 0, 2131895948).setShowAsAction(0);
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432618) {
            return false;
        }
        AnonymousClass1Nb r3 = this.A06;
        C42551yM A0a = r3.A0a(this.A05);
        C42551yM A022 = A0a.A02();
        A0a.A0K = A022.A07();
        A0a.A0L = A022.A08();
        A0a.A0J = A022.A06();
        A0a.A0I = A022.A05();
        A0a.A0F = A022.A03();
        A0a.A0G = A022.A04();
        A0a.A0V = false;
        A0a.A0Q = false;
        AnonymousClass1Nb.A07(A0a, r3);
        this.A01.A06.A0S();
        A00(this);
        return true;
    }
}

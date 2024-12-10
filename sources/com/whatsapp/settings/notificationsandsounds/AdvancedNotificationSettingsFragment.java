package com.whatsapp.settings.notificationsandsounds;

import X.AHH;
import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1KB;
import X.AnonymousClass1Nb;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.C18000vb;
import X.C18070vi;
import X.C28281Zt;
import X.C37961qT;
import X.C42551yM;
import X.C55502fs;
import X.C70863Cu;
import X.C98844ro;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.whatsapp.settings.SettingsNotifications;

public final class AdvancedNotificationSettingsFragment extends Hilt_AdvancedNotificationSettingsFragment {
    public AnonymousClass1KB A00;
    public C18000vb A01;
    public AnonymousClass1BI A02;
    public C42551yM A03;
    public AnonymousClass1Nb A04;
    public C55502fs A05;
    public AnonymousClass10I A06;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A02.setItemAnimator((C37961qT) null);
        AnonymousClass10I r2 = this.A06;
        if (r2 != null) {
            r2.CGF(new C98844ro((Object) this, 36));
        } else {
            C18070vi.A11("waWorkers");
            throw null;
        }
    }

    public static final void A00(AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment) {
        boolean z;
        String str;
        String str2;
        ListPreference listPreference = (ListPreference) advancedNotificationSettingsFragment.BLF("jid_message_popup");
        if (listPreference != null) {
            listPreference.A0N(true);
            if (Build.VERSION.SDK_INT >= 29) {
                Context context = listPreference.A05;
                int A002 = C28281Zt.A00(context, 2130971172, AnonymousClass1YL.A00(context, 2130971190, 2131102526));
                PreferenceScreen preferenceScreen = listPreference.A0E.A06;
                if (preferenceScreen != null) {
                    PreferenceGroup.A00(listPreference, preferenceScreen);
                    preferenceScreen.A06();
                }
                AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 = new AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1(advancedNotificationSettingsFragment.A00, advancedNotificationSettingsFragment, A002);
                AnonymousClass8BY.A0k(listPreference, advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1);
                boolean z2 = listPreference.A0P;
                if (advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0P != z2) {
                    advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0P = z2;
                    advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A05();
                }
                if (preferenceScreen != null) {
                    preferenceScreen.A0T(advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1);
                }
                advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0S(listPreference.A00);
                advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0H(advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A05.getString(2131894705));
            } else {
                C42551yM r0 = advancedNotificationSettingsFragment.A03;
                if (r0 != null) {
                    str2 = r0.A06();
                } else {
                    str2 = null;
                }
                AnonymousClass8BW.A15(listPreference, str2);
                AHH.A01(listPreference, advancedNotificationSettingsFragment, 6);
            }
        }
        ListPreference listPreference2 = (ListPreference) advancedNotificationSettingsFragment.BLF("jid_message_light");
        if (listPreference2 != null) {
            C18000vb r1 = advancedNotificationSettingsFragment.A01;
            if (r1 != null) {
                listPreference2.A0T(r1.A0R(SettingsNotifications.A0z));
                C42551yM r02 = advancedNotificationSettingsFragment.A03;
                if (r02 != null) {
                    str = r02.A05();
                } else {
                    str = null;
                }
                AnonymousClass8BW.A15(listPreference2, str);
                AHH.A01(listPreference2, advancedNotificationSettingsFragment, 8);
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        TwoStatePreference twoStatePreference = (TwoStatePreference) advancedNotificationSettingsFragment.BLF("jid_use_high_priority_notifications");
        if (twoStatePreference != null) {
            C42551yM r03 = advancedNotificationSettingsFragment.A03;
            if (r03 != null) {
                z = r03.A0C();
            } else {
                z = true;
            }
            twoStatePreference.A0S(!z);
            AHH.A01(twoStatePreference, advancedNotificationSettingsFragment, 7);
        }
    }

    public static final void A01(AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment, String str) {
        int i;
        C55502fs r5 = advancedNotificationSettingsFragment.A05;
        if (r5 != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1922861276) {
                if (hashCode != -1918979398) {
                    if (hashCode == 318732504 && str.equals("jid_use_high_priority_notifications")) {
                        i = 15;
                    } else {
                        return;
                    }
                } else if (str.equals("jid_message_popup")) {
                    i = 14;
                } else {
                    return;
                }
            } else if (str.equals("jid_message_light")) {
                i = 13;
            } else {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                r5.A03.execute(new C70863Cu(valueOf, 95, 43, r5));
                return;
            }
            return;
        }
        C18070vi.A11("userJourneyLogger");
        throw null;
    }
}

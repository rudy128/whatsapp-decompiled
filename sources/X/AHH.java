package X;

import androidx.preference.ListPreference;
import androidx.preference.Preference;

public class AHH implements B6V {
    public final int A00;
    public final Object A01;

    public static void A00(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.A0H(listPreference.A01[listPreference.A0R((String) obj)].toString());
    }

    public AHH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(Preference preference, Object obj, int i) {
        preference.A0A = new AHH(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e6, code lost:
        com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment.A01(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e4, code lost:
        X.C18070vi.A11("chatSettingsStore");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ea, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C1R(androidx.preference.Preference r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x01d0;
                case 1: goto L_0x01b3;
                case 2: goto L_0x016e;
                case 3: goto L_0x014d;
                case 4: goto L_0x0139;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00b0;
                case 7: goto L_0x0084;
                case 8: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r0 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r0
            X.C18070vi.A0j(r7, r8)
            X.0vl r0 = r0.A0H
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r2 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r2
            java.lang.String r1 = r7.A0J
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r8.toString()
            r2.A0T(r1, r0)
        L_0x0020:
            r0 = 1
            return r0
        L_0x0022:
            java.lang.Object r4 = r6.A01
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r4 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r4
            X.C18070vi.A0j(r7, r8)
            java.lang.String r1 = android.os.Build.MODEL
            X.C18070vi.A0Z(r1)
            java.lang.String r0 = "Desire"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "Wildfire"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 == 0) goto L_0x0054
        L_0x003e:
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "00FF00"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0054
            r1 = 2131891600(0x7f121590, float:1.9417925E38)
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x0054
            r0.BhQ(r1)
        L_0x0054:
            r2 = r7
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r2.A0R(r0)
            java.lang.CharSequence[] r0 = r2.A01
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            r7.A0H(r0)
            X.1BI r3 = r4.A02
            if (r3 == 0) goto L_0x0081
            X.1Nb r2 = r4.A04
            if (r2 == 0) goto L_0x01e4
            java.lang.String r1 = r8.toString()
            X.00H r0 = r2.A0K
            r0.get()
            java.lang.String r0 = r3.getRawString()
            X.AnonymousClass1Nb.A08(r2, r0, r1)
        L_0x0081:
            java.lang.String r0 = "jid_message_light"
            goto L_0x00e6
        L_0x0084:
            java.lang.Object r4 = r6.A01
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r4 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r4
            boolean r0 = X.C108975cc.A1J(r8)
            X.1BI r1 = r4.A02
            if (r1 == 0) goto L_0x0020
            X.1Nb r3 = r4.A04
            if (r3 == 0) goto L_0x01e4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r0.equals(r8)
            java.lang.String r0 = r1.getRawString()
            X.1yM r1 = X.AnonymousClass1Nb.A01(r3, r0)
            boolean r0 = r1.A0Q
            if (r2 == r0) goto L_0x00ad
            r1.A0Q = r2
            X.AnonymousClass1Nb.A07(r1, r3)
        L_0x00ad:
            java.lang.String r0 = "jid_use_high_priority_notifications"
            goto L_0x00e6
        L_0x00b0:
            java.lang.Object r4 = r6.A01
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r4 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r4
            X.C18070vi.A0j(r7, r8)
            r2 = r7
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r2.A0R(r0)
            java.lang.CharSequence[] r0 = r2.A01
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            r7.A0H(r0)
            X.1BI r3 = r4.A02
            if (r3 == 0) goto L_0x00e4
            X.1Nb r2 = r4.A04
            if (r2 == 0) goto L_0x01e4
            java.lang.String r1 = r8.toString()
            X.00H r0 = r2.A0K
            r0.get()
            java.lang.String r0 = r3.getRawString()
            X.AnonymousClass1Nb.A09(r2, r0, r1)
        L_0x00e4:
            java.lang.String r0 = "jid_message_popup"
        L_0x00e6:
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment.A01(r4, r0)
            goto L_0x0020
        L_0x00eb:
            java.lang.Object r5 = r6.A01
            com.whatsapp.settings.SettingsJidNotificationFragment r5 = (com.whatsapp.settings.SettingsJidNotificationFragment) r5
            X.1Nb r1 = r5.A06
            X.1BI r0 = r5.A05
            X.1yM r0 = r1.A0a(r0)
            boolean r3 = r0.A0V
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r4 = r0.equals(r8)
            X.1Nb r2 = r5.A06
            X.1BI r0 = r5.A05
            X.1yM r1 = r2.A0a(r0)
            boolean r0 = r1.A0V
            if (r4 == r0) goto L_0x0118
            if (r4 == 0) goto L_0x0113
            boolean r0 = r1.A0C()
            r1.A0Q = r0
        L_0x0113:
            r1.A0V = r4
            X.AnonymousClass1Nb.A07(r1, r2)
        L_0x0118:
            if (r3 == r4) goto L_0x0130
            X.1BI r1 = r5.A05
            X.1hL r3 = r5.A01
            if (r4 == 0) goto L_0x0135
            X.1M9 r0 = r5.A02
            X.1E7 r2 = r0.A0E(r1)
            if (r2 == 0) goto L_0x0130
            android.content.Context r1 = r5.A14()
            r0 = 0
            r3.A04(r1, r2, r0)
        L_0x0130:
            com.whatsapp.settings.SettingsJidNotificationFragment.A01(r5)
            goto L_0x0020
        L_0x0135:
            r3.A07(r1)
            goto L_0x0130
        L_0x0139:
            java.lang.Object r0 = r6.A01
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            A00(r7, r8)
            X.1Nb r2 = r0.A06
            X.1BI r1 = r0.A05
            java.lang.String r0 = r8.toString()
            r2.A0l(r1, r0)
            goto L_0x0020
        L_0x014d:
            java.lang.Object r0 = r6.A01
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            X.1Nb r3 = r0.A06
            X.1BI r1 = r0.A05
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r2 = r0.equals(r8)
            java.lang.String r0 = r1.getRawString()
            X.1yM r1 = X.AnonymousClass1Nb.A01(r3, r0)
            boolean r0 = r1.A0Q
            if (r2 == r0) goto L_0x0020
            r1.A0Q = r2
            X.AnonymousClass1Nb.A07(r1, r3)
            goto L_0x0020
        L_0x016e:
            java.lang.Object r2 = r6.A01
            com.whatsapp.settings.SettingsJidNotificationFragment r2 = (com.whatsapp.settings.SettingsJidNotificationFragment) r2
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0184
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x019a
        L_0x0184:
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "00FF00"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x019a
            r1 = 2131891600(0x7f121590, float:1.9417925E38)
            X.8dO r0 = r2.A00
            if (r0 == 0) goto L_0x019a
            r0.BhQ(r1)
        L_0x019a:
            A00(r7, r8)
            X.1Nb r3 = r2.A06
            X.1BI r2 = r2.A05
            java.lang.String r1 = r8.toString()
            X.00H r0 = r3.A0K
            r0.get()
            java.lang.String r0 = r2.getRawString()
            X.AnonymousClass1Nb.A08(r3, r0, r1)
            goto L_0x0020
        L_0x01b3:
            java.lang.Object r0 = r6.A01
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            A00(r7, r8)
            X.1Nb r3 = r0.A06
            X.1BI r2 = r0.A05
            java.lang.String r1 = r8.toString()
            X.00H r0 = r3.A0K
            r0.get()
            java.lang.String r0 = r2.getRawString()
            X.AnonymousClass1Nb.A09(r3, r0, r1)
            goto L_0x0020
        L_0x01d0:
            java.lang.Object r0 = r6.A01
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = (com.whatsapp.settings.SettingsJidNotificationFragment) r0
            A00(r7, r8)
            X.1Nb r2 = r0.A06
            X.1BI r1 = r0.A05
            java.lang.String r0 = r8.toString()
            r2.A0n(r1, r0)
            goto L_0x0020
        L_0x01e4:
            java.lang.String r0 = "chatSettingsStore"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHH.C1R(androidx.preference.Preference, java.lang.Object):boolean");
    }
}

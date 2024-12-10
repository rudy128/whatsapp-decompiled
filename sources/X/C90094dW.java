package X;

import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.settings.SettingsPrivacy;

/* renamed from: X.4dW  reason: invalid class name and case insensitive filesystem */
public class C90094dW implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C90094dW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C90094dW(obj, i));
    }

    public static void A01(SettingsPrivacy settingsPrivacy, Integer num, String str, int i) {
        boolean equals = str.equals(settingsPrivacy.A0z);
        if (i == -1) {
            i = 0;
            if (equals) {
                i = 2;
            }
        }
        SettingsPrivacy.A0s(settingsPrivacy, num, Integer.valueOf(i));
        settingsPrivacy.A0x.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.whatsapp.settings.SettingsDataUsageActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: com.whatsapp.settings.SettingsDataUsageActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v78, resolved type: com.whatsapp.settings.SettingsHelpActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: com.whatsapp.settings.SettingsHelpActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v81, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v83, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v84, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: com.whatsapp.settings.SettingsDataUsageActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x046f, code lost:
        r3 = X.C72483Me.A0I(r0, r2, r3);
        r3.putInt("itemsArrayResId", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x04dc, code lost:
        r4 = new android.content.Intent("android.intent.action.RINGTONE_PICKER");
        r4.putExtra("android.intent.extra.ringtone.TITLE", r1);
        r4.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        r4.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        r4.putExtra("android.intent.extra.ringtone.DEFAULT_URI", android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04fa, code lost:
        if (r6 == null) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0502, code lost:
        if (r6.equals("Silent") != false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0504, code lost:
        r1 = android.net.Uri.parse(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0508, code lost:
        if (r1 == null) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x050a, code lost:
        r4.putExtra("android.intent.extra.ringtone.EXISTING_URI", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0519, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") == false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x051b, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x051f, code lost:
        r3.startActivityForResult(android.content.Intent.createChooser(r4, (java.lang.CharSequence) null), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0527, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0528, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x05a5, code lost:
        r3 = com.whatsapp.SingleSelectionDialogFragment.A03(r2, r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x05a9, code lost:
        r0 = new com.whatsapp.Hilt_SingleSelectionDialogFragment();
        r0.A1R(r3);
        r4.CMl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x05b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0668, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x066c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x069b, code lost:
        r2.setClassName(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x069e, code lost:
        if (r3 == null) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x06a0, code lost:
        r2.putExtra("search_result_key", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x06a5, code lost:
        r4.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x06a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x06b7, code lost:
        r2.setClassName(r1, r0);
        r3.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x06bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x06be, code lost:
        com.whatsapp.util.Log.e("SettingsPasskeys/no activity bound");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x06c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        r1 = X.AnonymousClass1Nb.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ce, code lost:
        if (r3 == r1.A0R) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d0, code lost:
        r1.A0R = r3;
        X.AnonymousClass1Nb.A07(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0368, code lost:
        r3.startActivity(r1.setClassName(r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x036f, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x06a9;
                case 1: goto L_0x068b;
                case 2: goto L_0x00fc;
                case 3: goto L_0x0683;
                case 4: goto L_0x00d6;
                case 5: goto L_0x066d;
                case 6: goto L_0x060c;
                case 7: goto L_0x05f8;
                case 8: goto L_0x05e4;
                case 9: goto L_0x05d0;
                case 10: goto L_0x05b5;
                case 11: goto L_0x058f;
                case 12: goto L_0x056c;
                case 13: goto L_0x0559;
                case 14: goto L_0x0545;
                case 15: goto L_0x052c;
                case 16: goto L_0x00b1;
                case 17: goto L_0x0099;
                case 18: goto L_0x04cd;
                case 19: goto L_0x047a;
                case 20: goto L_0x0461;
                case 21: goto L_0x0452;
                case 22: goto L_0x0434;
                case 23: goto L_0x041b;
                case 24: goto L_0x040a;
                case 25: goto L_0x03fb;
                case 26: goto L_0x0081;
                case 27: goto L_0x03ea;
                case 28: goto L_0x0024;
                case 29: goto L_0x03a8;
                case 30: goto L_0x038b;
                case 31: goto L_0x0370;
                case 32: goto L_0x0353;
                case 33: goto L_0x0338;
                case 34: goto L_0x0325;
                case 35: goto L_0x0308;
                case 36: goto L_0x02cc;
                case 37: goto L_0x02b5;
                case 38: goto L_0x029e;
                case 39: goto L_0x028a;
                case 40: goto L_0x0272;
                case 41: goto L_0x0256;
                case 42: goto L_0x0222;
                case 43: goto L_0x01fa;
                case 44: goto L_0x01dd;
                case 45: goto L_0x01a9;
                case 46: goto L_0x018a;
                case 47: goto L_0x015b;
                case 48: goto L_0x0136;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.1Si r0 = r2.A05
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0023
            boolean r0 = r2.A0A
            r0 = r0 ^ 1
            r2.A0A = r0
            X.10I r1 = r2.A05
            r0 = 15
            X.C98844ro.A02(r1, r2, r0)
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A03(r2)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r4 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r4
            X.1FL r3 = r4.A1B()
            if (r3 == 0) goto L_0x06be
            X.9mj r2 = X.C72473Md.A0Z(r4)
            r1 = 0
            r0 = 12
            r2.A00(r1, r1, r0)
            X.3Ri r3 = X.C73193Ri.A00(r3)
            r0 = 2131895960(0x7f122698, float:1.9426768E38)
            r3.A0V(r0)
            r0 = 2131895959(0x7f122697, float:1.9426766E38)
            r3.A0U(r0)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 14
            X.4ar r0 = new X.4ar
            r0.<init>(r4, r1)
            r3.A0W(r0, r2)
            r2 = 2131898874(0x7f1231fa, float:1.9432678E38)
            r1 = 15
            X.4ar r0 = new X.4ar
            r0.<init>(r4, r1)
            r3.A0X(r0, r2)
            X.05w r2 = r3.create()
            r2.show()
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x0023
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0023
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0023
            r0 = 29
            X.C90584eJ.A00(r1, r2, r0)
            return
        L_0x0081:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0I
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0I
            boolean r3 = A02(r0, r1)
            r2.A0S = r3
            X.1Nb r2 = r2.A0J
            java.lang.String r0 = "status_likes_notification"
            goto L_0x00c8
        L_0x0099:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0E
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0E
            boolean r3 = A02(r0, r1)
            r2.A0Q = r3
            X.1Nb r2 = r2.A0J
            java.lang.String r0 = "group_chat_defaults"
            goto L_0x00c8
        L_0x00b1:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0H
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0H
            boolean r3 = A02(r0, r1)
            r2.A0Q = r3
            X.1Nb r2 = r2.A0J
            java.lang.String r0 = "individual_chat_defaults"
        L_0x00c8:
            X.1yM r1 = X.AnonymousClass1Nb.A01(r2, r0)
            boolean r0 = r1.A0R
            if (r3 == r0) goto L_0x0023
            r1.A0R = r3
            X.AnonymousClass1Nb.A07(r1, r2)
            return
        L_0x00d6:
            java.lang.Object r5 = r7.A01
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            X.1Si r0 = r5.A0L
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0023
            r4 = 2131895798(0x7f1225f6, float:1.942644E38)
            int r3 = r5.A00
            java.lang.String[] r0 = r5.A0U
            int r0 = r0.length
            boolean[] r2 = new boolean[r0]
            r1 = 0
        L_0x00ed:
            if (r3 == 0) goto L_0x06c4
            r0 = r3 & 1
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r2[r1] = r0
            int r3 = r3 >> 1
            int r1 = r1 + 1
            goto L_0x00ed
        L_0x00fc:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsDataUsageActivity r3 = (com.whatsapp.settings.SettingsDataUsageActivity) r3
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0C
            r0.toggle()
            X.0z4 r1 = r3.A0A
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0C
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r1)
            java.lang.String r0 = "voip_low_data_usage"
            X.C17880vN.A1F(r1, r0, r2)
            com.whatsapp.settings.SettingsDataUsageViewModel r1 = r3.A0M
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0C
            boolean r2 = r0.isChecked()
            X.1HQ r0 = r1.A03
            X.1HR r0 = (X.AnonymousClass1HR) r0
            X.0ve r0 = r0.A00
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            if (r1 == 0) goto L_0x0023
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0023
            com.whatsapp.voipcalling.Voip.setCallLowDataUsage(r2)
            return
        L_0x0132:
            java.lang.String r0 = "traffAnonGating"
            goto L_0x0668
        L_0x0136:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r4 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r4
            boolean r0 = com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A0Q(r4)
            r3 = r0 ^ 1
            X.00H r0 = r4.A09
            if (r0 == 0) goto L_0x0157
            java.lang.Object r2 = r0.get()
            X.1Rl r2 = (X.C26261Rl) r2
            java.lang.String r1 = "messages"
            java.lang.String r0 = X.C63682tW.A02(r1, r3)
            r2.A02(r1, r0)
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A03(r4)
            return
        L_0x0157:
            java.lang.String r0 = "privacySettingManager"
            goto L_0x0668
        L_0x015b:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 22
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = r4.A00
            java.lang.String r1 = "privacy_contacts"
            java.lang.String r0 = r4.A0z
            boolean r1 = r1.equals(r0)
            r0 = -1
            if (r2 != r0) goto L_0x0176
            r2 = 0
            if (r1 == 0) goto L_0x0176
            r2 = 2
        L_0x0176:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.whatsapp.settings.SettingsPrivacy.A0s(r4, r3, r0)
            X.1pJ r2 = r4.A0W
            r0 = 2
            X.4kM r1 = new X.4kM
            r1.<init>(r4, r0)
            r0 = 5
            r2.A01(r4, r1, r0)
            return
        L_0x018a:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r4.A00
            java.lang.String r0 = "screen_lock"
            A01(r4, r2, r0, r1)
            java.lang.String r3 = r4.A0z
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.authentication.AppAuthSettingsActivity"
            goto L_0x069b
        L_0x01a9:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            X.00H r0 = r4.A0t
            java.lang.Object r1 = r0.get()
            X.6zO r1 = (X.C139756zO) r1
            r0 = 0
            r3 = 0
            r1.A03(r0, r0, r3)
            r0 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r4.A00
            java.lang.String r0 = "privacy_checkup"
            A01(r4, r2, r0, r1)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x01dd:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "advanced_privacy_relay_calls"
            A01(r3, r2, r0, r1)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacyAdvancedActivity"
            goto L_0x06b7
        L_0x01fa:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r4.A00
            java.lang.String r0 = "calling_privacy"
            A01(r4, r2, r0, r1)
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x0222:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = r4.A00
            java.lang.String r1 = "camera_effects"
            java.lang.String r0 = r4.A0z
            boolean r1 = r1.equals(r0)
            r0 = -1
            if (r2 != r0) goto L_0x023d
            r2 = 0
            if (r1 == 0) goto L_0x023d
            r2 = 2
        L_0x023d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.whatsapp.settings.SettingsPrivacy.A0s(r4, r3, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r2 = r4.A0h
            android.content.Context r1 = r8.getContext()
            androidx.appcompat.widget.SwitchCompat r0 = r4.A0Q
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            r2.A0T(r1, r0)
            return
        L_0x0256:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "live_location"
            A01(r3, r2, r0, r1)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.location.LiveLocationPrivacyActivity"
            goto L_0x06b7
        L_0x0272:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C17880vN.A0k()
            int r1 = r3.A00
            java.lang.String r0 = "privacy_status"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.AnonymousClass1LU.A06(r3)
            r0 = 0
            r3.startActivityForResult(r1, r0)
            return
        L_0x028a:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r2 = (com.whatsapp.settings.SettingsPrivacy) r2
            X.00H r0 = r2.A0x
            android.content.Intent r1 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r0 = "com.whatsapp.profile.PixPrivacyActivity"
            android.content.Intent r0 = r1.setClassName(r2, r0)
            r2.startActivity(r0)
            return
        L_0x029e:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C17880vN.A0i()
            int r1 = r3.A00
            java.lang.String r0 = "wcs_about_status"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.profile.AboutStatusPrivacyActivity"
            goto L_0x0368
        L_0x02b5:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C17880vN.A0h()
            int r1 = r3.A00
            java.lang.String r0 = "wcs_profile_photo"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            goto L_0x0368
        L_0x02cc:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C17880vN.A0l()
            int r2 = r4.A00
            java.lang.String r1 = "wcs_read_receipts"
            java.lang.String r0 = r4.A0z
            boolean r1 = r1.equals(r0)
            r0 = -1
            if (r2 != r0) goto L_0x02e5
            r2 = 0
            if (r1 == 0) goto L_0x02e5
            r2 = 2
        L_0x02e5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.whatsapp.settings.SettingsPrivacy.A0s(r4, r3, r0)
            androidx.appcompat.widget.SwitchCompat r0 = r4.A0R
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            java.lang.String r3 = "all"
            if (r0 != 0) goto L_0x02fa
            java.lang.String r3 = "none"
        L_0x02fa:
            java.lang.String r2 = "readreceipts"
            X.2rE r1 = r4.A0g
            r0 = 1
            X.C62332rE.A00(r1, r0)
            X.1Rl r0 = r4.A0S
            r0.A02(r2, r3)
            return
        L_0x0308:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "disappearing_messages_privacy"
            A01(r3, r2, r0, r1)
            r1 = 1
            android.content.Intent r0 = X.C17880vN.A0A()
            X.AnonymousClass1LU.A1q(r3, r0, r1)
            r3.startActivity(r0)
            return
        L_0x0325:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r2 = (com.whatsapp.settings.SettingsPrivacy) r2
            X.00H r0 = r2.A0x
            android.content.Intent r1 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r0 = "com.whatsapp.avatar.privacy.AvatarStickerPrivacySettings"
            r1.setClassName(r2, r0)
            r2.startActivity(r1)
            return
        L_0x0338:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C17880vN.A0j()
            int r1 = r3.A00
            java.lang.String r0 = "privacy_groups"
            A01(r3, r2, r0, r1)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            goto L_0x06b7
        L_0x0353:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.AnonymousClass3MY.A0f()
            int r1 = r3.A00
            java.lang.String r0 = "wcs_last_seen"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.lastseen.PresencePrivacyActivity"
        L_0x0368:
            android.content.Intent r0 = r1.setClassName(r3, r0)
            r3.startActivity(r0)
            return
        L_0x0370:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C17880vN.A0m()
            int r1 = r3.A00
            java.lang.String r0 = "privacy_blocked"
            A01(r3, r2, r0, r1)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.blocklist.BlockList"
            goto L_0x06b7
        L_0x038b:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "privacy_chat_lock"
            A01(r3, r2, r0, r1)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockPrivacySettingsActivity"
            goto L_0x06b7
        L_0x03a8:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r4 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r4
            X.1FL r3 = r4.A1B()
            if (r3 == 0) goto L_0x06be
            X.9mj r2 = X.C72473Md.A0Z(r4)
            r1 = 0
            r0 = 12
            r2.A00(r1, r1, r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131895968(0x7f1226a0, float:1.9426784E38)
            r3.A0E(r0)
            r0 = 2131895967(0x7f12269f, float:1.9426782E38)
            r3.A0D(r0)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 22
            X.4fy r0 = new X.4fy
            r0.<init>(r4, r1)
            r3.A0e(r4, r0, r2)
            r2 = 2131895966(0x7f12269e, float:1.942678E38)
            r1 = 23
            X.4fy r0 = new X.4fy
            r0.<init>(r4, r1)
            r3.A0g(r4, r0, r2)
            r3.A0C()
            return
        L_0x03ea:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131899408(0x7f123410, float:1.9433761E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0O
            r5 = 7
            r2 = 1
            goto L_0x04dc
        L_0x03fb:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131899413(0x7f123415, float:1.9433771E38)
            int r2 = r4.A00
            r1 = 2130903079(0x7f030027, float:1.7412966E38)
            r0 = 15
            goto L_0x046f
        L_0x040a:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131899392(0x7f123400, float:1.9433729E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0M
            r5 = 1
            r2 = 3
            goto L_0x04dc
        L_0x041b:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0D
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0D
            boolean r1 = A02(r0, r1)
            r2.A0P = r1
            X.1Nb r0 = r2.A0J
            r0.A0t(r1)
            return
        L_0x0434:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A01
            X.0vb r1 = r4.A00
            int[] r0 = com.whatsapp.settings.SettingsNotifications.A0z
            java.lang.String[] r2 = r1.A0R(r0)
            r1 = 14
            r0 = 2131899404(0x7f12340c, float:1.9433753E38)
            android.os.Bundle r3 = X.C72483Me.A0I(r1, r3, r0)
            java.lang.String r0 = "items"
            r3.putStringArray(r0, r2)
            goto L_0x05a9
        L_0x0452:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131899406(0x7f12340e, float:1.9433757E38)
            int r2 = r4.A02
            r1 = 2130903068(0x7f03001c, float:1.7412944E38)
            r0 = 13
            goto L_0x046f
        L_0x0461:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131899413(0x7f123415, float:1.9433771E38)
            int r2 = r4.A03
            r1 = 2130903079(0x7f030027, float:1.7412966E38)
            r0 = 12
        L_0x046f:
            android.os.Bundle r3 = X.C72483Me.A0I(r0, r2, r3)
            java.lang.String r0 = "itemsArrayResId"
            r3.putInt(r0, r1)
            goto L_0x05a9
        L_0x047a:
            java.lang.Object r1 = r7.A01
            com.whatsapp.settings.SettingsNotifications r1 = (com.whatsapp.settings.SettingsNotifications) r1
            androidx.appcompat.widget.SwitchCompat r0 = r1.A0G
            r0.toggle()
            X.00H r0 = r1.A0K
            java.lang.Object r5 = r0.get()
            X.2fi r5 = (X.C55402fi) r5
            androidx.appcompat.widget.SwitchCompat r0 = r1.A0G
            boolean r4 = r0.isChecked()
            X.0z4 r0 = r5.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_unread_message_clear_notification"
            X.C17880vN.A1F(r1, r0, r4)
            X.3zl r3 = new X.3zl
            r3.<init>()
            java.lang.Integer r2 = X.AnonymousClass3MY.A0f()
            if (r4 == 0) goto L_0x04ca
            java.lang.Integer r0 = X.C17880vN.A0h()
            r3.A00 = r0
            X.1gx r1 = r5.A01
            r0 = 1
            r1.A0E(r0)
            X.3Ao r0 = r5.A02
            r0.A05()
        L_0x04bc:
            r3.A01 = r2
            X.00H r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.18K r0 = (X.AnonymousClass18K) r0
            r0.CC7(r3)
            return
        L_0x04ca:
            r3.A00 = r2
            goto L_0x04bc
        L_0x04cd:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131899408(0x7f123410, float:1.9433761E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0N
            r5 = 7
            r2 = 2
        L_0x04dc:
            java.lang.String r0 = "android.intent.action.RINGTONE_PICKER"
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            java.lang.String r0 = "android.intent.extra.ringtone.TITLE"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_SILENT"
            r1 = 1
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_DEFAULT"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "android.intent.extra.ringtone.DEFAULT_URI"
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r4.putExtra(r1, r0)
            if (r6 == 0) goto L_0x050f
            java.lang.String r0 = "Silent"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x050f
            android.net.Uri r1 = android.net.Uri.parse(r6)
            if (r1 == 0) goto L_0x050f
            java.lang.String r0 = "android.intent.extra.ringtone.EXISTING_URI"
            r4.putExtra(r0, r1)
        L_0x050f:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r1 = "android.intent.extra.ringtone.TYPE"
            if (r0 == 0) goto L_0x0528
            r0 = 2
            r4.putExtra(r1, r0)
        L_0x051f:
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)
            r3.startActivityForResult(r0, r2)
            return
        L_0x0528:
            r4.putExtra(r1, r5)
            goto L_0x051f
        L_0x052c:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0F
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0F
            boolean r1 = A02(r0, r1)
            r2.A0R = r1
            X.1Nb r0 = r2.A0J
            r0.A0u(r1)
            return
        L_0x0545:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A04
            X.0vb r1 = r4.A00
            int[] r0 = com.whatsapp.settings.SettingsNotifications.A0z
            java.lang.String[] r2 = r1.A0R(r0)
            r1 = 11
            r0 = 2131899404(0x7f12340c, float:1.9433753E38)
            goto L_0x05a5
        L_0x0559:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A05
            r2 = 10
            r1 = 2131899406(0x7f12340e, float:1.9433757E38)
            r0 = 2130903068(0x7f03001c, float:1.7412944E38)
            android.os.Bundle r3 = com.whatsapp.SingleSelectionDialogFragment.A00(r2, r3, r1, r0)
            goto L_0x05a9
        L_0x056c:
            java.lang.Object r4 = r7.A01
            X.1FU r4 = (X.AnonymousClass1FU) r4
            java.lang.String r3 = "26000003"
            r2 = 2131894704(0x7f1221b0, float:1.942422E38)
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "message_string_res_id"
            r1.putInt(r0, r2)
            java.lang.String r0 = "faq_id"
            r1.putString(r0, r3)
            com.whatsapp.dialogs.FAQLearnMoreDialogFragment r0 = new com.whatsapp.dialogs.FAQLearnMoreDialogFragment
            r0.<init>()
            r0.A1R(r1)
            r4.CMl(r0)
            return
        L_0x058f:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A06
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2130903079(0x7f030027, float:1.7412966E38)
            java.lang.String[] r2 = r1.getStringArray(r0)
            r1 = 9
            r0 = 2131899413(0x7f123415, float:1.9433771E38)
        L_0x05a5:
            android.os.Bundle r3 = com.whatsapp.SingleSelectionDialogFragment.A03(r2, r1, r3, r0)
        L_0x05a9:
            com.whatsapp.SingleSelectionDialogFragment r0 = new com.whatsapp.SingleSelectionDialogFragment
            r0.<init>()
            r0.A1R(r3)
            r4.CMl(r0)
            return
        L_0x05b5:
            java.lang.Object r2 = r7.A01
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0C
            r0.toggle()
            X.0z4 r1 = r2.A0A
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0C
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r1)
            java.lang.String r0 = "conversation_sound"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x05d0:
            java.lang.Object r2 = r7.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            com.whatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog r1 = new com.whatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r1.A1R(r0)
            r2.CMl(r1)
            return
        L_0x05e4:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsHelpActivity r3 = (com.whatsapp.settings.SettingsHelpActivity) r3
            X.00H r0 = r3.A0D
            if (r0 == 0) goto L_0x0663
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.About"
            goto L_0x06b7
        L_0x05f8:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.SettingsHelpActivity r3 = (com.whatsapp.settings.SettingsHelpActivity) r3
            X.00H r0 = r3.A0D
            if (r0 == 0) goto L_0x0663
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity"
            goto L_0x06b7
        L_0x060c:
            java.lang.Object r5 = r7.A01
            com.whatsapp.settings.SettingsHelpActivity r5 = (com.whatsapp.settings.SettingsHelpActivity) r5
            X.00H r0 = r5.A0B
            if (r0 == 0) goto L_0x0666
            java.lang.Object r2 = r0.get()
            X.1mP r2 = (X.C35541mP) r2
            r0 = 20
            X.63s r1 = new X.63s
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r2.A00
            r0.CC4(r1)
            X.0ve r2 = r5.A0E
            r1 = 9505(0x2521, float:1.332E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0640
            X.19T r1 = r5.A03
            r0 = 376777540(0x16752b44, float:1.9804595E-25)
            r1.markerStart(r0, r0)
        L_0x0640:
            X.1L9 r4 = r5.A01
            X.00H r0 = r5.A0D
            if (r0 == 0) goto L_0x0663
            r0.get()
            java.lang.String r3 = "com.bloks.www.csf.whatsapp.gethelp.user"
            r2 = 0
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            r1.setClassName(r5, r0)
            java.lang.String r0 = "screen_name"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "screen_params"
            r1.putExtra(r0, r2)
            r4.A08(r5, r1)
            return
        L_0x0663:
            java.lang.String r0 = "waIntents"
            goto L_0x0668
        L_0x0666:
            java.lang.String r0 = "supportLogger"
        L_0x0668:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x066d:
            java.lang.Object r2 = r7.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            X.1LC r1 = r2.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x0683:
            java.lang.Object r0 = r7.A01
            com.whatsapp.settings.SettingsDataUsageActivity r0 = (com.whatsapp.settings.SettingsDataUsageActivity) r0
            r0.A4b()
            return
        L_0x068b:
            java.lang.Object r4 = r7.A01
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            java.lang.String r3 = r4.A0S
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsNetworkUsage"
        L_0x069b:
            r2.setClassName(r1, r0)
            if (r3 == 0) goto L_0x06a5
            java.lang.String r0 = "search_result_key"
            r2.putExtra(r0, r3)
        L_0x06a5:
            r4.startActivity(r2)
            return
        L_0x06a9:
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsUserProxyActivity"
        L_0x06b7:
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x06be:
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06c4:
            r0 = 2
            com.whatsapp.settings.MultiSelectionDialogFragment r0 = com.whatsapp.settings.MultiSelectionDialogFragment.A00(r2, r0, r4)
            r5.CMl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90094dW.onClick(android.view.View):void");
    }

    public static boolean A02(CompoundButton compoundButton, Object obj) {
        return obj.equals(Boolean.valueOf(compoundButton.isChecked()));
    }
}

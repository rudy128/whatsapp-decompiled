package X;

import android.content.DialogInterface;

/* renamed from: X.4ar  reason: invalid class name and case insensitive filesystem */
public class C88814ar implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C88814ar(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: com.whatsapp.twofactor.AddEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v139, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v140, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d5, code lost:
        r4 = r0.A14();
        X.AnonymousClass3MW.A1X(r6.A0Y, new com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$reset$1(r4, r5, r6, (X.C30391dr) null), X.C41561wd.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f6, code lost:
        r2.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037b, code lost:
        r2.A00(r3, r4, r5, r6, r7, r7);
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0382, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x038e, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0392, code lost:
        r0 = "emailVerificationLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0395, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0397, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0178, code lost:
        r10.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0162;
                case 1: goto L_0x0389;
                case 2: goto L_0x0383;
                case 3: goto L_0x0383;
                case 4: goto L_0x035d;
                case 5: goto L_0x0356;
                case 6: goto L_0x0350;
                case 7: goto L_0x01c5;
                case 8: goto L_0x034a;
                case 9: goto L_0x0344;
                case 10: goto L_0x033e;
                case 11: goto L_0x000f;
                case 12: goto L_0x0151;
                case 13: goto L_0x032e;
                case 14: goto L_0x031a;
                case 15: goto L_0x02fa;
                case 16: goto L_0x02e9;
                case 17: goto L_0x02cb;
                case 18: goto L_0x02c0;
                case 19: goto L_0x02b5;
                case 20: goto L_0x02a9;
                case 21: goto L_0x02a1;
                case 22: goto L_0x028b;
                case 23: goto L_0x0236;
                case 24: goto L_0x0230;
                case 25: goto L_0x01f7;
                case 26: goto L_0x01ef;
                case 27: goto L_0x01e3;
                case 28: goto L_0x01cc;
                case 29: goto L_0x01c5;
                case 30: goto L_0x012f;
                case 31: goto L_0x019e;
                case 32: goto L_0x0196;
                case 33: goto L_0x0186;
                case 34: goto L_0x017c;
                case 35: goto L_0x017c;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0121;
                case 39: goto L_0x00f5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = (com.whatsapp.voipcalling.VoipErrorDialogFragment) r0
            X.4Rb r0 = r0.A02
            r0.A01(r10)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r9.A01
            com.whatsapp.settings.MultiSelectionDialogFragment r0 = (com.whatsapp.settings.MultiSelectionDialogFragment) r0
            X.5YL r4 = r0.A01
            int r3 = r0.A00
            boolean[] r6 = r0.A02
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r5 = 0
            r1 = 0
        L_0x0021:
            int r0 = r6.length
            if (r1 >= r0) goto L_0x0032
            boolean r0 = r6[r1]
            if (r0 == 0) goto L_0x002f
            java.lang.String[] r0 = r4.A0U
            r0 = r0[r1]
            r2.add(r0)
        L_0x002f:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0032:
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r5]
            java.lang.Object[] r6 = r2.toArray(r0)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            r0 = 2
            if (r3 == r0) goto L_0x00a2
            r0 = 3
            if (r3 == r0) goto L_0x008e
            r0 = 4
            if (r3 != r0) goto L_0x0178
            int r3 = r6.length
            r2 = 0
        L_0x0045:
            if (r2 >= r3) goto L_0x0057
            r0 = r6[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0057:
            r4.A01 = r5
            X.0z4 r0 = r4.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "autodownload_roaming_mask"
            X.C17880vN.A1C(r1, r0, r5)
            android.widget.TextView r1 = r4.A07
            int r0 = r4.A01
            java.lang.String r0 = com.whatsapp.settings.SettingsDataUsageActivity.A0Q(r4, r0)
            r1.setText(r0)
            X.1j3 r3 = r4.A0K
            java.lang.String r0 = "mediaautodownload/updatequeue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r2 = r3.A08
            r1 = 19
            X.7RA r0 = new X.7RA
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            int r0 = r4.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0178
            r0 = 1
            X.AnonymousClass4Yv.A01(r4, r0)
            goto L_0x0178
        L_0x008e:
            int r3 = r6.length
            r2 = 0
        L_0x0090:
            if (r2 >= r3) goto L_0x00c8
            r0 = r6[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00a2:
            int r3 = r6.length
            r2 = 0
        L_0x00a4:
            if (r2 >= r3) goto L_0x00b6
            r0 = r6[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00b6:
            r4.A00 = r5
            X.0z4 r0 = r4.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "autodownload_cellular_mask"
            X.C17880vN.A1C(r1, r0, r5)
            android.widget.TextView r1 = r4.A06
            int r0 = r4.A00
            goto L_0x00d9
        L_0x00c8:
            r4.A02 = r5
            X.0z4 r0 = r4.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "autodownload_wifi_mask"
            X.C17880vN.A1C(r1, r0, r5)
            android.widget.TextView r1 = r4.A08
            int r0 = r4.A02
        L_0x00d9:
            java.lang.String r0 = com.whatsapp.settings.SettingsDataUsageActivity.A0Q(r4, r0)
            r1.setText(r0)
            X.1j3 r3 = r4.A0K
            java.lang.String r0 = "mediaautodownload/updatequeue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r2 = r3.A08
            r1 = 19
            X.7RA r0 = new X.7RA
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            goto L_0x0178
        L_0x00f5:
            java.lang.Object r4 = r9.A01
            com.whatsapp.voipcalling.WASecuredDialogFragment r4 = (com.whatsapp.voipcalling.WASecuredDialogFragment) r4
            X.129 r1 = r4.A01
            java.lang.String r0 = "26000103"
            android.net.Uri r3 = r1.A03(r0)
            android.content.Context r0 = r4.A1n()
            if (r0 == 0) goto L_0x011b
            X.1L8 r2 = r4.A00
            android.content.Context r1 = r4.A1n()
            r0 = 0
            r2.CGU(r1, r3, r0)
        L_0x0111:
            boolean r0 = r4.A1b()
            if (r0 == 0) goto L_0x000e
            r4.A29()
            return
        L_0x011b:
            java.lang.String r0 = "Dialog detached from activity, null context"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0111
        L_0x0121:
            java.lang.Object r1 = r9.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x000e
            r1.A29()
            return
        L_0x012f:
            java.lang.Object r1 = r9.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 1
            androidx.fragment.app.Fragment r1 = androidx.fragment.app.Fragment.A0L(r1, r0)
            com.whatsapp.twofactor.SetEmailFragment r1 = (com.whatsapp.twofactor.SetEmailFragment) r1
            if (r1 == 0) goto L_0x000e
            java.lang.String r0 = "setemailfragment/do-skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.widget.EditText r0 = r1.A01
            if (r0 == 0) goto L_0x0148
            X.AnonymousClass3MW.A1S(r0)
        L_0x0148:
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r1.A05
            if (r1 == 0) goto L_0x000e
            r0 = 0
            r1.A4d(r0)
            return
        L_0x0151:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            com.whatsapp.settings.SettingsNetworkUsage r1 = (com.whatsapp.settings.SettingsNetworkUsage) r1
            if (r1 == 0) goto L_0x000e
            r0 = 1
            com.whatsapp.settings.SettingsNetworkUsage.A0Q(r1, r0)
            return
        L_0x0162:
            java.lang.Object r0 = r9.A01
            com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity r0 = (com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity) r0
            X.9kJ r1 = r0.A01
            if (r1 == 0) goto L_0x0392
            java.lang.String r2 = r0.A08
            int r4 = r0.A00
            r7 = 3
            r3 = 0
            r5 = 10
            r6 = 4
            r1.A00(r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L_0x000e
        L_0x0178:
            r10.dismiss()
            return
        L_0x017c:
            java.lang.Object r0 = r9.A01
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = (com.whatsapp.voipcalling.VoipErrorDialogFragment) r0
            X.4Rb r0 = r0.A02
            r0.A00()
            return
        L_0x0186:
            java.lang.Object r0 = r9.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.00H r0 = r0.A1i
            java.lang.Object r0 = r0.get()
            X.4aL r0 = (X.AnonymousClass4aL) r0
            r0.A08()
            return
        L_0x0196:
            java.lang.Object r0 = r9.A01
            X.3Ll r0 = (X.C72313Ll) r0
            r0.Byx()
            return
        L_0x019e:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r4 = r0.A1B()
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            r0 = 2131897173(0x7f122b55, float:1.9429228E38)
            r4.CNA(r0)
            android.os.Handler r3 = r4.A0K
            java.lang.Runnable r2 = r4.A0L
            long r0 = X.C30901eh.A0G
            r3.postDelayed(r2, r0)
            X.1eh r2 = r4.A0B
            java.lang.String r0 = "TwoFactorAuthManager/disableTwoFactorAuth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = ""
            r0 = 0
            r2.A05(r1, r0)
            return
        L_0x01c5:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            goto L_0x038e
        L_0x01cc:
            java.lang.Object r1 = r9.A01
            com.whatsapp.twofactor.AddEmailActivity r1 = (com.whatsapp.twofactor.AddEmailActivity) r1
            X.00H r0 = r1.A05
            if (r0 == 0) goto L_0x0392
            java.lang.Object r2 = r0.get()
            X.9kJ r2 = (X.C190059kJ) r2
            java.lang.String r3 = r1.A06
            int r5 = r1.A00
            r7 = 3
            r4 = 0
            r6 = 1
            goto L_0x037b
        L_0x01e3:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            X.AnonymousClass4aU.A05(r0)
            return
        L_0x01ef:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x01f7:
            java.lang.Object r4 = r9.A01
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r4 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r4
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x021f
            java.util.Collection r1 = r4.A03
        L_0x0201:
            java.util.LinkedHashSet r3 = X.C17880vN.A14()
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0222
            java.util.Iterator r2 = r1.iterator()
        L_0x020d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0225
            X.206 r1 = X.C17880vN.A0Y(r2)
            boolean r0 = r1.A0q
            if (r0 != 0) goto L_0x020d
            r3.add(r1)
            goto L_0x020d
        L_0x021f:
            java.util.Collection r1 = r4.A04
            goto L_0x0201
        L_0x0222:
            r3.addAll(r1)
        L_0x0225:
            X.10I r2 = r4.A02
            r0 = 48
            X.7RQ r1 = new X.7RQ
            r1.<init>(r4, r3, r0)
            goto L_0x02f6
        L_0x0230:
            java.lang.Object r0 = r9.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0236:
            java.lang.Object r3 = r9.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x027a
            java.lang.String r2 = "com.samsung.android.lool"
            android.content.Context r0 = r3.A1n()     // Catch:{ NameNotFoundException -> 0x027a }
            if (r0 == 0) goto L_0x027a
            android.content.Context r0 = r3.A1n()     // Catch:{ NameNotFoundException -> 0x027a }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x027a }
            if (r0 == 0) goto L_0x027a
            android.content.Context r0 = r3.A1n()     // Catch:{ NameNotFoundException -> 0x027a }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x027a }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x027a }
            if (r0 == 0) goto L_0x027a
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0275 }
            r0.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x0275 }
            android.content.Intent r0 = r0.setPackage(r2)     // Catch:{ ActivityNotFoundException -> 0x0275 }
            r3.A1k(r0)     // Catch:{ ActivityNotFoundException -> 0x0275 }
            return
        L_0x0275:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch com.samsung.android.lool"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x027a:
            java.lang.String r1 = "android.intent.action.POWER_USAGE_SUMMARY"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0285 }
            r0.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x0285 }
            r3.A1k(r0)     // Catch:{ ActivityNotFoundException -> 0x0285 }
            return
        L_0x0285:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch power usage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x028b:
            java.lang.Object r0 = r9.A01
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r0 = (com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment) r0
            X.1SB r1 = r0.A01
            if (r1 == 0) goto L_0x029d
            X.77d r0 = r0.A00
            java.util.Set r0 = X.C18070vi.A0P(r0)
            r1.A0J(r0)
            return
        L_0x029d:
            java.lang.String r0 = "stickerRepository"
            goto L_0x0397
        L_0x02a1:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
            goto L_0x038e
        L_0x02a9:
            java.lang.Object r1 = r9.A01
            X.1OS r1 = (X.AnonymousClass1OS) r1
            java.lang.Integer r0 = X.C72463Mc.A0k(r1, r11)
            r1.invoke(r10, r0)
            return
        L_0x02b5:
            java.lang.Object r0 = r9.A01
            com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment r0 = (com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment) r0
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r6 = r0.A01
            if (r6 == 0) goto L_0x0395
            X.4D5 r5 = X.AnonymousClass4D5.WALLPAPER
            goto L_0x02d5
        L_0x02c0:
            java.lang.Object r0 = r9.A01
            com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r0 = (com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment) r0
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r6 = r0.A02
            if (r6 == 0) goto L_0x0395
            X.4D5 r5 = X.AnonymousClass4D5.THEME_AND_WALLPAPER
            goto L_0x02d5
        L_0x02cb:
            java.lang.Object r0 = r9.A01
            com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment r0 = (com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment) r0
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r6 = r0.A01
            if (r6 == 0) goto L_0x0395
            X.4D5 r5 = X.AnonymousClass4D5.THEME
        L_0x02d5:
            android.content.Context r4 = r0.A14()
            X.1OX r3 = X.C41561wd.A00(r6)
            X.0wl r2 = r6.A0Y
            r1 = 0
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$reset$1 r0 = new com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$reset$1
            r0.<init>(r4, r5, r6, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x02e9:
            java.lang.Object r3 = r9.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            X.10I r2 = r3.A05
            r0 = 29
            X.4ro r1 = new X.4ro
            r1.<init>((java.lang.Object) r3, (int) r0)
        L_0x02f6:
            r2.CGF(r1)
            return
        L_0x02fa:
            java.lang.Object r3 = r9.A01
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r3 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r3
            java.lang.String r0 = "SettingsPasskeys/deletePasskey/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9mj r1 = X.C72473Md.A0Z(r3)
            r2 = 0
            r0 = 14
            r1.A00(r2, r2, r0)
            X.1pm r1 = X.AnonymousClass3MZ.A0H(r3)
            com.whatsapp.settings.SettingsPasskeysEnabledFragment$showDeleteDialog$dialog$2$1 r0 = new com.whatsapp.settings.SettingsPasskeysEnabledFragment$showDeleteDialog$dialog$2$1
            r0.<init>(r3, r2)
            X.AnonymousClass3MX.A1Q(r0, r1)
            return
        L_0x031a:
            java.lang.Object r1 = r9.A01
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r1 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r1
            java.lang.String r0 = "SettingsPasskeys/deletePasskey/cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9mj r2 = X.C72473Md.A0Z(r1)
            r1 = 0
            r0 = 13
            r2.A00(r1, r1, r0)
            return
        L_0x032e:
            java.lang.Object r3 = r9.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            X.10I r2 = r3.A05
            r1 = 3
            X.49i r0 = new X.49i
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.C17890vO.A0u(r0, r2)
            return
        L_0x033e:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            goto L_0x038e
        L_0x0344:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            goto L_0x038e
        L_0x034a:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            goto L_0x038e
        L_0x0350:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            goto L_0x038e
        L_0x0356:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 8
            goto L_0x038e
        L_0x035d:
            java.lang.Object r1 = r9.A01
            com.whatsapp.registration.email.VerifyEmail r1 = (com.whatsapp.registration.email.VerifyEmail) r1
            r10.dismiss()
            java.lang.String r0 = "VerifyEmail/onBackPressed/skip verify email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r1.A4f()
            java.lang.Object r2 = r0.get()
            X.9kJ r2 = (X.C190059kJ) r2
            java.lang.String r3 = r1.A0N
            int r5 = r1.A00
            r7 = 3
            r4 = 0
            r6 = 8
        L_0x037b:
            r8 = r7
            r2.A00(r3, r4, r5, r6, r7, r8)
            r1.finish()
            return
        L_0x0383:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            goto L_0x038e
        L_0x0389:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
        L_0x038e:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0392:
            java.lang.String r0 = "emailVerificationLogger"
            goto L_0x0397
        L_0x0395:
            java.lang.String r0 = "viewModel"
        L_0x0397:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88814ar.onClick(android.content.DialogInterface, int):void");
    }
}

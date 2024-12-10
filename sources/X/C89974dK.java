package X;

import android.view.View;

/* renamed from: X.4dK  reason: invalid class name and case insensitive filesystem */
public class C89974dK implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89974dK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89974dK(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r0 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        r0.A04.A0U(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034f, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0353, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x038f, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0392, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03a2, code lost:
        com.whatsapp.status.StatusesFragment.A0B(r2, ((X.AnonymousClass7FX) r2.A0j.A03.get()).A01(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r0 = "shareSheetController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f8, code lost:
        r3.CMm((androidx.fragment.app.DialogFragment) r0.getValue(), "PreviewThemePickerBottomSheetFragment");
        r3.A0B = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0509, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0537, code lost:
        r2.A0D(r3, r0, r1);
        r2.A0H(r0);
        r2.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0540, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05d0, code lost:
        r2.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06b1, code lost:
        r7 = X.AnonymousClass3MY.A0D(android.view.LayoutInflater.from(r4), 2131626642);
        r5 = (com.whatsapp.WaEditText) X.C18070vi.A05(r7, 2131434221);
        r5.setFilters(new X.C89534cc[]{new X.C89534cc(0, 65535)});
        r3 = (android.widget.CheckBox) X.C18070vi.A05(r7, 2131434226);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06df, code lost:
        if (r6 == false) goto L_0x0723;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06e1, code lost:
        r3.setVisibility(8);
        r0 = ((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r4.A05.getValue()).A0T().A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06f4, code lost:
        r0 = java.lang.String.valueOf(r0);
        X.AnonymousClass3MW.A1S(r5);
        r5.append(r0);
        r2 = X.AnonymousClass4a6.A00(r4);
        r2.A0E(r8);
        r2.A0c(r7);
        r2.A0g(r4, new X.C91534fq(r3, r5, r4, r6), 2131895378);
        X.C73203Rj.A05(r4, r2, 13, 2131898766);
        r0 = X.AnonymousClass3MY.A0L(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x071f, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0722, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0723, code lost:
        r3.setVisibility(0);
        r3.setText(2131894831);
        r1 = r4.A05;
        r3.setChecked(((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r1.getValue()).A0T().A06);
        r0 = ((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r1.getValue()).A0T().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        r0.A00.A04(r1);
        r0 = r2.A0F;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x031d;
                case 1: goto L_0x0670;
                case 2: goto L_0x06a9;
                case 3: goto L_0x06a0;
                case 4: goto L_0x0652;
                case 5: goto L_0x061f;
                case 6: goto L_0x0005;
                case 7: goto L_0x05f1;
                case 8: goto L_0x05de;
                case 9: goto L_0x0005;
                case 10: goto L_0x05d4;
                case 11: goto L_0x05c0;
                case 12: goto L_0x05a5;
                case 13: goto L_0x0577;
                case 14: goto L_0x0549;
                case 15: goto L_0x0295;
                case 16: goto L_0x0541;
                case 17: goto L_0x0521;
                case 18: goto L_0x050a;
                case 19: goto L_0x0143;
                case 20: goto L_0x0089;
                case 21: goto L_0x04f1;
                case 22: goto L_0x04e9;
                case 23: goto L_0x04d7;
                case 24: goto L_0x0481;
                case 25: goto L_0x0475;
                case 26: goto L_0x0462;
                case 27: goto L_0x044f;
                case 28: goto L_0x0449;
                case 29: goto L_0x0425;
                case 30: goto L_0x0412;
                case 31: goto L_0x040a;
                case 32: goto L_0x040a;
                case 33: goto L_0x0062;
                case 34: goto L_0x0400;
                case 35: goto L_0x033f;
                case 36: goto L_0x03e9;
                case 37: goto L_0x03d8;
                case 38: goto L_0x03c8;
                case 39: goto L_0x03b4;
                case 40: goto L_0x039b;
                case 41: goto L_0x0393;
                case 42: goto L_0x0389;
                case 43: goto L_0x0382;
                case 44: goto L_0x067e;
                case 45: goto L_0x003e;
                case 46: goto L_0x040a;
                case 47: goto L_0x0369;
                case 48: goto L_0x002d;
                case 49: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r2 = (com.whatsapp.settings.SettingsTabActivity) r2
            r1 = 1
            r0 = 0
            com.whatsapp.settings.SettingsTabActivity.A0s(r2, r1, r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.00H r0 = r2.A2K()
            java.lang.Object r0 = r0.get()
            X.6ex r0 = (X.C127806ex) r0
            java.lang.String r1 = "tap_my_contacts_except_entry"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.6pz r1 = r2.A0F
            if (r1 == 0) goto L_0x005e
            r0 = 2
            r1.A00(r0)
            return
        L_0x002d:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.00H r0 = r2.A2K()
            java.lang.Object r0 = r0.get()
            X.6ex r0 = (X.C127806ex) r0
            java.lang.String r1 = "tap_my_contacts_except"
            goto L_0x004e
        L_0x003e:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.00H r0 = r2.A2K()
            java.lang.Object r0 = r0.get()
            X.6ex r0 = (X.C127806ex) r0
            java.lang.String r1 = "tap_contacts"
        L_0x004e:
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.6pz r0 = r2.A0F
            if (r0 == 0) goto L_0x005e
            X.5iV r1 = r0.A04
            r0 = 2
            r1.A0U(r0)
            return
        L_0x005e:
            java.lang.String r0 = "shareSheetController"
            goto L_0x034f
        L_0x0062:
            java.lang.Object r3 = r9.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            X.00H r0 = r3.A0M
            if (r0 == 0) goto L_0x0085
            r0.get()
            android.content.Context r0 = X.AnonymousClass3MY.A04(r10)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity"
            r2.setClassName(r1, r0)
            r3.A1k(r2)
            r3.A28()
            return
        L_0x0085:
            java.lang.String r0 = "waIntents"
            goto L_0x034f
        L_0x0089:
            java.lang.Object r3 = r9.A01
            X.47H r3 = (X.AnonymousClass47H) r3
            boolean r2 = X.C28281Zt.A0B(r3)
            java.lang.Integer r1 = r3.A0C
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x009b
            if (r2 == 0) goto L_0x013f
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x009b:
            r3.A0C = r0
            android.content.ContextWrapper r2 = r3.A4c()
            boolean r0 = r3 instanceof com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r3 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r3
            X.AnonymousClass47H.A0c(r3)
            X.3Zu r1 = X.C72463Mc.A0j(r3)
            if (r1 == 0) goto L_0x000e
            r1.A00 = r2
            boolean r0 = r3.A4k()
            r1.A05 = r0
            r1.A04()
            r0 = 1
            r3.A0D = r0
            com.google.android.material.slider.Slider r2 = r3.A4d()
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r3.A4l()
            int r0 = r0.getCurrentItem()
            int r0 = r1.A0I(r0)
        L_0x00ce:
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 - r1
            r2.setValue(r0)
            return
        L_0x00d6:
            boolean r0 = r3 instanceof com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview
            if (r0 == 0) goto L_0x010b
            com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview r3 = (com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview) r3
            android.content.ContextWrapper r0 = r3.A4c()
            android.util.Pair r1 = com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper.A03(r0)
            java.lang.Object r0 = r1.first
            X.C18070vi.A0W(r0)
            int[] r0 = (int[]) r0
            r3.A03 = r0
            java.lang.Object r0 = r1.second
            X.C18070vi.A0W(r0)
            int[] r0 = (int[]) r0
            r3.A04 = r0
            X.AnonymousClass47H.A0c(r3)
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r3.A4l()
            X.1b8 r0 = r0.getAdapter()
            X.3Zt r0 = (X.C74383Zt) r0
            if (r0 == 0) goto L_0x000e
            r0.A00 = r2
            r0.A04()
            return
        L_0x010b:
            boolean r0 = r3 instanceof com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity
            if (r0 == 0) goto L_0x0685
            com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity r3 = (com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity) r3
            X.AnonymousClass47H.A0c(r3)
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r3.A4l()
            X.1b8 r1 = r0.getAdapter()
            X.3Zt r1 = (X.C74383Zt) r1
            if (r1 == 0) goto L_0x000e
            r1.A00 = r2
            boolean r0 = r3.A4k()
            r1.A03 = r0
            r1.A04()
            r0 = 1
            r3.A0D = r0
            com.google.android.material.slider.Slider r2 = r3.A4d()
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r3.A4l()
            int r0 = r0.getCurrentItem()
            int r0 = r1.A0I(r0)
            goto L_0x00ce
        L_0x013f:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x009b
        L_0x0143:
            java.lang.Object r4 = r9.A01
            X.47H r4 = (X.AnonymousClass47H) r4
            boolean r5 = r4 instanceof com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity
            if (r5 == 0) goto L_0x0257
            r7 = r4
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r7 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r7
            java.util.Set r1 = r7.A0B
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r7.A4l()
            int r0 = r0.getCurrentItem()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0176
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r7)
            java.lang.String r0 = "pref_themes_confirmation_dialog_shown"
            int r0 = X.C17890vO.A00(r1, r0)
            r0 = r0 & 2
            if (r0 != 0) goto L_0x069b
        L_0x0176:
            boolean r2 = r7.A06
            r6 = r2 ^ 1
            r3 = 0
            r1 = 1
            X.1BI r0 = r7.A00
            if (r2 != 0) goto L_0x023d
            if (r0 != 0) goto L_0x0248
            r0 = 2131896853(0x7f122a15, float:1.9428579E38)
        L_0x0185:
            java.lang.String r3 = r7.getString(r0)
        L_0x0189:
            X.C18070vi.A0b(r3)
            r8 = 0
            r2 = 0
            X.3Ri r7 = X.C73193Ri.A00(r4)
            if (r5 == 0) goto L_0x022d
            r0 = r4
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r0 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r0
            boolean r0 = r0.A06
            r1 = 2131896856(0x7f122a18, float:1.9428585E38)
            if (r0 != 0) goto L_0x01a1
            r1 = 2131896858(0x7f122a1a, float:1.942859E38)
        L_0x01a1:
            r7.A0V(r1)
            r7.A0d(r3)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 45
            X.C73193Ri.A01(r7, r0, r1)
            if (r6 == 0) goto L_0x0227
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131627188(0x7f0e0cb4, float:1.8881633E38)
            android.view.View r3 = r1.inflate(r0, r2)
            r0 = 2131429078(0x7f0b06d6, float:1.8479819E38)
            android.view.View r2 = r3.findViewById(r0)
            com.google.android.material.checkbox.MaterialCheckBox r2 = (com.google.android.material.checkbox.MaterialCheckBox) r2
            if (r5 == 0) goto L_0x0225
            r0 = r4
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r0 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r0
            boolean r1 = r0.A06
            r0 = 0
            if (r1 != 0) goto L_0x01d2
            r0 = 2131896852(0x7f122a14, float:1.9428577E38)
        L_0x01d2:
            r2.setText(r0)
            r2.setChecked(r8)
            r7.A0c(r3)
            X.5WE r3 = new X.5WE
            r3.<init>(r2, r4)
        L_0x01e0:
            if (r5 == 0) goto L_0x0216
            r0 = r4
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r0 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r0
            boolean r0 = r0.A06
            r2 = 2131896855(0x7f122a17, float:1.9428583E38)
            if (r0 != 0) goto L_0x01ef
            r2 = 2131896850(0x7f122a12, float:1.9428573E38)
        L_0x01ef:
            r1 = 20
            X.4ar r0 = new X.4ar
            r0.<init>(r3, r1)
            r7.A0X(r0, r2)
            r7.A0C()
            if (r5 == 0) goto L_0x0689
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r4 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r4
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x000e
            X.0z4 r2 = r4.A0A
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r2)
            java.lang.String r1 = "pref_themes_confirmation_dialog_shown"
            int r0 = X.C17890vO.A00(r0, r1)
            r0 = r0 | 2
            X.C17900vP.A0M(r2, r1, r0)
            return
        L_0x0216:
            java.lang.Boolean r0 = r4.A0B
            boolean r0 = X.C72463Mc.A1Y(r0)
            r2 = 2131896850(0x7f122a12, float:1.9428573E38)
            if (r0 != 0) goto L_0x01ef
            r2 = 2131896860(0x7f122a1c, float:1.9428593E38)
            goto L_0x01ef
        L_0x0225:
            r0 = 0
            goto L_0x01d2
        L_0x0227:
            X.5WD r3 = new X.5WD
            r3.<init>(r4)
            goto L_0x01e0
        L_0x022d:
            java.lang.Boolean r0 = r4.A0B
            boolean r0 = X.C72463Mc.A1Y(r0)
            r1 = 2131896858(0x7f122a1a, float:1.942859E38)
            if (r0 != 0) goto L_0x01a1
            r1 = 2131896861(0x7f122a1d, float:1.9428595E38)
            goto L_0x01a1
        L_0x023d:
            if (r0 != 0) goto L_0x0244
            r0 = 2131896849(0x7f122a11, float:1.942857E38)
            goto L_0x0185
        L_0x0244:
            r2 = 2131896857(0x7f122a19, float:1.9428587E38)
            goto L_0x024b
        L_0x0248:
            r2 = 2131896859(0x7f122a1b, float:1.9428591E38)
        L_0x024b:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r7.A4f()
            java.lang.String r3 = X.C17880vN.A0q(r7, r0, r1, r3, r2)
            goto L_0x0189
        L_0x0257:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r4)
            java.lang.String r0 = "pref_themes_confirmation_dialog_shown"
            int r0 = X.C17890vO.A00(r1, r0)
            r0 = r0 & 1
            if (r0 != 0) goto L_0x069b
            r6 = 0
            java.lang.Boolean r0 = r4.A0B
            r3 = 1
            boolean r1 = X.C18070vi.A19(r0, r3)
            X.1BI r0 = r4.A00
            if (r1 != 0) goto L_0x027c
            if (r0 != 0) goto L_0x0282
            r0 = 2131896854(0x7f122a16, float:1.942858E38)
        L_0x0276:
            java.lang.String r3 = r4.getString(r0)
            goto L_0x0189
        L_0x027c:
            if (r0 != 0) goto L_0x0286
            r0 = 2131896853(0x7f122a15, float:1.9428579E38)
            goto L_0x0276
        L_0x0282:
            r2 = 2131896862(0x7f122a1e, float:1.9428597E38)
            goto L_0x0289
        L_0x0286:
            r2 = 2131896859(0x7f122a1b, float:1.9428591E38)
        L_0x0289:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r4.A4f()
            java.lang.String r3 = X.C17880vN.A0q(r4, r0, r1, r6, r2)
            goto L_0x0189
        L_0x0295:
            java.lang.Object r5 = r9.A01
            com.whatsapp.settings.SettingsUserProxyActivity r5 = (com.whatsapp.settings.SettingsUserProxyActivity) r5
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r5.A0A
            boolean r1 = r0.A0Y()
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r5.A0A
            if (r1 == 0) goto L_0x02d0
            X.4Yf r3 = r0.A0T()
            java.lang.Class<com.whatsapp.settings.SettingsSetupUserProxyActivity> r0 = com.whatsapp.settings.SettingsSetupUserProxyActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r0)
            java.lang.String r1 = "intent_host_name"
            java.lang.String r0 = r3.A03
            r2.putExtra(r1, r0)
            java.lang.String r1 = "intent_chat_port"
            int r0 = r3.A00
            r2.putExtra(r1, r0)
            java.lang.String r1 = "intent_media_port"
            int r0 = r3.A01
            r2.putExtra(r1, r0)
            java.lang.String r1 = "intent_use_tls"
            boolean r0 = r3.A06
            r2.putExtra(r1, r0)
            r0 = 10001(0x2711, float:1.4014E-41)
            r5.startActivityForResult(r2, r0)
            return
        L_0x02d0:
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x000e
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131626641(0x7f0e0a91, float:1.8880524E38)
            android.view.View r1 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131434220(0x7f0b1aec, float:1.8490248E38)
            android.widget.TextView r4 = X.AnonymousClass3MW.A0J(r1, r0)
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r5.A0A
            X.1DT r0 = r0.A05
            java.lang.Object r0 = r0.A06()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131894824(0x7f122228, float:1.9424464E38)
            r3.A0E(r0)
            r3.A0c(r1)
            r2 = 2131895378(0x7f122452, float:1.9425587E38)
            r1 = 28
            X.4bC r0 = new X.4bC
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r4, (int) r1)
            r3.A0Z(r0, r2)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 40
            X.C73203Rj.A07(r3, r0, r1)
            X.05w r0 = r3.create()
            goto L_0x071f
        L_0x031d:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.1Si r0 = r2.A05
            if (r0 == 0) goto L_0x033c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.A0B
            r0 = r0 ^ 1
            r2.A0B = r0
            X.10I r1 = r2.A05
            r0 = 17
            X.C98844ro.A02(r1, r2, r0)
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A03(r2)
            return
        L_0x033c:
            java.lang.String r0 = "traffAnonGating"
            goto L_0x034f
        L_0x033f:
            java.lang.Object r0 = r9.A01
            X.73S r0 = (X.AnonymousClass73S) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A03
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r2 = r0.A0K
            if (r2 == 0) goto L_0x000e
            X.6Up r0 = r2.A00
            if (r0 != 0) goto L_0x0354
            java.lang.String r0 = "crossPostingViewModelState"
        L_0x034f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0354:
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x000e
            X.00H r0 = r2.A05
            java.lang.Object r0 = r0.get()
            X.7FX r0 = (X.AnonymousClass7FX) r0
            r0.A02()
            r1 = 1
            r0 = 0
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel.A00(r2, r0, r1)
            return
        L_0x0369:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            X.00H r0 = r2.A2K()
            java.lang.Object r0 = r0.get()
            X.6ex r0 = (X.C127806ex) r0
            java.lang.String r1 = "tap_done_button"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            r2.A28()
            return
        L_0x0382:
            java.lang.Object r0 = r9.A01
            X.4P9 r0 = (X.AnonymousClass4P9) r0
            X.0vk r0 = r0.A04
            goto L_0x038f
        L_0x0389:
            java.lang.Object r0 = r9.A01
            X.4P9 r0 = (X.AnonymousClass4P9) r0
            X.0vk r0 = r0.A05
        L_0x038f:
            r0.invoke()
            return
        L_0x0393:
            java.lang.Object r0 = r9.A01
            X.7M6 r0 = (X.AnonymousClass7M6) r0
            com.whatsapp.status.StatusesFragment r2 = r0.A02
            r1 = 0
            goto L_0x03a2
        L_0x039b:
            java.lang.Object r0 = r9.A01
            X.7M6 r0 = (X.AnonymousClass7M6) r0
            com.whatsapp.status.StatusesFragment r2 = r0.A02
            r1 = 1
        L_0x03a2:
            X.6z5 r0 = r2.A0j
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.7FX r0 = (X.AnonymousClass7FX) r0
            X.1IX r0 = r0.A01()
            com.whatsapp.status.StatusesFragment.A0B(r2, r0, r1)
            return
        L_0x03b4:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.1nc r2 = r0.A0F
            X.1FL r1 = r0.A1B()
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01(r1, r0)
            return
        L_0x03c8:
            java.lang.Object r1 = r9.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r0 = r1.A1n()
            android.content.Intent r0 = X.AnonymousClass1LU.A06(r0)
            r1.A1k(r0)
            return
        L_0x03d8:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.0z4 r0 = r1.A0T
            r0.A16()
            android.view.View r1 = r1.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03e9:
            java.lang.Object r0 = r9.A01
            X.5nA r0 = (X.C113485nA) r0
            android.content.Context r3 = r0.A05
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.playback.MyStatusesActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0400:
            java.lang.Object r0 = r9.A01
            X.73S r0 = (X.AnonymousClass73S) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A03
            r0.A2C()
            return
        L_0x040a:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x0412:
            java.lang.Object r2 = r9.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r2 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r2
            X.1EC r1 = r2.A05
            X.C17960vV.A07(r1)
            r0 = 0
            com.whatsapp.RevokeLinkConfirmationDialogFragment r1 = X.AnonymousClass4FZ.A00(r1, r0)
            r0 = 0
            r2.CMk(r1, r0)
            return
        L_0x0425:
            java.lang.Object r4 = r9.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r4 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r4
            X.1EC r3 = r4.A05
            r0 = 1
            android.content.Intent r2 = X.AnonymousClass3MZ.A07(r3, r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.GroupLinkQrActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            r4.startActivity(r2)
            java.lang.Integer r0 = X.C17880vN.A0i()
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity.A0Q(r4, r0)
            return
        L_0x0449:
            java.lang.Object r0 = r9.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x044f:
            java.lang.Object r0 = r9.A01
            X.3XG r0 = (X.AnonymousClass3XG) r0
            X.4Mw r0 = r0.A02
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r0 = r0.A00
            X.3XG r3 = r0.A07
            java.util.List r2 = r0.A08
            X.0yx r1 = r0.A02
            r0 = 2
            r3.A0U(r1, r2, r0)
            return
        L_0x0462:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview r2 = (com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview) r2
            r1 = 0
            r0 = 0
            r2.setResult(r1, r0)
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r2.A09
            int r0 = r0.getCurrentItem()
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview.A0Q(r2, r0)
            return
        L_0x0475:
            java.lang.Object r1 = r9.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0481:
            java.lang.Object r6 = r9.A01
            X.47N r6 = (X.AnonymousClass47N) r6
            X.1BI r2 = r6.A00
            if (r2 == 0) goto L_0x04d3
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x04d3
            X.1M9 r0 = r6.A01
            X.1Me r1 = r6.A02
            r7 = 100
            X.1E7 r0 = r0.A0E(r2)
            X.C17960vV.A07(r0)
            java.lang.String r2 = r1.A0K(r0)
            r1 = 2131898413(0x7f12302d, float:1.9431743E38)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r4 = 0
            java.lang.String r3 = X.C17880vN.A0q(r6, r2, r0, r4, r1)
            boolean r1 = X.C28281Zt.A0B(r6)
            r0 = 2131898412(0x7f12302c, float:1.943174E38)
            if (r1 == 0) goto L_0x04b5
            r0 = 2131898410(0x7f12302a, float:1.9431737E38)
        L_0x04b5:
            java.lang.String r1 = r6.getString(r0)
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            r2[r4] = r3
            r2[r5] = r1
            com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment r1 = new com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment
            r1.<init>()
            r0 = 2131898409(0x7f123029, float:1.9431735E38)
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A03(r2, r7, r4, r0)
            r1.A1R(r0)
            r6.CMl(r1)
            return
        L_0x04d3:
            r6.A4c(r2)
            return
        L_0x04d7:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity r2 = (com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity) r2
            X.0vl r0 = r2.A0C
            java.lang.Object r1 = r0.getValue()
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            java.lang.String r0 = "PreviewThemePickerBottomSheetFragment"
            r2.CMm(r1, r0)
            return
        L_0x04e9:
            java.lang.Object r3 = r9.A01
            com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity r3 = (com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity) r3
            r2 = 0
            X.0vl r0 = r3.A08
            goto L_0x04f8
        L_0x04f1:
            java.lang.Object r3 = r9.A01
            com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity r3 = (com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity) r3
            r2 = 0
            X.0vl r0 = r3.A09
        L_0x04f8:
            java.lang.Object r1 = r0.getValue()
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            java.lang.String r0 = "PreviewThemePickerBottomSheetFragment"
            r3.CMm(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A0B = r0
            return
        L_0x050a:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment r3 = new com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment
            r3.<init>()
            X.1FL r0 = r0.A1D()
            X.1jj r2 = X.AnonymousClass3Ma.A0H(r0)
            r1 = 2131429504(0x7f0b0880, float:1.8480683E38)
            java.lang.String r0 = "ThemesWallpaperCategoryFragment"
            goto L_0x0537
        L_0x0521:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment r3 = new com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment
            r3.<init>()
            X.1FL r0 = r0.A1D()
            X.1jj r2 = X.AnonymousClass3Ma.A0H(r0)
            r1 = 2131429504(0x7f0b0880, float:1.8480683E38)
            java.lang.String r0 = "ChatThemeMessageColorFragment"
        L_0x0537:
            r2.A0D(r3, r0, r1)
            r2.A0H(r0)
            r2.A01()
            return
        L_0x0541:
            java.lang.Object r0 = r9.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x0549:
            java.lang.Object r5 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r5 = (com.whatsapp.settings.SettingsTabActivity) r5
            java.lang.String r0 = "account"
            com.whatsapp.settings.SettingsTabActivity.A0t(r5, r0)
            X.00H r0 = r5.A17
            r0.get()
            java.lang.String r4 = r5.A1C
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsAccount"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "is_companion"
            r2.putExtra(r0, r3)
            if (r4 == 0) goto L_0x0573
            java.lang.String r0 = "search_result_key"
            r2.putExtra(r0, r4)
        L_0x0573:
            r5.startActivity(r2)
            return
        L_0x0577:
            java.lang.Object r4 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r4 = (com.whatsapp.settings.SettingsTabActivity) r4
            java.lang.String r0 = "account"
            com.whatsapp.settings.SettingsTabActivity.A0t(r4, r0)
            X.00H r0 = r4.A17
            r0.get()
            java.lang.String r3 = r4.A1C
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsAccount"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "is_companion"
            r0 = 1
            r2.putExtra(r1, r0)
            if (r3 == 0) goto L_0x05a1
            java.lang.String r0 = "search_result_key"
            r2.putExtra(r0, r3)
        L_0x05a1:
            r4.startActivity(r2)
            return
        L_0x05a5:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r2 = (com.whatsapp.settings.SettingsTabActivity) r2
            X.00H r0 = r2.A0w
            java.lang.Object r1 = r0.get()
            X.1pI r1 = (X.C37301pI) r1
            r0 = 1
            r1.A00(r0)
            X.00H r0 = r2.A17
            r0.get()
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1m(r2, r0)
            goto L_0x05d0
        L_0x05c0:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r2 = (com.whatsapp.settings.SettingsTabActivity) r2
            r0 = 23
            X.AnonymousClass3MY.A1S(r2, r0)
            r1 = 0
            X.0zA r0 = r2.A07
            android.content.Intent r0 = X.C1408473h.A00(r2, r0, r1)
        L_0x05d0:
            r2.startActivity(r0)
            return
        L_0x05d4:
            java.lang.Object r0 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r0 = (com.whatsapp.settings.SettingsTabActivity) r0
            com.whatsapp.WaImageView r0 = r0.A0H
            r0.callOnClick()
            return
        L_0x05de:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r2 = (com.whatsapp.settings.SettingsTabActivity) r2
            X.00H r0 = r2.A0k
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r1 = r0.A0G()
            r0 = 1
            com.whatsapp.settings.SettingsTabActivity.A0s(r2, r0, r1)
            return
        L_0x05f1:
            java.lang.Object r3 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 7
            X.AnonymousClass3MY.A1S(r3, r0)
            X.1nb r0 = r3.A0P
            r2 = 11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.A00(r1)
            boolean r0 = X.AnonymousClass3MX.A1V(r3)
            if (r0 != 0) goto L_0x0619
            X.1L9 r1 = r3.A01
            X.00H r0 = r3.A17
            r0.get()
            android.content.Intent r0 = X.AnonymousClass1LU.A0F(r3, r2)
            r1.A09(r3, r0)
            return
        L_0x0619:
            X.1nc r0 = r3.A0E
            r0.A01(r3, r1)
            return
        L_0x061f:
            java.lang.Object r3 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            X.00H r0 = r3.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            r2 = 1
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "one_of_create_group_tool_tip_activated"
            X.C17880vN.A1F(r1, r0, r2)
            X.00H r0 = r3.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "create_group_banner_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            r0 = -1
            r3.setResult(r0)
            r3.finish()
            return
        L_0x0652:
            java.lang.Object r2 = r9.A01
            com.whatsapp.settings.SettingsTabActivity r2 = (com.whatsapp.settings.SettingsTabActivity) r2
            r1 = 1
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r2.A0i
            if (r0 == 0) goto L_0x066c
            com.whatsapp.wds.components.search.WDSSearchView r0 = r0.A08
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x066c
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r2.A0i
            r0.A02(r1)
        L_0x066c:
            com.whatsapp.settings.SettingsTabActivity.A0V(r2)
            return
        L_0x0670:
            java.lang.Object r1 = r9.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x067e:
            java.lang.String r0 = "wamRuntime"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0685:
            X.AnonymousClass47H.A0c(r3)
            return
        L_0x0689:
            X.0z4 r2 = r4.A0A
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r2)
            java.lang.String r1 = "pref_themes_confirmation_dialog_shown"
            int r0 = X.C17890vO.A00(r0, r1)
            r0 = r0 | 1
            X.C17900vP.A0M(r2, r1, r0)
            return
        L_0x069b:
            r0 = 0
            r4.A4j(r0)
            return
        L_0x06a0:
            java.lang.Object r4 = r9.A01
            com.whatsapp.settings.SettingsSetupUserProxyActivity r4 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r4
            r6 = 1
            r8 = 2131894829(0x7f12222d, float:1.9424474E38)
            goto L_0x06b1
        L_0x06a9:
            java.lang.Object r4 = r9.A01
            com.whatsapp.settings.SettingsSetupUserProxyActivity r4 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r4
            r6 = 0
            r8 = 2131894828(0x7f12222c, float:1.9424472E38)
        L_0x06b1:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131626642(0x7f0e0a92, float:1.8880526E38)
            android.view.View r7 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131434221(0x7f0b1aed, float:1.849025E38)
            android.view.View r5 = X.C18070vi.A05(r7, r0)
            com.whatsapp.WaEditText r5 = (com.whatsapp.WaEditText) r5
            r0 = 1
            X.4cc[] r3 = new X.C89534cc[r0]
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = 0
            X.4cc r0 = new X.4cc
            r0.<init>(r1, r2)
            r3[r1] = r0
            r5.setFilters(r3)
            r0 = 2131434226(0x7f0b1af2, float:1.849026E38)
            android.view.View r3 = X.C18070vi.A05(r7, r0)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            if (r6 == 0) goto L_0x0723
            r0 = 8
            r3.setVisibility(r0)
            X.0vl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.4Yf r0 = r0.A0T()
            int r0 = r0.A01
        L_0x06f4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.AnonymousClass3MW.A1S(r5)
            r5.append(r0)
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r2.A0E(r8)
            r2.A0c(r7)
            r1 = 2131895378(0x7f122452, float:1.9425587E38)
            X.4fq r0 = new X.4fq
            r0.<init>(r3, r5, r4, r6)
            r2.A0g(r4, r0, r1)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 13
            X.C73203Rj.A05(r4, r2, r0, r1)
            X.05w r0 = X.AnonymousClass3MY.A0L(r2)
        L_0x071f:
            r0.show()
            return
        L_0x0723:
            r3.setVisibility(r1)
            r0 = 2131894831(0x7f12222f, float:1.9424478E38)
            r3.setText(r0)
            X.0vl r1 = r4.A05
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.4Yf r0 = r0.A0T()
            boolean r0 = r0.A06
            r3.setChecked(r0)
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.4Yf r0 = r0.A0T()
            int r0 = r0.A00
            goto L_0x06f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89974dK.onClick(android.view.View):void");
    }
}

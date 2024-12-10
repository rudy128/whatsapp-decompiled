package X;

import android.view.View;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.48o  reason: invalid class name */
public class AnonymousClass48o extends C38471rL {
    public final int A00;
    public final Object A01;

    public AnonymousClass48o(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass48o(obj, i));
    }

    public static void A01(C108575bv r1, Object obj, int i) {
        r1.setOnClickListener(new AnonymousClass48o(obj, i));
    }

    public static void A02(WDSTextLayout wDSTextLayout, Object obj, int i) {
        wDSTextLayout.setPrimaryButtonClickListener(new AnonymousClass48o(obj, i));
    }

    public static boolean A03(String str, int i) {
        if (C18070vi.A00(str.charAt(i), 32) <= 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.whatsapp.registration.email.EmailEducationScreen} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.registration.parole.CustomRegistrationBlockActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: com.whatsapp.registration.security.PCRSuccessfulActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v109, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v110, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v114, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v115, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: com.whatsapp.registration.email.EmailEducationScreen} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v418, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: com.whatsapp.registration.parole.CustomRegistrationBlockActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: com.whatsapp.registration.email.EmailEducationScreen} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: com.whatsapp.registration.parole.CustomRegistrationBlockActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v127, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v129, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v130, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v131, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v132, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v133, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v138, resolved type: com.whatsapp.settings.SettingsTabActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03c5, code lost:
        r4.setClassName(r1, r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c8, code lost:
        if (r2 == null) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ca, code lost:
        r4.putExtra("search_result_key", r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0401, code lost:
        if (r0 != null) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0485, code lost:
        r2 = r3.A1C;
        r1 = (X.C133326oZ) r3.A0n.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x048f, code lost:
        if (r2 == null) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0491, code lost:
        r2 = r3.A1C;
        X.C18070vi.A0d(r2, 1);
        r4 = X.AnonymousClass3MZ.A06(r1.A00);
        r4.setClassName(r3.getPackageName(), "com.whatsapp.settings.SettingsPrivacy");
        r4.putExtra("search_result_key", r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ad, code lost:
        r4 = X.AnonymousClass3MZ.A06(r1.A00);
        r4.setClassName(r3.getPackageName(), "com.whatsapp.settings.SettingsPrivacy");
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0583, code lost:
        r4.setClassName(r1, r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0586, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0589, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0645, code lost:
        if (r0.A0G() == false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0778, code lost:
        r4 = X.C72473Md.A0D(r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x077c, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x077f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0780, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0799, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x079c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07f1, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0130, code lost:
        r6.A03(X.C17880vN.A0q(r4, r4.A0L.A04.getText(), new java.lang.Object[1], 0, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0141, code lost:
        r0 = r4.A0L.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0145, code lost:
        r0.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0a86, code lost:
        r4.setClassName(r1, r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0148, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0a89, code lost:
        if (r2 == null) goto L_0x0af5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0a8b, code lost:
        r4.putExtra("search_result_key", r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0aa6, code lost:
        r4 = r1.setClassName(r3, r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0af5, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0af8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0b78, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0b7b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0b94, code lost:
        r0 = "emailVerificationXmppMethods";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0b97, code lost:
        r0 = "emailAddress";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0b9a, code lost:
        r0 = "emailVerificationLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0b9c, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0ba0, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01ad, code lost:
        r0 = r4.A0L.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r3.startActivityForResult(r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x09dd  */
    /* JADX WARNING: Removed duplicated region for block: B:394:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r23) {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x08a5;
                case 1: goto L_0x089f;
                case 2: goto L_0x084f;
                case 3: goto L_0x07f9;
                case 4: goto L_0x0811;
                case 5: goto L_0x07bf;
                case 6: goto L_0x079d;
                case 7: goto L_0x0784;
                case 8: goto L_0x0b51;
                case 9: goto L_0x075e;
                case 10: goto L_0x076e;
                case 11: goto L_0x0222;
                case 12: goto L_0x0af9;
                case 13: goto L_0x0669;
                case 14: goto L_0x00df;
                case 15: goto L_0x062f;
                case 16: goto L_0x0612;
                case 17: goto L_0x05f1;
                case 18: goto L_0x05e9;
                case 19: goto L_0x05e9;
                case 20: goto L_0x0597;
                case 21: goto L_0x058a;
                case 22: goto L_0x00c0;
                case 23: goto L_0x0575;
                case 24: goto L_0x056b;
                case 25: goto L_0x0538;
                case 26: goto L_0x0517;
                case 27: goto L_0x04ec;
                case 28: goto L_0x04be;
                case 29: goto L_0x047c;
                case 30: goto L_0x0459;
                case 31: goto L_0x0444;
                case 32: goto L_0x042d;
                case 33: goto L_0x03e8;
                case 34: goto L_0x03d1;
                case 35: goto L_0x0ace;
                case 36: goto L_0x0aab;
                case 37: goto L_0x0052;
                case 38: goto L_0x0a9c;
                case 39: goto L_0x0a91;
                case 40: goto L_0x03ab;
                case 41: goto L_0x0a6c;
                case 42: goto L_0x0a51;
                case 43: goto L_0x0390;
                case 44: goto L_0x0385;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x0022;
                case 48: goto L_0x0379;
                case 49: goto L_0x0370;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            X.1BI r4 = X.C88594aB.A03(r3)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity"
            X.C72473Md.A0s(r2, r4, r1, r0)
            r0 = 199(0xc7, float:2.79E-43)
        L_0x001e:
            r3.startActivityForResult(r2, r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r3 = r2.A01
            com.whatsapp.shops.ShopsProductPreviewFragment r3 = (com.whatsapp.shops.ShopsProductPreviewFragment) r3
            X.1nl r2 = r3.A02
            X.1FL r1 = r3.A1D()
            java.lang.String r0 = r3.A07
            X.C72453Mb.A18(r1, r2, r0)
            com.whatsapp.shops.ShopsProductPreviewFragmentViewModel r2 = r3.A04
            X.9kp r0 = r2.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0021
            X.8qu r1 = new X.8qu
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A01 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A00 = r0
            X.18K r0 = r2.A00
            r0.CC7(r1)
            return
        L_0x0052:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            boolean r0 = X.AnonymousClass3MW.A1Y(r3)
            if (r0 != 0) goto L_0x0086
            r0 = 2131892932(0x7f121ac4, float:1.9420626E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 2131888732(0x7f120a5c, float:1.9412108E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r3.A40(r4, r2, r1, r0)
            X.3zK r1 = new X.3zK
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A01 = r0
            X.18K r0 = r3.A0U
            r0.CC4(r1)
            return
        L_0x0086:
            X.0ve r1 = r3.A0E
            r0 = 2090(0x82a, float:2.929E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00a3
            X.00H r0 = r3.A17
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappbugreporting.InAppBugReportingActivity"
            r4.setClassName(r1, r0)
            goto L_0x0af5
        L_0x00a3:
            X.0ve r1 = r3.A0E
            r0 = 10127(0x278f, float:1.4191E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0021
            X.00H r0 = r3.A17
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappbugreporting.InAppBugReportingActivity"
            r2.setClassName(r1, r0)
            r0 = 300(0x12c, float:4.2E-43)
            goto L_0x001e
        L_0x00c0:
            java.lang.Object r1 = r2.A01
            X.Bw2 r1 = (X.C24136Bw2) r1
            X.22l r3 = r1.A09
            boolean r0 = X.C50302Tx.A00(r3)
            if (r0 == 0) goto L_0x08c7
            X.6yW r0 = r1.A08
            X.C17960vV.A07(r0)
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r3)
            X.8fi r0 = (X.C167258fi) r0
            if (r0 == 0) goto L_0x0021
            r0.cancel()
            return
        L_0x00df:
            java.lang.Object r4 = r2.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r4 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r4
            boolean r0 = r4.A11
            if (r0 != 0) goto L_0x0021
            X.0vl r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r0
            r2 = 0
            r0.A0U(r2)
            int r5 = r4.A00
            X.9gv r0 = r4.A0L
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = X.C17900vP.A08(r0)
            java.lang.String r9 = "\\D"
            java.lang.String r6 = ""
            java.lang.String r7 = r0.replaceAll(r9, r6)
            X.9gv r0 = r4.A0L
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r8 = X.C17900vP.A08(r0)
            X.1LA r1 = r4.A04
            X.6z4 r0 = r4.A0E
            int r1 = X.C63942tw.A00(r1, r0, r7, r8)
            r3 = 1
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            switch(r1) {
                case 1: goto L_0x01b2;
                case 2: goto L_0x018e;
                case 3: goto L_0x0176;
                case 4: goto L_0x0165;
                case 5: goto L_0x0157;
                case 6: goto L_0x0149;
                default: goto L_0x0123;
            }
        L_0x0123:
            r0.A0Z(r2)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Y(r2)
            X.9uO r6 = r4.A0H
            r5 = 2131894977(0x7f1222c1, float:1.9424774E38)
        L_0x0130:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.9gv r0 = r4.A0L
            android.widget.TextView r0 = r0.A04
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C17880vN.A0q(r4, r0, r1, r2, r5)
            r6.A03(r0)
        L_0x0141:
            X.9gv r0 = r4.A0L
            android.widget.EditText r0 = r0.A03
        L_0x0145:
            r0.requestFocus()
            return
        L_0x0149:
            r0.A0Z(r2)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Y(r2)
            X.9uO r6 = r4.A0H
            r5 = 2131894978(0x7f1222c2, float:1.9424776E38)
            goto L_0x0130
        L_0x0157:
            r0.A0Z(r2)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Y(r2)
            X.9uO r6 = r4.A0H
            r5 = 2131894979(0x7f1222c3, float:1.9424778E38)
            goto L_0x0130
        L_0x0165:
            r0.A0Y(r3)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Z(r2)
            X.9uO r1 = r4.A0H
            r0 = 2131894987(0x7f1222cb, float:1.9424794E38)
            r1.A02(r0)
            goto L_0x0141
        L_0x0176:
            r0.A0Y(r2)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Z(r2)
            X.9uO r1 = r4.A0H
            r0 = 2131894974(0x7f1222be, float:1.9424768E38)
            r1.A02(r0)
            X.9gv r0 = r4.A0L
            android.widget.EditText r0 = r0.A02
            r0.setText(r6)
            goto L_0x01ad
        L_0x018e:
            r0.A0Y(r3)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Z(r2)
            X.9uO r6 = r4.A0H
            r5 = 2131894973(0x7f1222bd, float:1.9424766E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.C17880vN.A1T(r1, r3, r2)
            r0 = 3
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r0 = r4.getString(r5, r1)
            r6.A03(r0)
        L_0x01ad:
            X.9gv r0 = r4.A0L
            android.widget.EditText r0 = r0.A02
            goto L_0x0145
        L_0x01b2:
            r0.A0Z(r3)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            r0.A0Y(r2)
            int r1 = java.lang.Integer.parseInt(r7)
            java.lang.String r6 = r8.replaceAll(r9, r6)
            X.1LA r0 = r4.A04     // Catch:{ IOException -> 0x01c9 }
            java.lang.String r6 = r0.A03(r1, r6)     // Catch:{ IOException -> 0x01c9 }
            goto L_0x01cf
        L_0x01c9:
            r1 = move-exception
            java.lang.String r0 = "RegisterPhone/cc failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/cc="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/number="
            X.C17900vP.A0f(r0, r6, r1)
            boolean r0 = r4.A4m(r7, r6, r3)
            if (r0 != 0) goto L_0x0021
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A06
            java.lang.Object r0 = r0.A06()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x08dc
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A0D
            java.lang.Object r0 = r0.A06()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x08dc
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.00H r0 = r0.A0P
            java.lang.Object r0 = r0.get()
            X.9hs r0 = (X.C188719hs) r0
            X.9Ba r1 = r0.A00
            if (r1 == 0) goto L_0x08dc
            int r0 = r1.A09()
            if (r0 != r3) goto L_0x08dc
            X.8CU r0 = r1.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x08dc
            java.lang.String r0 = "RegisterPhone/still initializing"
            goto L_0x0b78
        L_0x0222:
            java.lang.String r0 = "ChangeNumber/next"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r8 = r2.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r8 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r8
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x0233
            java.lang.String r0 = "ChangeNumber/next/disabled"
            goto L_0x0b78
        L_0x0233:
            X.9gv r0 = r8.A0E
            java.lang.String r12 = "oldNumberEntry"
            r11 = 0
            if (r0 != 0) goto L_0x023e
            X.C18070vi.A11(r12)
            throw r11
        L_0x023e:
            android.widget.EditText r0 = r0.A02
            if (r0 == 0) goto L_0x026b
            android.text.Editable r0 = r0.getText()
        L_0x0246:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r3 = r4.length()
            r7 = 1
            int r3 = r3 - r7
            r5 = 0
            r2 = 0
            r1 = 0
        L_0x0253:
            if (r2 > r3) goto L_0x026d
            r0 = r3
            if (r1 != 0) goto L_0x0259
            r0 = r2
        L_0x0259:
            boolean r0 = A03(r4, r0)
            if (r1 != 0) goto L_0x0266
            if (r0 != 0) goto L_0x0263
            r1 = 1
            goto L_0x0253
        L_0x0263:
            int r2 = r2 + 1
            goto L_0x0253
        L_0x0266:
            if (r0 == 0) goto L_0x026d
            int r3 = r3 + -1
            goto L_0x0253
        L_0x026b:
            r0 = r11
            goto L_0x0246
        L_0x026d:
            int r0 = r3 + 1
            java.lang.CharSequence r0 = r4.subSequence(r2, r0)
            java.lang.String r9 = r0.toString()
            X.9gv r0 = r8.A0E
            if (r0 != 0) goto L_0x027f
            X.C18070vi.A11(r12)
            throw r11
        L_0x027f:
            android.widget.EditText r0 = r0.A03
            if (r0 == 0) goto L_0x0293
            android.text.Editable r0 = r0.getText()
        L_0x0287:
            java.lang.String r10 = java.lang.String.valueOf(r0)
            X.9gv r0 = r8.A0E
            if (r0 != 0) goto L_0x0295
            X.C18070vi.A11(r12)
            throw r11
        L_0x0293:
            r0 = r11
            goto L_0x0287
        L_0x0295:
            boolean r0 = com.whatsapp.registration.phonenumberentry.ChangeNumber.A13(r8, r0, r9, r10)
            if (r0 == 0) goto L_0x0021
            X.9gv r0 = r8.A0L
            android.widget.EditText r0 = r0.A02
            java.lang.String r4 = X.AnonymousClass3Ma.A12(r0)
            int r3 = r4.length()
            int r3 = r3 - r7
            r2 = 0
            r1 = 0
        L_0x02aa:
            if (r2 > r3) goto L_0x02c2
            r0 = r3
            if (r1 != 0) goto L_0x02b0
            r0 = r2
        L_0x02b0:
            boolean r0 = A03(r4, r0)
            if (r1 != 0) goto L_0x02bd
            if (r0 != 0) goto L_0x02ba
            r1 = 1
            goto L_0x02aa
        L_0x02ba:
            int r2 = r2 + 1
            goto L_0x02aa
        L_0x02bd:
            if (r0 == 0) goto L_0x02c2
            int r3 = r3 + -1
            goto L_0x02aa
        L_0x02c2:
            int r0 = r3 + 1
            java.lang.CharSequence r0 = r4.subSequence(r2, r0)
            java.lang.String r4 = r0.toString()
            X.9gv r0 = r8.A0L
            android.widget.EditText r0 = r0.A03
            java.lang.String r3 = X.AnonymousClass3Ma.A12(r0)
            X.9gv r0 = r8.A0L
            X.C18070vi.A0W(r0)
            boolean r0 = com.whatsapp.registration.phonenumberentry.ChangeNumber.A13(r8, r0, r4, r3)
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = "\\D"
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r2)
            java.lang.String r1 = ""
            java.lang.String r6 = r0.A00(r3, r1)
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r2)
            java.lang.String r3 = r0.A00(r10, r1)
            X.1LA r1 = r8.A04     // Catch:{ IOException -> 0x0310 }
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException -> 0x0310 }
            java.lang.String r2 = r1.A03(r0, r6)     // Catch:{ IOException -> 0x0310 }
            X.C18070vi.A0X(r2)     // Catch:{ IOException -> 0x0310 }
            X.1LA r1 = r8.A04     // Catch:{ IOException -> 0x0312 }
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ IOException -> 0x0312 }
            java.lang.String r0 = r1.A03(r0, r3)     // Catch:{ IOException -> 0x0312 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x0312 }
            goto L_0x031b
        L_0x0310:
            r1 = move-exception
            goto L_0x0314
        L_0x0312:
            r1 = move-exception
            r6 = r2
        L_0x0314:
            java.lang.String r0 = "ChangeNumber/cc failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
            r2 = r6
            goto L_0x031c
        L_0x031b:
            r3 = r0
        L_0x031c:
            boolean r0 = X.C18070vi.A18(r4, r9)
            if (r0 == 0) goto L_0x0335
            boolean r0 = X.C18070vi.A18(r2, r3)
            if (r0 == 0) goto L_0x0335
            X.10I r2 = r8.A05
            r1 = 22
            X.Ajv r0 = new X.Ajv
            r0.<init>(r8, r1)
            r2.CGF(r0)
            return
        L_0x0335:
            boolean r0 = r8.A4m(r4, r2, r5)
            if (r0 != 0) goto L_0x0021
            X.10I r2 = r8.A05
            r1 = 23
            X.Ajv r0 = new X.Ajv
            r0.<init>(r8, r1)
            r2.CGF(r0)
            X.9gv r0 = r8.A0E
            if (r0 == 0) goto L_0x0a4d
            android.widget.EditText r0 = r0.A02
            java.lang.String r4 = X.AnonymousClass3Ma.A12(r0)
            int r3 = r4.length()
            int r3 = r3 - r7
            r2 = 0
            r1 = 0
        L_0x0358:
            if (r2 > r3) goto L_0x09cf
            r0 = r3
            if (r1 != 0) goto L_0x035e
            r0 = r2
        L_0x035e:
            boolean r0 = A03(r4, r0)
            if (r1 != 0) goto L_0x036b
            if (r0 != 0) goto L_0x0368
            r1 = 1
            goto L_0x0358
        L_0x0368:
            int r2 = r2 + 1
            goto L_0x0358
        L_0x036b:
            if (r0 == 0) goto L_0x09cf
            int r3 = r3 + -1
            goto L_0x0358
        L_0x0370:
            java.lang.Object r1 = r2.A01
            X.6lR r1 = (X.C131646lR) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x0379:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            X.AnonymousClass4aU.A05(r0)
            return
        L_0x0385:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            java.lang.String r0 = "privacy"
            com.whatsapp.settings.SettingsTabActivity.A0t(r3, r0)
            goto L_0x0485
        L_0x0390:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            java.lang.String r0 = "notifications"
            com.whatsapp.settings.SettingsTabActivity.A0t(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            java.lang.String r2 = r3.A1C
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsNotifications"
            goto L_0x03c5
        L_0x03ab:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            java.lang.String r0 = "help"
            com.whatsapp.settings.SettingsTabActivity.A0t(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            java.lang.String r2 = r3.A1C
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsHelpActivity"
        L_0x03c5:
            r4.setClassName(r1, r0)
            if (r2 == 0) goto L_0x0586
            java.lang.String r0 = "search_result_key"
            r4.putExtra(r0, r2)
            goto L_0x0586
        L_0x03d1:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 28
            X.AnonymousClass3MY.A1S(r3, r0)
            X.00H r0 = r3.A17
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.avatar.home.AvatarHomeActivity"
            goto L_0x0583
        L_0x03e8:
            java.lang.Object r4 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r4 = (com.whatsapp.settings.SettingsTabActivity) r4
            r0 = 29
            X.AnonymousClass3MY.A1S(r4, r0)
            X.1QO r0 = r4.A0W
            boolean r0 = r0.A0H()
            X.1QS r1 = r4.A0X
            if (r0 == 0) goto L_0x0422
            java.lang.String r0 = "P2M_LITE"
            X.AZ9 r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0427
        L_0x0403:
            java.lang.Class r3 = r0.BWu()
            if (r3 == 0) goto L_0x0427
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SettingsTabActivity/PAY: Settings - Loading payment class: "
            X.C17900vP.A0Y(r3, r0, r1)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r3)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "chat"
            r2.putExtra(r1, r0)
            r4.startActivity(r2)
            return
        L_0x0422:
            X.BD1 r0 = r1.A06()
            goto L_0x0403
        L_0x0427:
            java.lang.String r0 = "SettingsTabActivity/PAY: Settings - can't find payment service"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x042d:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 21
            X.AnonymousClass3MY.A1S(r3, r0)
            X.00H r0 = r3.A17
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDevicesActivity"
            goto L_0x0583
        L_0x0444:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 8
            X.AnonymousClass3MY.A1S(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            r0 = 0
            android.content.Intent r4 = X.AnonymousClass1LU.A0s(r3, r0)
            goto L_0x0586
        L_0x0459:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 27
            X.AnonymousClass3MY.A1S(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r2 = X.C72473Md.A0B(r3, r0)
            java.lang.String r0 = "source_surface"
            r1 = 1
            r2.putExtra(r0, r1)
            java.lang.String r0 = "contacts_list_view_mode"
            r2.putExtra(r0, r1)
            r3.startActivity(r2)
            return
        L_0x047c:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 26
            X.AnonymousClass3MY.A1S(r3, r0)
        L_0x0485:
            java.lang.String r2 = r3.A1C
            X.00H r0 = r3.A0n
            java.lang.Object r1 = r0.get()
            X.6oZ r1 = (X.C133326oZ) r1
            if (r2 == 0) goto L_0x04ad
            java.lang.String r2 = r3.A1C
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r1.A00
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "search_result_key"
            r4.putExtra(r0, r2)
            goto L_0x077c
        L_0x04ad:
            X.00H r0 = r1.A00
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r4.setClassName(r1, r0)
            goto L_0x077c
        L_0x04be:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            X.00H r0 = r3.A17
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.textstatus.AddTextStatusActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            X.00H r0 = r3.A14
            java.lang.Object r2 = r0.get()
            X.4Pv r2 = (X.C86014Pv) r2
            boolean r1 = r3.A1F
            r0 = 0
            if (r1 == 0) goto L_0x04e2
            r0 = 4
        L_0x04e2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 32
            r2.A00(r0, r1)
            return
        L_0x04ec:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            X.00H r0 = r3.A14
            java.lang.Object r2 = r0.get()
            X.4Pv r2 = (X.C86014Pv) r2
            r1 = 11
            r0 = 0
            r2.A00(r1, r0)
            X.00H r0 = r3.A0n
            java.lang.Object r0 = r0.get()
            X.6oZ r0 = (X.C133326oZ) r0
            X.00H r0 = r0.A00
            android.content.Intent r4 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r4.setClassName(r1, r0)
            goto L_0x077c
        L_0x0517:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsPasskeysDisabledFragment r3 = (com.whatsapp.settings.SettingsPasskeysDisabledFragment) r3
            X.1OB r0 = r3.A03
            if (r0 == 0) goto L_0x0527
            boolean r1 = r0.Be2()
            r0 = 1
            if (r1 != r0) goto L_0x0527
            return
        L_0x0527:
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r3)
            r1 = 0
            com.whatsapp.settings.SettingsPasskeysDisabledFragment$initCreateButton$1$onOneClick$1 r0 = new com.whatsapp.settings.SettingsPasskeysDisabledFragment$initCreateButton$1$onOneClick$1
            r0.<init>(r3, r1)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r2)
            r3.A03 = r0
            return
        L_0x0538:
            java.lang.Object r4 = r2.A01
            X.1FU r4 = (X.AnonymousClass1FU) r4
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp"
            java.io.File r3 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0555
            X.1KB r2 = r4.A05
            java.lang.String r1 = "Nothing to migrate"
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x0555:
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = "android.provider.extra.INITIAL_URI"
            android.net.Uri r0 = android.net.Uri.fromFile(r3)
            android.content.Intent r1 = r2.putExtra(r1, r0)
            r0 = 2
            r4.startActivityForResult(r1, r0)
            return
        L_0x056b:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1D()
            goto L_0x0799
        L_0x0575:
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.Licenses"
        L_0x0583:
            r4.setClassName(r1, r0)
        L_0x0586:
            r3.startActivity(r4)
            return
        L_0x058a:
            java.lang.Object r0 = r2.A01
            X.Bw2 r0 = (X.C24136Bw2) r0
            X.1kd r2 = r0.A01
            X.22l r1 = r0.A09
            r0 = 1
            r2.A08(r1, r0, r0)
            return
        L_0x0597:
            java.lang.Object r2 = r2.A01
            X.Bw2 r2 = (X.C24136Bw2) r2
            X.22l r3 = r2.A09
            boolean r0 = X.C50302Tx.A00(r3)
            if (r0 == 0) goto L_0x05ac
            X.6yW r0 = r2.A08
            X.C17960vV.A07(r0)
            r0.A01(r3)
            return
        L_0x05ac:
            X.2rc r0 = X.AnonymousClass206.A00(r3)
            int r1 = r0.A07
            r0 = 1
            if (r1 != r0) goto L_0x05c7
            int r4 = r3.A0u
            r3 = 1
            X.1KB r2 = r2.A00
            r1 = 2
            r0 = 2131890637(0x7f1211cd, float:1.9415971E38)
            if (r4 != r1) goto L_0x05c3
            r0 = 2131890636(0x7f1211cc, float:1.941597E38)
        L_0x05c3:
            r2.A06(r0, r3)
            return
        L_0x05c7:
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x05da
            X.1iW r1 = r2.A02
            android.app.Activity r2 = X.AnonymousClass3Ma.A05(r2)
            X.1FU r2 = (X.AnonymousClass1FU) r2
            r5 = 1
            r4 = 0
            r6 = r5
            r1.A0M(r2, r3, r4, r5, r6)
            return
        L_0x05da:
            java.lang.String r0 = "cannot download media message with no media attached"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r2 = r2.A00
            r1 = 2131891444(0x7f1214f4, float:1.9417608E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x05e9:
            java.lang.Object r0 = r2.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x05f1:
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.sendsmstowa.SendSmsToWa r3 = (com.whatsapp.registration.sendsmstowa.SendSmsToWa) r3
            X.00H r0 = r3.A4c()
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            java.lang.String r1 = "send_sms_to_wa_non_fraud"
            java.lang.String r0 = "verify_another_way"
            r2.A0I(r1, r0)
            X.Ad6 r0 = r3.A0C
            if (r0 != 0) goto L_0x060e
            java.lang.String r0 = "dynamicBottomSheetNavigator"
            goto L_0x0b9c
        L_0x060e:
            r0.A04()
            return
        L_0x0612:
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.sendsmstowa.SendSmsToWa r3 = (com.whatsapp.registration.sendsmstowa.SendSmsToWa) r3
            X.00H r0 = r3.A4c()
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            java.lang.String r1 = r3.A0S
            java.lang.String r0 = "send_code_tapped"
            r2.A0I(r1, r0)
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = r3.A0T
            r3.A4d(r1, r0)
            return
        L_0x062f:
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.security.PCRSuccessfulActivity r3 = (com.whatsapp.registration.security.PCRSuccessfulActivity) r3
            X.1dX r0 = r3.A00
            if (r0 == 0) goto L_0x0665
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0647
            X.17x r0 = r3.A01
            if (r0 == 0) goto L_0x0661
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0650
        L_0x0647:
            X.1jT r2 = r3.A03
            if (r2 == 0) goto L_0x065d
            r1 = 2
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
        L_0x0650:
            X.1LU r0 = r3.A02
            if (r0 == 0) goto L_0x0780
            android.content.Intent r0 = X.AnonymousClass1LU.A03(r3)
            r3.startActivity(r0)
            goto L_0x07f1
        L_0x065d:
            java.lang.String r0 = "registrationManager"
            goto L_0x0b9c
        L_0x0661:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x0b9c
        L_0x0665:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x0b9c
        L_0x0669:
            java.lang.Object r11 = r2.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r11 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r11
            X.00H r0 = r11.A0t
            java.lang.Object r0 = r0.get()
            X.2iS r0 = (X.C57052iS) r0
            X.9nK r8 = r0.A00()
            X.C17960vV.A07(r8)
            X.6z4 r1 = r11.A0E
            r0 = 11550(0x2d1e, float:1.6185E-41)
            boolean r2 = r1.A02(r0)
            r0 = 86400(0x15180, double:4.26873E-319)
            r4 = 1
            r3 = 0
            X.6sP r14 = new X.6sP
            r14.<init>(r0, r2, r4)
            boolean r1 = r14.A02
            r6 = 4
            X.00H r0 = r8.A07
            java.lang.Object r10 = r0.get()
            X.721 r10 = (X.AnonymousClass721) r10
            if (r1 != 0) goto L_0x0703
            r1 = 15
            X.Alb r0 = new X.Alb
            r0.<init>(r8, r1)
            java.lang.Object r0 = X.C20017A3j.A00(r0, r6)
            int r9 = X.AnonymousClass000.A0M(r0)
            r1 = 16
            X.Alb r0 = new X.Alb
            r0.<init>(r8, r1)
            java.lang.Object r5 = X.C20017A3j.A00(r0, r6)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r7 = 2131433222(0x7f0b1706, float:1.8488224E38)
            X.6fn r1 = new X.6fn
            r1.<init>(r11, r11, r8)
            X.6da r0 = new X.6da
            r0.<init>(r7, r1)
            r2.add(r0)
            X.7C1 r12 = new X.7C1
            r12.<init>(r11, r8, r3)
            java.lang.String r16 = "wa_nta"
            java.lang.String r17 = "reg_phone"
            X.C18070vi.A0d(r5, r6)
            r18 = 0
            r0 = 0
            X.6sP r14 = new X.6sP
            r14.<init>(r0, r3, r4)
            X.6lh r13 = new X.6lh
            r13.<init>()
            java.lang.String r3 = "target_account_type"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            X.C18070vi.A0d(r0, r4)
            java.util.Map r1 = r13.A00
            r1.put(r3, r0)
            java.lang.String r0 = "access_token"
            r1.put(r0, r5)
            java.lang.String r15 = "com.bloks.www.fxcal.waffle.nta.reg.async"
            r21 = 444795951(0x1a830c2f, float:5.4200014E-23)
        L_0x06fb:
            java.lang.String r19 = ""
            r20 = r2
            r10.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0703:
            r1 = 17
            X.Alb r0 = new X.Alb
            r0.<init>(r8, r1)
            java.lang.Object r0 = X.C20017A3j.A00(r0, r6)
            int r7 = X.AnonymousClass000.A0M(r0)
            r1 = 18
            X.Alb r0 = new X.Alb
            r0.<init>(r8, r1)
            java.lang.Object r5 = X.C20017A3j.A00(r0, r6)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r3 = 2131433222(0x7f0b1706, float:1.8488224E38)
            X.6fn r1 = new X.6fn
            r1.<init>(r11, r11, r8)
            X.6da r0 = new X.6da
            r0.<init>(r3, r1)
            r2.add(r0)
            r0 = 0
            X.7C1 r12 = new X.7C1
            r12.<init>(r11, r8, r0)
            java.lang.String r16 = "wa_nta"
            java.lang.String r17 = "reg_phone"
            X.C18070vi.A0d(r5, r6)
            X.6lh r13 = new X.6lh
            r13.<init>()
            java.lang.String r3 = "target_account_type"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            X.C18070vi.A0d(r0, r4)
            java.util.Map r1 = r13.A00
            r1.put(r3, r0)
            java.lang.String r0 = "access_token"
            r1.put(r0, r5)
            java.lang.String r15 = "com.bloks.www.fx.waffle.reg"
            r21 = 444795951(0x1a830c2f, float:5.4200014E-23)
            r18 = 0
            goto L_0x06fb
        L_0x075e:
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.parole.CustomRegistrationBlockActivity r3 = (com.whatsapp.registration.parole.CustomRegistrationBlockActivity) r3
            X.1LU r0 = r3.A00
            if (r0 == 0) goto L_0x0780
            java.lang.String r0 = r3.A05
            if (r0 != 0) goto L_0x0778
            java.lang.String r0 = "buttonPrimaryLink"
            goto L_0x0b9c
        L_0x076e:
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.parole.CustomRegistrationBlockActivity r3 = (com.whatsapp.registration.parole.CustomRegistrationBlockActivity) r3
            X.1LU r0 = r3.A00
            if (r0 == 0) goto L_0x0780
            java.lang.String r0 = r3.A07
        L_0x0778:
            android.content.Intent r4 = X.C72473Md.A0D(r0)
        L_0x077c:
            r3.startActivity(r4)
            return
        L_0x0780:
            java.lang.String r0 = "waIntents"
            goto L_0x0b9c
        L_0x0784:
            java.lang.Object r0 = r2.A01
            com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity r0 = (com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity) r0
            X.9kJ r1 = r0.A4b()
            java.lang.String r2 = r0.A0C
            int r4 = r0.A00
            r7 = 3
            r3 = 0
            r5 = 9
            r6 = 11
            r1.A00(r2, r3, r4, r5, r6, r7)
        L_0x0799:
            r0.finish()
            return
        L_0x079d:
            java.lang.String r0 = "EmailEducationScreen/setupSkipButton/skip add email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r2.A01
            com.whatsapp.registration.email.EmailEducationScreen r1 = (com.whatsapp.registration.email.EmailEducationScreen) r1
            X.00H r0 = r1.A05
            if (r0 == 0) goto L_0x0b9a
            java.lang.Object r2 = r0.get()
            X.9kJ r2 = (X.C190059kJ) r2
            java.lang.String r3 = r1.A08
            int r5 = r1.A00
            r7 = 3
            r4 = 0
            r6 = 5
            r8 = r7
            r2.A00(r3, r4, r5, r6, r7, r8)
            r1.finish()
            return
        L_0x07bf:
            java.lang.String r0 = "EmailEducationScreen/setupAddEmailButton/add email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.email.EmailEducationScreen r3 = (com.whatsapp.registration.email.EmailEducationScreen) r3
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x0b9a
            java.lang.Object r4 = r0.get()
            X.9kJ r4 = (X.C190059kJ) r4
            java.lang.String r5 = r3.A08
            int r7 = r3.A00
            r10 = 3
            r6 = 0
            r8 = 5
            r9 = 1
            r4.A00(r5, r6, r7, r8, r9, r10)
            X.1L9 r2 = r3.A01
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x07f5
            r0.get()
            int r1 = r3.A00
            java.lang.String r0 = r3.A08
            android.content.Intent r0 = X.AnonymousClass1LU.A1P(r3, r0, r1)
            r2.A08(r3, r0)
        L_0x07f1:
            r3.finish()
            return
        L_0x07f5:
            X.AnonymousClass3MW.A1F()
            throw r6
        L_0x07f9:
            java.lang.Object r3 = r2.A01
            com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity r3 = (com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity) r3
            X.00H r0 = r3.A04
            if (r0 == 0) goto L_0x0b94
            java.lang.Object r2 = r0.get()
            X.9uY r2 = (X.C196159uY) r2
            r1 = 1
            X.4mo r0 = new X.4mo
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0811:
            java.lang.Object r5 = r2.A01
            com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity r5 = (com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity) r5
            X.3Rj r4 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131889690(0x7f120e1a, float:1.941405E38)
            r4.A0E(r0)
            r3 = 2131889689(0x7f120e19, float:1.9414049E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x0b97
            r1 = 0
            r2[r1] = r0
            android.text.Spanned r0 = X.AnonymousClass1EG.A01(r5, r2, r3)
            r4.A0S(r0)
            r4.A0T(r1)
            r1 = 2131889673(0x7f120e09, float:1.9414016E38)
            r0 = 49
            X.C73203Rj.A0A(r4, r5, r0, r1)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 0
            X.4ar r0 = new X.4ar
            r0.<init>(r5, r1)
            r4.A0X(r0, r2)
            r4.A0C()
            return
        L_0x084f:
            java.lang.Object r4 = r2.A01
            com.whatsapp.registration.EULA r4 = (com.whatsapp.registration.EULA) r4
            X.0z4 r0 = r4.A0A
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "is_ls_shown_during_reg"
            X.C17880vN.A1F(r1, r0, r2)
            X.4Qk r0 = r4.A0H
            r0.A00()
            r0 = 2131430538(0x7f0b0c8a, float:1.848278E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MX.A0F(r4, r0)
            X.1bY r2 = new X.1bY
            r2.<init>()
            r0 = 100
            r2.A0C(r0)
            X.C29191bl.A02(r3, r2)
            r3.removeAllViews()
            android.view.LayoutInflater r2 = r4.getLayoutInflater()
            r0 = 2131625232(0x7f0e0510, float:1.8877666E38)
            r1 = 0
            android.view.View r0 = r2.inflate(r0, r3, r1)
            r3.addView(r0)
            com.whatsapp.registration.EULA.A03(r4)
            com.whatsapp.registration.EULA.A0Q(r4)
            X.0vl r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r0
            r0.A0U(r1)
            r4.A4d()
            return
        L_0x089f:
            java.lang.Object r0 = r2.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x08a5:
            java.lang.Object r5 = r2.A01
            com.whatsapp.quickcontact.QuickContactActivity r5 = (com.whatsapp.quickcontact.QuickContactActivity) r5
            X.00H r0 = r5.A0x
            X.C72453Mb.A1P(r0)
            X.1VP r4 = r5.A0D
            X.1E7 r3 = r5.A0S
            X.1MZ r2 = r5.A0P
            X.11S r1 = r5.A02
            X.1M9 r0 = r5.A0H
            java.util.List r3 = X.C63982u1.A04(r1, r0, r2, r3)
            android.content.Context r2 = r23.getContext()
            X.1EC r1 = r5.A0a
            r0 = 7
            r4.BjS(r2, r1, r3, r0)
            return
        L_0x08c7:
            boolean r0 = X.AnonymousClass4H3.A00(r3)
            if (r0 != 0) goto L_0x08d4
            X.1hs r1 = r1.A06
            r0 = 1
            r1.A07(r3, r0)
            return
        L_0x08d4:
            X.1hB r2 = r1.A07
            r1 = 0
            r0 = 1
            X.C32431hB.A06(r2, r3, r0, r1, r1)
            return
        L_0x08dc:
            java.lang.String r0 = "RegisterPhone/checkforreinstall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 7
            r4.A4h(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A06
            r0.A0F(r7)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A0D
            r0.A0F(r6)
            X.1Vu r0 = r4.A0Z
            r0.A01()
            android.content.SharedPreferences r0 = r4.getPreferences(r2)
            android.content.SharedPreferences$Editor r6 = r0.edit()
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A06
            java.lang.Object r1 = r0.A06()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.country_code"
            r6.putString(r0, r1)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A0D
            java.lang.Object r1 = r0.A06()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.phone_number"
            r6.putString(r0, r1)
            r6.apply()
            boolean r0 = X.AnonymousClass3MW.A1Y(r4)
            if (r0 != 0) goto L_0x0942
            java.lang.String r0 = "RegisterPhone/checkreinstall/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9uO r6 = r4.A0H
            r5 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r0 = X.C17880vN.A0q(r4, r0, r1, r2, r5)
            r6.A03(r0)
            return
        L_0x0942:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1B(r4)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A06
            java.lang.Object r1 = r0.A06()
            java.lang.String r1 = (java.lang.String) r1
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A0D
            java.lang.Object r0 = r0.A06()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = com.whatsapp.registration.phonenumberentry.RegisterPhone.A10(r4, r1, r0, r5)
            X.0z4 r0 = r4.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            X.C17880vN.A1E(r1, r0, r6)
            X.9gO r5 = r4.A1B
            java.lang.Integer r0 = r5.A02
            if (r0 == 0) goto L_0x099e
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x099e
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A06
            java.lang.Object r1 = r0.A06()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r4.A0v
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0998
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r4.A0M
            X.1DT r0 = r0.A0D
            java.lang.Object r1 = r0.A06()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r4.A0w
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x099e
        L_0x0998:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A02 = r0
        L_0x099e:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r4)
            java.lang.String r0 = "backup_token_source"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            r5.A05 = r0
            X.00H r0 = r4.A0i
            java.lang.Object r3 = r0.get()
            X.9xw r3 = (X.C198189xw) r3
            X.00H r0 = r3.A01
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            java.lang.String r0 = "enter_number"
            java.lang.String r1 = "unknown"
            r2.A0I(r0, r1)
            java.lang.String r0 = "account_transfer_eligibility_check_started"
            X.C198189xw.A00(r3, r0, r1)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r4 = r4.A0M
            r9 = 0
            r7 = 0
            r4.A0X(r5, r6, r7, r9)
            return
        L_0x09cf:
            int r0 = r3 + 1
            java.lang.CharSequence r0 = r4.subSequence(r2, r0)
            java.lang.String r4 = r0.toString()
            X.9gv r0 = r8.A0E
            if (r0 == 0) goto L_0x0a4d
            android.widget.EditText r0 = r0.A03
            java.lang.String r3 = X.AnonymousClass3Ma.A12(r0)
            X.9gv r0 = r8.A0L
            android.widget.EditText r0 = r0.A02
            java.lang.String r6 = X.AnonymousClass3Ma.A12(r0)
            int r5 = r6.length()
            int r5 = r5 - r7
            r2 = 0
            r1 = 0
        L_0x09f2:
            if (r2 > r5) goto L_0x0a0a
            r0 = r5
            if (r1 != 0) goto L_0x09f8
            r0 = r2
        L_0x09f8:
            boolean r0 = A03(r6, r0)
            if (r1 != 0) goto L_0x0a05
            if (r0 != 0) goto L_0x0a02
            r1 = 1
            goto L_0x09f2
        L_0x0a02:
            int r2 = r2 + 1
            goto L_0x09f2
        L_0x0a05:
            if (r0 == 0) goto L_0x0a0a
            int r5 = r5 + -1
            goto L_0x09f2
        L_0x0a0a:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r6.subSequence(r2, r0)
            java.lang.String r1 = r0.toString()
            X.9gv r0 = r8.A0L
            android.widget.EditText r0 = r0.A03
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            int r6 = r8.A00
            java.util.ArrayList r5 = r8.A0J
            java.lang.String r4 = X.C17900vP.A0A(r4, r3)
            java.lang.String r3 = X.C17900vP.A0A(r1, r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "mode"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "preselectedJids"
            r2.putStringArrayListExtra(r0, r5)
            java.lang.String r0 = "oldJid"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "newJid"
            r2.putExtra(r0, r3)
            r8.startActivityForResult(r2, r7)
            return
        L_0x0a4d:
            X.C18070vi.A11(r12)
            throw r11
        L_0x0a51:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            java.lang.String r0 = "storage_and_data"
            com.whatsapp.settings.SettingsTabActivity.A0t(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            java.lang.String r2 = r3.A1C
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsDataUsageActivity"
            goto L_0x0a86
        L_0x0a6c:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            java.lang.String r0 = "chat"
            com.whatsapp.settings.SettingsTabActivity.A0t(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            java.lang.String r2 = r3.A1C
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
        L_0x0a86:
            r4.setClassName(r1, r0)
            if (r2 == 0) goto L_0x0af5
            java.lang.String r0 = "search_result_key"
            r4.putExtra(r0, r2)
            goto L_0x0af5
        L_0x0a91:
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.Advanced"
            goto L_0x0aa6
        L_0x0a9c:
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.debug.library.DebugToolsActivity"
        L_0x0aa6:
            android.content.Intent r4 = r1.setClassName(r3, r0)
            goto L_0x0af5
        L_0x0aab:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            X.00H r0 = r3.A17
            r0.get()
            r2 = 0
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.lists.home.ListsHomeActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "LAUNCH_FROM_DEEPLINK"
            r4.putExtra(r0, r2)
            r1 = 7
            java.lang.String r0 = "EXTRA_ENTRY_POINT"
            r4.putExtra(r0, r1)
            goto L_0x0af5
        L_0x0ace:
            java.lang.Object r3 = r2.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            r0 = 36
            X.AnonymousClass3MY.A1S(r3, r0)
            X.00H r0 = r3.A17
            r0.get()
            r5 = 0
            r2 = 6
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.favorites.FavoritesActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "IS_EDIT"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "ENTRY_POINT"
            r4.putExtra(r0, r2)
        L_0x0af5:
            r3.startActivity(r4)
            return
        L_0x0af9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/countrypicker/clicked n="
            r1.append(r0)
            java.lang.Object r2 = r2.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r2 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r2
            android.app.Dialog r0 = r2.A0A
            X.C17900vP.A0b(r0, r1)
            android.app.Dialog r3 = r2.A0A
            if (r3 != 0) goto L_0x0b46
            X.9gv r0 = r2.A0L
            android.widget.TextView r0 = r0.A04
            java.lang.String r1 = X.AnonymousClass3MZ.A18(r0)
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A1S(r2, r0, r1)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.6z4 r1 = r2.A0E
            r0 = 10789(0x2a25, float:1.5119E-41)
            boolean r0 = r1.A02(r0)
            java.lang.String r1 = "choose_country"
            if (r0 == 0) goto L_0x0b37
            X.00H r0 = r2.A0U
            java.lang.Object r0 = r0.get()
            X.A8V r0 = (X.A8V) r0
            r0.A0C(r1)
        L_0x0b37:
            X.00H r0 = r2.A0m
            java.lang.Object r0 = r0.get()
            X.A29 r0 = (X.A29) r0
            r0.A01(r1)
            r0 = 1
            r2.A11 = r0
            return
        L_0x0b46:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/countrypicker/clicked/dialog-visible/skip n="
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            goto L_0x0b78
        L_0x0b51:
            java.lang.Object r5 = r2.A01
            com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity r5 = (com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity) r5
            java.lang.String r4 = r5.A0B
            if (r4 == 0) goto L_0x0b97
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0b7c
            X.9kJ r0 = r5.A4b()
            java.lang.String r1 = r5.A0C
            int r3 = r5.A00
            r6 = 2
            java.lang.String r2 = "INVALID_EMAIL"
            r4 = 9
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "UnverifiedEmailSetupRegUpsellActivity/executeSetEmailRequest/invalid email"
        L_0x0b78:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0b7c:
            r3 = 1
            X.AnonymousClass4Yv.A01(r5, r3)
            X.00H r0 = r5.A07
            if (r0 == 0) goto L_0x0b94
            java.lang.Object r2 = r0.get()
            X.9uY r2 = (X.C196159uY) r2
            r1 = 2
            X.4mt r0 = new X.4mt
            r0.<init>(r1, r4, r5)
            r2.A03(r0, r4, r3)
            return
        L_0x0b94:
            java.lang.String r0 = "emailVerificationXmppMethods"
            goto L_0x0b9c
        L_0x0b97:
            java.lang.String r0 = "emailAddress"
            goto L_0x0b9c
        L_0x0b9a:
            java.lang.String r0 = "emailVerificationLogger"
        L_0x0b9c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48o.A04(android.view.View):void");
    }
}

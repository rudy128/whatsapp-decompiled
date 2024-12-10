package X;

/* renamed from: X.Ajv  reason: case insensitive filesystem */
public class C21428Ajv implements Runnable {
    public final int A00;
    public final Object A01;

    public C21428Ajv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21428Ajv(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.registration.email.EmailEducationScreen} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: X.1FU} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030d, code lost:
        r3 = new X.C146767Qn(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0312, code lost:
        r4.CGF(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0315, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x052e, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0531, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0630, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0634, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x069e, code lost:
        if (r0 == null) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06a0, code lost:
        X.AnonymousClass3MW.A0a(r0).A01(r2, "email");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06aa, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06fb, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fe, code lost:
        if (X.C72453Mb.A1a(r3.A04) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0200, code lost:
        X.A29.A00(r3, r2, r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0204, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x023b, code lost:
        X.AnonymousClass4Yv.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x023e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0245, code lost:
        com.whatsapp.util.Log.i(r0);
        r2 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0205;
                case 1: goto L_0x020e;
                case 2: goto L_0x068c;
                case 3: goto L_0x0214;
                case 4: goto L_0x021b;
                case 5: goto L_0x0221;
                case 6: goto L_0x0698;
                case 7: goto L_0x0228;
                case 8: goto L_0x0236;
                case 9: goto L_0x065e;
                case 10: goto L_0x0644;
                case 11: goto L_0x002b;
                case 12: goto L_0x023f;
                case 13: goto L_0x024a;
                case 14: goto L_0x006d;
                case 15: goto L_0x0269;
                case 16: goto L_0x027c;
                case 17: goto L_0x06ad;
                case 18: goto L_0x06bf;
                case 19: goto L_0x00bc;
                case 20: goto L_0x028e;
                case 21: goto L_0x0110;
                case 22: goto L_0x0298;
                case 23: goto L_0x02ab;
                case 24: goto L_0x06ce;
                case 25: goto L_0x02b8;
                case 26: goto L_0x02c9;
                case 27: goto L_0x02d7;
                case 28: goto L_0x02ed;
                case 29: goto L_0x02fd;
                case 30: goto L_0x0128;
                case 31: goto L_0x0316;
                case 32: goto L_0x042d;
                case 33: goto L_0x04aa;
                case 34: goto L_0x04d8;
                case 35: goto L_0x04ec;
                case 36: goto L_0x0505;
                case 37: goto L_0x0145;
                case 38: goto L_0x0515;
                case 39: goto L_0x051d;
                case 40: goto L_0x0532;
                case 41: goto L_0x0544;
                case 42: goto L_0x054c;
                case 43: goto L_0x0565;
                case 44: goto L_0x056d;
                case 45: goto L_0x0153;
                case 46: goto L_0x01d7;
                case 47: goto L_0x01e8;
                case 48: goto L_0x0581;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r2 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r2
            X.0z4 r1 = r2.A0A
            X.00H r0 = r2.A0h
            X.2u4 r0 = X.C17880vN.A0J(r0)
            java.util.List r0 = r0.A0F()
            int r0 = r0.size()
            r1.A1H(r0)
            X.00H r0 = r2.A0q
            java.lang.Object r2 = r0.get()
            X.2n1 r2 = (X.C59872n1) r2
            X.2Qb r1 = X.C49332Qb.A02
            r0 = 1
            r2.A01(r1, r0)
        L_0x002a:
            return
        L_0x002b:
            java.lang.Object r7 = r14.A01
            com.whatsapp.registration.email.VerifyEmail r7 = (com.whatsapp.registration.email.VerifyEmail) r7
            X.4VX r0 = r7.A09
            java.lang.String r2 = "codeInputBoxManager"
            if (r0 == 0) goto L_0x05a2
            boolean r0 = r0.A06()
            java.lang.String r6 = "nextButton"
            r5 = 1
            r1 = 6
            if (r0 == 0) goto L_0x0060
            X.4VX r0 = r7.A09
            if (r0 == 0) goto L_0x05a2
            java.lang.String r0 = r0.A00()
        L_0x0047:
            int r0 = r0.length()
            if (r0 != r1) goto L_0x002a
            long r3 = X.AnonymousClass8BS.A01(r7)
            long r1 = r7.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002a
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0E
            if (r0 != 0) goto L_0x059e
            X.C18070vi.A11(r6)
            goto L_0x06fa
        L_0x0060:
            com.whatsapp.CodeInputField r0 = r7.A04
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "codeInputField"
            goto L_0x06f7
        L_0x0068:
            java.lang.String r0 = r0.getCode()
            goto L_0x0047
        L_0x006d:
            java.lang.Object r5 = r14.A01
            X.8CE r5 = (X.AnonymousClass8CE) r5
            r7 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r4 = "CallLogContentObserver"
            r1.append(r4)
            java.lang.String r0 = "/callLogContentObserver/onChange"
            X.C17890vO.A1A(r1, r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0635 }
            X.11C r0 = r5.A03     // Catch:{ Exception -> 0x0635 }
            X.11B r8 = r0.A0O()     // Catch:{ Exception -> 0x0635 }
            if (r8 == 0) goto L_0x002a
            android.net.Uri r0 = android.provider.CallLog.Calls.CONTENT_URI     // Catch:{ Exception -> 0x0635 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ Exception -> 0x0635 }
            java.lang.String r1 = "limit"
            r0 = 5
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0635 }
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch:{ Exception -> 0x0635 }
            android.net.Uri r9 = r0.build()     // Catch:{ Exception -> 0x0635 }
            java.lang.String r11 = "date >? "
            java.lang.String[] r12 = X.C17880vN.A1Y()     // Catch:{ Exception -> 0x0635 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0635 }
            long r2 = r5.A01     // Catch:{ Exception -> 0x0635 }
            long r0 = r0 - r2
            X.C17880vN.A1V(r12, r7, r0)     // Catch:{ Exception -> 0x0635 }
            java.lang.String r13 = "date DESC "
            r10 = 0
            android.database.Cursor r7 = r8.A03(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0635 }
            if (r7 == 0) goto L_0x002a
            goto L_0x05a7
        L_0x00bc:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r0 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r0
            X.00H r0 = r0.A0I
            if (r0 == 0) goto L_0x0640
            java.lang.Object r2 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r2 = (com.whatsapp.bridge.wfal.WfalManager) r2
            X.00H r0 = r2.A06
            java.lang.Object r1 = r0.get()
            X.1le r1 = (X.C35101le) r1
            X.1lh r0 = X.C35131lh.A02
            int r1 = r1.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x002a
            X.732 r1 = r2.A02()
            if (r1 == 0) goto L_0x002a
            X.77e r0 = r1.A04
            java.lang.Object r0 = r0.A00
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            long r9 = X.C17880vN.A05(r0)
            X.77e r0 = r1.A05
            java.lang.String r6 = X.AnonymousClass8BS.A0h(r0)
            long r11 = r1.A00
            java.lang.Long r5 = r1.A07
            java.lang.String r8 = r1.A08
            X.1lW r4 = r1.A01
            java.lang.String r7 = ""
            X.732 r3 = new X.732
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            X.00H r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.1j8 r0 = (X.C33631j8) r0
            r0.A08(r3)
            return
        L_0x0110:
            java.lang.Object r1 = r14.A01
            X.1FY r1 = (X.AnonymousClass1FY) r1
            X.11S r0 = r1.A02
            r0.A0I()
            com.whatsapp.Me r2 = r0.A00
            if (r2 == 0) goto L_0x002a
            X.11S r1 = r1.A02
            r1.A0I()
            java.lang.String r0 = "me_old"
            X.AnonymousClass11S.A05(r2, r1, r0)
            return
        L_0x0128:
            java.lang.Object r1 = r14.A01
            X.99S r1 = (X.AnonymousClass99S) r1
            boolean r0 = r1.Bed()
            if (r0 != 0) goto L_0x002a
            X.05w r0 = r1.A00
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0141
            X.05w r0 = r1.A00
            r0.dismiss()
        L_0x0141:
            r0 = 0
            r1.A00 = r0
            return
        L_0x0145:
            java.lang.Object r1 = r14.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x002a
            r1.invalidateOptionsMenu()
            return
        L_0x0153:
            java.lang.Object r3 = r14.A01
            X.99S r3 = (X.AnonymousClass99S) r3
            X.00H r0 = r3.A0X
            java.lang.Object r5 = r0.get()
            X.A98 r5 = (X.A98) r5
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r3.A0M
            X.1DT r0 = r0.A06
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x01d4
            java.lang.String r9 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A04(r3)
        L_0x016d:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r3.A0M
            X.1DT r0 = r0.A0D
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x01d1
            java.lang.String r10 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A05(r3)
        L_0x017b:
            java.lang.String r1 = "challenge_type"
            java.lang.String r0 = "email_enter"
            X.1D6 r6 = X.AnonymousClass1D6.A01(r1, r0)
            r4 = 0
            boolean r1 = X.C18070vi.A17(r9, r10)
            boolean r0 = r5.A0T()
            if (r0 != 0) goto L_0x01a2
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.6wr r4 = new X.6wr
            r4.<init>(r0)
        L_0x0195:
            X.1KB r2 = r3.A05
            r1 = 46
            X.7Pk r0 = new X.7Pk
            r0.<init>(r3, r4, r1)
            r2.CGP(r0)
            return
        L_0x01a2:
            r5.A0S(r1)
            X.1D6[] r2 = new X.AnonymousClass1D6[r1]
            java.lang.Object r1 = r6.first
            java.lang.Object r0 = r6.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = X.C108975cc.A1O(r0)
            X.AnonymousClass1D6.A03(r1, r0, r2, r4)
            java.util.LinkedHashMap r8 = X.AnonymousClass1D7.A0C(r2)
            X.00H r0 = r5.A0D
            java.lang.Object r6 = r0.get()
            java.util.List r7 = X.A98.A04(r5)
            X.2bP r5 = r5.A09
            r11 = 1
            X.9CF r4 = new X.9CF
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = X.C19951A0i.A00(r4)
            if (r4 == 0) goto L_0x002a
            goto L_0x0195
        L_0x01d1:
            java.lang.String r10 = "2155550000"
            goto L_0x017b
        L_0x01d4:
            java.lang.String r9 = "1"
            goto L_0x016d
        L_0x01d7:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            X.00H r0 = r0.A0m
            java.lang.Object r3 = r0.get()
            X.A29 r3 = (X.A29) r3
            java.lang.String r2 = "google_phone_number_hint"
            java.lang.String r1 = "decline"
            goto L_0x01f8
        L_0x01e8:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            X.00H r0 = r0.A0m
            java.lang.Object r3 = r0.get()
            X.A29 r3 = (X.A29) r3
            java.lang.String r2 = "google_phone_number_hint"
            java.lang.String r1 = "accept"
        L_0x01f8:
            X.0vl r0 = r3.A04
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 0
            X.A29.A00(r3, r2, r1, r0)
            return
        L_0x0205:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
            r0 = 1
            goto L_0x023b
        L_0x020e:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0214:
            java.lang.Object r2 = r14.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "RegisterEmail/handleSuccessVerification/"
            goto L_0x0245
        L_0x021b:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            goto L_0x023b
        L_0x0221:
            java.lang.Object r2 = r14.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "UnverifiedEmailSetupRegUpsellActivity}/handleSuccessVerification/"
            goto L_0x0245
        L_0x0228:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 1
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 2
            goto L_0x023b
        L_0x0236:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
        L_0x023b:
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x023f:
            java.lang.Object r2 = r14.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "VerifyEmail/handleSuccessVerification/start main"
        L_0x0245:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x052e
        L_0x024a:
            java.lang.Object r1 = r14.A01
            com.whatsapp.registration.email.VerifyEmail r1 = (com.whatsapp.registration.email.VerifyEmail) r1
            X.00H r0 = r1.A4f()
            java.lang.Object r2 = r0.get()
            X.9kJ r2 = (X.C190059kJ) r2
            java.lang.String r3 = r1.A0N
            int r5 = r1.A00
            r8 = 1
            r4 = 0
            r6 = 8
            r7 = 5
            r2.A00(r3, r4, r5, r6, r7, r8)
            r0 = 3
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0269:
            java.lang.Object r0 = r14.A01
            X.9fu r0 = (X.C187499fu) r0
            X.0z4 r0 = r0.A01
            r2 = 1
            X.00H r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r0)
            java.lang.String r0 = "pref_flash_call_education_link_clicked"
            X.C17880vN.A1C(r1, r0, r2)
            return
        L_0x027c:
            java.lang.Object r0 = r14.A01
            X.8dH r0 = (X.C166638dH) r0
            X.1L9 r2 = r0.A00
            android.app.Activity r1 = r0.A00
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            r2.A08(r1, r0)
            return
        L_0x028e:
            java.lang.Object r0 = r14.A01
            X.99S r0 = (X.AnonymousClass99S) r0
            X.1jT r0 = r0.A0I
            r0.A0E()
            return
        L_0x0298:
            java.lang.Object r3 = r14.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.1KB r2 = r3.A05
            X.1FR r1 = r2.A00
            r0 = 2131888078(0x7f1207ce, float:1.9410781E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A0F(r1, r0)
            return
        L_0x02ab:
            java.lang.Object r1 = r14.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 0
            X.0z4 r1 = r1.A0A
            byte[] r0 = new byte[r0]
            r1.A2G(r0)
            return
        L_0x02b8:
            java.lang.Object r0 = r14.A01
            X.99S r0 = (X.AnonymousClass99S) r0
            X.00H r0 = r0.A0V
            java.lang.Object r1 = r0.get()
            X.1Do r1 = (X.C22881Do) r1
            r0 = 0
            r1.A00(r0, r0)
            return
        L_0x02c9:
            java.lang.Object r0 = r14.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.1KB r2 = r0.A05
            r1 = 2131896467(0x7f122893, float:1.9427796E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x02d7:
            java.lang.Object r1 = r14.A01
            X.99S r1 = (X.AnonymousClass99S) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = r1.A0N
            r1 = 0
            X.10I r4 = r2.A08
            r0 = 39
            X.7RM r3 = new X.7RM
            r3.<init>((java.lang.Object) r2, (int) r1, (int) r0)
            goto L_0x0312
        L_0x02ed:
            java.lang.Object r1 = r14.A01
            X.99S r1 = (X.AnonymousClass99S) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = r1.A0N
            X.10I r4 = r2.A08
            r0 = 43
            goto L_0x030d
        L_0x02fd:
            java.lang.Object r0 = r14.A01
            X.99S r0 = (X.AnonymousClass99S) r0
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = r0.A0N
            X.1DT r1 = r2.A02
            r0 = 3
            X.AnonymousClass3MX.A1J(r1, r0)
            X.10I r4 = r2.A08
            r0 = 44
        L_0x030d:
            X.7Qn r3 = new X.7Qn
            r3.<init>(r2, r0)
        L_0x0312:
            r4.CGF(r3)
            return
        L_0x0316:
            java.lang.Object r3 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r3 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r3
            X.0z4 r0 = r3.A0A
            java.lang.String r4 = r0.A0l()
            X.0z4 r0 = r3.A0A
            java.lang.String r2 = r0.A0n()
            java.lang.String r0 = "RegisterPhone/deleteLoggedOutUsersExternalRootDirectory"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1L7 r0 = r3.A0L
            X.00H r0 = r0.A02
            java.lang.Object r1 = r0.get()
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            X.C64062u9.A0K(r1, r0)
            java.lang.String r0 = "RegisterPhone/deleteLoggedOutUsersExternalRootDirectory/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "RegisterPhone/deleteInternalFiles"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.io.File r9 = r3.getCacheDir()
            java.io.File r8 = r3.getFilesDir()
            java.io.File r5 = X.C18010vc.A01(r3)
            if (r9 == 0) goto L_0x035b
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x035b
            r0 = 0
            X.C64062u9.A0K(r9, r0)
        L_0x035b:
            r7 = 0
            if (r8 == 0) goto L_0x039c
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x039c
            java.lang.String r0 = "decompressed"
            java.io.File r13 = X.C17880vN.A0e(r8, r0)
            java.io.File[] r11 = r8.listFiles()
            if (r11 == 0) goto L_0x039c
            int r10 = r11.length
            r6 = 0
        L_0x0372:
            if (r6 >= r10) goto L_0x039c
            r12 = r11[r6]
            java.lang.String r1 = r12.getCanonicalPath()     // Catch:{ IOException -> 0x0389 }
            java.lang.String r0 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0389 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0389 }
            if (r0 != 0) goto L_0x0399
            r0 = 0
            X.C64062u9.A0K(r12, r0)     // Catch:{ IOException -> 0x0389 }
            goto L_0x0399
        L_0x0389:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LOG_TAG/Error resolving path: "
            r1.append(r0)
            java.lang.String r0 = r12.getPath()
            X.C17890vO.A19(r1, r0)
        L_0x0399:
            int r6 = r6 + 1
            goto L_0x0372
        L_0x039c:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x03a6
            r0 = 0
            X.C64062u9.A0K(r5, r0)
        L_0x03a6:
            r0 = 3
            java.io.File[] r6 = new java.io.File[r0]
            X.AnonymousClass8BS.A1B(r9, r8, r6)
            r0 = 2
            r6[r0] = r5
            r5 = 3
        L_0x03b0:
            r1 = r6[r7]
            if (r1 == 0) goto L_0x03be
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x03be
            r0 = 0
            X.C64062u9.A0K(r1, r0)
        L_0x03be:
            int r7 = r7 + 1
            if (r7 < r5) goto L_0x03b0
            X.1MH r0 = r3.A0O
            r0.A08()
            X.2Df r0 = r3.A0I
            r0.A08()
            X.1Cd r0 = r3.A0N
            r0.A06()
            X.1Cm r0 = r0.A02
            r0.A0A()
            X.1Nb r0 = r3.A0e
            X.1tH r0 = r0.A0U()
            r0.A08()
            X.1KH r1 = r3.A0P
            X.1QS r0 = r3.A0U
            com.whatsapp.payments.PaymentConfiguration r0 = r0.A03()
            r0.getClass()
            r1.A0H(r0)
            X.2Ko r0 = r3.A0H
            r0.A03()
            java.lang.String r0 = "RegisterPhone/deleteInternalFiles/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9oy r0 = r3.A0W
            java.lang.String r1 = r0.A00(r4, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0427
            java.lang.String r0 = "wamsys initialization fails"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0427
            X.9oy r0 = r3.A0W
            r0.A01(r1)
            java.lang.String r0 = "RegisterPhone/deleteLoggedOutUsersExternalRootDirectory/successfully fetched prechatd ab props"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0415:
            r0 = 612(0x264, float:8.58E-43)
            r3.dismissDialog(r0)
            X.1KB r2 = r3.A05
            r1 = 41
            X.Ajv r0 = new X.Ajv
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        L_0x0427:
            java.lang.String r0 = "RegisterPhone/deleteLoggedOutUsersExternalRootDirectory/failed to fetch prechatd ab props"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0415
        L_0x042d:
            java.lang.Object r9 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r9 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r9
            android.accounts.Account[] r8 = X.C41371wF.A01(r9)
            int r7 = r8.length
            r6 = 0
            r5 = 0
        L_0x0438:
            if (r5 >= r7) goto L_0x04a6
            r3 = r8[r5]
            X.0z4 r0 = r9.A0A
            java.lang.String r4 = r0.A0k()
            if (r4 == 0) goto L_0x04a2
            java.lang.String r1 = r3.name
            java.lang.String r2 = "*"
            int r0 = r4.indexOf(r2)
            java.lang.String r0 = r4.substring(r6, r0)
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x04a2
            java.lang.String r1 = r3.name
            int r0 = r4.lastIndexOf(r2)
            int r0 = r0 + 1
            java.lang.String r0 = r4.substring(r0)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x04a2
            X.118 r0 = r9.A08     // Catch:{ Exception -> 0x0499 }
            android.content.Context r2 = r0.A00     // Catch:{ Exception -> 0x0499 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0499 }
            java.lang.String r0 = "audience:server:client_id:"
            r1.append(r0)     // Catch:{ Exception -> 0x0499 }
            java.lang.String r0 = X.C197569wu.A0M     // Catch:{ Exception -> 0x0499 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0499 }
            java.lang.String r10 = X.C26266CwB.A02(r3, r2, r0)     // Catch:{ Exception -> 0x0499 }
            com.whatsapp.registration.phonenumberentry.RegisterPhoneViewModel r0 = r9.A0a     // Catch:{ Exception -> 0x0499 }
            X.99K r4 = r0.A01     // Catch:{ Exception -> 0x0499 }
            X.1pm r3 = X.AnonymousClass2SS.A00(r9)     // Catch:{ Exception -> 0x0499 }
            java.lang.String r1 = "oauth_email"
            r0 = 2
            X.9s5 r2 = new X.9s5     // Catch:{ Exception -> 0x0499 }
            r2.<init>(r10, r1, r0)     // Catch:{ Exception -> 0x0499 }
            r1 = 0
            com.whatsapp.registration.email.EmailOtpUseCase$verifyEmailOtp$1 r0 = new com.whatsapp.registration.email.EmailOtpUseCase$verifyEmailOtp$1     // Catch:{ Exception -> 0x0499 }
            r0.<init>(r4, r2, r1)     // Catch:{ Exception -> 0x0499 }
            X.AnonymousClass3MX.A1Q(r0, r3)     // Catch:{ Exception -> 0x0499 }
            goto L_0x04a5
        L_0x0499:
            r1 = move-exception
            java.lang.String r0 = "Error fetching email id token for reg"
            com.whatsapp.util.Log.i(r0, r1)
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A18(r9)
        L_0x04a2:
            int r5 = r5 + 1
            goto L_0x0438
        L_0x04a5:
            return
        L_0x04a6:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A18(r9)
            return
        L_0x04aa:
            java.lang.Object r1 = r14.A01
            X.99S r1 = (X.AnonymousClass99S) r1
            java.lang.String r0 = "EnterPhoneNumber/onVerificationCompleteDialogEnded/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r1.Bed()
            if (r0 != 0) goto L_0x04cb
            X.05w r0 = r1.A00
            if (r0 == 0) goto L_0x04c8
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x04c8
            X.05w r0 = r1.A00
            r0.dismiss()
        L_0x04c8:
            r0 = 0
            r1.A00 = r0
        L_0x04cb:
            X.9uO r4 = r1.A0H
            X.1LU r3 = r1.A0G
            X.1jT r5 = r1.A0I
            X.1Vn r2 = r1.A09
            r6 = 0
            X.A80.A02(r1, r2, r3, r4, r5, r6)
            return
        L_0x04d8:
            java.lang.Object r1 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r1 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r1
            X.17x r0 = r1.A0A
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x04e8
            X.AnonymousClass74O.A06(r1)
            return
        L_0x04e8:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1E(r1)
            return
        L_0x04ec:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r2 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r2
            X.129 r1 = r2.A0f
            java.lang.String r0 = "653480766448040"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            java.lang.String r0 = "RegisterPhone/openLoggedOutChatsLearnMore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.startActivity(r1)
            return
        L_0x0505:
            java.lang.Object r0 = r14.A01
            X.99S r0 = (X.AnonymousClass99S) r0
            X.A8V r2 = X.AnonymousClass8BT.A0e(r0)
            java.lang.String r1 = "phone_number_confirm_dialog"
            java.lang.String r0 = "continue"
            r2.A0I(r1, r0)
            return
        L_0x0515:
            java.lang.Object r0 = r14.A01
            X.4eK r0 = (X.C90594eK) r0
            r0.A03()
            return
        L_0x051d:
            java.lang.Object r2 = r14.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            java.lang.String r0 = "RegisterPhone/start2FAActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1o(r2, r1, r1)
            r2.A3q(r0, r1)
        L_0x052e:
            r2.finish()
            return
        L_0x0532:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            X.00H r0 = r0.A0m
            java.lang.Object r1 = r0.get()
            X.A29 r1 = (X.A29) r1
            java.lang.String r0 = "google_phone_number_hint"
            r1.A01(r0)
            return
        L_0x0544:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A16(r0)
            return
        L_0x054c:
            java.lang.Object r3 = r14.A01
            X.99S r3 = (X.AnonymousClass99S) r3
            X.A8V r2 = X.AnonymousClass8BT.A0e(r3)
            java.lang.String r1 = "phone_number_confirm_dialog"
            java.lang.String r0 = "edit"
            r2.A0I(r1, r0)
            X.A8V r1 = X.AnonymousClass8BT.A0e(r3)
            java.lang.String r0 = "enter_number"
            r1.A0C(r0)
            return
        L_0x0565:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C17970vW.A09(r0)
            return
        L_0x056d:
            java.lang.Object r0 = r14.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.content.Context r3 = r0.getApplicationContext()
            X.0z4 r2 = r0.A0A
            X.190 r1 = r0.A03
            java.lang.String r0 = r2.A0n()
            X.C20138A8z.A03(r3, r1, r2, r0)
            return
        L_0x0581:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r2 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r2
            java.lang.String r0 = "RegisterPhone/whats-my-number/link-clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9gO r1 = r2.A1B
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A00 = r0
            r0 = 34
            X.Ajv r1 = new X.Ajv
            r1.<init>(r2, r0)
            r0 = 0
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1H(r2, r1, r0)
            return
        L_0x059e:
            r0.setEnabled(r5)
            return
        L_0x05a2:
            X.C18070vi.A11(r2)
            goto L_0x06fa
        L_0x05a7:
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x062e }
            if (r0 == 0) goto L_0x05c8
        L_0x05ad:
            java.lang.String r0 = "number"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x062e }
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x062e }
            if (r1 == 0) goto L_0x05c2
            int r0 = r1.length()     // Catch:{ all -> 0x062e }
            if (r0 == 0) goto L_0x05c2
            r6.add(r1)     // Catch:{ all -> 0x062e }
        L_0x05c2:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x062e }
            if (r0 != 0) goto L_0x05ad
        L_0x05c8:
            monitor-enter(r5)     // Catch:{ all -> 0x062e }
            boolean r0 = r5.A00     // Catch:{ all -> 0x062b }
            if (r0 != 0) goto L_0x0626
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x062b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x062b }
        L_0x05d5:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x062b }
            if (r0 == 0) goto L_0x05fa
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x062b }
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x062b }
            int r0 = r2.length()     // Catch:{ all -> 0x062b }
            if (r0 <= 0) goto L_0x05d5
            java.lang.String r1 = r5.A04     // Catch:{ all -> 0x062b }
            int r0 = r1.length()     // Catch:{ all -> 0x062b }
            if (r0 <= 0) goto L_0x05d5
            boolean r0 = X.A9B.A0X(r2, r1)     // Catch:{ all -> 0x062b }
            if (r0 == 0) goto L_0x05d5
            r9.add(r3)     // Catch:{ all -> 0x062b }
            goto L_0x05d5
        L_0x05fa:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x062b }
            r8 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0626
            java.lang.Object r1 = X.C29431cG.A0b(r9)     // Catch:{ all -> 0x062b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x062b }
            java.lang.String r0 = "\\D"
            java.lang.String r6 = X.C108985cd.A0o(r1, r0)     // Catch:{ all -> 0x062b }
            java.lang.ref.WeakReference r0 = r5.A05     // Catch:{ all -> 0x062b }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x062b }
            X.B9O r3 = (X.B9O) r3     // Catch:{ all -> 0x062b }
            if (r3 == 0) goto L_0x0626
            android.os.Handler r2 = r5.A02     // Catch:{ all -> 0x062b }
            r1 = 7
            X.7RS r0 = new X.7RS     // Catch:{ all -> 0x062b }
            r0.<init>(r1, r6, r3)     // Catch:{ all -> 0x062b }
            r2.post(r0)     // Catch:{ all -> 0x062b }
            r5.A00 = r8     // Catch:{ all -> 0x062b }
        L_0x0626:
            monitor-exit(r5)     // Catch:{ all -> 0x062e }
            r7.close()     // Catch:{ Exception -> 0x0635 }
            return
        L_0x062b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x062e }
            throw r0     // Catch:{ all -> 0x062e }
        L_0x062e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0630 }
        L_0x0630:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ Exception -> 0x0635 }
            throw r0     // Catch:{ Exception -> 0x0635 }
        L_0x0635:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            java.lang.String r0 = "/callLogContentObserver/onChange/error"
            X.C108985cd.A1M(r0, r1, r2)
            return
        L_0x0640:
            java.lang.String r0 = "wfalManager"
            goto L_0x06f7
        L_0x0644:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.email.VerifyEmail r0 = (com.whatsapp.registration.email.VerifyEmail) r0
            com.whatsapp.registration.email.VerifyEmail.A03(r0)
            com.whatsapp.WaTextView r2 = r0.A07
            if (r2 != 0) goto L_0x0653
            java.lang.String r0 = "resendCodeText"
            goto L_0x06f7
        L_0x0653:
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131103264(0x7f060e20, float:1.781899E38)
            X.AnonymousClass8BS.A14(r1, r2, r0)
            return
        L_0x065e:
            java.lang.Object r3 = r14.A01
            com.whatsapp.registration.email.VerifyEmail r3 = (com.whatsapp.registration.email.VerifyEmail) r3
            boolean r0 = com.whatsapp.registration.email.VerifyEmail.A0d(r3)
            if (r0 == 0) goto L_0x0671
            X.0zA r0 = r3.A4e()
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x0671:
            X.1L9 r2 = r3.A01
            X.00H r0 = r3.A0M
            if (r0 == 0) goto L_0x0689
            r0.get()
            int r1 = r3.A00
            java.lang.String r0 = r3.A0N
            android.content.Intent r0 = X.AnonymousClass1LU.A1P(r3, r0, r1)
            r2.A08(r3, r0)
            r3.finish()
            return
        L_0x0689:
            java.lang.String r0 = "waIntents"
            goto L_0x06f7
        L_0x068c:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.email.EmailEducationScreen r2 = (com.whatsapp.registration.email.EmailEducationScreen) r2
            java.lang.String r0 = "EmailEducationScreen/createFootnote/open contextual help"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r2.A04
            goto L_0x069e
        L_0x0698:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity r2 = (com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity) r2
            X.00H r0 = r2.A06
        L_0x069e:
            if (r0 == 0) goto L_0x06aa
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "email"
            r1.A01(r2, r0)
            return
        L_0x06aa:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x06f7
        L_0x06ad:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r0 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r0
            X.1iq r0 = r0.A0D
            if (r0 == 0) goto L_0x06bc
            r0.A0A()
            X.C33451iq.A04(r0)
            return
        L_0x06bc:
            java.lang.String r0 = "userNoticeManager"
            goto L_0x06f7
        L_0x06bf:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r0 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r0
            X.1Uv r0 = r0.A0A
            if (r0 == 0) goto L_0x06cb
            r0.A0O()
            return
        L_0x06cb:
            java.lang.String r0 = "locationSharingManager"
            goto L_0x06f7
        L_0x06ce:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r2 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r2
            X.122 r0 = r2.A09
            if (r0 == 0) goto L_0x06f5
            r1 = 0
            r0.A0N(r1, r1)
            X.122 r0 = r2.A09
            if (r0 == 0) goto L_0x06ef
            r0.A0L()
            X.122 r0 = r2.A09
            if (r0 == 0) goto L_0x06e9
            r0.A0M()
            return
        L_0x06e9:
            java.lang.String r0 = "coreMessageStore"
            X.C18070vi.A11(r0)
            throw r1
        L_0x06ef:
            java.lang.String r0 = "coreMessageStore"
            X.C18070vi.A11(r0)
            throw r1
        L_0x06f5:
            java.lang.String r0 = "coreMessageStore"
        L_0x06f7:
            X.C18070vi.A11(r0)
        L_0x06fa:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21428Ajv.run():void");
    }
}

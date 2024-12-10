package X;

/* renamed from: X.4rc  reason: invalid class name and case insensitive filesystem */
public class C98724rc implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C98724rc(Object obj, String str, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
    }

    public static void A00(AnonymousClass1FU r1, String str, boolean z) {
        r1.A0A.A1f(str);
        r1.A0A.A29(z);
        r1.A0A.A28(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.whatsapp.registration.email.RegisterEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0372, code lost:
        r1.get();
        r0 = X.A0K.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0379, code lost:
        if (r0 != null) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x037b, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x037f, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0382, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b5, code lost:
        r4.putExtra("entrypoint", r7);
        r4.putExtra("session_id", r6);
        r5.A08(r0, r4);
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03c5, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0092;
                case 2: goto L_0x01cd;
                case 3: goto L_0x0030;
                case 4: goto L_0x02a4;
                case 5: goto L_0x033a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.1eb r0 = (X.C30841eb) r0
            boolean r1 = r1.A03
            X.1LD r0 = r0.A02
            r0.A00(r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r1.A01
            X.A99 r0 = (X.A99) r0
            boolean r3 = r1.A03
            boolean r2 = r1.A04
            java.lang.String r1 = r1.A02
            X.11S r0 = r0.A23
            if (r0 == 0) goto L_0x0012
            r0.A0I()
            X.1E8 r0 = r0.A0D
            if (r0 == 0) goto L_0x0012
            if (r3 == 0) goto L_0x03e2
            if (r2 == 0) goto L_0x03de
            com.whatsapp.voipcalling.Voip.endCallAndAcceptPendingCallWithVideoStopped(r1)
            return
        L_0x0030:
            java.lang.Object r3 = r1.A01
            X.A2M r3 = (X.A2M) r3
            boolean r7 = r1.A03
            java.lang.String r6 = r1.A02
            boolean r5 = r1.A04
            r4 = 0
            X.8sE r2 = new X.8sE
            r2.<init>()
            X.A2M.A00(r2, r3)
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            java.lang.String r0 = r3.A04
            r2.A0N = r0
            r2.A0L = r6
            java.lang.Boolean r0 = r3.A02
            r2.A01 = r0
            X.18K r0 = r3.A08
            r0.CC4(r2)
            r2 = 0
            if (r7 != 0) goto L_0x008d
            java.lang.String r0 = "flow_error"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "user_interrupted"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "flow_success"
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x008b
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
        L_0x0079:
            X.9tz r0 = r3.A01
            r3.A01(r0, r1, r2, r4)
            if (r5 == 0) goto L_0x0012
            r3.A01 = r2
            r3.A04 = r2
            r3.A02 = r2
            r0 = 1
            r3.A00 = r0
            return
        L_0x008b:
            r1 = r2
            goto L_0x0079
        L_0x008d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            goto L_0x0079
        L_0x0092:
            java.lang.String r4 = r1.A02
            java.lang.Object r2 = r1.A01
            com.whatsapp.email.EmailVerificationActivity r2 = (com.whatsapp.email.EmailVerificationActivity) r2
            boolean r3 = r1.A03
            boolean r1 = r1.A04
            if (r4 == 0) goto L_0x00c8
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00c8
            X.0z4 r0 = r2.A0A
            r0.A1f(r4)
            X.0z4 r0 = r2.A0A
            r0.A29(r3)
            X.0z4 r0 = r2.A0A
            r0.A28(r1)
            boolean r0 = com.whatsapp.email.EmailVerificationActivity.A0s(r2)
            r1 = 7
            if (r0 == 0) goto L_0x00bc
            r1 = 11
        L_0x00bc:
            r0 = 8
            com.whatsapp.email.EmailVerificationActivity.A0r(r2, r1, r0)
            com.whatsapp.email.EmailVerificationActivity.A0c(r2)
        L_0x00c4:
            com.whatsapp.email.EmailVerificationActivity.A0q(r2)
            return
        L_0x00c8:
            X.0z4 r1 = r2.A0A
            r0 = 0
            r1.A1f(r0)
            X.0z4 r0 = r2.A0A
            r1 = 0
            r0.A29(r1)
            X.0z4 r0 = r2.A0A
            r0.A28(r1)
            r0 = 5
            r7 = 8
            com.whatsapp.email.EmailVerificationActivity.A0r(r2, r0, r7)
            X.1bI r0 = r2.A03
            java.lang.String r6 = "wdsTextLayoutViewStub"
            if (r0 == 0) goto L_0x01c8
            android.view.View r1 = r0.A02()
            r0 = 2131430301(0x7f0b0b9d, float:1.84823E38)
            android.view.View r5 = r1.findViewById(r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r5 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r5
            android.view.View r1 = r2.A00
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            android.view.View r4 = X.C18070vi.A05(r1, r0)
            X.0ve r3 = r2.A0E
            r1 = 10040(0x2738, float:1.4069E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0198
            r4.setVisibility(r7)
            X.1bI r0 = r2.A03
            if (r0 == 0) goto L_0x01c8
            r0.A04(r3)
            X.C18070vi.A0b(r5)
            r0 = 2131889681(0x7f120e11, float:1.9414032E38)
            X.AnonymousClass3MY.A10(r2, r5, r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r3 = 2131233476(0x7f080ac4, float:1.808309E38)
            r0 = 2131889675(0x7f120e0b, float:1.941402E38)
            java.lang.String r1 = X.C18070vi.A0F(r2, r0)
            r4 = 0
            X.4Zy r0 = new X.4Zy
            r0.<init>(r1, r4, r3)
            r6.add(r0)
            r3 = 2131233238(0x7f0809d6, float:1.8082608E38)
            r0 = 2131889676(0x7f120e0c, float:1.9414022E38)
            java.lang.String r1 = X.C18070vi.A0F(r2, r0)
            X.4Zy r0 = new X.4Zy
            r0.<init>(r1, r4, r3)
            r6.add(r0)
            r3 = 2131232075(0x7f08054b, float:1.808025E38)
            r0 = 2131889677(0x7f120e0d, float:1.9414024E38)
            java.lang.String r1 = X.C18070vi.A0F(r2, r0)
            X.4Zy r0 = new X.4Zy
            r0.<init>(r1, r4, r3)
            r6.add(r0)
            X.AnonymousClass4CF.A00(r5, r6)
            r0 = 2131430969(0x7f0b0e39, float:1.8483654E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r5, r0)
            X.0ve r0 = r2.A0E
            X.AnonymousClass3Ma.A1I(r1, r0)
            X.00H r0 = r2.A08
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r4 = r0.get()
            X.1np r4 = (X.C36401np) r4
            r0 = 2131889679(0x7f120e0f, float:1.9414028E38)
            java.lang.String r3 = r2.getString(r0)
            r0 = 30
            X.4rM r1 = new X.4rM
            r1.<init>(r2, r0)
            java.lang.String r0 = "learn-more"
            android.text.SpannableStringBuilder r0 = X.AnonymousClass3MY.A0A(r2, r4, r1, r3, r0)
            r5.setFootnoteText(r0)
            r0 = 2131889654(0x7f120df6, float:1.9413978E38)
            X.AnonymousClass3MY.A0z(r2, r5, r0)
            r1 = 45
            X.48f r0 = new X.48f
            r0.<init>(r2, r1)
            r5.setPrimaryButtonClickListener(r0)
            goto L_0x00c4
        L_0x0198:
            r4.setVisibility(r3)
            X.1bI r0 = r2.A03
            if (r0 == 0) goto L_0x01c8
            r0.A04(r7)
            X.1bI r0 = r2.A01
            java.lang.String r1 = "addEmailButtonViewStub"
            if (r0 == 0) goto L_0x01c4
            r0.A04(r3)
            X.1bI r0 = r2.A01
            if (r0 == 0) goto L_0x01c4
            android.view.View r1 = r0.A02()
            r0 = 2131427596(0x7f0b010c, float:1.8476813E38)
            android.view.View r1 = X.AnonymousClass3MX.A0C(r1, r0)
            r0 = 6
            X.C89934dG.A00(r1, r2, r0)
            goto L_0x00c4
        L_0x01c0:
            X.AnonymousClass3MW.A1E()
            throw r4
        L_0x01c4:
            X.C18070vi.A11(r1)
            goto L_0x01cb
        L_0x01c8:
            X.C18070vi.A11(r6)
        L_0x01cb:
            r0 = 0
            throw r0
        L_0x01cd:
            java.lang.Object r9 = r1.A01
            com.whatsapp.email.UpdateEmailActivity r9 = (com.whatsapp.email.UpdateEmailActivity) r9
            java.lang.String r10 = r1.A02
            boolean r3 = r1.A03
            boolean r2 = r1.A04
            r1 = 0
            r8 = 1
            X.C18070vi.A0d(r10, r8)
            X.AnonymousClass4Yv.A00(r9, r8)
            r0 = 5
            X.AnonymousClass4Yv.A00(r9, r0)
            int r0 = r10.length()
            r4 = 0
            if (r0 != 0) goto L_0x0216
            X.9kJ r2 = X.C72453Mb.A0k(r9)
            java.lang.String r3 = r9.A0A
            int r5 = r9.A00
            r6 = 4
            r7 = 2
            r2.A00(r3, r4, r5, r6, r7, r8)
            A00(r9, r4, r1)
            X.1L9 r2 = r9.A01
            X.00H r0 = r9.A09
            if (r0 == 0) goto L_0x0212
            r0.get()
            int r1 = r9.A00
            java.lang.String r0 = r9.A0A
            android.content.Intent r0 = X.AnonymousClass1LU.A1O(r9, r0, r1)
            r2.A08(r9, r0)
            r9.finish()
            return
        L_0x0212:
            X.AnonymousClass3MW.A1F()
            throw r4
        L_0x0216:
            if (r3 == 0) goto L_0x024a
            X.9kJ r2 = X.C72453Mb.A0k(r9)
            java.lang.String r3 = r9.A0A
            int r5 = r9.A00
            int r6 = com.whatsapp.email.UpdateEmailActivity.A03(r9)
            r7 = 15
            r2.A00(r3, r4, r5, r6, r7, r8)
            A00(r9, r10, r8)
            r0 = 35
            X.4rM r1 = new X.4rM
            r1.<init>(r9, r0)
            X.00H r0 = r9.A05
            if (r0 == 0) goto L_0x0244
            r0.get()
            X.05w r0 = X.A0K.A00(r9, r1)
            if (r0 != 0) goto L_0x037f
            r1.run()
            return
        L_0x0244:
            java.lang.String r0 = "automaticVerificationCompleteDialogUtil"
            X.C18070vi.A11(r0)
            throw r4
        L_0x024a:
            if (r2 == 0) goto L_0x028d
            X.9kJ r2 = X.C72453Mb.A0k(r9)
            java.lang.String r3 = r9.A0A
            int r5 = r9.A00
            int r6 = com.whatsapp.email.UpdateEmailActivity.A03(r9)
            r7 = 2
            r2.A00(r3, r4, r5, r6, r7, r8)
            A00(r9, r10, r1)
            X.1L9 r1 = r9.A01
            X.00H r0 = r9.A09
            if (r0 == 0) goto L_0x0289
            r0.get()
            int r13 = r9.A01
            int r14 = r9.A00
            java.lang.String r12 = r9.A0A
            r11 = r4
            android.content.Intent r0 = X.AnonymousClass1LU.A1d(r9, r10, r11, r12, r13, r14)
            r1.A08(r9, r0)
            r9.finish()
            X.1bI r1 = r9.A03
            if (r1 != 0) goto L_0x0283
            java.lang.String r0 = "invalidEmailViewStub"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0283:
            r0 = 8
            r1.A04(r0)
            return
        L_0x0289:
            X.AnonymousClass3MW.A1F()
            throw r4
        L_0x028d:
            X.9kJ r0 = X.C72453Mb.A0k(r9)
            java.lang.String r1 = r9.A0A
            int r3 = r9.A00
            int r4 = com.whatsapp.email.UpdateEmailActivity.A03(r9)
            r5 = 2
            java.lang.String r2 = "INVALID_EMAIL"
            r6 = r5
            r0.A00(r1, r2, r3, r4, r5, r6)
            com.whatsapp.email.UpdateEmailActivity.A0Q(r9)
            return
        L_0x02a4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.email.RegisterEmail r0 = (com.whatsapp.registration.email.RegisterEmail) r0
            boolean r5 = r1.A03
            java.lang.String r3 = r1.A02
            boolean r4 = r1.A04
            r2 = 0
            r14 = 2
            X.C18070vi.A0d(r3, r14)
            r1 = 4
            X.AnonymousClass4Yv.A00(r0, r1)
            r8 = 1
            X.AnonymousClass4Yv.A00(r0, r8)
            if (r5 == 0) goto L_0x02df
            X.9kJ r4 = X.C72463Mc.A0b(r0)
            java.lang.String r5 = r0.A0G
            int r7 = r0.A00
            r6 = 0
            r9 = 15
            r10 = r8
            r4.A00(r5, r6, r7, r8, r9, r10)
            A00(r0, r3, r8)
            r1 = 3
            X.Ajv r2 = new X.Ajv
            r2.<init>(r0, r1)
            X.00H r1 = r0.A0A
            if (r1 != 0) goto L_0x0372
            java.lang.String r0 = "automaticVerificationCompleteDialogUtil"
            X.C18070vi.A11(r0)
            throw r6
        L_0x02df:
            java.lang.String r1 = "invalidEmailViewStub"
            X.9kJ r9 = X.C72463Mc.A0b(r0)
            java.lang.String r10 = r0.A0G
            int r12 = r0.A00
            if (r4 == 0) goto L_0x0326
            r11 = 0
            r13 = r8
            r15 = r8
            r9.A00(r10, r11, r12, r13, r14, r15)
            A00(r0, r3, r2)
            X.1bI r2 = r0.A06
            if (r2 != 0) goto L_0x02fc
            X.C18070vi.A11(r1)
            throw r11
        L_0x02fc:
            r1 = 8
            r2.A04(r1)
            X.1L9 r5 = r0.A01
            X.00H r1 = r0.A0F
            if (r1 == 0) goto L_0x0322
            r1.get()
            int r7 = r0.A00
            java.lang.String r6 = r0.A0G
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.whatsapp.registration.email.VerifyEmail"
            r4.setClassName(r2, r1)
            java.lang.String r1 = "email"
            r4.putExtra(r1, r3)
            goto L_0x03b5
        L_0x0322:
            X.AnonymousClass3MW.A1F()
            throw r11
        L_0x0326:
            java.lang.String r11 = "INVALID_EMAIL"
            r13 = r8
            r15 = r14
            r9.A00(r10, r11, r12, r13, r14, r15)
            X.1bI r0 = r0.A06
            if (r0 != 0) goto L_0x0336
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x0336:
            r0.A04(r2)
            return
        L_0x033a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity r0 = (com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity) r0
            boolean r4 = r1.A03
            java.lang.String r2 = r1.A02
            boolean r3 = r1.A04
            r6 = 2
            r1 = 3
            X.AnonymousClass4Yv.A00(r0, r1)
            r9 = 1
            X.AnonymousClass4Yv.A00(r0, r9)
            if (r4 == 0) goto L_0x0383
            X.9kJ r3 = r0.A4b()
            java.lang.String r4 = r0.A0C
            int r6 = r0.A00
            r5 = 0
            r7 = 9
            r8 = 15
            r3.A00(r4, r5, r6, r7, r8, r9)
            A00(r0, r2, r9)
            r1 = 5
            X.Ajv r2 = new X.Ajv
            r2.<init>(r0, r1)
            X.00H r1 = r0.A05
            if (r1 != 0) goto L_0x0372
            java.lang.String r0 = "automaticVerificationCompleteDialogUtil"
            X.C18070vi.A11(r0)
            throw r5
        L_0x0372:
            r1.get()
            X.05w r0 = X.A0K.A00(r0, r2)
            if (r0 != 0) goto L_0x037f
            r2.run()
            return
        L_0x037f:
            r0.show()
            return
        L_0x0383:
            if (r3 == 0) goto L_0x03ca
            X.9kJ r10 = r0.A4b()
            java.lang.String r11 = r0.A0C
            int r13 = r0.A00
            r12 = 0
            r14 = 9
            r15 = r14
            r16 = r9
            r10.A00(r11, r12, r13, r14, r15, r16)
            X.1L9 r5 = r0.A01
            X.00H r1 = r0.A0A
            if (r1 == 0) goto L_0x03c6
            r1.get()
            int r7 = r0.A00
            java.lang.String r6 = r0.A0C
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r1 = "com.whatsapp.registration.email.VerifyEmail"
            r4.setClassName(r3, r1)
            java.lang.String r1 = "email"
            r4.putExtra(r1, r2)
        L_0x03b5:
            java.lang.String r1 = "entrypoint"
            r4.putExtra(r1, r7)
            java.lang.String r1 = "session_id"
            r4.putExtra(r1, r6)
            r5.A08(r0, r4)
            r0.finish()
            return
        L_0x03c6:
            X.AnonymousClass3MW.A1F()
            throw r12
        L_0x03ca:
            X.9kJ r1 = r0.A4b()
            java.lang.String r2 = r0.A0C
            int r4 = r0.A00
            java.lang.String r3 = "INVALID_EMAIL"
            r5 = 9
            r7 = r6
            r1.A00(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass4Yv.A01(r0, r6)
            return
        L_0x03de:
            com.whatsapp.voipcalling.Voip.endCallAndAcceptPendingCall(r1)
            return
        L_0x03e2:
            if (r2 == 0) goto L_0x03e8
            com.whatsapp.voipcalling.Voip.acceptCallWithVideoStopped()
            return
        L_0x03e8:
            com.whatsapp.voipcalling.Voip.acceptCall()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98724rc.run():void");
    }
}

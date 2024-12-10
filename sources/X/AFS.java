package X;

import android.view.View;

public class AFS implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Long A00(A5R a5r, String str) {
        return Long.valueOf(a5r.A02(str, 0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0436, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0439, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0525, code lost:
        r2 = X.C17880vN.A0D();
        r2.putString("VERIFY_ANOTHER_WAY_CODE_METHOD", r1);
        r3.A1F().A0w("VERIFY_ANOTHER_WAY_FRAGMENT_RESULT", r2);
        r3.A29();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x053a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x059c, code lost:
        r0 = "funnelLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05a9, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05ad, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x061d, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0620, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r3.A05.A0N() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r1 = new com.whatsapp.report.DeleteReportConfirmationDialogFragment();
        r1.A00 = new X.C145567Lt(r3, r2);
        r3.CMk(r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0164, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0168, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            r4 = r20
            switch(r0) {
                case 0: goto L_0x0560;
                case 1: goto L_0x053b;
                case 2: goto L_0x051a;
                case 3: goto L_0x050e;
                case 4: goto L_0x04d9;
                case 5: goto L_0x0506;
                case 6: goto L_0x0506;
                case 7: goto L_0x04e1;
                case 8: goto L_0x04d9;
                case 9: goto L_0x04bb;
                case 10: goto L_0x0454;
                case 11: goto L_0x044e;
                case 12: goto L_0x044e;
                case 13: goto L_0x043a;
                case 14: goto L_0x044e;
                case 15: goto L_0x044e;
                case 16: goto L_0x044e;
                case 17: goto L_0x041e;
                case 18: goto L_0x01cd;
                case 19: goto L_0x0615;
                case 20: goto L_0x05e0;
                case 21: goto L_0x015a;
                case 22: goto L_0x0144;
                case 23: goto L_0x012e;
                case 24: goto L_0x0015;
                case 25: goto L_0x05b2;
                case 26: goto L_0x010c;
                case 27: goto L_0x00d2;
                case 28: goto L_0x03fa;
                case 29: goto L_0x0009;
                case 30: goto L_0x059f;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x03f2;
                case 34: goto L_0x04d9;
                case 35: goto L_0x03b8;
                case 36: goto L_0x008f;
                case 37: goto L_0x03b0;
                case 38: goto L_0x02e6;
                case 39: goto L_0x02cd;
                case 40: goto L_0x02e6;
                case 41: goto L_0x026a;
                case 42: goto L_0x026a;
                case 43: goto L_0x0070;
                case 44: goto L_0x0069;
                case 45: goto L_0x0264;
                case 46: goto L_0x0219;
                case 47: goto L_0x04d9;
                case 48: goto L_0x01ef;
                case 49: goto L_0x01e6;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r1
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            r1.onRadioButtonClicked(r4)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r1.A01
            com.whatsapp.registration.email.VerifyEmail r4 = (com.whatsapp.registration.email.VerifyEmail) r4
            boolean r0 = com.whatsapp.registration.email.VerifyEmail.A0d(r4)
            if (r0 == 0) goto L_0x0028
            X.0zA r0 = r4.A4e()
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x0028:
            X.4VX r0 = r4.A09
            java.lang.String r1 = "codeInputBoxManager"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0054
            X.4VX r0 = r4.A09
            if (r0 == 0) goto L_0x0064
            java.lang.String r3 = r0.A00()
        L_0x003c:
            r0 = 2
            X.AnonymousClass4Yv.A01(r4, r0)
            X.00H r0 = r4.A0J
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r2 = r0.get()
            X.9uY r2 = (X.C196159uY) r2
            r1 = 1
            X.4mu r0 = new X.4mu
            r0.<init>(r4, r1)
            r2.A04(r0, r3)
            return
        L_0x0054:
            com.whatsapp.CodeInputField r0 = r4.A04
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "codeInputField"
            goto L_0x0164
        L_0x005c:
            java.lang.String r3 = r0.getCode()
            X.C18070vi.A0b(r3)
            goto L_0x003c
        L_0x0064:
            X.C18070vi.A11(r1)
            goto L_0x0167
        L_0x0069:
            java.lang.Object r3 = r1.A01
            com.whatsapp.report.ReportActivity r3 = (com.whatsapp.report.ReportActivity) r3
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            goto L_0x0076
        L_0x0070:
            java.lang.Object r3 = r1.A01
            com.whatsapp.report.ReportActivity r3 = (com.whatsapp.report.ReportActivity) r3
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
        L_0x0076:
            X.1KB r0 = r3.A05
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0014
            com.whatsapp.report.DeleteReportConfirmationDialogFragment r1 = new com.whatsapp.report.DeleteReportConfirmationDialogFragment
            r1.<init>()
            X.7Lt r0 = new X.7Lt
            r0.<init>(r3, r2)
            r1.A00 = r0
            r0 = 0
            r3.CMk(r1, r0)
            return
        L_0x008f:
            java.lang.Object r5 = r1.A01
            com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment r5 = (com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment) r5
            androidx.recyclerview.widget.RecyclerView r0 = r5.A04
            r1 = 0
            if (r0 == 0) goto L_0x009a
            X.1rD r1 = r0.A0B
        L_0x009a:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.registration.verifyphone.RegMethodsAdapter"
            X.C18070vi.A0z(r1, r0)
            X.8Hl r1 = (X.C161718Hl) r1
            int r1 = r1.A00
            r0 = -1
            if (r1 == r0) goto L_0x00ce
            java.util.List r0 = r5.A0K
            java.lang.Object r1 = r0.get(r1)
            X.9tR r1 = (X.C195499tR) r1
            X.0vk r0 = r1.A05
            r0.invoke()
            X.A8V r4 = r5.A0A
            if (r4 == 0) goto L_0x059c
            java.lang.String r3 = r1.A02
            r0 = 0
            X.9xW r2 = new X.9xW
            r2.<init>(r0, r3)
            boolean r1 = r5.A0M
            java.lang.String r0 = "tapped_continue_button"
            r4.A0A(r2, r0, r1)
            java.lang.String r0 = "passkey"
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 != 0) goto L_0x0014
        L_0x00ce:
            r5.A29()
            return
        L_0x00d2:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen r3 = (com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen) r3
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0571
            X.Ad6 r2 = r3.A05
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "DynamicBottomSheetNavigator/startVerifyWithSilentAuth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1jT r1 = r2.A0C
            r0 = 23
            r6 = 1
            X.C33841jT.A03(r1, r0, r6)
            X.1FY r1 = r2.A09
            long r7 = r2.A01
            long r9 = r2.A02
            boolean r15 = r2.A04
            boolean r0 = r2.A0H
            java.lang.String r3 = r2.A0G
            r2 = 0
            r4 = -1
            r11 = 0
            r5 = 0
            r13 = r11
            r16 = r6
            r17 = r0
            r18 = r5
            android.content.Intent r0 = X.AnonymousClass1LU.A1W(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r15, r16, r17, r18)
            r1.startActivity(r0)
            goto L_0x061d
        L_0x010c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen r3 = (com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen) r3
            java.lang.String r0 = "PrimaryFlashCallEducationScreen/verify-with-flash-call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A0A
            if (r0 == 0) goto L_0x059c
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r1 = "flash_call_education"
            java.lang.String r0 = "continue"
            r2.A0I(r1, r0)
            X.Ad6 r1 = r3.A05
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "flash"
            r1.A05(r0)
            return
        L_0x012e:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.email.VerifyEmail r1 = (com.whatsapp.registration.email.VerifyEmail) r1
            com.whatsapp.registration.email.VerifyEmail.A0Q(r1)
            boolean r0 = com.whatsapp.registration.email.VerifyEmail.A0d(r1)
            if (r0 == 0) goto L_0x0014
            X.0zA r0 = r1.A4e()
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x0144:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.email.VerifyEmail r1 = (com.whatsapp.registration.email.VerifyEmail) r1
            com.whatsapp.registration.email.VerifyEmail.A0Q(r1)
            boolean r0 = com.whatsapp.registration.email.VerifyEmail.A0d(r1)
            if (r0 == 0) goto L_0x0014
            X.0zA r0 = r1.A4e()
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x015a:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.email.RegisterEmail r3 = (com.whatsapp.registration.email.RegisterEmail) r3
            com.whatsapp.WaEditText r0 = r3.A02
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "emailInput"
        L_0x0164:
            X.C18070vi.A11(r0)
        L_0x0167:
            r0 = 0
            throw r0
        L_0x0169:
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            java.lang.String r4 = X.AnonymousClass1YF.A0I(r0)
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            boolean r0 = X.AnonymousClass8BU.A1V(r4, r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "RegisterEmail/executeSetEmailRequest/invalid email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A4e()
            java.lang.Object r4 = r0.get()
            X.9kJ r4 = (X.C190059kJ) r4
            java.lang.String r5 = r3.A0G
            int r7 = r3.A00
            r9 = 2
            java.lang.String r6 = "INVALID_EMAIL"
            r8 = 1
            r10 = r9
            r4.A00(r5, r6, r7, r8, r9, r10)
            X.1bI r1 = r3.A06
            if (r1 != 0) goto L_0x01b2
            java.lang.String r0 = "invalidEmailViewStub"
            goto L_0x0164
        L_0x019b:
            r2 = 1
            X.AnonymousClass4Yv.A01(r3, r2)
            X.00H r0 = r3.A0C
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r1 = r0.get()
            X.9uY r1 = (X.C196159uY) r1
            X.4mt r0 = new X.4mt
            r0.<init>(r2, r4, r3)
            r1.A03(r0, r4, r2)
            goto L_0x01b6
        L_0x01b2:
            r0 = 0
            r1.A04(r0)
        L_0x01b6:
            X.0vl r0 = r3.A0Q
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0014
            X.0zA r0 = r3.A01
            if (r0 == 0) goto L_0x01c7
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x01c7:
            java.lang.String r0 = "smbOnboardingAnalyticsManager"
            goto L_0x0164
        L_0x01ca:
            java.lang.String r0 = "emailVerificationXmppMethods"
            goto L_0x0164
        L_0x01cd:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity r1 = (com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity) r1
            X.8GT r0 = r1.A0E
            if (r0 == 0) goto L_0x01d8
            X.AnonymousClass8GT.A00(r0)
        L_0x01d8:
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r1 = r1.A03
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.A05 = r0
            r0 = 0
            r1.A02 = r0
            r1.A01()
            return
        L_0x01e6:
            java.lang.Object r1 = r1.A01
            X.4VZ r1 = (X.AnonymousClass4VZ) r1
            r0 = 1
            r1.A05(r0)
            return
        L_0x01ef:
            java.lang.Object r3 = r1.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            X.5jU r2 = r3.A0b
            X.1Dl r1 = r3.A04
            boolean r0 = X.C111295jU.A0G(r2)
            if (r0 == 0) goto L_0x0216
            X.1Dg r0 = r2.A0a
        L_0x01ff:
            r0.A0D(r1)
            X.5jU r1 = r3.A0b
            X.00H r0 = r3.A0y
            java.lang.Object r0 = r0.get()
            X.1rX r0 = (X.C38581rX) r0
            boolean r0 = r0.A02()
            r0 = r0 ^ 1
            r1.A0p(r0)
            return
        L_0x0216:
            X.1Dg r0 = r2.A0h
            goto L_0x01ff
        L_0x0219:
            java.lang.Object r5 = r1.A01
            com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet r5 = (com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet) r5
            X.1FL r3 = r5.A1D()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.C18070vi.A0z(r3, r0)
            X.1FR r3 = (X.AnonymousClass1FR) r3
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2 = 0
            r3.CNB(r2, r0)
            X.10I r1 = r5.A0F
            if (r1 == 0) goto L_0x0260
            X.1kk r7 = r5.A09
            if (r7 == 0) goto L_0x025c
            X.1kb r6 = r5.A01
            if (r6 == 0) goto L_0x0258
            X.1EC r0 = r5.A0C
            if (r0 == 0) goto L_0x0254
            java.util.Set r8 = X.C18070vi.A0P(r0)
            r0 = 1
            X.4fK r4 = new X.4fK
            r4.<init>(r3, r5, r0)
            X.2PS r3 = new X.2PS
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.CGD(r3, r0)
            return
        L_0x0254:
            java.lang.String r0 = "groupJid"
            goto L_0x05a9
        L_0x0258:
            java.lang.String r0 = "communityChatManager"
            goto L_0x05a9
        L_0x025c:
            java.lang.String r0 = "unsentMessageStore"
            goto L_0x05a9
        L_0x0260:
            java.lang.String r0 = "waWorkers"
            goto L_0x05a9
        L_0x0264:
            java.lang.Object r0 = r1.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x026a:
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r2 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = r2.A0s
            java.lang.String r1 = "sms"
            java.util.Map r0 = r0.A04
            java.lang.Number r0 = X.C108945cZ.A1E(r1, r0)
            long r4 = X.C17900vP.A01(r0)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = r2.A0s
            java.lang.String r1 = "voice"
            java.util.Map r0 = r0.A04
            java.lang.Number r0 = X.C108945cZ.A1E(r1, r0)
            long r6 = X.C17900vP.A01(r0)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = r2.A0s
            java.lang.String r1 = "wa_old"
            java.util.Map r0 = r0.A04
            java.lang.Number r0 = X.C108945cZ.A1E(r1, r0)
            long r8 = X.C17900vP.A01(r0)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = r2.A0s
            java.lang.String r1 = "email_otp"
            java.util.Map r0 = r0.A04
            java.lang.Number r0 = X.C108945cZ.A1E(r1, r0)
            long r10 = X.C17900vP.A01(r0)
            boolean r12 = X.AnonymousClass8BR.A1N(r2)
            boolean r13 = X.AnonymousClass8BR.A1O(r2)
            java.lang.String r3 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A17(r2)
            com.whatsapp.registration.verifyphone.RequestOtpCodeBottomSheetFragment r3 = com.whatsapp.registration.verifyphone.RequestOtpCodeBottomSheetFragment.A00(r3, r4, r6, r8, r10, r12, r13)
            X.6z4 r1 = r2.A0b
            r0 = 10789(0x2a25, float:1.5119E-41)
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x02c9
            X.A8V r1 = X.AnonymousClass8BU.A0d(r2)
            java.lang.String r0 = "verification_code_retry_prompt"
            r1.A0C(r0)
        L_0x02c9:
            r2.CMl(r3)
            return
        L_0x02cd:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r3 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r3
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/retryverify"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.CodeInputField r0 = r3.A0L
            java.lang.String r2 = r0.getCode()
            android.widget.ImageButton r1 = r3.A0E
            r0 = 4
            r1.setVisibility(r0)
            r3.A4m(r2)
            return
        L_0x02e6:
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r2 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2
            X.19D r3 = r2.A00
            r1 = 10885(0x2a85, float:1.5253E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r0, r3, r1)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "sms"
            java.lang.Long r4 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "flash"
            if (r3 == 0) goto L_0x0331
            java.lang.Long r5 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "voice"
            java.lang.Long r6 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "wa_old"
            java.lang.Long r7 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "email_otp"
            java.lang.Long r8 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "send_sms"
            java.lang.Long r9 = A00(r1, r0)
            java.lang.String r10 = r2.A1M
            r11 = 0
            com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment r0 = X.C181729Rp.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.CMl(r0)
            return
        L_0x0331:
            java.lang.Long r10 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "voice"
            java.lang.Long r9 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "wa_old"
            java.lang.Long r8 = A00(r1, r0)
            X.A5R r1 = r2.A0v
            java.lang.String r0 = "email_otp"
            java.lang.Long r7 = A00(r1, r0)
            java.lang.String r6 = r2.A1M
            com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment r5 = new com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment
            r5.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            if (r4 == 0) goto L_0x0363
            long r3 = r4.longValue()
            java.lang.String r0 = "EXTRA_SMS_RETRY_TIME"
            r1.putLong(r0, r3)
        L_0x0363:
            if (r10 == 0) goto L_0x036e
            long r3 = r10.longValue()
            java.lang.String r0 = "EXTRA_FLASH_RETRY_TIME"
            r1.putLong(r0, r3)
        L_0x036e:
            if (r9 == 0) goto L_0x0379
            long r3 = r9.longValue()
            java.lang.String r0 = "EXTRA_VOICE_RETRY_TIME"
            r1.putLong(r0, r3)
        L_0x0379:
            if (r8 == 0) goto L_0x0384
            long r3 = r8.longValue()
            java.lang.String r0 = "EXTRA_WA_OLD_RETRY_TIME"
            r1.putLong(r0, r3)
        L_0x0384:
            if (r7 == 0) goto L_0x038f
            long r3 = r7.longValue()
            java.lang.String r0 = "EXTRA_EMAIL_OTP_RETRY_TIME"
            r1.putLong(r0, r3)
        L_0x038f:
            if (r6 == 0) goto L_0x0396
            java.lang.String r0 = "EXTRA_WA_OLD_DEVICE_NAME"
            r1.putString(r0, r6)
        L_0x0396:
            r5.A1R(r1)
            X.6z4 r1 = r2.A0b
            r0 = 10789(0x2a25, float:1.5119E-41)
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x03ac
            X.A8V r1 = X.AnonymousClass8BU.A0d(r2)
            java.lang.String r0 = "verification_code_retry_prompt"
            r1.A0C(r0)
        L_0x03ac:
            r2.CMl(r5)
            return
        L_0x03b0:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x03b8:
            java.lang.Object r4 = r1.A01
            com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment r4 = (com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r1 = 0
            if (r0 == 0) goto L_0x03c3
            X.1rD r1 = r0.A0B
        L_0x03c3:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.registration.verifyphone.RegMethodsAdapter"
            X.C18070vi.A0z(r1, r0)
            X.8Hl r1 = (X.C161718Hl) r1
            int r1 = r1.A00
            r0 = -1
            if (r1 == r0) goto L_0x03ee
            java.util.List r0 = r4.A0H
            java.lang.Object r1 = r0.get(r1)
            X.9tR r1 = (X.C195499tR) r1
            X.0vk r0 = r1.A05
            r0.invoke()
            X.A8V r3 = r4.A08
            if (r3 == 0) goto L_0x059c
            java.lang.String r1 = r1.A02
            r0 = 0
            X.9xW r2 = new X.9xW
            r2.<init>(r0, r1)
            java.lang.String r1 = "tapped_continue_button"
            r0 = 0
            r3.A0A(r2, r1, r0)
        L_0x03ee:
            r4.A29()
            return
        L_0x03f2:
            java.lang.Object r0 = r1.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x03fa:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r3 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r3
            java.lang.String r0 = "ChangeNumberNotifyContacts/confirm_change_btn/onClick/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.util.List r0 = r3.A0A
            if (r0 == 0) goto L_0x0419
            java.util.ArrayList r1 = X.C22971Dz.A0B(r0)
            java.lang.String r0 = "selectedJids"
            r2.putStringArrayListExtra(r0, r1)
            r0 = -1
            r3.setResult(r0, r2)
            goto L_0x0436
        L_0x0419:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x041e:
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            android.content.Context r0 = r4.getContext()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccount2FaActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
        L_0x0436:
            r3.finish()
            return
        L_0x043a:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Context r1 = r4.getContext()
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1m(r1, r0)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x044e:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0454:
            java.lang.Object r4 = r1.A01
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r4 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity) r4
            X.1oU r0 = r4.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x04a2
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/onMoveButtonClick/backup in-progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/showBackupRunningWarningDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131886315(0x7f1200eb, float:1.9407205E38)
            r3.A0E(r0)
            r0 = 2131886314(0x7f1200ea, float:1.9407203E38)
            r3.A0D(r0)
            r1 = 2131886312(0x7f1200e8, float:1.94072E38)
            r0 = 16
            X.C20152A9o.A00(r3, r4, r0, r1)
            r2 = 2131886313(0x7f1200e9, float:1.9407201E38)
            r1 = 17
            X.A9o r0 = new X.A9o
            r0.<init>(r4, r1)
            r3.A0X(r0, r2)
            r2 = 2131886311(0x7f1200e7, float:1.9407197E38)
            r1 = 12
            X.A9R r0 = new X.A9R
            r0.<init>(r1)
            r3.A0Y(r0, r2)
            r3.A0C()
            return
        L_0x04a2:
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/launchConfirmationDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9Ys r0 = new X.9Ys
            r0.<init>(r4)
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r2 = new com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment
            r2.<init>(r0)
            X.1GP r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity"
            r2.A2C(r1, r0)
            return
        L_0x04bb:
            java.lang.Object r4 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r4 = (com.whatsapp.registration.VerifyTwoFactorAuth) r4
            int r3 = com.whatsapp.registration.VerifyTwoFactorAuth.A03(r4)
            com.whatsapp.registration.VerifyTwoFactorAuth$resetAccountDialog r2 = new com.whatsapp.registration.VerifyTwoFactorAuth$resetAccountDialog
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "wipeStatus"
            r1.putInt(r0, r3)
            r2.A1R(r1)
            r0 = 0
            r4.CMk(r2, r0)
            return
        L_0x04d9:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x04e1:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r3 = (com.whatsapp.registration.VerifyTwoFactorAuth) r3
            int r1 = X.AnonymousClass8BU.A02(r3)
            r0 = 18
            if (r1 != r0) goto L_0x04fa
            java.lang.String r0 = "VerifyTwoFactorAuth/onClickForgotPinDialogPositiveButton/Send code"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r1 = r3.A0A
            X.118 r0 = r3.A0F
            X.C196889vo.A00(r0, r1, r3)
            return
        L_0x04fa:
            java.lang.String r0 = "VerifyTwoFactorAuth/onClickForgotPinDialogPositiveButton/Send email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 1
            r1 = 0
            r0 = 0
            com.whatsapp.registration.VerifyTwoFactorAuth.A0c(r3, r1, r2, r0)
            return
        L_0x0506:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            com.whatsapp.registration.VerifyTwoFactorAuth.A0Q(r0)
            return
        L_0x050e:
            java.lang.Object r3 = r1.A01
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "VerifyAnotherWayBottomSheetFragment/send-sms"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "sms"
            goto L_0x0525
        L_0x051a:
            java.lang.Object r3 = r1.A01
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "VerifyAnotherWayBottomSheetFragment/call-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "voice"
        L_0x0525:
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            r2.putString(r0, r1)
            X.1GP r1 = r3.A1F()
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT"
            r1.A0w(r0, r2)
            r3.A29()
            return
        L_0x053b:
            java.lang.Object r1 = r1.A01
            X.8dJ r1 = (X.C166658dJ) r1
            java.lang.String r0 = "RegisterName/restoredialog/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.RegisterName r1 = r1.A08
            X.1oU r0 = r1.A0J
            if (r0 == 0) goto L_0x055d
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0557
            X.AnonymousClass8BX.A15(r1)
            r0 = 1
            r1.A1W = r0
            return
        L_0x0557:
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x055d:
            java.lang.String r0 = "googleBackupConditionsManager"
            goto L_0x05a9
        L_0x0560:
            java.lang.Object r1 = r1.A01
            X.8dJ r1 = (X.C166658dJ) r1
            java.lang.String r0 = "RegisterName/restoredialog/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.RegisterName r1 = r1.A08
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0571:
            X.9oA r0 = r3.A07
            if (r0 == 0) goto L_0x0599
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0584
            com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment r0 = new com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment
            r0.<init>()
        L_0x0580:
            r3.CMl(r0)
            return
        L_0x0584:
            X.00H r0 = r3.A0A
            if (r0 == 0) goto L_0x059c
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r1 = "flash_call_education"
            java.lang.String r0 = "verify_another_way"
            r2.A0I(r1, r0)
            com.whatsapp.registration.VerifyAnotherWayBottomSheetFragment r0 = new com.whatsapp.registration.VerifyAnotherWayBottomSheetFragment
            r0.<init>()
            goto L_0x0580
        L_0x0599:
            java.lang.String r0 = "serverDrivenOtpManager"
            goto L_0x05a9
        L_0x059c:
            java.lang.String r0 = "funnelLogger"
            goto L_0x05a9
        L_0x059f:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r0 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A04
            if (r0 != 0) goto L_0x05ae
            java.lang.String r0 = "notifyContactsSwitch"
        L_0x05a9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05ae:
            r0.toggle()
            return
        L_0x05b2:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.email.VerifyEmail r1 = (com.whatsapp.registration.email.VerifyEmail) r1
            java.lang.String r0 = "VerifyEmail/setupNotNowButton/skip verify email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r1.A4f()
            java.lang.Object r2 = r0.get()
            X.9kJ r2 = (X.C190059kJ) r2
            java.lang.String r3 = r1.A0N
            int r5 = r1.A00
            r7 = 3
            r4 = 0
            r6 = 8
            r8 = r7
            r2.A00(r3, r4, r5, r6, r7, r8)
            boolean r0 = com.whatsapp.registration.email.VerifyEmail.A0d(r1)
            if (r0 == 0) goto L_0x061d
            X.0zA r0 = r1.A4e()
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x05e0:
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.email.RegisterEmail r1 = (com.whatsapp.registration.email.RegisterEmail) r1
            java.lang.String r0 = "RegisterEmail/setupNotNowButton/skip add email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r1.A4e()
            java.lang.Object r2 = r0.get()
            X.9kJ r2 = (X.C190059kJ) r2
            java.lang.String r3 = r1.A0G
            int r5 = r1.A00
            r7 = 3
            r4 = 0
            r6 = 1
            r8 = r7
            r2.A00(r3, r4, r5, r6, r7, r8)
            X.0vl r0 = r1.A0Q
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x061d
            X.0zA r0 = r1.A01
            if (r0 == 0) goto L_0x060f
            java.lang.NullPointerException r0 = X.AnonymousClass8BW.A0a(r0)
            throw r0
        L_0x060f:
            java.lang.String r0 = "smbOnboardingAnalyticsManager"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0615:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            r1.setResult(r0)
        L_0x061d:
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFS.onClick(android.view.View):void");
    }
}

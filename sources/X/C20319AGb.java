package X;

/* renamed from: X.AGb  reason: case insensitive filesystem */
public class C20319AGb implements AnonymousClass1XI {
    public final int A00;
    public final Object A01;

    public C20319AGb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0278, code lost:
        r13.finish();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bv0(java.lang.String r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A00
            r4 = r23
            switch(r0) {
                case 0: goto L_0x02d5;
                case 1: goto L_0x029d;
                case 2: goto L_0x0026;
                case 3: goto L_0x0011;
                case 4: goto L_0x0102;
                case 5: goto L_0x0047;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r0 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r0
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.A00(r4, r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen r3 = (com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen) r3
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            java.lang.String r2 = r4.getString(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrimaryFlashCallEducationScreen/verify-another-way/codeMethod "
            goto L_0x003a
        L_0x0026:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen r3 = (com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen) r3
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = "REQUEST_SERVER_DRIVEN_OTP_CODE_METHOD"
            java.lang.String r2 = r4.getString(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrimaryFlashCallEducationScreen/setupServerDrivenRequestOtpCodeResultListener/codeMethod "
        L_0x003a:
            X.C17900vP.A0f(r0, r2, r1)
            if (r2 == 0) goto L_0x0010
            X.Ad6 r0 = r3.A05
            if (r0 == 0) goto L_0x0010
            r0.A05(r2)
            return
        L_0x0047:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r3 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r3
            java.lang.String r0 = "REQUEST_SERVER_DRIVEN_OTP_CODE_METHOD"
            java.lang.String r5 = "RESTART_REG"
            java.lang.String r4 = r4.getString(r0, r5)
            r0 = 47
            X.AnonymousClass4Yv.A00(r3, r0)
            int r0 = r4.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case -1337063900: goto L_0x00ee;
                case -795576526: goto L_0x00dc;
                case -792038226: goto L_0x00c4;
                case 114009: goto L_0x00ab;
                case 97513456: goto L_0x009a;
                case 112386354: goto L_0x008e;
                case 1247787042: goto L_0x0079;
                case 2120743944: goto L_0x0068;
                default: goto L_0x0061;
            }
        L_0x0061:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1j(r3)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1f(r3)
            return
        L_0x0068:
            boolean r0 = X.AnonymousClass8BR.A1X(r4)
            if (r0 == 0) goto L_0x0061
            X.1jT r1 = r3.A0j
            r0 = 17
            X.C33841jT.A03(r1, r0, r2)
            r3.A4n(r2)
            goto L_0x0061
        L_0x0079:
            java.lang.String r0 = "send_sms"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r3.A0w
            X.6Eo r2 = r0.A04
            X.1pm r1 = X.AnonymousClass2SS.A00(r3)
            r0 = 0
            r2.A04(r1, r0)
            goto L_0x0061
        L_0x008e:
            java.lang.String r0 = "voice"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0061
            r3.A4g()
            goto L_0x0061
        L_0x009a:
            boolean r0 = X.AnonymousClass8BR.A1V(r4)
            if (r0 == 0) goto L_0x0061
            X.1jT r1 = r3.A0j
            r0 = 8
            X.C33841jT.A03(r1, r0, r2)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1r(r3, r2)
            goto L_0x0061
        L_0x00ab:
            boolean r0 = X.AnonymousClass8BR.A1U(r4)
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.C19963A0w.A00(r3)
            if (r0 == 0) goto L_0x00ba
            r3.A4h(r1)
        L_0x00ba:
            X.1jT r1 = r3.A0j
            r0 = 4
            X.C33841jT.A03(r1, r0, r2)
            r3.A4o(r2)
            goto L_0x0061
        L_0x00c4:
            java.lang.String r0 = "passkey"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel r2 = r3.A0q
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r3)
            java.lang.String r0 = "reg_passkey_auth_challenge"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            r2.A0T(r3, r0)
            goto L_0x0061
        L_0x00dc:
            boolean r0 = X.AnonymousClass8BR.A1W(r4)
            if (r0 == 0) goto L_0x0061
            X.1jT r1 = r3.A0j
            r0 = 15
            X.C33841jT.A03(r1, r0, r2)
            r3.A4p(r2)
            goto L_0x0061
        L_0x00ee:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x0061
            X.190 r4 = r3.A03
            java.lang.String r1 = "server_driven_fallback_methods_return_to_enter_phone_number"
            java.lang.String r0 = "PhoneNumber or CodeMethod is null/blank"
            r4.A0G(r1, r0, r2)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1i(r3)
            goto L_0x0061
        L_0x0102:
            java.lang.Object r13 = r1.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r13 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r13
            java.lang.String r0 = "REQUEST_SERVER_DRIVEN_OTP_CODE_METHOD"
            java.lang.String r2 = "RESTART_REG"
            java.lang.String r1 = r4.getString(r0, r2)
            r12 = 1
            r13.A0y = r12
            int r0 = r1.hashCode()
            r11 = 0
            switch(r0) {
                case -1537218559: goto L_0x011c;
                case -1337063900: goto L_0x01fc;
                case -795576526: goto L_0x020d;
                case -792038226: goto L_0x021c;
                case 114009: goto L_0x023a;
                case 97513456: goto L_0x0249;
                case 112386354: goto L_0x0254;
                case 1247787042: goto L_0x027d;
                case 2120743944: goto L_0x0292;
                default: goto L_0x0119;
            }
        L_0x0119:
            r13.A0y = r11
            return
        L_0x011c:
            java.lang.String r0 = "ENTER_CODE_DIRECTLY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0119
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r13)
            java.lang.String r0 = "registration_last_code_method"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            r1 = 4
            if (r2 == 0) goto L_0x0138
            int r0 = r2.hashCode()
            switch(r0) {
                case -795576526: goto L_0x01f0;
                case 112386354: goto L_0x01e3;
                case 2120743944: goto L_0x01d7;
                default: goto L_0x0138;
            }
        L_0x0138:
            X.1jT r0 = r13.A0I
        L_0x013a:
            X.C33841jT.A03(r0, r1, r12)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r13.A0M
            X.1DT r0 = r0.A0A
            int r19 = X.AnonymousClass8BX.A01(r0)
            long r8 = r13.A06
            long r6 = r13.A07
            long r4 = r13.A08
            long r2 = r13.A03
            boolean r0 = r13.A13
            r20 = r0
            java.lang.Boolean r0 = X.C17970vW.A01
            int r18 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r13)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r13.A0M
            X.1DT r0 = r0.A0M
            java.lang.String r17 = X.C108945cZ.A1F(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r13.A0M
            X.1DT r0 = r0.A0K
            int r16 = X.AnonymousClass8BX.A01(r0)
            boolean r10 = r13.A0y
            r14 = 0
            android.content.Intent r15 = X.C17880vN.A0A()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.verifyphone.VerifyPhoneNumber"
            android.content.Intent r1 = r15.setClassName(r1, r0)
            java.lang.String r0 = "server_start_message"
            r1.putExtra(r0, r14)
            java.lang.String r14 = "flash_type"
            r0 = r19
            r1.putExtra(r14, r0)
            java.lang.String r0 = "sms_retry_time"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "voice_retry_time"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "wa_old_retry_time"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "email_otp_retry_time"
            r1.putExtra(r0, r2)
            java.lang.String r2 = "use_sms_retriever"
            r0 = r20
            r1.putExtra(r2, r0)
            java.lang.String r0 = "show_request_code_progress_dialog"
            r1.putExtra(r0, r12)
            java.lang.String r0 = "changenumber"
            r1.putExtra(r0, r11)
            java.lang.String r0 = "should_request_flash_call"
            r1.putExtra(r0, r11)
            java.lang.String r2 = "wa_old_eligible"
            r0 = r18
            r1.putExtra(r2, r0)
            java.lang.String r2 = "wa_old_device_name"
            r0 = r17
            r1.putExtra(r2, r0)
            java.lang.String r2 = "silent_auth_eligible"
            r0 = r16
            r1.putExtra(r2, r0)
            java.lang.String r0 = "code_verification_mode"
            r1.putExtra(r0, r11)
            java.lang.String r0 = "should_show_dbs_on_back_pressed"
            r1.putExtra(r0, r10)
            java.lang.String r0 = "is_direct_code_entry"
            r1.putExtra(r0, r12)
            r13.startActivity(r1)
            goto L_0x0278
        L_0x01d7:
            boolean r0 = X.AnonymousClass8BR.A1X(r2)
            if (r0 == 0) goto L_0x0138
            X.1jT r0 = r13.A0I
            r1 = 17
            goto L_0x013a
        L_0x01e3:
            java.lang.String r0 = "voice"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0138
            X.1jT r0 = r13.A0I
            r1 = 5
            goto L_0x013a
        L_0x01f0:
            boolean r0 = X.AnonymousClass8BR.A1W(r2)
            if (r0 == 0) goto L_0x0138
            X.1jT r0 = r13.A0I
            r1 = 15
            goto L_0x013a
        L_0x01fc:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0119
            X.190 r2 = r13.A03
            java.lang.String r1 = "server_driven_fallback_methods_return_to_enter_phone_number"
            java.lang.String r0 = "PhoneNumber or CodeMethod is null/blank"
            r2.A0G(r1, r0, r12)
            goto L_0x0119
        L_0x020d:
            boolean r0 = X.AnonymousClass8BR.A1W(r1)
            if (r0 == 0) goto L_0x0119
            X.1jT r1 = r13.A0I
            r0 = 15
            X.C166988f1.A0c(r13, r1, r13, r0)
            goto L_0x0119
        L_0x021c:
            java.lang.String r0 = "passkey"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0119
            r0 = 17
            r13.A4h(r0)
            r13.A02 = r12
            com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel r1 = r13.A0b
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r13.A0M
            X.1DT r0 = r0.A0C
            java.lang.String r0 = X.C108945cZ.A1F(r0)
            r1.A0T(r13, r0)
            goto L_0x0119
        L_0x023a:
            boolean r0 = X.AnonymousClass8BR.A1U(r1)
            if (r0 == 0) goto L_0x0119
            X.0z4 r1 = r13.A0A
            X.118 r0 = r13.A08
            X.C196889vo.A00(r0, r1, r13)
            goto L_0x0119
        L_0x0249:
            boolean r0 = X.AnonymousClass8BR.A1V(r1)
            if (r0 == 0) goto L_0x0119
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1C(r13)
            goto L_0x0119
        L_0x0254:
            java.lang.String r0 = "voice"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = "RegisterPhone/verifyWithCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1jT r1 = r13.A0I
            r0 = 5
            X.C33841jT.A03(r1, r0, r12)
            long r3 = r13.A06
            long r1 = r13.A07
            boolean r0 = r13.A13
            r5 = r13
            r6 = r3
            r8 = r1
            r10 = r0
            android.content.Intent r0 = X.AnonymousClass1LU.A0M(r5, r6, r8, r10, r11)
            r13.startActivity(r0)
        L_0x0278:
            r13.finish()
            goto L_0x0119
        L_0x027d:
            java.lang.String r0 = "send_sms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0119
            com.whatsapp.registration.phonenumberentry.RegisterPhoneViewModel r0 = r13.A0a
            X.6Eo r1 = r0.A03
            X.1pm r0 = X.AnonymousClass2SS.A00(r13)
            r1.A04(r0, r11)
            goto L_0x0119
        L_0x0292:
            boolean r0 = X.AnonymousClass8BR.A1X(r1)
            if (r0 == 0) goto L_0x0119
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A18(r13)
            goto L_0x0119
        L_0x029d:
            java.lang.Object r2 = r1.A01
            X.Ad6 r2 = (X.C21014Ad6) r2
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            java.lang.String r1 = "REQUEST_SERVER_DRIVEN_OTP_CODE_METHOD"
            java.lang.String r0 = "RESTART_REG"
            java.lang.String r1 = r4.getString(r1, r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r3 = 1
            if (r0 == 0) goto L_0x02be
            X.190 r2 = r2.A08
            java.lang.String r1 = "server_driven_fallback_methods_return_to_enter_phone_number"
            java.lang.String r0 = "PhoneNumber or CodeMethod is null/blank"
            r2.A0G(r1, r0, r3)
            return
        L_0x02be:
            java.lang.String r0 = "ENTER_CODE_DIRECTLY"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x02cd
            X.C18070vi.A0b(r1)
            r2.A05(r1)
            return
        L_0x02cd:
            java.lang.String r1 = "An operation is not implemented."
            X.6Rw r0 = new X.6Rw
            r0.<init>(r1)
            throw r0
        L_0x02d5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r0 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r0
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A01(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20319AGb.Bv0(java.lang.String, android.os.Bundle):void");
    }
}

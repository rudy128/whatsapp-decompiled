package X;

public final class B0K extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22391B5u $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0K(C22391B5u b5u) {
        super(1);
        this.$callback = b5u;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.whatsapp.registration.phonenumberentry.RegisterPhone} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.whatsapp.registration.verifyphone.VerifyPhoneNumber} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.whatsapp.registration.phonenumberentry.RegisterPhone} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.whatsapp.registration.phonenumberentry.RegisterPhone} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r2 = r17
            X.9Mi r2 = (X.C180389Mi) r2
            boolean r0 = r2 instanceof X.AnonymousClass99W
            if (r0 != 0) goto L_0x0022
            boolean r0 = r2 instanceof X.AnonymousClass99V
            r1 = r16
            if (r0 == 0) goto L_0x002f
            X.B5u r1 = r1.$callback
            X.AdV r1 = (X.C21039AdV) r1
            int r0 = r1.A00
            java.lang.Object r1 = r1.A01
            if (r0 == 0) goto L_0x0025
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            r0 = 0
            r1.A1V = r0
        L_0x001d:
            r0 = 610(0x262, float:8.55E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
        L_0x0022:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0025:
            com.whatsapp.registration.phonenumberentry.RegisterPhone r1 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r1
            int r0 = r1.A02
            if (r0 != 0) goto L_0x001d
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1D(r1)
            goto L_0x0022
        L_0x002f:
            boolean r0 = r2 instanceof X.AnonymousClass99T
            if (r0 == 0) goto L_0x00f5
            X.B5u r1 = r1.$callback
            X.99T r2 = (X.AnonymousClass99T) r2
            java.lang.String r11 = r2.A00
            X.AdV r1 = (X.C21039AdV) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r2 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r2.A0w
            com.whatsapp.registration.passkey.PasskeyUseCase r4 = r0.A03
            X.1pm r3 = X.AnonymousClass2SS.A00(r2)
            java.lang.String r1 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r2)
            X.99E r0 = r2.A0m
            X.9s6 r2 = new X.9s6
            r2.<init>(r0, r1, r11)
            r1 = 0
            com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2 r0 = new com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2
            r0.<init>(r4, r2, r1)
            X.AnonymousClass3MX.A1Q(r0, r3)
            goto L_0x0022
        L_0x0060:
            java.lang.Object r9 = r1.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r9 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r9
            X.1jT r2 = r9.A0I
            r1 = 20
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.19D r2 = r9.A00
            r1 = 9120(0x23a0, float:1.278E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0095
            com.whatsapp.registration.phonenumberentry.RegisterPhoneViewModel r0 = r9.A0a
            com.whatsapp.registration.passkey.PasskeyUseCase r4 = r0.A02
            X.1pm r3 = X.AnonymousClass2SS.A00(r9)
            X.99E r1 = X.C199199zb.A00(r9)
            java.lang.String r0 = "verify_passkey"
            X.9s6 r2 = new X.9s6
            r2.<init>(r1, r0, r11)
            r1 = 0
            com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2 r0 = new com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2
            r0.<init>(r4, r2, r1)
            X.AnonymousClass3MX.A1Q(r0, r3)
            goto L_0x0022
        L_0x0095:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r9.A0M
            X.1DT r0 = r0.A0A
            int r14 = X.AnonymousClass8BX.A01(r0)
            long r7 = r9.A06
            long r5 = r9.A07
            long r0 = r9.A08
            long r3 = r9.A03
            int r12 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r9)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r2 = r9.A0M
            X.1DT r2 = r2.A0K
            int r10 = X.AnonymousClass8BX.A01(r2)
            android.content.Intent r15 = X.C17880vN.A0A()
            java.lang.String r13 = r9.getPackageName()
            java.lang.String r2 = "com.whatsapp.registration.verifyphone.VerifyPhoneNumber"
            android.content.Intent r2 = r15.setClassName(r13, r2)
            java.lang.String r13 = "flash_type"
            r2.putExtra(r13, r14)
            java.lang.String r13 = "sms_retry_time"
            r2.putExtra(r13, r7)
            java.lang.String r7 = "voice_retry_time"
            r2.putExtra(r7, r5)
            java.lang.String r5 = "wa_old_retry_time"
            r2.putExtra(r5, r0)
            java.lang.String r0 = "email_otp_retry_time"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "wa_old_eligible"
            r2.putExtra(r0, r12)
            java.lang.String r0 = "passkey_challenge_response"
            r2.putExtra(r0, r11)
            java.lang.String r0 = "silent_auth_eligible"
            r2.putExtra(r0, r10)
            java.lang.String r1 = "code_verification_mode"
            r0 = 0
            r2.putExtra(r1, r0)
            r9.startActivity(r2)
            r9.finish()
            goto L_0x0022
        L_0x00f5:
            boolean r0 = r2 instanceof X.AnonymousClass99U
            if (r0 == 0) goto L_0x0022
            X.B5u r1 = r1.$callback
            X.AdV r1 = (X.C21039AdV) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r1.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            r0 = 0
            r1.A1V = r0
            goto L_0x0022
        L_0x010a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1D(r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0K.invoke(java.lang.Object):java.lang.Object");
    }
}

package com.whatsapp.registration.passkey;

import X.AnonymousClass00H;
import X.C18070vi;
import com.whatsapp.passkeys.PasskeyAndroidApiImpl;

public final class PasskeyVerifier {
    public final PasskeyAndroidApiImpl A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.app.Activity r14, java.lang.String r15, X.C30391dr r16, X.AnonymousClass1OS r17) {
        /*
            r13 = this;
            r3 = r17
            r4 = r16
            boolean r0 = r4 instanceof X.C21700AoT
            if (r0 == 0) goto L_0x010c
            r5 = r4
            X.AoT r5 = (X.C21700AoT) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010c
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r8 = 1
            if (r0 == 0) goto L_0x00ec
            if (r0 != r8) goto L_0x0113
            long r1 = r5.J$0
            java.lang.Object r3 = r5.L$1
            X.1OS r3 = (X.AnonymousClass1OS) r3
            java.lang.Object r7 = r5.L$0
            com.whatsapp.registration.passkey.PasskeyVerifier r7 = (com.whatsapp.registration.passkey.PasskeyVerifier) r7
            X.C30691eM.A01(r6)
        L_0x002e:
            X.9MT r6 = (X.AnonymousClass9MT) r6
            boolean r4 = r6 instanceof X.C175348yZ
            r0 = 2
            r9 = 0
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = "PasskeyVerification/onPasskeyChallengeReceived/PasskeyLoginEvent/passkey_client_login_success"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.00H r4 = r7.A01
            X.A8V r7 = X.AnonymousClass8BR.A0q(r4)
            long r1 = X.AnonymousClass8BR.A04(r1)
            java.lang.String r9 = "verify_passkey"
            java.lang.String r10 = "passkey_client_login_success"
            r11 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            r12 = r11
            X.A8V.A05(r7, r8, r9, r10, r11, r12)
            X.8yZ r6 = (X.C175348yZ) r6
            java.lang.Object r1 = r6.A00
            java.lang.String r1 = (java.lang.String) r1
            byte[] r1 = X.C108975cc.A1O(r1)
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            X.9IG r0 = X.AnonymousClass9IG.SUCCESS
            r3.invoke(r0, r1)
        L_0x0065:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0068:
            boolean r4 = r6 instanceof X.C175338yY
            if (r4 == 0) goto L_0x0065
            long r4 = X.AnonymousClass8BR.A04(r1)
            X.8yY r6 = (X.C175338yY) r6
            java.lang.Object r1 = r6.A00
            X.A1a r1 = (X.C19965A1a) r1
            java.lang.Integer r2 = r1.A00
            java.lang.Throwable r1 = r1.A01
            int r2 = r2.intValue()
            r6 = 0
            if (r2 == r8) goto L_0x00ba
            if (r2 == r9) goto L_0x00a3
            if (r2 == r0) goto L_0x008c
            r0 = 3
            if (r2 == r0) goto L_0x00d1
            r0 = 4
            if (r2 == r0) goto L_0x00d1
            goto L_0x0065
        L_0x008c:
            java.lang.String r0 = "PasskeyVerification/passkeyEvent/passkey_client_login_nopasskey"
            com.whatsapp.util.Log.e(r0, r1)
            X.00H r0 = r7.A01
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            X.9qu r1 = X.C181569Qz.A00(r1)
            java.lang.String r0 = "passkey_client_login_nopasskey"
            r2.A09(r1, r0, r4)
            X.9IG r0 = X.AnonymousClass9IG.ANDROID_API_VERIFICATION_NOPASSKEY
            goto L_0x00e7
        L_0x00a3:
            java.lang.String r0 = "PasskeyVerification/passkeyEvent/passkey_client_login_ineligible"
            com.whatsapp.util.Log.e(r0, r1)
            X.00H r0 = r7.A01
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            X.9qu r1 = X.C181569Qz.A00(r1)
            java.lang.String r0 = "passkey_client_login_ineligible"
            r2.A09(r1, r0, r4)
            X.9IG r0 = X.AnonymousClass9IG.ANDROID_API_VERIFICATION_INELIGIBLE
            goto L_0x00e7
        L_0x00ba:
            java.lang.String r0 = "PasskeyVerification/passkeyEvent/passkey_client_login_cancelled"
            com.whatsapp.util.Log.e(r0, r1)
            X.00H r0 = r7.A01
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            X.9qu r1 = X.C181569Qz.A00(r1)
            java.lang.String r0 = "passkey_client_login_cancelled"
            r2.A09(r1, r0, r4)
            X.9IG r0 = X.AnonymousClass9IG.ANDROID_API_VERIFICATION_CANCELLED
            goto L_0x00e7
        L_0x00d1:
            java.lang.String r0 = "PasskeyVerification/passkeyEvent/passkey_client_login_error"
            com.whatsapp.util.Log.e(r0, r1)
            X.00H r0 = r7.A01
            X.A8V r2 = X.AnonymousClass8BR.A0q(r0)
            X.9qu r1 = X.C181569Qz.A00(r1)
            java.lang.String r0 = "passkey_client_login_error"
            r2.A09(r1, r0, r4)
            X.9IG r0 = X.AnonymousClass9IG.ANDROID_API_VERIFICATION_FAILED
        L_0x00e7:
            r3.invoke(r0, r6)
            goto L_0x0065
        L_0x00ec:
            X.C30691eM.A01(r6)
            java.lang.String r0 = "PasskeyVerification/onPasskeyChallengeReceived/attempt to verify authResponse"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r1 = java.lang.System.currentTimeMillis()
            com.whatsapp.passkeys.PasskeyAndroidApiImpl r0 = r13.A00
            r5.L$0 = r13
            r5.L$1 = r3
            r5.J$0 = r1
            r5.label = r8
            java.lang.Object r6 = r0.A07(r14, r15, r5)
            if (r6 != r4) goto L_0x0109
            return r4
        L_0x0109:
            r7 = r13
            goto L_0x002e
        L_0x010c:
            X.AoT r5 = new X.AoT
            r5.<init>(r13, r4)
            goto L_0x0016
        L_0x0113:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkey.PasskeyVerifier.A00(android.app.Activity, java.lang.String, X.1dr, X.1OS):java.lang.Object");
    }

    public PasskeyVerifier(PasskeyAndroidApiImpl passkeyAndroidApiImpl, AnonymousClass00H r2) {
        C18070vi.A0j(passkeyAndroidApiImpl, r2);
        this.A00 = passkeyAndroidApiImpl;
        this.A01 = r2;
    }
}

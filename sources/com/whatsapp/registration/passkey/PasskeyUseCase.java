package com.whatsapp.registration.passkey;

import X.A8V;
import X.AnonymousClass11P;
import X.C18070vi;
import X.C191459md;
import X.C19830z4;
import X.C19880zA;
import X.C72473Md;
import X.C86374Rj;
import com.whatsapp.passkeys.PasskeyExistsCache;

public final class PasskeyUseCase extends C86374Rj {
    public final AnonymousClass11P A00;
    public final PasskeyExistsCache A01;
    public final C19880zA A02;
    public final C19830z4 A03;
    public final A8V A04;
    public final C191459md A05;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C188779hy r18, com.whatsapp.registration.passkey.PasskeyUseCase r19, X.C194669s6 r20, X.C30391dr r21) {
        /*
            r3 = r21
            r10 = r19
            boolean r0 = r3 instanceof X.C21688AoH
            if (r0 == 0) goto L_0x0037
            r9 = r3
            X.AoH r9 = (X.C21688AoH) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r9.label = r2
        L_0x0016:
            java.lang.Object r1 = r9.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 5
            r12 = 4
            r13 = 2
            r14 = 3
            r15 = 17
            r6 = 12
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003d
            if (r0 == r5) goto L_0x013b
            if (r0 == r13) goto L_0x013b
            if (r0 == r14) goto L_0x013b
            if (r0 == r12) goto L_0x015c
            if (r0 == r7) goto L_0x015c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0037:
            X.AoH r9 = new X.AoH
            r9.<init>(r10, r3)
            goto L_0x0016
        L_0x003d:
            X.C30691eM.A01(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyUseCase/onVerifyPasskeyResponse/status="
            r1.append(r0)
            r11 = r18
            java.lang.Integer r0 = r11.A07
            java.lang.String r0 = X.C181679Rk.A00(r0)
            X.C17890vO.A1A(r1, r0)
            r0 = r20
            java.lang.String r0 = r0.A01
            X.9pc r0 = X.C196759vb.A00(r0)
            byte[] r0 = r0.A00
            java.lang.String r0 = X.C108955ca.A13(r0)
            r17 = 0
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0088 }
            if (r1 == 0) goto L_0x0080
            int r0 = r1.length()     // Catch:{ JSONException -> 0x0088 }
            if (r0 == 0) goto L_0x0080
            X.9pc r1 = X.C196759vb.A00(r1)     // Catch:{ JSONException -> 0x0088 }
            X.9pb r0 = new X.9pb     // Catch:{ JSONException -> 0x0088 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0088 }
            goto L_0x008f
        L_0x0080:
            java.lang.String r0 = "PasskeyUtils/getCredentialIdFromPasskeyAuthChallenge/No credential id found in passkey solved challenge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r17
            goto L_0x008f
        L_0x0088:
            java.lang.String r0 = "PasskeyUtils/Error parsing JSON"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = r17
        L_0x008f:
            java.lang.Integer r1 = r11.A07
            r18 = r1
            int r3 = r18.intValue()
            java.lang.String r2 = "passkey_finish_login_success"
            java.lang.String r16 = "PasskeyUseCase/passkeyEvent/passkey_finish_login_success"
            java.lang.String r1 = "verify_passkey"
            if (r3 == r4) goto L_0x010d
            if (r3 == r6) goto L_0x00f9
            if (r3 == r15) goto L_0x0121
            java.lang.String r19 = "passkey_finish_login_error"
            if (r3 == r13) goto L_0x00de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyUseCase/passkeyEvent/passkey_finish_login_error/error="
            r1.append(r0)
            java.lang.String r0 = X.C181679Rk.A00(r18)
            X.C17890vO.A19(r1, r0)
            X.A8V r1 = r10.A04
            java.lang.Integer r0 = r11.A07
            java.lang.String r20 = X.C181679Rk.A00(r0)
            java.lang.String r18 = "verify_passkey_error_dialog"
            r21 = r17
            r16 = r1
            X.A8V.A05(r16, r17, r18, r19, r20, r21)
            X.0z4 r1 = r10.A03
            java.lang.Integer r0 = r11.A07
            java.lang.String r0 = X.C181679Rk.A00(r0)
            X.A9B.A0U(r1, r0)
            X.AdS r0 = X.C21036AdS.A00
            r9.label = r7
        L_0x00d7:
            java.lang.Object r0 = r10.A02(r0, r9)
            if (r0 != r8) goto L_0x015f
            return r8
        L_0x00de:
            java.lang.String r0 = "PasskeyUseCase/passkeyEvent/passkey_finish_login_error/wamsysFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.A8V r2 = r10.A04
            java.lang.Integer r0 = r11.A07
            java.lang.String r20 = X.C181679Rk.A00(r0)
            r18 = r1
            r21 = r17
            r16 = r2
            X.A8V.A05(r16, r17, r18, r19, r20, r21)
            X.AdT r0 = X.C21037AdT.A00
            r9.label = r12
            goto L_0x00d7
        L_0x00f9:
            com.whatsapp.util.Log.i((java.lang.String) r16)
            X.A8V r3 = r10.A04
            r3.A0G(r1, r2)
            X.AdP r1 = new X.AdP
            r1.<init>(r11)
            r9.L$0 = r10
            r9.L$1 = r0
            r9.label = r13
            goto L_0x0134
        L_0x010d:
            com.whatsapp.util.Log.i((java.lang.String) r16)
            X.A8V r3 = r10.A04
            r3.A0G(r1, r2)
            X.AdR r1 = new X.AdR
            r1.<init>(r11)
            r9.L$0 = r10
            r9.L$1 = r0
            r9.label = r5
            goto L_0x0134
        L_0x0121:
            com.whatsapp.util.Log.i((java.lang.String) r16)
            X.A8V r3 = r10.A04
            r3.A0G(r1, r2)
            X.AdQ r1 = new X.AdQ
            r1.<init>(r11)
            r9.L$0 = r10
            r9.L$1 = r0
            r9.label = r14
        L_0x0134:
            java.lang.Object r1 = r10.A02(r1, r9)
            if (r1 != r8) goto L_0x0146
            return r8
        L_0x013b:
            java.lang.Object r0 = r9.L$1
            X.9pb r0 = (X.C193139pb) r0
            java.lang.Object r10 = r9.L$0
            com.whatsapp.registration.passkey.PasskeyUseCase r10 = (com.whatsapp.registration.passkey.PasskeyUseCase) r10
            X.C30691eM.A01(r1)
        L_0x0146:
            com.whatsapp.passkeys.PasskeyExistsCache r4 = r10.A01
            X.11P r1 = r10.A00
            long r1 = r1.A05()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r2 = 0
            X.AWw r1 = new X.AWw
            r1.<init>(r0, r2, r3)
            r4.A01(r1)
            goto L_0x015f
        L_0x015c:
            X.C30691eM.A01(r1)
        L_0x015f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkey.PasskeyUseCase.A00(X.9hy, com.whatsapp.registration.passkey.PasskeyUseCase, X.9s6, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.registration.passkey.PasskeyUseCase r15, X.C194669s6 r16, X.C30391dr r17) {
        /*
            r5 = r17
            r4 = r15
            r3 = r16
            boolean r0 = r5 instanceof X.C21687AoG
            if (r0 == 0) goto L_0x0091
            r15 = r5
            X.AoG r15 = (X.C21687AoG) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r15.label = r2
        L_0x0017:
            java.lang.Object r7 = r15.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r1 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 == r6) goto L_0x0040
            if (r0 == r5) goto L_0x0076
            if (r0 != r1) goto L_0x0097
            X.C30691eM.A01(r7)
        L_0x002b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002e:
            X.C30691eM.A01(r7)
            X.AdU r0 = X.C21038AdU.A00
            r15.L$0 = r4
            r15.L$1 = r3
            r15.label = r6
            java.lang.Object r0 = r4.A02(r0, r15)
            if (r0 != r2) goto L_0x004b
            return r2
        L_0x0040:
            java.lang.Object r3 = r15.L$1
            X.9s6 r3 = (X.C194669s6) r3
            java.lang.Object r4 = r15.L$0
            com.whatsapp.registration.passkey.PasskeyUseCase r4 = (com.whatsapp.registration.passkey.PasskeyUseCase) r4
            X.C30691eM.A01(r7)
        L_0x004b:
            X.9md r6 = r4.A05
            java.lang.String r9 = r3.A01
            X.0z4 r0 = r4.A03
            java.lang.String r11 = X.C108955ca.A0t(r0)
            java.lang.String r12 = X.C108955ca.A0u(r0)
            X.99E r8 = r3.A00
            X.0zA r0 = r4.A02
            X.8aU r7 = X.A80.A00(r0)
            r15.L$0 = r4
            r15.L$1 = r3
            r15.label = r5
            java.lang.String r10 = "passkey"
            r13 = 0
            r16 = 0
            r17 = 5
            r14 = r13
            java.lang.Object r7 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r7 != r2) goto L_0x0081
            return r2
        L_0x0076:
            java.lang.Object r3 = r15.L$1
            X.9s6 r3 = (X.C194669s6) r3
            java.lang.Object r4 = r15.L$0
            com.whatsapp.registration.passkey.PasskeyUseCase r4 = (com.whatsapp.registration.passkey.PasskeyUseCase) r4
            X.C30691eM.A01(r7)
        L_0x0081:
            X.9hy r7 = (X.C188779hy) r7
            r0 = 0
            r15.L$0 = r0
            r15.L$1 = r0
            r15.label = r1
            java.lang.Object r0 = A00(r7, r4, r3, r15)
            if (r0 != r2) goto L_0x002b
            return r2
        L_0x0091:
            X.AoG r15 = new X.AoG
            r15.<init>(r4, r5)
            goto L_0x0017
        L_0x0097:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkey.PasskeyUseCase.A01(com.whatsapp.registration.passkey.PasskeyUseCase, X.9s6, X.1dr):java.lang.Object");
    }

    public PasskeyUseCase(C19880zA r1, AnonymousClass11P r2, C19830z4 r3, PasskeyExistsCache passkeyExistsCache, A8V a8v, C191459md r6) {
        C18070vi.A0o(a8v, passkeyExistsCache, r3);
        C72473Md.A1J(r1, r2);
        this.A04 = a8v;
        this.A01 = passkeyExistsCache;
        this.A03 = r3;
        this.A05 = r6;
        this.A02 = r1;
        this.A00 = r2;
    }
}

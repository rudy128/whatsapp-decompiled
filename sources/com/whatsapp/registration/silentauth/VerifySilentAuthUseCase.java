package com.whatsapp.registration.silentauth;

import X.A8V;
import X.AnonymousClass19D;
import X.C108965cb;
import X.C18070vi;
import X.C187509fv;
import X.C188139gw;
import X.C191459md;
import X.C192809p1;
import X.C19830z4;
import X.C19880zA;
import X.C86374Rj;

public final class VerifySilentAuthUseCase extends C86374Rj {
    public final C19830z4 A00;
    public final A8V A01;
    public final C187509fv A02;
    public final C19880zA A03;
    public final AnonymousClass19D A04;
    public final C192809p1 A05;
    public final C191459md A06;
    public final C188139gw A07;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.net.Network r14, X.C194109rB r15, com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r16, java.lang.String r17, X.C30391dr r18) {
        /*
            r5 = r18
            r1 = r16
            r2 = r15
            boolean r0 = r5 instanceof X.C21690AoJ
            if (r0 == 0) goto L_0x0031
            r15 = r5
            X.AoJ r15 = (X.C21690AoJ) r15
            int r4 = r15.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0031
            int r4 = r4 - r3
            r15.label = r4
        L_0x0017:
            java.lang.Object r5 = r15.result
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            int r8 = r15.label
            r7 = 4
            r4 = 3
            r6 = 1
            r3 = 2
            r13 = 0
            if (r8 == 0) goto L_0x0037
            if (r8 == r6) goto L_0x0055
            if (r8 == r3) goto L_0x00a4
            if (r8 == r4) goto L_0x0141
            if (r8 == r7) goto L_0x0141
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            X.AoJ r15 = new X.AoJ
            r15.<init>(r1, r5)
            goto L_0x0017
        L_0x0037:
            X.C30691eM.A01(r5)
            X.9gw r10 = r1.A07
            java.lang.String r12 = r2.A01
            r15.L$0 = r1
            r15.L$1 = r2
            r15.label = r6
            X.0wl r5 = r10.A06
            com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2 r8 = new com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$onVerifySilentAuthUsingCarrierApi$2
            r9 = r14
            r11 = r17
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r5 = X.C30451dy.A00(r15, r5, r8)
            if (r5 != r0) goto L_0x0060
            return r0
        L_0x0055:
            java.lang.Object r2 = r15.L$1
            X.9rB r2 = (X.C194109rB) r2
            java.lang.Object r1 = r15.L$0
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r1 = (com.whatsapp.registration.silentauth.VerifySilentAuthUseCase) r1
            X.C30691eM.A01(r5)
        L_0x0060:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0097
            X.9md r6 = r1.A06
            byte[] r5 = X.C108975cc.A1O(r5)
            java.lang.String r9 = android.util.Base64.encodeToString(r5, r3)
            X.C18070vi.A0X(r9)
            X.0z4 r5 = r1.A00
            java.lang.String r11 = X.C108955ca.A0t(r5)
            java.lang.String r12 = X.C108955ca.A0u(r5)
            X.99E r8 = r2.A00
            X.0zA r5 = r1.A03
            X.8aU r7 = X.A80.A00(r5)
            r15.L$0 = r1
            r15.L$1 = r2
            r15.label = r3
            java.lang.String r10 = "silent_auth"
            r16 = 0
            r14 = r13
            r17 = r3
            java.lang.Object r5 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r5 != r0) goto L_0x00af
            return r0
        L_0x0097:
            X.AdZ r2 = X.C21043AdZ.A00
            r15.L$0 = r13
            r15.L$1 = r13
            r15.label = r7
            java.lang.Object r1 = r1.A02(r2, r15)
            goto L_0x00f2
        L_0x00a4:
            java.lang.Object r2 = r15.L$1
            X.9rB r2 = (X.C194109rB) r2
            java.lang.Object r1 = r15.L$0
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r1 = (com.whatsapp.registration.silentauth.VerifySilentAuthUseCase) r1
            X.C30691eM.A01(r5)
        L_0x00af:
            X.9hy r5 = (X.C188779hy) r5
            r15.L$0 = r13
            r15.L$1 = r13
            r15.label = r4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r4 = "VerifySilentAuthUseCase/onVerifySilentAuthResponse/status="
            r6.append(r4)
            java.lang.Integer r4 = r5.A07
            java.lang.String r4 = X.C181679Rk.A00(r4)
            X.C17890vO.A1A(r6, r4)
            java.lang.Integer r4 = r5.A07
            int r9 = r4.intValue()
            java.lang.String r4 = "ipification_auth_success"
            java.lang.String r8 = "silent_auth_successful"
            r7 = 1
            r6 = 0
            if (r9 == r6) goto L_0x012c
            r6 = 12
            if (r9 == r6) goto L_0x0117
            r6 = 17
            if (r9 == r6) goto L_0x0102
            java.lang.String r4 = "silent_auth_verify_code_failed"
            if (r9 == r3) goto L_0x00f5
            X.0z4 r2 = r1.A00
            r2.A1g(r4)
            X.AdZ r2 = X.C21043AdZ.A00
        L_0x00ea:
            java.lang.Object r1 = r1.A02(r2, r15)
            if (r1 == r0) goto L_0x0146
            X.1Wu r1 = X.C27621Wu.A00
        L_0x00f2:
            if (r1 != r0) goto L_0x0144
            return r0
        L_0x00f5:
            java.lang.String r2 = "VerifySilentAuthUseCase/onVerifySilentAuthResponse/wamsysFailure"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.0z4 r2 = r1.A00
            r2.A1g(r4)
            X.Ada r2 = X.C21044Ada.A00
            goto L_0x00ea
        L_0x0102:
            X.0z4 r3 = r1.A00
            r3.A1g(r8)
            r3.A2E(r7)
            X.A8V r3 = r1.A01
            java.lang.String r2 = r2.A01
            r3.A0K(r2, r4, r13)
            X.AdX r2 = new X.AdX
            r2.<init>(r5)
            goto L_0x00ea
        L_0x0117:
            X.0z4 r3 = r1.A00
            r3.A1g(r8)
            r3.A2E(r7)
            X.A8V r3 = r1.A01
            java.lang.String r2 = r2.A01
            r3.A0K(r2, r4, r13)
            X.AdW r2 = new X.AdW
            r2.<init>(r5)
            goto L_0x00ea
        L_0x012c:
            X.0z4 r3 = r1.A00
            r3.A1g(r8)
            r3.A2E(r7)
            X.A8V r3 = r1.A01
            java.lang.String r2 = r2.A01
            r3.A0K(r2, r4, r13)
            X.AdY r2 = new X.AdY
            r2.<init>(r5)
            goto L_0x00ea
        L_0x0141:
            X.C30691eM.A01(r5)
        L_0x0144:
            X.1Wu r0 = X.C27621Wu.A00
        L_0x0146:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.silentauth.VerifySilentAuthUseCase.A00(android.net.Network, X.9rB, com.whatsapp.registration.silentauth.VerifySilentAuthUseCase, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(android.net.Network r18, X.C194109rB r19, com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r20, X.C30391dr r21) {
        /*
            r6 = r21
            r3 = r20
            r4 = r19
            boolean r0 = r6 instanceof X.C21689AoI
            if (r0 == 0) goto L_0x0032
            r2 = r6
            X.AoI r2 = (X.C21689AoI) r2
            int r5 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x0032
            int r5 = r5 - r1
            r2.label = r5
        L_0x0018:
            java.lang.Object r8 = r2.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r6 = r2.label
            r10 = 4
            r5 = 3
            r7 = 2
            r0 = 1
            r12 = 0
            if (r6 == 0) goto L_0x0038
            if (r6 == r0) goto L_0x0055
            if (r6 == r7) goto L_0x00a7
            if (r6 == r5) goto L_0x0129
            if (r6 == r10) goto L_0x0129
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0032:
            X.AoI r2 = new X.AoI
            r2.<init>(r3, r6)
            goto L_0x0018
        L_0x0038:
            X.C30691eM.A01(r8)
            X.9gw r9 = r3.A07
            java.lang.String r8 = r4.A01
            r2.L$0 = r3
            r2.L$1 = r4
            r2.label = r0
            X.0wl r6 = r9.A06
            com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2 r0 = new com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2
            r11 = r18
            r0.<init>(r11, r9, r8, r12)
            java.lang.Object r8 = X.C30451dy.A00(r2, r6, r0)
            if (r8 != r1) goto L_0x0060
            return r1
        L_0x0055:
            java.lang.Object r4 = r2.L$1
            X.9rB r4 = (X.C194109rB) r4
            java.lang.Object r3 = r2.L$0
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r3 = (com.whatsapp.registration.silentauth.VerifySilentAuthUseCase) r3
            X.C30691eM.A01(r8)
        L_0x0060:
            boolean r0 = X.AnonymousClass000.A1Y(r8)
            if (r0 == 0) goto L_0x009a
            X.9p1 r9 = r3.A05
            X.0z4 r6 = r3.A00
            java.lang.String r13 = X.C108955ca.A0t(r6)
            java.lang.String r14 = X.C108955ca.A0u(r6)
            X.19D r0 = r3.A04
            X.99F r10 = X.A9B.A0B(r6, r0)
            int r19 = r6.A0A()
            int r20 = r6.A0B()
            int r21 = r6.A09()
            r2.L$0 = r3
            r2.L$1 = r4
            r2.label = r7
            r18 = 0
            java.lang.String r11 = "silent_auth"
            r16 = r12
            r15 = r12
            r17 = r2
            java.lang.Object r8 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r8 != r1) goto L_0x00b2
            return r1
        L_0x009a:
            X.AdZ r0 = X.C21043AdZ.A00
            r2.L$0 = r12
            r2.L$1 = r12
            r2.label = r10
            java.lang.Object r0 = r3.A02(r0, r2)
            goto L_0x00f4
        L_0x00a7:
            java.lang.Object r4 = r2.L$1
            X.9rB r4 = (X.C194109rB) r4
            java.lang.Object r3 = r2.L$0
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r3 = (com.whatsapp.registration.silentauth.VerifySilentAuthUseCase) r3
            X.C30691eM.A01(r8)
        L_0x00b2:
            X.ADN r8 = (X.ADN) r8
            r2.L$0 = r12
            r2.L$1 = r12
            r2.label = r5
            java.lang.Integer r6 = r8.A09
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifySilentAuthUseCase/onRequestSilentAuthCodeResponse/status="
            r5.append(r0)
            java.lang.String r0 = X.C181669Rj.A00(r6)
            X.C17890vO.A1A(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r6 != r0) goto L_0x010a
            X.A8V r6 = r3.A01
            java.lang.String r5 = r4.A01
            java.lang.String r0 = "ipification_auth_initiated"
            r6.A0K(r5, r0, r12)
            java.lang.String r5 = r8.A0P
            if (r5 == 0) goto L_0x00f7
            int r0 = r5.length()
            if (r0 == 0) goto L_0x00f7
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$onSilentAuthCodeSent$2 r0 = new com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$onSilentAuthCodeSent$2
            r0.<init>(r4, r3, r5, r12)
            java.lang.Object r0 = X.AnonymousClass1OW.A00(r2, r0)
        L_0x00ec:
            if (r0 == r1) goto L_0x012e
            X.1Wu r0 = X.C27621Wu.A00
        L_0x00f0:
            if (r0 == r1) goto L_0x012e
            X.1Wu r0 = X.C27621Wu.A00
        L_0x00f4:
            if (r0 != r1) goto L_0x012c
            return r1
        L_0x00f7:
            java.lang.String r0 = "VerifySilentAuthUseCase/onSilentAuthCodeSent/uri is null or empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r4 = r3.A00
            java.lang.String r0 = "silent_auth_request_code_failed"
            r4.A1g(r0)
            X.AdZ r0 = X.C21043AdZ.A00
            java.lang.Object r0 = r3.A02(r0, r2)
            goto L_0x00ec
        L_0x010a:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            java.lang.String r4 = "silent_auth_request_code_failed"
            if (r6 != r0) goto L_0x0121
            java.lang.String r0 = "VerifySilentAuthUseCase/onRequestSilentAuthCodeResponse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0z4 r0 = r3.A00
            r0.A1g(r4)
            X.Ada r0 = X.C21044Ada.A00
        L_0x011c:
            java.lang.Object r0 = r3.A02(r0, r2)
            goto L_0x00f0
        L_0x0121:
            X.0z4 r0 = r3.A00
            r0.A1g(r4)
            X.AdZ r0 = X.C21043AdZ.A00
            goto L_0x011c
        L_0x0129:
            X.C30691eM.A01(r8)
        L_0x012c:
            X.1Wu r1 = X.C27621Wu.A00
        L_0x012e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.silentauth.VerifySilentAuthUseCase.A01(android.net.Network, X.9rB, com.whatsapp.registration.silentauth.VerifySilentAuthUseCase, X.1dr):java.lang.Object");
    }

    public VerifySilentAuthUseCase(C19880zA r2, C19830z4 r3, AnonymousClass19D r4, A8V a8v, C187509fv r6, C192809p1 r7, C191459md r8, C188139gw r9) {
        C18070vi.A0j(a8v, r3);
        C108965cb.A1P(r4, 6, r2);
        this.A01 = a8v;
        this.A00 = r3;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r4;
        this.A02 = r6;
        this.A03 = r2;
    }
}

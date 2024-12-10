package com.whatsapp.passkeys;

import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass1PY;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18600wl;
import X.C191519mj;
import X.C192679on;
import X.C19830z4;
import X.C22821Di;
import X.C30391dr;
import X.C30451dy;

public final class PasskeyFacade {
    public final AnonymousClass11P A00;
    public final AnonymousClass1PY A01;
    public final C192679on A02;
    public final PasskeyExistsCache A03;
    public final C191519mj A04;
    public final PasskeyServerApiImpl A05;
    public final AnonymousClass118 A06;
    public final C19830z4 A07;
    public final C18030ve A08;
    public final PasskeyAndroidApiImpl A09;
    public final C18600wl A0A;

    private final Object A00(C30391dr r4, C22821Di r5) {
        if (C18020vd.A05(C18040vf.A02, this.A08, 8877)) {
            return C30451dy.A00(r4, this.A0A, new PasskeyFacade$maybeDoInBackground$2((C30391dr) null, r5));
        }
        return r5.invoke(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f7, code lost:
        if (r9 == r6) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.app.Activity r12, X.C193169pe r13, X.C30391dr r14, X.C18090vk r15) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C21703AoW
            if (r0 == 0) goto L_0x0146
            r5 = r14
            X.AoW r5 = (X.C21703AoW) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0146
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r9 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 3
            r8 = 2
            r7 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x00a4
            if (r0 == r7) goto L_0x0090
            if (r0 == r8) goto L_0x00fa
            if (r0 != r4) goto L_0x014d
            java.lang.Object r2 = r5.L$2
            X.9pb r2 = (X.C193139pb) r2
            java.lang.Object r7 = r5.L$1
            X.9qt r7 = (X.C193929qt) r7
            java.lang.Object r1 = r5.L$0
            com.whatsapp.passkeys.PasskeyFacade r1 = (com.whatsapp.passkeys.PasskeyFacade) r1
            X.C30691eM.A01(r9)
        L_0x0034:
            X.9MT r9 = (X.AnonymousClass9MT) r9
            boolean r0 = r9 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r5 = r1.A08
            r4 = 11133(0x2b7d, float:1.56E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x005c
            X.0z4 r4 = r1.A07
            X.118 r0 = r1.A06
            java.lang.String r5 = X.AnonymousClass9R1.A00(r0)
            android.content.SharedPreferences$Editor r4 = X.C19830z4.A00(r4)
            java.lang.String r0 = "reg_passkey_created_hashed_account_list"
            X.C17880vN.A1E(r4, r0, r5)
        L_0x005c:
            X.9mj r5 = r1.A04
            X.0z4 r0 = r1.A07
            android.content.SharedPreferences r4 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "reg_passkey_created_hashed_account_list"
            java.lang.String r4 = r4.getString(r0, r3)
            r0 = 10
            r5.A00(r4, r3, r0)
            com.whatsapp.passkeys.PasskeyExistsCache r4 = r1.A03
            X.11P r0 = r1.A00
            long r0 = r0.A05()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.AWw r0 = new X.AWw
            r0.<init>(r2, r1, r3)
            r4.A01(r0)
            X.B5O r0 = r7.A00
            X.9qv r1 = new X.9qv
            r1.<init>(r2, r0)
            X.8yZ r0 = new X.8yZ
            r0.<init>(r1)
            return r0
        L_0x0090:
            java.lang.Object r15 = r5.L$3
            X.0vk r15 = (X.C18090vk) r15
            java.lang.Object r13 = r5.L$2
            X.9pe r13 = (X.C193169pe) r13
            java.lang.Object r12 = r5.L$1
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.Object r1 = r5.L$0
            com.whatsapp.passkeys.PasskeyFacade r1 = (com.whatsapp.passkeys.PasskeyFacade) r1
            X.C30691eM.A01(r9)
            goto L_0x00c8
        L_0x00a4:
            X.C30691eM.A01(r9)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9mj r1 = r11.A04
            r0 = 4
            r1.A00(r3, r3, r0)
            com.whatsapp.passkeys.PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1 r0 = new com.whatsapp.passkeys.PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1
            r0.<init>(r11, r3)
            r5.L$0 = r11
            r5.L$1 = r12
            r5.L$2 = r13
            r5.L$3 = r15
            r5.label = r7
            java.lang.Object r9 = r11.A00(r5, r0)
            if (r9 == r6) goto L_0x00f9
            r1 = r11
        L_0x00c8:
            X.9MT r9 = (X.AnonymousClass9MT) r9
            r15.invoke()
            boolean r0 = r9 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x01b7
            X.8yZ r9 = (X.C175348yZ) r9
            java.lang.Object r10 = r9.A00
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9mj r9 = r1.A04
            r0 = 5
            r9.A00(r3, r3, r0)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.passkeys.PasskeyAndroidApiImpl r0 = r1.A09
            r5.L$0 = r1
            r5.L$1 = r3
            r5.L$2 = r3
            r5.L$3 = r3
            r5.label = r8
            java.lang.Object r9 = r0.A06(r12, r13, r10, r5)
            if (r9 != r6) goto L_0x0101
        L_0x00f9:
            return r6
        L_0x00fa:
            java.lang.Object r1 = r5.L$0
            com.whatsapp.passkeys.PasskeyFacade r1 = (com.whatsapp.passkeys.PasskeyFacade) r1
            X.C30691eM.A01(r9)
        L_0x0101:
            X.9MT r9 = (X.AnonymousClass9MT) r9
            boolean r0 = r9 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0152
            X.8yZ r9 = (X.C175348yZ) r9
            java.lang.Object r7 = r9.A00
            X.9qt r7 = (X.C193929qt) r7
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9mj r2 = r1.A04
            r0 = 7
            r2.A00(r3, r3, r0)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r7.A01
            org.json.JSONObject r2 = X.C17880vN.A16(r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C18070vi.A0J(r0, r2)
            X.9pc r0 = X.C196759vb.A00(r0)
            X.9pb r2 = new X.9pb
            r2.<init>(r0)
            com.whatsapp.passkeys.PasskeyFacade$passkeyCreate$2 r0 = new com.whatsapp.passkeys.PasskeyFacade$passkeyCreate$2
            r0.<init>(r7, r1, r3)
            r5.L$0 = r1
            r5.L$1 = r7
            r5.L$2 = r2
            r5.label = r4
            java.lang.Object r9 = r1.A00(r5, r0)
            if (r9 != r6) goto L_0x0034
            return r6
        L_0x0146:
            X.AoW r5 = new X.AoW
            r5.<init>(r11, r14)
            goto L_0x0012
        L_0x014d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0152:
            boolean r0 = r9 instanceof X.C175338yY
            if (r0 == 0) goto L_0x01b2
            X.8yY r9 = (X.C175338yY) r9
            java.lang.Object r4 = r9.A00
            X.A1k r4 = (X.C19975A1k) r4
            java.lang.Integer r0 = r4.A00
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x01a0
            if (r0 == r7) goto L_0x018e
            if (r0 == r8) goto L_0x017c
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client error"
            java.lang.Throwable r3 = r4.A02
            com.whatsapp.util.Log.e(r0, r3)
            X.9mj r2 = r1.A04
            r1 = 0
            r0 = 9
            r2.A00(r1, r3, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
        L_0x0179:
            java.lang.Integer r0 = r4.A01
            goto L_0x01e9
        L_0x017c:
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client error before user interaction"
            java.lang.Throwable r3 = r4.A02
            com.whatsapp.util.Log.e(r0, r3)
            X.9mj r2 = r1.A04
            r1 = 0
            r0 = 9
            r2.A00(r1, r3, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            goto L_0x0179
        L_0x018e:
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client canceled"
            java.lang.Throwable r3 = r4.A02
            com.whatsapp.util.Log.i(r0, r3)
            X.9mj r2 = r1.A04
            r1 = 0
            r0 = 8
            r2.A00(r1, r3, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            goto L_0x0179
        L_0x01a0:
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client ineligible"
            java.lang.Throwable r3 = r4.A02
            com.whatsapp.util.Log.i(r0, r3)
            X.9mj r2 = r1.A04
            r1 = 0
            r0 = 19
            r2.A00(r1, r3, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y
            goto L_0x0179
        L_0x01b2:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x01b7:
            boolean r0 = r9 instanceof X.C175338yY
            if (r0 == 0) goto L_0x01f9
            X.8yY r9 = (X.C175338yY) r9
            java.lang.Object r2 = r9.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister error"
            com.whatsapp.util.Log.i(r0, r2)
            X.9mj r1 = r1.A04
            r0 = 6
            r1.A00(r3, r2, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            goto L_0x01e7
        L_0x01cf:
            boolean r0 = r9 instanceof X.C175338yY
            if (r0 == 0) goto L_0x01f4
            X.8yY r9 = (X.C175338yY) r9
            java.lang.Object r2 = r9.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.9mj r1 = r1.A04
            r0 = 11
            r1.A00(r3, r2, r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
        L_0x01e7:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x01e9:
            X.A1b r1 = new X.A1b
            r1.<init>(r2, r0)
            X.8yY r0 = new X.8yY
            r0.<init>(r1)
            return r0
        L_0x01f4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x01f9:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyFacade.A01(android.app.Activity, X.9pe, X.1dr, X.0vk):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21658Ann
            if (r0 == 0) goto L_0x00a2
            r7 = r9
            X.Ann r7 = (X.C21658Ann) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a2
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r5) goto L_0x00cf
            if (r0 != r4) goto L_0x00ca
            java.lang.Object r2 = r7.L$0
            com.whatsapp.passkeys.PasskeyFacade r2 = (com.whatsapp.passkeys.PasskeyFacade) r2
            X.C30691eM.A01(r1)
        L_0x0027:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00ac
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r1 = r1.A00
            X.B5N r1 = (X.B5N) r1
            com.whatsapp.passkeys.PasskeyExistsCache r0 = r2.A03
            r0.A01(r1)
            boolean r0 = r1 instanceof X.C20741AWw
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "PasskeyFacade/checkPasskeyExists/server passkeyExists already_exists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9mj r1 = r2.A04
            r0 = 0
            r1.A00(r0, r0, r4)
            X.9I1 r1 = X.AnonymousClass9I1.ALREADY_HAS_PASSKEY
        L_0x0049:
            return r1
        L_0x004a:
            X.C30691eM.A01(r1)
            X.9mj r0 = r8.A04
            r3 = 0
            r0.A00(r3, r3, r5)
            X.0ve r2 = r8.A08
            r1 = 10139(0x279b, float:1.4208E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0091
            r7.L$0 = r8
            r7.label = r5
            X.1g7 r5 = X.C72473Md.A0m(r7)
            X.AWz r4 = new X.AWz
            r4.<init>(r8, r5)
            X.1PY r3 = r8.A01
            java.lang.String r0 = "PasskeyExistCheckMex/getPasskeyExistCheck"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryImpl$Builder
            r0.<init>()
            X.A7K r2 = r0.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryResponseImpl> r1 = com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryResponseImpl.class
            java.lang.String r0 = "PasskeyExistResponseQuery"
            X.A2g r1 = X.AIj.A01(r2, r3, r1, r0)
            X.8tu r0 = new X.8tu
            r0.<init>(r4)
            r1.A03(r0)
            java.lang.Object r1 = r5.A0C()
            if (r1 != r6) goto L_0x0049
        L_0x0090:
            return r6
        L_0x0091:
            com.whatsapp.passkeys.PasskeyFacade$checkPasskeyExists$existsResponse$1 r0 = new com.whatsapp.passkeys.PasskeyFacade$checkPasskeyExists$existsResponse$1
            r0.<init>(r8, r3)
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = r8.A00(r7, r0)
            if (r1 == r6) goto L_0x0090
            r2 = r8
            goto L_0x0027
        L_0x00a2:
            X.Ann r7 = new X.Ann
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x00a9:
            X.9I1 r1 = X.AnonymousClass9I1.DOES_NOT_HAVE_PASSKEY
            return r1
        L_0x00ac:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00c5
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r3 = r1.A00
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r0 = "PasskeyFacade/checkPasskeyExists/server passkeyExists error"
            com.whatsapp.util.Log.e(r0, r3)
            X.9mj r2 = r2.A04
            r1 = 0
            r0 = 3
            r2.A00(r1, r3, r0)
            X.9I1 r1 = X.AnonymousClass9I1.EXISTS_CHECK_ERROR
            return r1
        L_0x00c5:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00cf:
            X.C30691eM.A01(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyFacade.A02(X.1dr):java.lang.Object");
    }

    public PasskeyFacade(AnonymousClass11P r1, AnonymousClass118 r2, C19830z4 r3, C18030ve r4, AnonymousClass1PY r5, PasskeyAndroidApiImpl passkeyAndroidApiImpl, C192679on r7, PasskeyExistsCache passkeyExistsCache, C191519mj r9, PasskeyServerApiImpl passkeyServerApiImpl, C18600wl r11) {
        C18070vi.A0w(r4, r5, passkeyServerApiImpl, passkeyAndroidApiImpl, r7);
        C18070vi.A0x(passkeyExistsCache, r3, r2, r11, r1);
        this.A08 = r4;
        this.A01 = r5;
        this.A05 = passkeyServerApiImpl;
        this.A09 = passkeyAndroidApiImpl;
        this.A02 = r7;
        this.A03 = passkeyExistsCache;
        this.A07 = r3;
        this.A06 = r2;
        this.A0A = r11;
        this.A00 = r1;
        this.A04 = r9;
    }
}

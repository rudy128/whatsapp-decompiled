package com.whatsapp.registration.silentauth;

import X.AnonymousClass1OS;
import X.C194109rB;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1", f = "SilentAuthUseCase.kt", i = {0}, l = {65, 68}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class VerifySilentAuthUseCase$requestSilentAuth$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C194109rB $params;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ VerifySilentAuthUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifySilentAuthUseCase$requestSilentAuth$1(C194109rB r2, VerifySilentAuthUseCase verifySilentAuthUseCase, C30391dr r4) {
        super(2, r4);
        this.this$0 = verifySilentAuthUseCase;
        this.$params = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        VerifySilentAuthUseCase$requestSilentAuth$1 verifySilentAuthUseCase$requestSilentAuth$1 = new VerifySilentAuthUseCase$requestSilentAuth$1(this.$params, this.this$0, r5);
        verifySilentAuthUseCase$requestSilentAuth$1.L$0 = obj;
        return verifySilentAuthUseCase$requestSilentAuth$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0031
            if (r0 != r7) goto L_0x006c
            X.C30691eM.A01(r10)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r10)
            java.lang.Object r8 = r9.L$0
            X.1OX r8 = (X.AnonymousClass1OX) r8
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r0 = r9.this$0
            X.0z4 r1 = r0.A00
            java.lang.String r0 = "silent_auth_entered"
            r1.A1g(r0)
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r1 = r9.this$0
            X.Adb r0 = X.C21045Adb.A00
            r9.L$0 = r8
            r9.label = r2
            java.lang.Object r0 = r1.A02(r0, r9)
            if (r0 != r6) goto L_0x0038
            return r6
        L_0x0031:
            java.lang.Object r8 = r9.L$0
            X.1OX r8 = (X.AnonymousClass1OX) r8
            X.C30691eM.A01(r10)
        L_0x0038:
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r0 = r9.this$0
            X.A8V r2 = r0.A01
            X.9rB r0 = r9.$params
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "ipification_coverage_initiated"
            r5 = 0
            r2.A0K(r1, r0, r5)
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r1 = r9.this$0
            X.9fv r4 = r1.A02
            X.9rB r0 = r9.$params
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1$1 r3 = new com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1$1
            r3.<init>(r0, r1, r5, r8)
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r1 = r9.this$0
            X.9rB r0 = r9.$params
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1$2 r2 = new com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1$2
            r2.<init>(r0, r1, r5)
            r9.L$0 = r5
            r9.label = r7
            X.0wl r1 = r4.A04
            com.whatsapp.registration.silentauth.SilentAuthConnectivityHelper$checkCellularConnectivity$2 r0 = new com.whatsapp.registration.silentauth.SilentAuthConnectivityHelper$checkCellularConnectivity$2
            r0.<init>(r4, r5, r2, r3)
            java.lang.Object r0 = X.C30451dy.A00(r9, r1, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VerifySilentAuthUseCase$requestSilentAuth$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

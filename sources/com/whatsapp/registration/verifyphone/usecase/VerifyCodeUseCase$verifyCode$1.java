package com.whatsapp.registration.verifyphone.usecase;

import X.AnonymousClass1OS;
import X.AnonymousClass99E;
import X.AnonymousClass99I;
import X.C165038aU;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.verifyphone.usecase.VerifyCodeUseCase$verifyCode$1", f = "VerifyCodeUseCase.kt", i = {}, l = {43, 45, 56}, m = "invokeSuspend", n = {}, s = {})
public final class VerifyCodeUseCase$verifyCode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $authChallenge;
    public final /* synthetic */ String $authCodeContext;
    public final /* synthetic */ AnonymousClass99E $clientMetrics;
    public final /* synthetic */ String $code;
    public final /* synthetic */ int $codeEntryMethod;
    public final /* synthetic */ int $codeVerificationMode;
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ String $method;
    public final /* synthetic */ String $phoneNumber;
    public final /* synthetic */ C165038aU $verifiedNameCertificate;
    public int label;
    public final /* synthetic */ AnonymousClass99I this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifyCodeUseCase$verifyCode$1(C165038aU r2, AnonymousClass99E r3, AnonymousClass99I r4, String str, String str2, String str3, String str4, String str5, String str6, C30391dr r11, int i, int i2) {
        super(2, r11);
        this.this$0 = r4;
        this.$code = str;
        this.$codeVerificationMode = i;
        this.$method = str2;
        this.$codeEntryMethod = i2;
        this.$countryCode = str3;
        this.$phoneNumber = str4;
        this.$authCodeContext = str5;
        this.$authChallenge = str6;
        this.$clientMetrics = r3;
        this.$verifiedNameCertificate = r2;
    }

    public final C30391dr create(Object obj, C30391dr r15) {
        AnonymousClass99I r3 = this.this$0;
        String str = this.$code;
        int i = this.$codeVerificationMode;
        String str2 = this.$method;
        int i2 = this.$codeEntryMethod;
        String str3 = this.$countryCode;
        String str4 = this.$phoneNumber;
        String str5 = this.$authCodeContext;
        String str6 = this.$authChallenge;
        return new VerifyCodeUseCase$verifyCode$1(this.$verifiedNameCertificate, this.$clientMetrics, r3, str, str2, str3, str4, str5, str6, r15, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r17
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            r13 = r16
            int r0 = r13.label
            r3 = 3
            r1 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0019
            if (r0 == r5) goto L_0x0029
            if (r0 == r1) goto L_0x004d
            if (r0 != r3) goto L_0x0064
            X.C30691eM.A01(r6)
        L_0x0016:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x0019:
            X.C30691eM.A01(r6)
            X.99I r4 = r13.this$0
            X.99c r0 = X.C1775399c.A00
            r13.label = r5
            java.lang.Object r0 = r4.A02(r0, r13)
            if (r0 != r2) goto L_0x002c
            return r2
        L_0x0029:
            X.C30691eM.A01(r6)
        L_0x002c:
            X.99I r0 = r13.this$0
            X.9md r4 = r0.A00
            java.lang.String r7 = r13.$code
            int r14 = r13.$codeVerificationMode
            java.lang.String r8 = r13.$method
            int r15 = r13.$codeEntryMethod
            java.lang.String r9 = r13.$countryCode
            java.lang.String r10 = r13.$phoneNumber
            java.lang.String r11 = r13.$authCodeContext
            java.lang.String r12 = r13.$authChallenge
            X.99E r6 = r13.$clientMetrics
            X.8aU r5 = r13.$verifiedNameCertificate
            r13.label = r1
            java.lang.Object r6 = r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r6 != r2) goto L_0x0050
            return r2
        L_0x004d:
            X.C30691eM.A01(r6)
        L_0x0050:
            X.9hy r6 = (X.C188779hy) r6
            X.99I r4 = r13.this$0
            java.lang.String r1 = r13.$method
            X.99b r0 = new X.99b
            r0.<init>(r6, r1)
            r13.label = r3
            java.lang.Object r0 = r4.A02(r0, r13)
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.usecase.VerifyCodeUseCase$verifyCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VerifyCodeUseCase$verifyCode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.registration.email;

import X.AnonymousClass1OS;
import X.AnonymousClass99K;
import X.C194659s5;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.email.EmailOtpUseCase$verifyEmailOtp$1", f = "EmailOtpUseCase.kt", i = {}, l = {91, 94, 109, 111}, m = "invokeSuspend", n = {}, s = {})
public final class EmailOtpUseCase$verifyEmailOtp$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C194659s5 $params;
    public int label;
    public final /* synthetic */ AnonymousClass99K this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmailOtpUseCase$verifyEmailOtp$1(AnonymousClass99K r2, C194659s5 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$params = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EmailOtpUseCase$verifyEmailOtp$1(this.this$0, this.$params, r5);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.99E, X.9zb] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r8 = r22
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r5 = r21
            int r0 = r5.label
            r3 = 4
            r2 = 3
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r7) goto L_0x002b
            if (r0 == r6) goto L_0x007a
            if (r0 == r2) goto L_0x00a3
            if (r0 == r3) goto L_0x00a3
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001b:
            X.C30691eM.A01(r8)
            X.99K r1 = r5.this$0
            X.AdO r0 = X.C21032AdO.A00
            r5.label = r7
            java.lang.Object r0 = r1.A02(r0, r5)
            if (r0 != r4) goto L_0x002e
            return r4
        L_0x002b:
            X.C30691eM.A01(r8)
        L_0x002e:
            X.99K r7 = r5.this$0
            X.9md r9 = r7.A04
            X.9s5 r0 = r5.$params
            java.lang.String r12 = r0.A01
            java.lang.String r13 = r0.A02
            int r1 = r0.A00
            X.0z4 r0 = r7.A01
            java.lang.String r14 = X.C108955ca.A0t(r0)
            X.99K r0 = r5.this$0
            X.0z4 r0 = r0.A01
            java.lang.String r15 = X.C108955ca.A0u(r0)
            X.99K r0 = r5.this$0
            X.0z4 r0 = r0.A01
            int r8 = r0.A0J()
            X.99K r0 = r5.this$0
            X.19D r7 = r0.A02
            X.0z4 r0 = r0.A01
            java.lang.String r0 = X.A9B.A0F(r0, r7)
            X.99E r11 = new X.99E
            r11.<init>(r8, r0)
            X.99K r0 = r5.this$0
            X.0zA r0 = r0.A00
            X.8aU r10 = X.A80.A00(r0)
            r5.label = r6
            r19 = 0
            r16 = 0
            r17 = r16
            r18 = r5
            r20 = r1
            java.lang.Object r8 = r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r8 != r4) goto L_0x007d
            return r4
        L_0x007a:
            X.C30691eM.A01(r8)
        L_0x007d:
            X.9hy r8 = (X.C188779hy) r8
            X.9s5 r0 = r5.$params
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "email_otp"
            boolean r0 = X.C18070vi.A18(r1, r0)
            X.99K r1 = r5.this$0
            if (r0 == 0) goto L_0x009b
            X.AdK r0 = new X.AdK
            r0.<init>(r8)
            r5.label = r2
        L_0x0094:
            java.lang.Object r0 = r1.A02(r0, r5)
            if (r0 != r4) goto L_0x00a6
            return r4
        L_0x009b:
            X.AdL r0 = new X.AdL
            r0.<init>(r8)
            r5.label = r3
            goto L_0x0094
        L_0x00a3:
            X.C30691eM.A01(r8)
        L_0x00a6:
            X.1Wu r4 = X.C27621Wu.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.email.EmailOtpUseCase$verifyEmailOtp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmailOtpUseCase$verifyEmailOtp$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

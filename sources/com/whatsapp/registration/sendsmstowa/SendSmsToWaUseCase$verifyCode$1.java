package com.whatsapp.registration.sendsmstowa;

import X.AnonymousClass1OS;
import X.C120626Eo;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.sendsmstowa.SendSmsToWaUseCase$verifyCode$1", f = "SendSmsToWaUseCase.kt", i = {}, l = {86, 89, 107, 110, 111}, m = "invokeSuspend", n = {}, s = {})
public final class SendSmsToWaUseCase$verifyCode$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C120626Eo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendSmsToWaUseCase$verifyCode$1(C120626Eo r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SendSmsToWaUseCase$verifyCode$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SendSmsToWaUseCase$verifyCode$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.99E, X.9zb] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r10 = r25
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            r6 = r24
            int r8 = r6.label
            r4 = 5
            r3 = 4
            r2 = 3
            r7 = 12
            r9 = 2
            r1 = 0
            r0 = 1
            if (r8 == 0) goto L_0x0021
            if (r8 == r0) goto L_0x0031
            if (r8 == r9) goto L_0x007c
            if (r8 == r2) goto L_0x00af
            if (r8 == r3) goto L_0x00af
            if (r8 == r4) goto L_0x00af
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0021:
            X.C30691eM.A01(r10)
            X.6Eo r10 = r6.this$0
            X.7Lo r8 = X.C145517Lo.A00
            r6.label = r0
            java.lang.Object r8 = r10.A02(r8, r6)
            if (r8 != r5) goto L_0x0034
            return r5
        L_0x0031:
            X.C30691eM.A01(r10)
        L_0x0034:
            X.6Eo r8 = r6.this$0
            X.9md r12 = r8.A04
            X.0z4 r8 = r8.A01
            java.lang.String r17 = X.C108955ca.A0t(r8)
            X.6Eo r8 = r6.this$0
            X.0z4 r8 = r8.A01
            java.lang.String r18 = X.C108955ca.A0u(r8)
            X.6Eo r8 = r6.this$0
            X.0z4 r8 = r8.A01
            int r10 = r8.A0J()
            X.6Eo r8 = r6.this$0
            X.19D r11 = r8.A02
            X.0z4 r8 = r8.A01
            java.lang.String r8 = X.A9B.A0F(r8, r11)
            X.99E r14 = new X.99E
            r14.<init>(r10, r8)
            X.6Eo r8 = r6.this$0
            X.0zA r8 = r8.A00
            X.8aU r13 = X.A80.A00(r8)
            r6.label = r9
            java.lang.String r15 = ""
            java.lang.String r16 = "send_sms"
            r19 = 0
            r23 = r1
            r20 = r19
            r21 = r6
            r22 = r1
            java.lang.Object r10 = r12.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r10 != r5) goto L_0x007f
            return r5
        L_0x007c:
            X.C30691eM.A01(r10)
        L_0x007f:
            X.9hy r10 = (X.C188779hy) r10
            java.lang.Integer r8 = r10.A07
            int r8 = r8.intValue()
            if (r8 == r0) goto L_0x00a5
            if (r8 == r1) goto L_0x00a5
            X.6Eo r1 = r6.this$0
            if (r8 == r7) goto L_0x009d
            X.7Lm r0 = new X.7Lm
            r0.<init>(r10)
            r6.label = r4
        L_0x0096:
            java.lang.Object r0 = r1.A02(r0, r6)
            if (r0 != r5) goto L_0x00b2
            return r5
        L_0x009d:
            X.7Lj r0 = new X.7Lj
            r0.<init>(r10)
            r6.label = r3
            goto L_0x0096
        L_0x00a5:
            X.6Eo r1 = r6.this$0
            X.7Ll r0 = new X.7Ll
            r0.<init>(r10)
            r6.label = r2
            goto L_0x0096
        L_0x00af:
            X.C30691eM.A01(r10)
        L_0x00b2:
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.sendsmstowa.SendSmsToWaUseCase$verifyCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

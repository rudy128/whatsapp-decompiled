package com.whatsapp.registration.deviceswitching;

import X.AnonymousClass1OS;
import X.AnonymousClass99J;
import X.C193229pk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.deviceswitching.DeviceSwitchingUseCase$verifyDeviceSwitching$1", f = "DeviceSwitchingUseCase.kt", i = {}, l = {89, 92, 106}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceSwitchingUseCase$verifyDeviceSwitching$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C193229pk $params;
    public int label;
    public final /* synthetic */ AnonymousClass99J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceSwitchingUseCase$verifyDeviceSwitching$1(AnonymousClass99J r2, C193229pk r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$params = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DeviceSwitchingUseCase$verifyDeviceSwitching$1(this.this$0, this.$params, r5);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.99E, X.9zb] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            r15 = r18
            int r0 = r15.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0019
            if (r0 == r5) goto L_0x0029
            if (r0 == r4) goto L_0x0072
            if (r0 != r3) goto L_0x0087
            X.C30691eM.A01(r6)
        L_0x0016:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x0019:
            X.C30691eM.A01(r6)
            X.99J r1 = r15.this$0
            X.AdJ r0 = X.C21027AdJ.A00
            r15.label = r5
            java.lang.Object r0 = r1.A02(r0, r15)
            if (r0 != r2) goto L_0x002c
            return r2
        L_0x0029:
            X.C30691eM.A01(r6)
        L_0x002c:
            X.99J r1 = r15.this$0
            X.9md r6 = r1.A04
            X.9pk r0 = r15.$params
            java.lang.String r9 = r0.A00
            r17 = 1
            X.0z4 r0 = r1.A01
            java.lang.String r11 = X.C108955ca.A0t(r0)
            X.99J r0 = r15.this$0
            X.0z4 r0 = r0.A01
            java.lang.String r12 = X.C108955ca.A0u(r0)
            X.99J r0 = r15.this$0
            X.0z4 r0 = r0.A01
            int r5 = r0.A0J()
            X.99J r0 = r15.this$0
            X.19D r1 = r0.A02
            X.0z4 r0 = r0.A01
            java.lang.String r0 = X.A9B.A0F(r0, r1)
            X.99E r8 = new X.99E
            r8.<init>(r5, r0)
            X.99J r0 = r15.this$0
            X.0zA r0 = r0.A00
            X.8aU r7 = X.A80.A00(r0)
            r15.label = r4
            r16 = 0
            java.lang.String r10 = "wa_old"
            r13 = 0
            r14 = r13
            java.lang.Object r6 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r6 != r2) goto L_0x0075
            return r2
        L_0x0072:
            X.C30691eM.A01(r6)
        L_0x0075:
            X.9hy r6 = (X.C188779hy) r6
            X.99J r1 = r15.this$0
            X.AdG r0 = new X.AdG
            r0.<init>(r6)
            r15.label = r3
            java.lang.Object r0 = r1.A02(r0, r15)
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.deviceswitching.DeviceSwitchingUseCase$verifyDeviceSwitching$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeviceSwitchingUseCase$verifyDeviceSwitching$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

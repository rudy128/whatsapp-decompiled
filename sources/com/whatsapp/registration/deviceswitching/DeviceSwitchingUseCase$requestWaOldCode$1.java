package com.whatsapp.registration.deviceswitching;

import X.AnonymousClass1OS;
import X.AnonymousClass99J;
import X.C194649s4;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.deviceswitching.DeviceSwitchingUseCase$requestWaOldCode$1", f = "DeviceSwitchingUseCase.kt", i = {2}, l = {60, 63, 76, 78}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class DeviceSwitchingUseCase$requestWaOldCode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C194649s4 $params;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass99J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceSwitchingUseCase$requestWaOldCode$1(AnonymousClass99J r2, C194649s4 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$params = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DeviceSwitchingUseCase$requestWaOldCode$1(this.this$0, this.$params, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            r13 = r18
            int r0 = r13.label
            r8 = 0
            r4 = 4
            r2 = 3
            r1 = 2
            r7 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 == r7) goto L_0x003b
            if (r0 == r1) goto L_0x007b
            if (r0 == r2) goto L_0x008e
            if (r0 != r4) goto L_0x00ab
            X.C30691eM.A01(r6)
        L_0x001a:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x001d:
            X.C30691eM.A01(r6)
            X.99J r0 = r13.this$0
            X.0z4 r0 = r0.A01
            r0.A1c(r8)
            X.99J r6 = r13.this$0
            X.9s4 r0 = r13.$params
            boolean r5 = r0.A02
            X.AdH r0 = new X.AdH
            r0.<init>(r5)
            r13.label = r7
            java.lang.Object r0 = r6.A02(r0, r13)
            if (r0 != r3) goto L_0x003e
            return r3
        L_0x003b:
            X.C30691eM.A01(r6)
        L_0x003e:
            X.99J r0 = r13.this$0
            X.9p1 r5 = r0.A03
            X.0z4 r0 = r0.A01
            java.lang.String r9 = X.C108955ca.A0t(r0)
            X.99J r0 = r13.this$0
            X.0z4 r0 = r0.A01
            java.lang.String r10 = X.C108955ca.A0u(r0)
            X.9s4 r0 = r13.$params
            java.lang.String r11 = r0.A01
            X.99F r6 = r0.A00
            X.99J r0 = r13.this$0
            X.0z4 r0 = r0.A01
            int r15 = r0.A0A()
            X.99J r0 = r13.this$0
            X.0z4 r0 = r0.A01
            int r16 = r0.A0B()
            X.99J r0 = r13.this$0
            X.0z4 r0 = r0.A01
            int r17 = r0.A09()
            r13.label = r1
            r14 = 0
            java.lang.String r7 = "wa_old"
            r12 = r8
            java.lang.Object r6 = r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r6 != r3) goto L_0x007e
            return r3
        L_0x007b:
            X.C30691eM.A01(r6)
        L_0x007e:
            r5 = r6
            X.ADN r5 = (X.ADN) r5
            r0 = 2000(0x7d0, double:9.88E-321)
            r13.L$0 = r5
            r13.label = r2
            java.lang.Object r0 = X.C62882s9.A00(r13, r0)
            if (r0 != r3) goto L_0x0095
            return r3
        L_0x008e:
            java.lang.Object r5 = r13.L$0
            X.ADN r5 = (X.ADN) r5
            X.C30691eM.A01(r6)
        L_0x0095:
            X.99J r2 = r13.this$0
            X.9s4 r0 = r13.$params
            boolean r1 = r0.A02
            X.AdI r0 = new X.AdI
            r0.<init>(r5, r1)
            r13.L$0 = r8
            r13.label = r4
            java.lang.Object r0 = r2.A02(r0, r13)
            if (r0 != r3) goto L_0x001a
            return r3
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.deviceswitching.DeviceSwitchingUseCase$requestWaOldCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeviceSwitchingUseCase$requestWaOldCode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

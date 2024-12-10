package com.whatsapp.registration.autoconf;

import X.AnonymousClass1OS;
import X.C194629s2;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.autoconf.AutoconfUseCase$requestAutoconfCode$1", f = "AutoconfUseCase.kt", i = {}, l = {50, 52, 64}, m = "invokeSuspend", n = {}, s = {})
public final class AutoconfUseCase$requestAutoconfCode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C194629s2 $params;
    public int label;
    public final /* synthetic */ AutoconfUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoconfUseCase$requestAutoconfCode$1(C194629s2 r2, AutoconfUseCase autoconfUseCase, C30391dr r4) {
        super(2, r4);
        this.this$0 = autoconfUseCase;
        this.$params = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AutoconfUseCase$requestAutoconfCode$1(this.$params, this.this$0, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            r13 = r18
            int r2 = r13.label
            r0 = 3
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0019
            if (r2 == r5) goto L_0x002e
            if (r2 == r3) goto L_0x0071
            if (r2 != r0) goto L_0x00af
            X.C30691eM.A01(r6)
        L_0x0016:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        L_0x0019:
            X.C30691eM.A01(r6)
            java.lang.String r2 = "AutoconfUseCase/requestAutoconfCode"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            com.whatsapp.registration.autoconf.AutoconfUseCase r4 = r13.this$0
            X.AdF r2 = X.C21023AdF.A00
            r13.label = r5
            java.lang.Object r2 = r4.A02(r2, r13)
            if (r2 != r1) goto L_0x0031
            return r1
        L_0x002e:
            X.C30691eM.A01(r6)
        L_0x0031:
            com.whatsapp.registration.autoconf.AutoconfUseCase r4 = r13.this$0
            X.9p1 r5 = r4.A01
            X.9s2 r2 = r13.$params
            java.lang.String r8 = r2.A02
            X.0z4 r2 = r4.A00
            java.lang.String r9 = X.C108955ca.A0t(r2)
            com.whatsapp.registration.autoconf.AutoconfUseCase r2 = r13.this$0
            X.0z4 r2 = r2.A00
            java.lang.String r10 = X.C108955ca.A0u(r2)
            X.9s2 r2 = r13.$params
            X.99F r6 = r2.A00
            com.whatsapp.registration.autoconf.AutoconfUseCase r2 = r13.this$0
            X.0z4 r2 = r2.A00
            int r15 = r2.A0A()
            com.whatsapp.registration.autoconf.AutoconfUseCase r2 = r13.this$0
            X.0z4 r2 = r2.A00
            int r16 = r2.A0B()
            com.whatsapp.registration.autoconf.AutoconfUseCase r2 = r13.this$0
            X.0z4 r2 = r2.A00
            int r17 = r2.A09()
            r13.label = r3
            r14 = 0
            java.lang.String r7 = "autoconf"
            r11 = 0
            r12 = r11
            java.lang.Object r6 = r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0071:
            X.C30691eM.A01(r6)
        L_0x0074:
            X.ADN r6 = (X.ADN) r6
            com.whatsapp.registration.autoconf.AutoconfUseCase r4 = r13.this$0
            X.9s2 r3 = r13.$params
            r13.label = r0
            java.lang.Integer r2 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 != r0) goto L_0x008d
            java.lang.String r0 = r6.A0A
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = com.whatsapp.registration.autoconf.AutoconfUseCase.A00(r3, r4, r0, r13)
        L_0x008a:
            if (r0 != r1) goto L_0x0016
            return r1
        L_0x008d:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r2 != r0) goto L_0x0098
            X.AdD r0 = X.C21021AdD.A00
        L_0x0093:
            java.lang.Object r0 = r4.A02(r0, r13)
            goto L_0x008a
        L_0x0098:
            X.0z4 r3 = r4.A00
            r2 = 0
            java.lang.String r0 = "autoconf_authentication_failed"
            r3.A1X(r0)
            r3.A17(r2)
            java.lang.Integer r0 = r6.A09
            java.lang.String r0 = X.C181669Rj.A00(r0)
            X.A9B.A0U(r3, r0)
            X.AdC r0 = X.C21020AdC.A00
            goto L_0x0093
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.autoconf.AutoconfUseCase$requestAutoconfCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AutoconfUseCase$requestAutoconfCode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

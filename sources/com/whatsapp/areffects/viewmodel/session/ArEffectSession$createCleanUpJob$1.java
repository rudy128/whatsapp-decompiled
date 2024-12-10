package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C99804tU;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.session.ArEffectSession$createCleanUpJob$1", f = "ArEffectSession.kt", i = {}, l = {280, 281, 285}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectSession$createCleanUpJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $currentDisableJob;
    public final /* synthetic */ AnonymousClass1OB $currentEnableJob;
    public final /* synthetic */ AnonymousClass1OB $currentStrengthUpdateJob;
    public final /* synthetic */ C99804tU $exception;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectSession$createCleanUpJob$1(C99804tU r2, C30391dr r3, AnonymousClass1OB r4, AnonymousClass1OB r5, AnonymousClass1OB r6) {
        super(2, r3);
        this.$currentStrengthUpdateJob = r4;
        this.$currentDisableJob = r5;
        this.$exception = r2;
        this.$currentEnableJob = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ArEffectSession$createCleanUpJob$1(this.$exception, r8, this.$currentStrengthUpdateJob, this.$currentDisableJob, this.$currentEnableJob);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r1) goto L_0x0025
            if (r0 == r2) goto L_0x0035
            if (r0 != r3) goto L_0x0050
            X.C30691eM.A01(r6)
        L_0x0012:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0015:
            X.C30691eM.A01(r6)
            X.1OB r0 = r5.$currentStrengthUpdateJob
            if (r0 == 0) goto L_0x0028
            r5.label = r1
            java.lang.Object r0 = X.C30551e8.A00(r5, r0)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x0025:
            X.C30691eM.A01(r6)
        L_0x0028:
            X.1OB r0 = r5.$currentDisableJob
            if (r0 == 0) goto L_0x0038
            r5.label = r2
            java.lang.Object r0 = r0.BhB(r5)
            if (r0 != r4) goto L_0x0038
            return r4
        L_0x0035:
            X.C30691eM.A01(r6)
        L_0x0038:
            X.4tU r1 = r5.$exception
            if (r1 == 0) goto L_0x0043
            X.1OB r0 = r5.$currentEnableJob
            if (r0 == 0) goto L_0x0043
            r0.BEM(r1)
        L_0x0043:
            X.1OB r0 = r5.$currentEnableJob
            if (r0 == 0) goto L_0x0012
            r5.label = r3
            java.lang.Object r0 = r0.BhB(r5)
            if (r0 != r4) goto L_0x0012
            return r4
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.session.ArEffectSession$createCleanUpJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectSession$createCleanUpJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

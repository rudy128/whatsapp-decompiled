package com.whatsapp.productinfra.avatar.liveediting.fallback;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$delay$1", f = "FlowExtensions.kt", i = {0}, l = {18, 19}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class FlowExtensionsKt$delay$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $timeoutInMS;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$delay$1(C30391dr r2, long j) {
        super(2, r2);
        this.$timeoutInMS = j;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        FlowExtensionsKt$delay$1 flowExtensionsKt$delay$1 = new FlowExtensionsKt$delay$1(r5, this.$timeoutInMS);
        flowExtensionsKt$delay$1.L$0 = obj;
        return flowExtensionsKt$delay$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0026
            if (r0 != r4) goto L_0x003b
            X.C30691eM.A01(r7)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r7)
            java.lang.Object r2 = r6.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            long r0 = r6.$timeoutInMS
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r5) goto L_0x002d
            return r5
        L_0x0026:
            java.lang.Object r2 = r6.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r7)
        L_0x002d:
            X.1Wu r1 = X.C27621Wu.A00
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r0 = r2.BJt(r1, r6)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$delay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$delay$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.extensions;

import X.AnonymousClass1OS;
import X.C18600wl;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.FlowExtKt$debounceSelectively$1", f = "FlowExt.kt", i = {0, 0}, l = {40, 61}, m = "invokeSuspend", n = {"$this$channelFlow", "scope"}, s = {"L$0", "L$1"})
public final class FlowExtKt$debounceSelectively$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $alwaysCollectStates;
    public final /* synthetic */ long $debounceTimeMillis;
    public final /* synthetic */ C18600wl $dispatcher;
    public final /* synthetic */ C23421Fz $this_debounceSelectively;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$debounceSelectively$1(List list, C30391dr r3, C18600wl r4, C23421Fz r5, long j) {
        super(2, r3);
        this.$dispatcher = r4;
        this.$this_debounceSelectively = r5;
        this.$alwaysCollectStates = list;
        this.$debounceTimeMillis = j;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C30391dr r2 = r9;
        FlowExtKt$debounceSelectively$1 flowExtKt$debounceSelectively$1 = new FlowExtKt$debounceSelectively$1(this.$alwaysCollectStates, r2, this.$dispatcher, this.$this_debounceSelectively, this.$debounceTimeMillis);
        flowExtKt$debounceSelectively$1.L$0 = obj;
        return flowExtKt$debounceSelectively$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x003f
            if (r0 != r3) goto L_0x005d
            X.C30691eM.A01(r13)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r13)
            java.lang.Object r9 = r12.L$0
            X.5bl r9 = (X.C108475bl) r9
            X.0wl r0 = r12.$dispatcher
            X.1OY r8 = X.AnonymousClass1OW.A02(r0)
            X.4rF r6 = X.C98494rF.A00()
            X.4rF r7 = X.C98494rF.A00()
            X.1Fz r0 = r12.$this_debounceSelectively
            java.util.List r5 = r12.$alwaysCollectStates
            long r10 = r12.$debounceTimeMillis
            com.whatsapp.extensions.FlowExtKt$debounceSelectively$1$1 r4 = new com.whatsapp.extensions.FlowExtKt$debounceSelectively$1$1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.L$0 = r9
            r12.L$1 = r8
            r12.label = r1
            java.lang.Object r0 = r0.BFC(r12, r4)
            if (r0 != r2) goto L_0x004a
            return r2
        L_0x003f:
            java.lang.Object r8 = r12.L$1
            X.1OX r8 = (X.AnonymousClass1OX) r8
            java.lang.Object r9 = r12.L$0
            X.5bl r9 = (X.C108475bl) r9
            X.C30691eM.A01(r13)
        L_0x004a:
            X.5HT r1 = new X.5HT
            r1.<init>(r8)
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.label = r3
            java.lang.Object r0 = X.AnonymousClass4W9.A00(r12, r1, r9)
            if (r0 != r2) goto L_0x000f
            return r2
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.FlowExtKt$debounceSelectively$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$debounceSelectively$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

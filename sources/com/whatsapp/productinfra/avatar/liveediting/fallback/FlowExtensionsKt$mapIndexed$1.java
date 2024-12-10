package com.whatsapp.productinfra.avatar.liveediting.fallback;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$mapIndexed$1", f = "FlowExtensions.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtensionsKt$mapIndexed$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $this_mapIndexed;
    public final /* synthetic */ C36001nB $transform;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$mapIndexed$1(C30391dr r2, C36001nB r3, C23421Fz r4) {
        super(2, r2);
        this.$this_mapIndexed = r4;
        this.$transform = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        FlowExtensionsKt$mapIndexed$1 flowExtensionsKt$mapIndexed$1 = new FlowExtensionsKt$mapIndexed$1(r5, this.$transform, this.$this_mapIndexed);
        flowExtensionsKt$mapIndexed$1.L$0 = obj;
        return flowExtensionsKt$mapIndexed$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r2 = this.$this_mapIndexed;
            FlowExtensionsKt$mapIndexed$1$invokeSuspend$$inlined$collectIndexed$1 flowExtensionsKt$mapIndexed$1$invokeSuspend$$inlined$collectIndexed$1 = new FlowExtensionsKt$mapIndexed$1$invokeSuspend$$inlined$collectIndexed$1(this.$transform, (AnonymousClass1G2) this.L$0);
            this.label = 1;
            if (r2.BFC(this, flowExtensionsKt$mapIndexed$1$invokeSuspend$$inlined$collectIndexed$1) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$mapIndexed$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

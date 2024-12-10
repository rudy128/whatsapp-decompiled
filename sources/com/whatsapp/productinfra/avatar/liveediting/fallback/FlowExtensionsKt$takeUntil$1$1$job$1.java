package com.whatsapp.productinfra.avatar.liveediting.fallback;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C23421Fz;
import X.C27179DXo;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C83114Dw;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$takeUntil$1$1$job$1", f = "FlowExtensions.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtensionsKt$takeUntil$1$1$job$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $notifier;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$takeUntil$1$1$job$1(C30391dr r2, C23421Fz r3) {
        super(2, r2);
        this.$notifier = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FlowExtensionsKt$takeUntil$1$1$job$1(r4, this.$notifier);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FlowExtensionsKt$takeUntil$1$1$job$1((C30391dr) obj2, this.$notifier).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C27179DXo dXo = new C27179DXo(this.$notifier, 15);
            this.label = 1;
            if (C88604aC.A01(this, dXo) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw new C83114Dw();
    }
}

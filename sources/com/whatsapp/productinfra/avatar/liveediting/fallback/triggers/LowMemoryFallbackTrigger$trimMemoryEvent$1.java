package com.whatsapp.productinfra.avatar.liveediting.fallback.triggers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.C108475bl;
import X.C144937Jg;
import X.C156717uo;
import X.C24561Ku;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.LowMemoryFallbackTrigger$trimMemoryEvent$1", f = "LowMemoryFallbackTrigger.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class LowMemoryFallbackTrigger$trimMemoryEvent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C24561Ku $this_trimMemoryEvent;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LowMemoryFallbackTrigger$trimMemoryEvent$1(C24561Ku r2, C30391dr r3) {
        super(2, r3);
        this.$this_trimMemoryEvent = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        LowMemoryFallbackTrigger$trimMemoryEvent$1 lowMemoryFallbackTrigger$trimMemoryEvent$1 = new LowMemoryFallbackTrigger$trimMemoryEvent$1(this.$this_trimMemoryEvent, r4);
        lowMemoryFallbackTrigger$trimMemoryEvent$1.L$0 = obj;
        return lowMemoryFallbackTrigger$trimMemoryEvent$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            C144937Jg r2 = new C144937Jg(r3);
            this.$this_trimMemoryEvent.registerObserver(r2);
            C156717uo r0 = new C156717uo(this.$this_trimMemoryEvent, r2);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r0, r3) == r5) {
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
        return ((LowMemoryFallbackTrigger$trimMemoryEvent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

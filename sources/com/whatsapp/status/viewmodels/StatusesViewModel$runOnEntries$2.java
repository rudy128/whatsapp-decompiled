package com.whatsapp.status.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C111255jJ;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35911n2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$runOnEntries$2", f = "StatusesViewModel.kt", i = {0}, l = {558}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class StatusesViewModel$runOnEntries$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $runnable;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C111255jJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$runOnEntries$2(C111255jJ r2, C30391dr r3, C18090vk r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$runnable = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StatusesViewModel$runOnEntries$2(this.this$0, r5, this.$runnable);
    }

    public final Object invokeSuspend(Object obj) {
        C18090vk r2;
        C35911n2 r1;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r1 = this.this$0.A0L;
            r2 = this.$runnable;
            this.L$0 = r1;
            this.L$1 = r2;
            this.label = 1;
            if (r1.Bhx(this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            r2 = (C18090vk) this.L$1;
            r1 = (C35911n2) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        try {
            r2.invoke();
            return C27621Wu.A00;
        } finally {
            r1.CQ9((Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusesViewModel$runOnEntries$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

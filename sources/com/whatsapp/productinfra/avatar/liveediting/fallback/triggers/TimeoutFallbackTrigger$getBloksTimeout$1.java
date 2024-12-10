package com.whatsapp.productinfra.avatar.liveediting.fallback.triggers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.C104565Oq;
import X.C108475bl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C97344pJ;
import X.DBQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$getBloksTimeout$1", f = "TimeoutFallbackTrigger.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class TimeoutFallbackTrigger$getBloksTimeout$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C97344pJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeoutFallbackTrigger$getBloksTimeout$1(C97344pJ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        TimeoutFallbackTrigger$getBloksTimeout$1 timeoutFallbackTrigger$getBloksTimeout$1 = new TimeoutFallbackTrigger$getBloksTimeout$1(this.this$0, r4);
        timeoutFallbackTrigger$getBloksTimeout$1.L$0 = obj;
        return timeoutFallbackTrigger$getBloksTimeout$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            DBQ dbq = new DBQ(r3, 0);
            this.this$0.A00.A03.add(dbq);
            C104565Oq r0 = new C104565Oq(dbq, this.this$0);
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
        return ((TimeoutFallbackTrigger$getBloksTimeout$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

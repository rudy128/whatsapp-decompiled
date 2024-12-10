package com.whatsapp.calling.calldatasource;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.AnonymousClass5ME;
import X.C108475bl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85914Pf;
import X.C93344ip;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.calldatasource.CallRepository$getCallStateModel$1", f = "CallRepository.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class CallRepository$getCallStateModel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $withSpeakerRanking;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C85914Pf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallRepository$getCallStateModel$1(C85914Pf r2, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = r2;
        this.$withSpeakerRanking = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        CallRepository$getCallStateModel$1 callRepository$getCallStateModel$1 = new CallRepository$getCallStateModel$1(this.this$0, r5, this.$withSpeakerRanking);
        callRepository$getCallStateModel$1.L$0 = obj;
        return callRepository$getCallStateModel$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            boolean z = this.$withSpeakerRanking;
            C85914Pf r0 = this.this$0;
            C93344ip r2 = new C93344ip(r0, r3, z);
            r0.A00.registerObserver(r2);
            r3.CQ0(this.this$0.A00.A07());
            AnonymousClass5ME r02 = new AnonymousClass5ME(r2, this.this$0);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r02, r3) == r5) {
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
        return ((CallRepository$getCallStateModel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

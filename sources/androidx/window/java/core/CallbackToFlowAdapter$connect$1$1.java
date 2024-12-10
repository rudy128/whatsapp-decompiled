package androidx.window.java.core;

import X.AnonymousClass000;
import X.AnonymousClass1GV;
import X.AnonymousClass1OS;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", f = "CallbackToFlowAdapter.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class CallbackToFlowAdapter$connect$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1GV $consumer;
    public final /* synthetic */ C23421Fz $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallbackToFlowAdapter$connect$1$1(AnonymousClass1GV r2, C30391dr r3, C23421Fz r4) {
        super(2, r3);
        this.$flow = r4;
        this.$consumer = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CallbackToFlowAdapter$connect$1$1(this.$consumer, r5, this.$flow);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r3 = this.$flow;
            C99624tC r0 = new C99624tC(this.$consumer, 4);
            this.label = 1;
            if (r3.BFC(this, r0) == r5) {
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
        return ((CallbackToFlowAdapter$connect$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

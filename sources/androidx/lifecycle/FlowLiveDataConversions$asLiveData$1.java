package androidx.lifecycle;

import X.AnonymousClass000;
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

@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class FlowLiveDataConversions$asLiveData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $this_asLiveData;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(C30391dr r2, C23421Fz r3) {
        super(2, r2);
        this.$this_asLiveData = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(r4, this.$this_asLiveData);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C23421Fz r1 = this.$this_asLiveData;
            C99624tC A00 = C99624tC.A00(obj2, 1);
            this.label = 1;
            if (r1.BFC(this, A00) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowLiveDataConversions$asLiveData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

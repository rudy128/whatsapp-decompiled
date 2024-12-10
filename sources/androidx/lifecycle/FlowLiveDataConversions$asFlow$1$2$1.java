package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1OS;
import X.C22851Dl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowLiveDataConversions$asFlow$1$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22851Dl $observer;
    public final /* synthetic */ AnonymousClass1DS $this_asFlow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1$2$1(AnonymousClass1DS r2, C22851Dl r3, C30391dr r4) {
        super(2, r4);
        this.$this_asFlow = r2;
        this.$observer = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FlowLiveDataConversions$asFlow$1$2$1(this.$this_asFlow, this.$observer, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$this_asFlow.A0D(this.$observer);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowLiveDataConversions$asFlow$1$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

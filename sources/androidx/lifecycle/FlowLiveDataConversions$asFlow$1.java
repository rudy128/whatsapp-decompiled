package androidx.lifecycle;

import X.AnonymousClass1DS;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {112, 116}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
public final class FlowLiveDataConversions$asFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1DS $this_asFlow;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(AnonymousClass1DS r2, C30391dr r3) {
        super(2, r3);
        this.$this_asFlow = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, r4);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r8 = 2
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0013
            if (r0 == r6) goto L_0x003c
            if (r0 != r8) goto L_0x005b
            X.C30691eM.A01(r10)
        L_0x0010:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0013:
            X.C30691eM.A01(r10)
            java.lang.Object r4 = r9.L$0
            X.5bl r4 = (X.C108475bl) r4
            r0 = 0
            X.4fu r2 = new X.4fu
            r2.<init>(r4, r0)
            X.0wl r0 = X.C23871Hy.A00
            X.1IR r0 = X.AnonymousClass1IN.A00
            X.1IT r0 = (X.AnonymousClass1IT) r0
            X.1IT r3 = r0.A01
            X.1DS r1 = r9.$this_asFlow
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            r0.<init>(r2, r5)
            r9.L$0 = r4
            r9.L$1 = r2
            r9.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r9, r3, r0)
            if (r0 != r7) goto L_0x0047
            return r7
        L_0x003c:
            java.lang.Object r2 = r9.L$1
            X.1Dl r2 = (X.C22851Dl) r2
            java.lang.Object r4 = r9.L$0
            X.5bl r4 = (X.C108475bl) r4
            X.C30691eM.A01(r10)
        L_0x0047:
            X.1DS r1 = r9.$this_asFlow
            X.5Lt r0 = new X.5Lt
            r0.<init>(r1, r2)
            r9.L$0 = r5
            r9.L$1 = r5
            r9.label = r8
            java.lang.Object r0 = X.AnonymousClass4W9.A00(r9, r0, r4)
            if (r0 != r7) goto L_0x0010
            return r7
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowLiveDataConversions$asFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.pancake;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass7SX;
import X.C147317Sr;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.PearPancakeFragment$onViewCreated$1", f = "PearPancakeFragment.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class PearPancakeFragment$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ PearPancakeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PearPancakeFragment$onViewCreated$1(PearPancakeFragment pearPancakeFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = pearPancakeFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PearPancakeFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PearPancakeFragment$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G1 BWJ = this.this$0.A26().BWJ();
            AnonymousClass7SX r0 = new AnonymousClass7SX(this.this$0, 4);
            this.label = 1;
            if (BWJ.BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw new C147317Sr();
    }
}

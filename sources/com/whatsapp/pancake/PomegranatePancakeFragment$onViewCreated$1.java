package com.whatsapp.pancake;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C147277Sn;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.PomegranatePancakeFragment$onViewCreated$1", f = "PomegranatePancakeFragment.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
public final class PomegranatePancakeFragment$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ PomegranatePancakeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PomegranatePancakeFragment$onViewCreated$1(PomegranatePancakeFragment pomegranatePancakeFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = pomegranatePancakeFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PomegranatePancakeFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PomegranatePancakeFragment$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C147277Sn r0 = new C147277Sn(this.this$0, 31);
            this.label = 1;
            if (((C23421Fz) ((PomegranatePancakeViewModel) this.this$0.A00.getValue()).A02.getValue()).BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}

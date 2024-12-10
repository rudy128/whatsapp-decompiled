package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6nl;
import X.C108945cZ;
import X.C147277Sn;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87324Vd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1", f = "UTwoNetViewModel.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$startToObserveFetch$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$startToObserveFetch$1(UTwoNetViewModel uTwoNetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = uTwoNetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UTwoNetViewModel$startToObserveFetch$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UTwoNetViewModel$startToObserveFetch$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz A01 = C87324Vd.A01(C108945cZ.A0Q(((AnonymousClass6nl) this.this$0.A07.get()).A05));
            C147277Sn r0 = new C147277Sn(this.this$0, 28);
            this.label = 1;
            if (A01.BFC(this, r0) == r5) {
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

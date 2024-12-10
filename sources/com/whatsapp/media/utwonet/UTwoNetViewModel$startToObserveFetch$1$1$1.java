package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1OS;
import X.AnonymousClass85U;
import X.C1195968v;
import X.C145057Js;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1$1$1", f = "UTwoNetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$startToObserveFetch$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass85U $state;
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$startToObserveFetch$1$1$1(UTwoNetViewModel uTwoNetViewModel, AnonymousClass85U r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = uTwoNetViewModel;
        this.$state = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UTwoNetViewModel$startToObserveFetch$1$1$1(this.this$0, this.$state, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UTwoNetViewModel uTwoNetViewModel = this.this$0;
            uTwoNetViewModel.A03.A0G("UTwoNetViewModel", AnonymousClass001.A1E(((C145057Js) this.$state).A01, "Error fetching the model ", AnonymousClass000.A10()), true);
            uTwoNetViewModel.A02.A0E(C1195968v.A00);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UTwoNetViewModel$startToObserveFetch$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C111285jR;
import X.C1595885c;
import X.C18070vi;
import X.C21598Amm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.GetDirectoryCategoriesPreviewUseCase$onError$1$1", f = "GetDirectoryCategoriesPreviewUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDirectoryCategoriesPreviewUseCase$onError$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1595885c $listener;
    public final /* synthetic */ C21598Amm $t;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetDirectoryCategoriesPreviewUseCase$onError$1$1(C21598Amm amm, C1595885c r3, C30391dr r4) {
        super(2, r4);
        this.$listener = r3;
        this.$t = amm;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GetDirectoryCategoriesPreviewUseCase$onError$1$1(this.$t, this.$listener, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1595885c r2 = this.$listener;
            C21598Amm amm = this.$t;
            C18070vi.A0d(amm, 0);
            ((C111285jR) r2).A0B.A0E(amm);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetDirectoryCategoriesPreviewUseCase$onError$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

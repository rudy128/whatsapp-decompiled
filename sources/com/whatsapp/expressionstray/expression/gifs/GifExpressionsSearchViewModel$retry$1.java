package com.whatsapp.expressionstray.expression.gifs;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C127256e3;
import X.C26067Crh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34081jt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel$retry$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$retry$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$retry$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = gifExpressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GifExpressionsSearchViewModel$retry$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GifExpressionsSearchViewModel$retry$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34081jt r0 = new C34081jt((AnonymousClass1OB) null, ((C127256e3) this.this$0.A0B.get()).A01);
            this.label = 1;
            obj = C26067Crh.A02(this, r0);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A0T((String) obj);
        return C27621Wu.A00;
    }
}

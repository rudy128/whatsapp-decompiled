package com.whatsapp.expressionstray.expression.gifs;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel$startDataLoad$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$startDataLoad$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$startDataLoad$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = gifExpressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        GifExpressionsSearchViewModel$startDataLoad$1 gifExpressionsSearchViewModel$startDataLoad$1 = new GifExpressionsSearchViewModel$startDataLoad$1(this.this$0, r4);
        gifExpressionsSearchViewModel$startDataLoad$1.L$0 = obj;
        return gifExpressionsSearchViewModel$startDataLoad$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A0T((String) this.L$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GifExpressionsSearchViewModel$startDataLoad$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

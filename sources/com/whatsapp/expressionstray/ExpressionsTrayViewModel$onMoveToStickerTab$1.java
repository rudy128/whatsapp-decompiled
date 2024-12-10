package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C117255zT;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$onMoveToStickerTab$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$onMoveToStickerTab$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$onMoveToStickerTab$1(ExpressionsTrayViewModel expressionsTrayViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = expressionsTrayViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ExpressionsTrayViewModel$onMoveToStickerTab$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsTrayViewModel$onMoveToStickerTab$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A0U(C117255zT.A00);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}

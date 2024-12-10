package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C70733Ch;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayView$onStickersTabSelected$1", f = "ExpressionsTrayView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayView$onStickersTabSelected$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsTrayView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView$onStickersTabSelected$1(ExpressionsTrayView expressionsTrayView, C30391dr r3) {
        super(2, r3);
        this.this$0 = expressionsTrayView;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ExpressionsTrayView$onStickersTabSelected$1 expressionsTrayView$onStickersTabSelected$1 = new ExpressionsTrayView$onStickersTabSelected$1(this.this$0, r4);
        expressionsTrayView$onStickersTabSelected$1.L$0 = obj;
        return expressionsTrayView$onStickersTabSelected$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.getGlobalUI().A0J(new C70733Ch(this.L$0, this.this$0, 48));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayView$onStickersTabSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

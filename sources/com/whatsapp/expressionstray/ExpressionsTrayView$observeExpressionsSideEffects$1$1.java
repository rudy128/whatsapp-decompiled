package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1F9;
import X.AnonymousClass1G3;
import X.AnonymousClass1G6;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.C147187Sd;
import X.C147207Sf;
import X.C147277Sn;
import X.C23401Fx;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayView$observeExpressionsSideEffects$1$1", f = "ExpressionsTrayView.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayView$observeExpressionsSideEffects$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1F9 $it;
    public int label;
    public final /* synthetic */ ExpressionsTrayView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView$observeExpressionsSideEffects$1$1(AnonymousClass1F9 r2, ExpressionsTrayView expressionsTrayView, C30391dr r4) {
        super(2, r4);
        this.this$0 = expressionsTrayView;
        this.$it = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsTrayView$observeExpressionsSideEffects$1$1(this.$it, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G3 r2 = this.this$0.getExpressionsViewModel().A0G;
            C23421Fz A00 = AnonymousClass4FR.A00(C23401Fx.STARTED, this.$it.getLifecycle(), r2);
            if (!(A00 instanceof AnonymousClass1G6)) {
                A00 = new C147187Sd(A00);
            }
            ExpressionsTrayView expressionsTrayView = this.this$0;
            C147207Sf r22 = new C147207Sf(expressionsTrayView, A00, 3);
            C147277Sn r0 = new C147277Sn(expressionsTrayView, 14);
            this.label = 1;
            if (r22.BFC(this, r0) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayView$observeExpressionsSideEffects$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

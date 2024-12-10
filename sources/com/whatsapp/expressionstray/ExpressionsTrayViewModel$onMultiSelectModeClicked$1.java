package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C117135zH;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$onMultiSelectModeClicked$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$onMultiSelectModeClicked$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$onMultiSelectModeClicked$1(ExpressionsTrayViewModel expressionsTrayViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = expressionsTrayViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ExpressionsTrayViewModel$onMultiSelectModeClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsTrayViewModel$onMultiSelectModeClicked$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ExpressionsTrayViewModel expressionsTrayViewModel = this.this$0;
            AnonymousClass1G3 r2 = expressionsTrayViewModel.A0G;
            C117135zH r0 = new C117135zH(expressionsTrayViewModel.A03);
            this.label = 1;
            if (r2.BJt(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A07.A03(AnonymousClass3MW.A0v(40), 1, 10);
        return C27621Wu.A00;
    }
}

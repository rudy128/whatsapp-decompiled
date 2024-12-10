package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C117065zA;
import X.C117075zB;
import X.C137836w6;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onBackButtonClick$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {319, 324}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onBackButtonClick$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isKeyboardShowing;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onBackButtonClick$1(ExpressionsSearchViewModel expressionsSearchViewModel, C30391dr r3, boolean z) {
        super(2, r3);
        this.$isKeyboardShowing = z;
        this.this$0 = expressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsSearchViewModel$onBackButtonClick$1(this.this$0, r5, this.$isKeyboardShowing);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$isKeyboardShowing;
            ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
            AnonymousClass1G3 r2 = expressionsSearchViewModel.A0L;
            AnonymousClass1BI A00 = C137836w6.A00(expressionsSearchViewModel.A0F);
            if (z) {
                r0 = new C117075zB(A00);
                this.label = 1;
            } else {
                r0 = new C117065zA(A00);
                this.label = 2;
            }
            if (r2.BJt(r0, this) == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onBackButtonClick$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

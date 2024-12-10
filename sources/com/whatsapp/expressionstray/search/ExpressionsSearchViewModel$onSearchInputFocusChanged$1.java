package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass60f;
import X.C127256e3;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onSearchInputFocusChanged$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onSearchInputFocusChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $currentPrompt;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onSearchInputFocusChanged$1(ExpressionsSearchViewModel expressionsSearchViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = expressionsSearchViewModel;
        this.$currentPrompt = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsSearchViewModel$onSearchInputFocusChanged$1(this.this$0, this.$currentPrompt, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C127256e3 r4 = (C127256e3) this.this$0.A0I.get();
            String str = this.$currentPrompt;
            this.label = 1;
            if (C30451dy.A00(this, r4.A00, new SearchQueryProvider$setSearchQuery$2(r4, str, (C30391dr) null)) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
        expressionsSearchViewModel.A08.A0F(new AnonymousClass60f(expressionsSearchViewModel.A02, expressionsSearchViewModel.A03, this.$currentPrompt, true));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onSearchInputFocusChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

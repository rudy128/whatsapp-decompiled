package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4DE;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C92504hR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onButtonClicked$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$onButtonClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4DE $category;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$onButtonClicked$1(AnonymousClass4DE r2, BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = baseArEffectsViewModel;
        this.$category = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new BaseArEffectsViewModel$onButtonClicked$1(this.$category, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A0h(this.$category, C92504hR.A00);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BaseArEffectsViewModel$onButtonClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y1;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C92514hS;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onRemoveAllEffectsButtonClicked$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$onRemoveAllEffectsButtonClicked$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$onRemoveAllEffectsButtonClicked$1(BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = baseArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BaseArEffectsViewModel$onRemoveAllEffectsButtonClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BaseArEffectsViewModel$onRemoveAllEffectsButtonClicked$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            BaseArEffectsViewModel.A04(this.this$0, new C92514hS((String) null, (AnonymousClass1Y1) null, 1));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}

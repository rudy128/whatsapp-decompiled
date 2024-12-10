package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4D3;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$findTrayEffectById$2$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$findTrayEffectById$2$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public BaseArEffectsViewModel$findTrayEffectById$2$1(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        BaseArEffectsViewModel$findTrayEffectById$2$1 baseArEffectsViewModel$findTrayEffectById$2$1 = new BaseArEffectsViewModel$findTrayEffectById$2$1(r3);
        baseArEffectsViewModel$findTrayEffectById$2$1.L$0 = obj;
        return baseArEffectsViewModel$findTrayEffectById$2$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BaseArEffectsViewModel$findTrayEffectById$2$1 baseArEffectsViewModel$findTrayEffectById$2$1 = new BaseArEffectsViewModel$findTrayEffectById$2$1((C30391dr) obj2);
        baseArEffectsViewModel$findTrayEffectById$2$1.L$0 = obj;
        return baseArEffectsViewModel$findTrayEffectById$2$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(AnonymousClass000.A1Z(this.L$0, AnonymousClass4D3.LOADED));
        }
        throw AnonymousClass000.A0l();
    }
}

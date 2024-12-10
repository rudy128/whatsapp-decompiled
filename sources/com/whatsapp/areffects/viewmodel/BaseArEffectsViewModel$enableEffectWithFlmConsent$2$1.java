package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4DE;
import X.C107855aj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$enableEffectWithFlmConsent$2$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$enableEffectWithFlmConsent$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4DE $category;
    public final /* synthetic */ C107855aj $effect;
    public final /* synthetic */ Float $effectStrength;
    public final /* synthetic */ boolean $isFromButton;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$enableEffectWithFlmConsent$2$1(AnonymousClass4DE r2, C107855aj r3, BaseArEffectsViewModel baseArEffectsViewModel, Float f, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = baseArEffectsViewModel;
        this.$category = r2;
        this.$effect = r3;
        this.$effectStrength = f;
        this.$isFromButton = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new BaseArEffectsViewModel$enableEffectWithFlmConsent$2$1(this.$category, this.$effect, this.this$0, this.$effectStrength, r9, this.$isFromButton);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            BaseArEffectsViewModel baseArEffectsViewModel = this.this$0;
            baseArEffectsViewModel.A0g(this.$category, this.$effect, this.$effectStrength, baseArEffectsViewModel.A0Y(), this.$isFromButton, true);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BaseArEffectsViewModel$enableEffectWithFlmConsent$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

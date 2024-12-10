package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4DE;
import X.C106575Wj;
import X.C107855aj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30511e4;
import X.C30691eM;
import X.C83454Fe;
import X.C83524Fl;
import X.C87354Vg;
import X.C92374hC;
import X.C92584hZ;
import X.C99804tU;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession$updateStrength$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onSliderChanged$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$onSliderChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4DE $category;
    public final /* synthetic */ C107855aj $effect;
    public final /* synthetic */ int $sliderStrength;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$onSliderChanged$1(AnonymousClass4DE r2, C107855aj r3, BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r5, int i) {
        super(2, r5);
        this.$effect = r3;
        this.$sliderStrength = i;
        this.this$0 = baseArEffectsViewModel;
        this.$category = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C107855aj r2 = this.$effect;
        int i = this.$sliderStrength;
        return new BaseArEffectsViewModel$onSliderChanged$1(this.$category, r2, this.this$0, r8, i);
    }

    public final Object invokeSuspend(Object obj) {
        Float f;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Float A00 = C87354Vg.A00(this.$effect, AnonymousClass3MW.A0v(this.$sliderStrength));
            if (A00 != null) {
                BaseArEffectsViewModel baseArEffectsViewModel = this.this$0;
                AnonymousClass4DE r4 = this.$category;
                C107855aj r2 = this.$effect;
                float floatValue = A00.floatValue();
                ArEffectSession A0V = baseArEffectsViewModel.A0V(r4);
                if (A0V != null) {
                    C106575Wj A01 = ArEffectSession.A01(A0V);
                    if (A01 instanceof C92584hZ) {
                        C92584hZ r1 = (C92584hZ) A01;
                        if (C83524Fl.A00(r4, r2, r1) && ((f = r1.A04) == null || f.floatValue() != floatValue)) {
                            BaseArEffectsViewModel baseArEffectsViewModel2 = this.this$0;
                            C92374hC r5 = new C92374hC(this.$category, baseArEffectsViewModel2.A0T(), floatValue);
                            ArEffectSession arEffectSession = (ArEffectSession) AnonymousClass000.A0w(AnonymousClass3MW.A12(baseArEffectsViewModel2.A0G), C83454Fe.A00(r5));
                            if (arEffectSession != null) {
                                synchronized (arEffectSession) {
                                    C30511e4 A05 = ArEffectSession.A05((C99804tU) null, arEffectSession);
                                    arEffectSession.A01 = AnonymousClass3MY.A0s(new ArEffectSession$updateStrength$1(r5, arEffectSession, (C30391dr) null, A05), arEffectSession.A07);
                                }
                            }
                        }
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BaseArEffectsViewModel$onSliderChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

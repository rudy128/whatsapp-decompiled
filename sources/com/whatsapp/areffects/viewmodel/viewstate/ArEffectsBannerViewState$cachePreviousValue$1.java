package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$cachePreviousValue$1", f = "ArEffectsBannerViewState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsBannerViewState$cachePreviousValue$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public ArEffectsBannerViewState$cachePreviousValue$1(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ArEffectsBannerViewState$cachePreviousValue$1 arEffectsBannerViewState$cachePreviousValue$1 = new ArEffectsBannerViewState$cachePreviousValue$1((C30391dr) obj3);
        arEffectsBannerViewState$cachePreviousValue$1.L$0 = obj;
        arEffectsBannerViewState$cachePreviousValue$1.L$1 = obj2;
        return arEffectsBannerViewState$cachePreviousValue$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1D6 r0 = (AnonymousClass1D6) this.L$0;
            Object obj3 = this.L$1;
            if (r0 != null) {
                obj2 = r0.second;
            } else {
                obj2 = null;
            }
            return AnonymousClass1D6.A01(obj2, obj3);
        }
        throw AnonymousClass000.A0l();
    }
}

package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsEffectButtonViewState$isSliderShown$2$1", f = "ArEffectsEffectButtonViewState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsEffectButtonViewState$isSliderShown$2$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ boolean $hasSlider;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsEffectButtonViewState$isSliderShown$2$1(C30391dr r2, boolean z) {
        super(3, r2);
        this.$hasSlider = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L_0x001a
            X.C30691eM.A01(r4)
            boolean r2 = r3.Z$0
            java.lang.Object r1 = r3.L$0
            boolean r0 = r3.$hasSlider
            if (r0 == 0) goto L_0x0014
            if (r2 == 0) goto L_0x0014
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x001a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.viewstate.ArEffectsEffectButtonViewState$isSliderShown$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        ArEffectsEffectButtonViewState$isSliderShown$2$1 arEffectsEffectButtonViewState$isSliderShown$2$1 = new ArEffectsEffectButtonViewState$isSliderShown$2$1((C30391dr) obj3, this.$hasSlider);
        arEffectsEffectButtonViewState$isSliderShown$2$1.Z$0 = A1Y;
        arEffectsEffectButtonViewState$isSliderShown$2$1.L$0 = obj2;
        return arEffectsEffectButtonViewState$isSliderShown$2$1.invokeSuspend(C27621Wu.A00);
    }
}

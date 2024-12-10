package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass4DE;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1", f = "ArEffectsTrayViewState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass4DE $category;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1(AnonymousClass4DE r2, C30391dr r3) {
        super(3, r3);
        this.$category = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1 arEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1 = new ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1(this.$category, (C30391dr) obj3);
        arEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1.L$0 = obj;
        arEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1.L$1 = obj2;
        return arEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            if (r0 != 0) goto L_0x0039
            X.C30691eM.A01(r5)
            java.lang.Object r3 = r4.L$0
            X.5Wj r3 = (X.C106575Wj) r3
            java.lang.Object r1 = r4.L$1
            boolean r0 = r1 instanceof X.C92444hJ
            r2 = 0
            if (r0 != 0) goto L_0x0029
            boolean r0 = r1 instanceof X.C92434hI
            if (r0 != 0) goto L_0x0029
            boolean r0 = r3 instanceof X.C92594ha
            if (r0 == 0) goto L_0x0030
            X.4ha r3 = (X.C92594ha) r3
            X.4hZ r0 = r3.A03
            if (r0 == 0) goto L_0x002e
            X.4hD r0 = r0.A03
        L_0x0022:
            X.4DE r1 = r0.A00
        L_0x0024:
            X.4DE r0 = r4.$category
            if (r1 != r0) goto L_0x0029
            r2 = 1
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x002e:
            r1 = 0
            goto L_0x0024
        L_0x0030:
            boolean r0 = r3 instanceof X.C92584hZ
            if (r0 == 0) goto L_0x0029
            X.4hZ r3 = (X.C92584hZ) r3
            X.4hD r0 = r3.A03
            goto L_0x0022
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

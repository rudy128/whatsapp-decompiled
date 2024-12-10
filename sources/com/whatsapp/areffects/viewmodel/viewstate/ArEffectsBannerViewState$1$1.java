package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass20G;
import X.AnonymousClass4t0;
import X.C27182DXr;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86214Qt;
import X.C86554Sc;
import X.C99454sq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$1$1", f = "ArEffectsBannerViewState.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsBannerViewState$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C86554Sc $configuration;
    public final /* synthetic */ AnonymousClass1G1 $it;
    public final /* synthetic */ AnonymousClass20G $retryEffect;
    public int label;
    public final /* synthetic */ C86214Qt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsBannerViewState$1$1(C86554Sc r2, C86214Qt r3, C30391dr r4, AnonymousClass20G r5, AnonymousClass1G1 r6) {
        super(2, r4);
        this.this$0 = r3;
        this.$it = r6;
        this.$retryEffect = r5;
        this.$configuration = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C86214Qt r2 = this.this$0;
        AnonymousClass1G1 r5 = this.$it;
        return new ArEffectsBannerViewState$1$1(this.$configuration, r2, r8, this.$retryEffect, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C99454sq r5 = new C99454sq(new C27182DXr((Object) null, new ArEffectsBannerViewState$cachePreviousValue$1((C30391dr) null), this.$it), 13);
            AnonymousClass4t0 r0 = new AnonymousClass4t0(this.this$0, this.$configuration, this.$retryEffect, 2);
            this.label = 1;
            if (r5.BFC(this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsBannerViewState$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

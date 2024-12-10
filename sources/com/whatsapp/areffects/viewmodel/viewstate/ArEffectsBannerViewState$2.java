package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86214Qt;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$2", f = "ArEffectsBannerViewState.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsBannerViewState$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C86214Qt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsBannerViewState$2(C86214Qt r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ArEffectsBannerViewState$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ArEffectsBannerViewState$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C86214Qt r2 = this.this$0;
            AnonymousClass1G1 r1 = r2.A04;
            C99624tC A00 = C99624tC.A00(r2, 11);
            this.label = 1;
            if (r1.BFC(this, A00) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }
}

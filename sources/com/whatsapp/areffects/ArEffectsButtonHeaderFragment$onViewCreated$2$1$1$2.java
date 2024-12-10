package com.whatsapp.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3R4;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85404Ng;
import X.C99574t7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$2", f = "ArEffectsButtonHeaderFragment.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3R4 $button;
    public final /* synthetic */ C85404Ng $viewState;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$2(AnonymousClass3R4 r2, C85404Ng r3, C30391dr r4) {
        super(2, r4);
        this.$viewState = r3;
        this.$button = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$2(this.$button, this.$viewState, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C99574t7 r0 = new C99574t7(this.$button, this.$viewState, 0);
            this.label = 1;
            if (((AnonymousClass1G0) this.$viewState.A01.getValue()).BFC(this, r0) == r6) {
                return r6;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

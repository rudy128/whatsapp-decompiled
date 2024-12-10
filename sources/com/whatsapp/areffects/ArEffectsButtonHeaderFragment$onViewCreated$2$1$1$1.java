package com.whatsapp.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3R4;
import X.AnonymousClass4V6;
import X.AnonymousClass4t0;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85404Ng;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1", f = "ArEffectsButtonHeaderFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3R4 $button;
    public final /* synthetic */ AnonymousClass4V6 $config;
    public final /* synthetic */ C85404Ng $viewState;
    public int label;
    public final /* synthetic */ ArEffectsButtonHeaderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1(ArEffectsButtonHeaderFragment arEffectsButtonHeaderFragment, AnonymousClass3R4 r3, AnonymousClass4V6 r4, C85404Ng r5, C30391dr r6) {
        super(2, r6);
        this.$viewState = r5;
        this.$button = r3;
        this.this$0 = arEffectsButtonHeaderFragment;
        this.$config = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C85404Ng r4 = this.$viewState;
        return new ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1(this.this$0, this.$button, this.$config, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4t0 r0 = new AnonymousClass4t0(this.this$0, this.$button, this.$config, 0);
            this.label = 1;
            if (((AnonymousClass1G0) this.$viewState.A00.getValue()).BFC(this, r0) == r7) {
                return r7;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsButtonHeaderFragment$onViewCreated$2$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

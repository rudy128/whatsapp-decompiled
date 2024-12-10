package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C122636Rd;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {519}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1(InCallBannerViewModelV2 inCallBannerViewModelV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = inCallBannerViewModelV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InCallBannerViewModelV2$maybeShowCallOnHold$1$viewState$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.BYL().A0E(C27621Wu.A00);
            InCallBannerViewModelV2 inCallBannerViewModelV2 = this.this$0;
            C122636Rd r0 = C122636Rd.A05;
            this.label = 1;
            if (InCallBannerViewModelV2.A04(r0, inCallBannerViewModelV2, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}

package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onViewStateDismissed$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$onViewStateDismissed$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onViewStateDismissed$1(InCallBannerViewModelV2 inCallBannerViewModelV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = inCallBannerViewModelV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InCallBannerViewModelV2$onViewStateDismissed$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InCallBannerViewModelV2$onViewStateDismissed$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C41731wy BVK = this.this$0.BVK();
            C27621Wu r0 = C27621Wu.A00;
            BVK.A0E(r0);
            return r0;
        }
        throw AnonymousClass000.A0l();
    }
}

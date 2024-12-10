package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C122636Rd;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122636Rd $bannerType;
    public final /* synthetic */ List $userJids;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1(C122636Rd r2, InCallBannerViewModelV2 inCallBannerViewModelV2, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = inCallBannerViewModelV2;
        this.$userJids = list;
        this.$bannerType = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1(this.$bannerType, this.this$0, this.$userJids, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.BWL().A0E(this.$userJids);
            InCallBannerViewModelV2 inCallBannerViewModelV2 = this.this$0;
            C122636Rd r0 = this.$bannerType;
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

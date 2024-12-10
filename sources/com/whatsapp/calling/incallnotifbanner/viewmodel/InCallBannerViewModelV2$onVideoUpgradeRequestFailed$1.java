package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZN;
import X.AnonymousClass720;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onVideoUpgradeRequestFailed$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$onVideoUpgradeRequestFailed$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $stringRes;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onVideoUpgradeRequestFailed$1(InCallBannerViewModelV2 inCallBannerViewModelV2, C30391dr r3, int i) {
        super(2, r3);
        this.$stringRes = i;
        this.this$0 = inCallBannerViewModelV2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InCallBannerViewModelV2$onVideoUpgradeRequestFailed$1(this.this$0, r5, this.$stringRes);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass720 r2 = new AnonymousClass720(C122636Rd.A0L, C72453Mb.A0q(this.$stringRes), (AnonymousClass4ZN) null, 0);
            ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
            AnonymousClass7C7 A02 = r2.A02();
            this.label = 1;
            if (A03.A02(A02, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$onVideoUpgradeRequestFailed$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

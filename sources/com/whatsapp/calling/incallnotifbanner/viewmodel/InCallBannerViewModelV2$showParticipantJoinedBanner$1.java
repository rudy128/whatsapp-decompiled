package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6p5;
import X.AnonymousClass7C7;
import X.C148027gm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$showParticipantJoinedBanner$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$showParticipantJoinedBanner$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isVideoCall;
    public final /* synthetic */ List $userJids;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$showParticipantJoinedBanner$1(InCallBannerViewModelV2 inCallBannerViewModelV2, List list, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = inCallBannerViewModelV2;
        this.$userJids = list;
        this.$isVideoCall = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InCallBannerViewModelV2$showParticipantJoinedBanner$1(this.this$0, this.$userJids, r6, this.$isVideoCall);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
            AnonymousClass6p5 r5 = (AnonymousClass6p5) this.this$0.A09.get();
            List list = this.$userJids;
            int i2 = 2131102903;
            if (this.$isVideoCall) {
                i2 = 2131102073;
            }
            AnonymousClass7C7 A01 = r5.A01(list, new C148027gm(this.this$0, 2), i2);
            this.label = 1;
            if (A03.A02(A01, this) == r8) {
                return r8;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$showParticipantJoinedBanner$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

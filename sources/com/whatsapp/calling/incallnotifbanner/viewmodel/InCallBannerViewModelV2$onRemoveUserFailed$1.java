package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7C7;
import X.C132276mW;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onRemoveUserFailed$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {327}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$onRemoveUserFailed$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isRemoveAndBlock;
    public final /* synthetic */ boolean $isVideoEnabled;
    public final /* synthetic */ UserJid $removeeJid;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onRemoveUserFailed$1(InCallBannerViewModelV2 inCallBannerViewModelV2, UserJid userJid, C30391dr r4, boolean z, boolean z2) {
        super(2, r4);
        this.this$0 = inCallBannerViewModelV2;
        this.$removeeJid = userJid;
        this.$isVideoEnabled = z;
        this.$isRemoveAndBlock = z2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new InCallBannerViewModelV2$onRemoveUserFailed$1(this.this$0, this.$removeeJid, r8, this.$isVideoEnabled, this.$isRemoveAndBlock);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
            AnonymousClass7C7 A00 = ((C132276mW) this.this$0.A0D.get()).A00(this.$removeeJid, this.$isVideoEnabled, this.$isRemoveAndBlock);
            this.label = 1;
            if (A03.A02(A00, this) == r6) {
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
        return ((InCallBannerViewModelV2$onRemoveUserFailed$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

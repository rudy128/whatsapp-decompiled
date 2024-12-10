package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass7C7;
import X.C131886lp;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C40811vJ;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onScreenShareStateChanged$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$onScreenShareStateChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isStarted;
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onScreenShareStateChanged$1(InCallBannerViewModelV2 inCallBannerViewModelV2, UserJid userJid, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = inCallBannerViewModelV2;
        this.$jid = userJid;
        this.$isStarted = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InCallBannerViewModelV2$onScreenShareStateChanged$1(this.this$0, this.$jid, r6, this.$isStarted);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (!C40811vJ.A0K((AnonymousClass11S) this.this$0.A05.get(), this.$jid)) {
                AnonymousClass7C7 A00 = ((C131886lp) this.this$0.A0A.get()).A00(((AnonymousClass1M9) this.this$0.A04.get()).A0H(this.$jid), this.$isStarted);
                if (A00 == null) {
                    Log.e("InCallBannerViewModel/onScreenShareStateChanged view state is null");
                } else {
                    ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
                    this.label = 1;
                    if (A03.A02(A00, this) == r3) {
                        return r3;
                    }
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$onScreenShareStateChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

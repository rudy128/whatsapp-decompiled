package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C133476op;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86534Sa;
import X.C90034dQ;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$maybeShowCallOnHold$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {523, 526}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$maybeShowCallOnHold$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C86534Sa $callStateModel;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$maybeShowCallOnHold$1(C86534Sa r2, InCallBannerViewModelV2 inCallBannerViewModelV2, C30391dr r4) {
        super(2, r4);
        this.this$0 = inCallBannerViewModelV2;
        this.$callStateModel = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InCallBannerViewModelV2$maybeShowCallOnHold$1(this.$callStateModel, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object A04;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            InCallBannerViewModelV2 inCallBannerViewModelV2 = this.this$0;
            A99 a99 = inCallBannerViewModelV2.A01;
            AnonymousClass7C7 A00 = ((C133476op) this.this$0.A03.get()).A00(new C90034dQ(inCallBannerViewModelV2, 26), this.$callStateModel, a99);
            if (A00 != null) {
                ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
                this.label = 1;
                A04 = A03.A02(A00, this);
            } else {
                InCallBannerViewModelV2 inCallBannerViewModelV22 = this.this$0;
                C122636Rd r0 = C122636Rd.A05;
                this.label = 2;
                A04 = InCallBannerViewModelV2.A04(r0, inCallBannerViewModelV22, this);
            }
            if (A04 == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$maybeShowCallOnHold$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

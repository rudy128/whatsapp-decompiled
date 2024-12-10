package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZN;
import X.AnonymousClass6IR;
import X.AnonymousClass720;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C1402670q;
import X.C24921Me;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72473Md;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onRemovingUser$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {316}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$onRemovingUser$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isVideoEnabled;
    public final /* synthetic */ boolean $shouldBlock;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onRemovingUser$1(InCallBannerViewModelV2 inCallBannerViewModelV2, UserJid userJid, C30391dr r4, boolean z, boolean z2) {
        super(2, r4);
        this.this$0 = inCallBannerViewModelV2;
        this.$userJid = userJid;
        this.$shouldBlock = z;
        this.$isVideoEnabled = z2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new InCallBannerViewModelV2$onRemovingUser$1(this.this$0, this.$userJid, r8, this.$shouldBlock, this.$isVideoEnabled);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E7 A0H = ((AnonymousClass1M9) this.this$0.A04.get()).A0H(this.$userJid);
            if (this.$shouldBlock) {
                i = 2131887672;
                i2 = 2131233217;
            } else {
                i = 2131887681;
                i2 = 2131233396;
                if (C72473Md.A1Z(this.this$0.A0H)) {
                    i2 = 2131233179;
                }
            }
            C122636Rd r7 = C122636Rd.A0I;
            AnonymousClass6IR A02 = C1402670q.A02(new Object[]{((C24921Me) this.this$0.A0G.get()).A0I(A0H)}, i);
            int i4 = 2131102903;
            if (this.$isVideoEnabled) {
                i4 = 2131102073;
            }
            AnonymousClass720 r2 = new AnonymousClass720(r7, A02, (AnonymousClass4ZN) null, i4);
            AnonymousClass720.A01(r2, i2, 2131102055);
            ActionFeedbackPriorityQueue A03 = InCallBannerViewModelV2.A03(this.this$0);
            AnonymousClass7C7 A022 = r2.A02();
            this.label = 1;
            if (A03.A02(A022, this) == r4) {
                return r4;
            }
        } else if (i3 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$onRemovingUser$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

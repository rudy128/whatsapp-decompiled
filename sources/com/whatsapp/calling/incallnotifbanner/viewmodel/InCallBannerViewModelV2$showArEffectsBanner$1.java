package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZN;
import X.AnonymousClass720;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.view.View;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$showArEffectsBanner$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {359}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$showArEffectsBanner$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ View.OnClickListener $buttonOnClick;
    public final /* synthetic */ AnonymousClass4ZN $buttonStringProvider;
    public final /* synthetic */ boolean $isPersistent;
    public final /* synthetic */ AnonymousClass4ZN $stringProvider;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$showArEffectsBanner$1(View.OnClickListener onClickListener, InCallBannerViewModelV2 inCallBannerViewModelV2, AnonymousClass4ZN r4, AnonymousClass4ZN r5, C30391dr r6, boolean z) {
        super(2, r6);
        this.$isPersistent = z;
        this.$stringProvider = r4;
        this.$buttonStringProvider = r5;
        this.this$0 = inCallBannerViewModelV2;
        this.$buttonOnClick = onClickListener;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        boolean z = this.$isPersistent;
        AnonymousClass4ZN r3 = this.$stringProvider;
        AnonymousClass4ZN r4 = this.$buttonStringProvider;
        return new InCallBannerViewModelV2$showArEffectsBanner$1(this.$buttonOnClick, this.this$0, r3, r4, r9, z);
    }

    public final Object invokeSuspend(Object obj) {
        C122636Rd r4;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (this.$isPersistent) {
                r4 = C122636Rd.A03;
            } else {
                r4 = C122636Rd.A02;
            }
            AnonymousClass720 r2 = new AnonymousClass720(r4, this.$stringProvider, (AnonymousClass4ZN) null, 0);
            AnonymousClass4ZN r0 = this.$stringProvider;
            C18070vi.A0d(r0, 0);
            r2.A03 = r0;
            AnonymousClass4ZN r1 = this.$buttonStringProvider;
            if (r1 != null) {
                r2.A03(this.$buttonOnClick);
                r2.A04 = r1;
            }
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
        return ((InCallBannerViewModelV2$showArEffectsBanner$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

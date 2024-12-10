package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1VE;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass6IR;
import X.AnonymousClass720;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72473Md;
import X.C90034dQ;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onHighDataUsageDetected$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
public final class InCallBannerViewModelV2$onHighDataUsageDetected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isVideo;
    public int label;
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallBannerViewModelV2$onHighDataUsageDetected$1(InCallBannerViewModelV2 inCallBannerViewModelV2, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = inCallBannerViewModelV2;
        this.$isVideo = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InCallBannerViewModelV2$onHighDataUsageDetected$1(this.this$0, r5, this.$isVideo);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int i2 = AnonymousClass1VE.A00((AnonymousClass1VE) this.this$0.A0F.get()).getInt("high_data_usage_banner_shown_count", 0);
            C18020vd A0P = C17880vN.A0P(this.this$0.A02);
            C18040vf r6 = C18040vf.A02;
            int A00 = C18020vd.A00(r6, A0P, 4043);
            if (i2 < A00) {
                AnonymousClass1VE r0 = (AnonymousClass1VE) this.this$0.A0F.get();
                C17880vN.A1C(AnonymousClass3MZ.A08(r0), "high_data_usage_banner_shown_count", AnonymousClass1VE.A00(r0).getInt("high_data_usage_banner_shown_count", 0) + 1);
                C122636Rd r7 = C122636Rd.A07;
                AnonymousClass6IR A0t = AnonymousClass3MX.A0t(2131891220);
                Object copyOf = Arrays.copyOf(new Object[0], 0);
                C18070vi.A0d(copyOf, 2);
                AnonymousClass720 A03 = InCallBannerViewModel.A03(r7, A0t, new AnonymousClass6IR(new Object[]{copyOf}, 2131891218), this.$isVideo);
                A03.A05 = new Long((long) C18020vd.A00(r6, C17880vN.A0P(this.this$0.A02), 4183));
                InCallBannerViewModelV2 inCallBannerViewModelV2 = this.this$0;
                A03.A03(new C90034dQ(inCallBannerViewModelV2, 27));
                if (C72473Md.A1Z(inCallBannerViewModelV2.A0H)) {
                    A03.A04 = AnonymousClass3MX.A0t(2131891219);
                }
                ActionFeedbackPriorityQueue A032 = InCallBannerViewModelV2.A03(this.this$0);
                AnonymousClass7C7 A02 = A03.A02();
                this.label = 1;
                if (A032.A02(A02, this) == obj2) {
                    return obj2;
                }
            } else if (A00 == 0) {
                C17880vN.A1B(AnonymousClass3MZ.A08((AnonymousClass1VE) this.this$0.A0F.get()), "high_data_usage_banner_shown_count");
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InCallBannerViewModelV2$onHighDataUsageDetected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

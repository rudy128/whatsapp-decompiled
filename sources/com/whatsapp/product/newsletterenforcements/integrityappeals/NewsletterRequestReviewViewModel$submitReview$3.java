package com.whatsapp.product.newsletterenforcements.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass441;
import X.AnonymousClass45K;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99714tL;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestReviewViewModel$submitReview$3", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitReview$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $networkCall;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitReview$3(NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.$networkCall = r4;
        this.this$0 = newsletterRequestReviewViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new NewsletterRequestReviewViewModel$submitReview$3(this.this$0, r5, this.$networkCall);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                C22821Di r0 = this.$networkCall;
                this.label = 1;
                obj = r0.invoke(this);
                if (obj == r2) {
                    return r2;
                }
            } catch (C99714tL e) {
                boolean z = e instanceof AnonymousClass441;
                AnonymousClass1DT r22 = this.this$0.A00;
                int i2 = 2131896261;
                if (z) {
                    i2 = 2131888732;
                }
                r22.A0E(new AnonymousClass45K(i2));
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A00.A0E(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterRequestReviewViewModel$submitReview$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

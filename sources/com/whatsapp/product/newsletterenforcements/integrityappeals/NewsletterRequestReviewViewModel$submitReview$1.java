package com.whatsapp.product.newsletterenforcements.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass45M;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C89364cL;
import X.C89494cY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestReviewViewModel$submitReview$1", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitReview$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C89364cL $appealRequest;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitReview$1(C89364cL r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$appealRequest = r2;
        this.$reason = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterRequestReviewViewModel$submitReview$1(this.$appealRequest, this.this$0, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A00.A0E(AnonymousClass45M.A00);
            NewsletterRequestReviewViewModel newsletterRequestReviewViewModel = this.this$0;
            C89364cL r0 = this.$appealRequest;
            C29681ch r5 = r0.A00;
            C89494cY r6 = r0.A01;
            String str = this.$reason;
            this.label = 1;
            if (C30451dy.A00(this, newsletterRequestReviewViewModel.A02, new NewsletterRequestReviewViewModel$submitReview$3(newsletterRequestReviewViewModel, (C30391dr) null, new NewsletterRequestReviewViewModel$createAppeal$2(r5, r6, newsletterRequestReviewViewModel, str, (C30391dr) null))) == r3) {
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
        return ((NewsletterRequestReviewViewModel$submitReview$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

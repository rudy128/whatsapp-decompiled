package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C32991i5;
import X.C86444Rq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$hideChannelAlertsBanner$2", f = "NewsletterAlertsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsViewModel$hideChannelAlertsBanner$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ NewsletterAlertsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$hideChannelAlertsBanner$2(NewsletterAlertsViewModel newsletterAlertsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = newsletterAlertsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterAlertsViewModel$hideChannelAlertsBanner$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterAlertsViewModel$hideChannelAlertsBanner$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            NewsletterAlertsViewModel newsletterAlertsViewModel = this.this$0;
            C86444Rq r0 = newsletterAlertsViewModel.A02;
            ((C32991i5) r0.A01.get()).A08(newsletterAlertsViewModel.A01, 0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}

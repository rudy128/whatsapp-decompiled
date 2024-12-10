package X;

import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel", f = "NewsletterAlertsViewModel.kt", i = {0, 1, 1, 2}, l = {77, 79, 83}, m = "fetchNewsletterEnforcementsFromServer", n = {"this", "this", "newsletterEnforcements", "newsletterEnforcements"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* renamed from: X.4uw  reason: invalid class name and case insensitive filesystem */
public final class C100704uw extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewsletterAlertsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100704uw(NewsletterAlertsViewModel newsletterAlertsViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = newsletterAlertsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NewsletterAlertsViewModel.A00(this.this$0, this);
    }
}

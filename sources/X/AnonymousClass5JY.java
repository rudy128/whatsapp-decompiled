package X;

import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel;

/* renamed from: X.5JY  reason: invalid class name */
public final class AnonymousClass5JY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ NewsletterAlertsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5JY(NewsletterAlertsActivity newsletterAlertsActivity) {
        super(0);
        this.this$0 = newsletterAlertsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterAlertsActivity newsletterAlertsActivity = this.this$0;
        AnonymousClass5YE r4 = newsletterAlertsActivity.A03;
        if (r4 != null) {
            C29681ch A0o = AnonymousClass3MX.A0o(newsletterAlertsActivity.A0B);
            C18070vi.A0d(A0o, 1);
            return AnonymousClass4WS.A00(new AnonymousClass4WS(), NewsletterAlertsViewModel.class, new AnonymousClass5V0(A0o, r4));
        }
        C18070vi.A11("newsletterAlertsViewModelFactory");
        throw null;
    }
}

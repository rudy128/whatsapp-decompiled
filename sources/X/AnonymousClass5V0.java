package X;

import com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel;

/* renamed from: X.5V0  reason: invalid class name */
public final class AnonymousClass5V0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass5YE $assistedFactory;
    public final /* synthetic */ C29681ch $newsletterJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5V0(C29681ch r2, AnonymousClass5YE r3) {
        super(1);
        this.$assistedFactory = r3;
        this.$newsletterJid = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5YE r0 = this.$assistedFactory;
        C29681ch r2 = this.$newsletterJid;
        AnonymousClass10E r1 = ((C97194p4) r0).A00.A01;
        AnonymousClass4NT r4 = (AnonymousClass4NT) r1.A7G.get();
        C86274Qz r5 = (C86274Qz) r1.A7O.get();
        return new NewsletterAlertsViewModel(r2, (NewsletterEnforcementsClient) r1.A7E.get(), r4, r5, (C86444Rq) r1.A7A.get(), AnonymousClass3MZ.A1B(r1));
    }
}

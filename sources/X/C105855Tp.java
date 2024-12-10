package X;

import com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestCopyrightReviewActivity;

/* renamed from: X.5Tp  reason: invalid class name and case insensitive filesystem */
public final class C105855Tp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterRequestCopyrightReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105855Tp(NewsletterRequestCopyrightReviewActivity newsletterRequestCopyrightReviewActivity) {
        super(1);
        this.this$0 = newsletterRequestCopyrightReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C83364Ev r5 = (C83364Ev) obj;
        if (r5 instanceof AnonymousClass45L) {
            this.this$0.A05.A04();
            this.this$0.A05.A08(2131892794, 0);
            NewsletterRequestCopyrightReviewActivity newsletterRequestCopyrightReviewActivity = this.this$0;
            C89494cY r2 = ((AnonymousClass45L) r5).A00;
            AnonymousClass00H r0 = newsletterRequestCopyrightReviewActivity.A00;
            if (r0 != null) {
                newsletterRequestCopyrightReviewActivity.startActivity(((AnonymousClass4XC) r0.get()).A01(newsletterRequestCopyrightReviewActivity, ((C89364cL) newsletterRequestCopyrightReviewActivity.A03.getValue()).A00, r2));
                newsletterRequestCopyrightReviewActivity.finish();
            } else {
                C18070vi.A11("newsletterRequestReviewIntentUtils");
                throw null;
            }
        } else if (r5 instanceof AnonymousClass45K) {
            this.this$0.A05.A04();
            this.this$0.A05.A08(((AnonymousClass45K) r5).A00, 0);
        } else if (C18070vi.A18(r5, AnonymousClass45M.A00)) {
            this.this$0.A05.A07(0, 2131892787);
        }
        return C27621Wu.A00;
    }
}

package X;

import com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestReviewSelectReasonActivity;

/* renamed from: X.5Tq  reason: invalid class name and case insensitive filesystem */
public final class C105865Tq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterRequestReviewSelectReasonActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105865Tq(NewsletterRequestReviewSelectReasonActivity newsletterRequestReviewSelectReasonActivity) {
        super(1);
        this.this$0 = newsletterRequestReviewSelectReasonActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C83364Ev r5 = (C83364Ev) obj;
        if (r5 instanceof AnonymousClass45L) {
            this.this$0.A05.A04();
            this.this$0.A05.A08(2131892794, 0);
            NewsletterRequestReviewSelectReasonActivity newsletterRequestReviewSelectReasonActivity = this.this$0;
            C89494cY r2 = ((AnonymousClass45L) r5).A00;
            AnonymousClass00H r0 = newsletterRequestReviewSelectReasonActivity.A00;
            if (r0 != null) {
                newsletterRequestReviewSelectReasonActivity.startActivity(((AnonymousClass4XC) r0.get()).A01(newsletterRequestReviewSelectReasonActivity, ((C89364cL) newsletterRequestReviewSelectReasonActivity.A03.getValue()).A00, r2));
                newsletterRequestReviewSelectReasonActivity.finish();
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

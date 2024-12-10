package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment;

/* renamed from: X.5Jd  reason: invalid class name and case insensitive filesystem */
public final class C103135Jd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103135Jd(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(0);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable;
        boolean z = !(this.this$0.A0B.getValue() instanceof AnonymousClass442);
        boolean z2 = !(this.this$0.A0B.getValue() instanceof AnonymousClass442);
        C89494cY r1 = (C89494cY) this.this$0.A0B.getValue();
        C18070vi.A0d(r1, 1);
        if (r1 instanceof AnonymousClass446) {
            parcelable = AnonymousClass45R.A00;
        } else if (r1 instanceof AnonymousClass444) {
            parcelable = new AnonymousClass45U(((AnonymousClass444) r1).A04);
        } else if ((r1 instanceof AnonymousClass443) || (r1 instanceof AnonymousClass445)) {
            parcelable = AnonymousClass45T.A00;
        } else if (r1 instanceof AnonymousClass442) {
            parcelable = AnonymousClass45S.A00;
        } else {
            throw AnonymousClass3MW.A14();
        }
        NewsletterGuidelinesFragment newsletterGuidelinesFragment = new NewsletterGuidelinesFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("newsletter-enforcement", parcelable);
        A0D.putBoolean("show-what-this-means-section", z);
        A0D.putBoolean("show-what-you-can-do-section", z2);
        A0D.putBoolean("show-what-you-need-to-know-section", true);
        newsletterGuidelinesFragment.A1R(A0D);
        return newsletterGuidelinesFragment;
    }
}

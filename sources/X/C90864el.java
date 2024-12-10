package X;

import android.widget.CompoundButton;
import com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4el  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90864el implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ NewsletterUserReportsReviewSelectReasonFragment A00;
    public final /* synthetic */ WDSButton A01;
    public final /* synthetic */ String A02;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        WDSButton wDSButton = this.A01;
        NewsletterUserReportsReviewSelectReasonFragment newsletterUserReportsReviewSelectReasonFragment = this.A00;
        String str = this.A02;
        C18070vi.A0d(str, 2);
        if (z) {
            AnonymousClass3Ma.A1G(wDSButton, newsletterUserReportsReviewSelectReasonFragment, str, 21);
        }
    }

    public /* synthetic */ C90864el(NewsletterUserReportsReviewSelectReasonFragment newsletterUserReportsReviewSelectReasonFragment, WDSButton wDSButton, String str) {
        this.A01 = wDSButton;
        this.A00 = newsletterUserReportsReviewSelectReasonFragment;
        this.A02 = str;
    }
}

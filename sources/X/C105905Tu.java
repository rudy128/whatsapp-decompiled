package X;

import android.os.Bundle;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity;
import com.whatsapp.product.newsletterenforcements.userreports.detail.Hilt_NewsletterUserReportDetailFragment;
import com.whatsapp.product.newsletterenforcements.userreports.list.Hilt_NewsletterUserReportsListFragment;
import com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewFragment;
import com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment;

/* renamed from: X.5Tu  reason: invalid class name and case insensitive filesystem */
public final class C105905Tu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterUserReportsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105905Tu(NewsletterUserReportsActivity newsletterUserReportsActivity) {
        super(1);
        this.this$0 = newsletterUserReportsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1KB r1;
        int i;
        AnonymousClass5YH r8 = (AnonymousClass5YH) obj;
        NewsletterUserReportsActivity newsletterUserReportsActivity = this.this$0;
        C18070vi.A0b(r8);
        C34001jj A0H = AnonymousClass3Ma.A0H(newsletterUserReportsActivity);
        C72473Md.A19(A0H);
        if (r8 instanceof C97264pB) {
            String str = ((C97264pB) r8).A00;
            Hilt_NewsletterUserReportDetailFragment hilt_NewsletterUserReportDetailFragment = new Hilt_NewsletterUserReportDetailFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("arg-report-id", str);
            hilt_NewsletterUserReportDetailFragment.A1R(A0D);
            A0H.A09(hilt_NewsletterUserReportDetailFragment, 2131429504);
            A0H.A0H("NewsletterUserReportDetailFragment");
        } else {
            if (r8 instanceof C97294pE) {
                A0H.A09(new Hilt_NewsletterUserReportsListFragment(), 2131429504);
            } else if (r8 instanceof C97274pC) {
                String str2 = ((C97274pC) r8).A00;
                NewsletterUserReportsReviewFragment newsletterUserReportsReviewFragment = new NewsletterUserReportsReviewFragment();
                Bundle A0D2 = C17880vN.A0D();
                A0D2.putString("arg-report-id", str2);
                newsletterUserReportsReviewFragment.A1R(A0D2);
                A0H.A09(newsletterUserReportsReviewFragment, 2131429504);
                A0H.A0H("NewsletterUserReportsReviewFragment");
            } else if (r8 instanceof C97284pD) {
                newsletterUserReportsActivity.getSupportFragmentManager().A0v("NewsletterUserReportDetailFragment", 0);
                String str3 = ((C97284pD) r8).A00;
                NewsletterUserReportsReviewSelectReasonFragment newsletterUserReportsReviewSelectReasonFragment = new NewsletterUserReportsReviewSelectReasonFragment();
                Bundle A0D3 = C17880vN.A0D();
                A0D3.putString("arg-report-id", str3);
                newsletterUserReportsReviewSelectReasonFragment.A1R(A0D3);
                A0H.A09(newsletterUserReportsReviewSelectReasonFragment, 2131429504);
                A0H.A0H("NewsletterUserReportsReviewSelectReasonFragment");
            } else if (r8 instanceof C97314pG) {
                newsletterUserReportsActivity.A05.A04();
                newsletterUserReportsActivity.A05.A07(0, 2131892833);
            } else {
                if (r8 instanceof C97324pH) {
                    newsletterUserReportsActivity.A05.A04();
                    r1 = newsletterUserReportsActivity.A05;
                    i = 2131892844;
                } else if (r8 instanceof C97304pF) {
                    newsletterUserReportsActivity.A05.A04();
                    r1 = newsletterUserReportsActivity.A05;
                    i = 2131896261;
                }
                r1.A08(i, 0);
                newsletterUserReportsActivity.getSupportFragmentManager().A0v("NewsletterUserReportDetailFragment", 0);
            }
            A0H.A01();
            return C27621Wu.A00;
        }
        A0H.A0G = true;
        A0H.A01();
        return C27621Wu.A00;
    }
}

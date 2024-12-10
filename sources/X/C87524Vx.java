package X;

import android.os.Bundle;
import com.whatsapp.product.newsletterenforcements.newsletterimpact.NewsletterImpactFragment;

/* renamed from: X.4Vx  reason: invalid class name and case insensitive filesystem */
public abstract class C87524Vx {
    public static final NewsletterImpactFragment A00(C89494cY r3) {
        C18070vi.A0d(r3, 0);
        NewsletterImpactFragment newsletterImpactFragment = new NewsletterImpactFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("newsletter-enforcement", r3);
        newsletterImpactFragment.A1R(A0D);
        return newsletterImpactFragment;
    }

    public static void A01(C34001jj r2, C89494cY r3) {
        r2.A08(A00(r3), 2131433017);
        r2.A01();
    }
}

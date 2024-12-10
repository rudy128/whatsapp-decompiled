package X;

import android.widget.ImageView;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.5Tj  reason: invalid class name and case insensitive filesystem */
public final class C105795Tj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105795Tj(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(1);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1E7 r4 = (AnonymousClass1E7) obj;
        NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity = this.this$0;
        C27201Vd r1 = newsletterAppealsOutcomeActivity.A00;
        if (r1 != null) {
            C37451pZ A06 = r1.A06(newsletterAppealsOutcomeActivity, "newsletter-appeals-outcome-activity");
            ImageView A0H = AnonymousClass3MW.A0H(this.this$0.A00, 2131434167);
            if (A0H != null) {
                A06.A07(A0H, r4);
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }
}

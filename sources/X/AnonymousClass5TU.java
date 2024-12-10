package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.List;

/* renamed from: X.5TU  reason: invalid class name */
public final class AnonymousClass5TU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TU(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C18070vi.A0b(list);
        int A00 = C18020vd.A00(C18040vf.A02, newsletterInfoActivity.A0E, 7560);
        if (A00 < 1) {
            A00 = 1;
        }
        int i = 0;
        boolean z = false;
        if (list.size() >= A00) {
            z = true;
        }
        View A0A = AnonymousClass3MW.A0A(newsletterInfoActivity.A1P);
        if (z) {
            AnonymousClass7KN r0 = newsletterInfoActivity.A0l;
            if (r0 != null) {
                r0.A02(list);
            }
        } else {
            i = 8;
        }
        A0A.setVisibility(i);
        ((ShimmerFrameLayout) newsletterInfoActivity.A1O.getValue()).A01();
        if (!newsletterInfoActivity.A1A) {
            NewsletterInfoActivity.A1K(newsletterInfoActivity, z);
            newsletterInfoActivity.A1A = true;
        }
        return C27621Wu.A00;
    }
}

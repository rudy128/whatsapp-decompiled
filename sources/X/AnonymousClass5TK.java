package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TK  reason: invalid class name */
public final class AnonymousClass5TK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TK(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C46162Dk A0y;
        C86924Tp r10 = (C86924Tp) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        if (r10 != null) {
            C46162Dk r3 = r10.A00;
            C86924Tp r0 = newsletterInfoActivity.A0i;
            if (r0 != null) {
                C46162Dk r4 = r0.A00;
                newsletterInfoActivity.A0i = r10;
                if (!(C18070vi.A18(r4.A0T, r3.A0T) && r4.A0G == r3.A0G && r4.A05 == r3.A05 && r4.A06 == r3.A06)) {
                    C87874Xk r1 = newsletterInfoActivity.A0T;
                    if (r1 != null) {
                        AnonymousClass1E7 r02 = newsletterInfoActivity.A0c;
                        if (r02 == null) {
                            C18070vi.A11("contact");
                            throw null;
                        }
                        r1.A02(r02);
                    }
                    if (NewsletterInfoActivity.A1S(newsletterInfoActivity)) {
                        AnonymousClass3VS r12 = newsletterInfoActivity.A0f;
                        if (r12 != null) {
                            r12.A0T(AnonymousClass9IV.SHORT);
                        }
                        NewsletterInfoActivity.A1D(newsletterInfoActivity);
                    }
                }
                if (!C18070vi.A18(r4.A0Q, r3.A0Q)) {
                    NewsletterInfoActivity.A1F(newsletterInfoActivity);
                }
                if (!(r4.A06 == r3.A06 || (A0y = NewsletterInfoActivity.A0y(newsletterInfoActivity)) == null)) {
                    NewsletterInfoActivity.A19(newsletterInfoActivity);
                    NewsletterInfoActivity.A1L(newsletterInfoActivity, AnonymousClass000.A1Z(A0y.A02, C179509Ig.SUBSCRIBED));
                }
                if (!(r3.A0B == r4.A0B && r3.A02 == r4.A02)) {
                    if (r4.A02 != r3.A02) {
                        NewsletterInfoActivity.A18(newsletterInfoActivity);
                    }
                    if (r4.A0B != r3.A0B) {
                        NewsletterInfoActivity.A1P(newsletterInfoActivity, false, false);
                    }
                }
                return C27621Wu.A00;
            }
        }
        newsletterInfoActivity.finish();
        return C27621Wu.A00;
    }
}

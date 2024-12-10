package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TP  reason: invalid class name */
public final class AnonymousClass5TP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TP(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C85174Mj r7 = (C85174Mj) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C18070vi.A0b(r7);
        C46162Dk A0y = NewsletterInfoActivity.A0y(newsletterInfoActivity);
        if (A0y != null) {
            if (newsletterInfoActivity.A02.A0O(r7.A01)) {
                C179509Ig r1 = r7.A00;
                A0y.A02 = r1;
                C76823oU r0 = newsletterInfoActivity.A0g;
                if (r0 != null) {
                    r0.A0X(r1);
                    AnonymousClass00H r02 = newsletterInfoActivity.A13;
                    if (r02 != null) {
                        ((C35681md) C18070vi.A0E(r02)).A05(newsletterInfoActivity.A4m());
                    } else {
                        C18070vi.A11("newsletterManager");
                        throw null;
                    }
                }
                C18070vi.A11("newsletterInfoViewModel");
                throw null;
            }
            C179509Ig r12 = A0y.A02;
            if (r12 == C179509Ig.ADMIN || r12 == C179509Ig.OWNER) {
                AnonymousClass3VS r13 = newsletterInfoActivity.A0f;
                if (r13 != null) {
                    r13.A0T(AnonymousClass9IV.SHORT);
                }
                AnonymousClass3VS r14 = newsletterInfoActivity.A0f;
                if (r14 != null) {
                    r14.A0T(AnonymousClass9IV.FULL);
                }
            }
            if (A0y.A0Q()) {
                C76823oU r3 = newsletterInfoActivity.A0g;
                if (r3 != null) {
                    r3.A0Y(newsletterInfoActivity.A4m(), false, true, false);
                }
                C18070vi.A11("newsletterInfoViewModel");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}

package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TW  reason: invalid class name */
public final class AnonymousClass5TW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TW(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C76823oU r1;
        C179509Ig r0;
        C46162Dk A0y;
        C86954Ts r6 = (C86954Ts) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C18070vi.A0b(r6);
        newsletterInfoActivity.CEx();
        int intValue = r6.A01.intValue();
        if (intValue == 3) {
            NewsletterInfoActivity.A1L(newsletterInfoActivity, false);
            r1 = newsletterInfoActivity.A0g;
            if (r1 != null) {
                r0 = C179509Ig.GUEST;
                r1.A0X(r0);
            }
            C18070vi.A11("newsletterInfoViewModel");
            throw null;
        } else if (intValue == 2) {
            NewsletterInfoActivity.A1L(newsletterInfoActivity, true);
            r1 = newsletterInfoActivity.A0g;
            if (r1 != null) {
                r0 = C179509Ig.SUBSCRIBED;
                r1.A0X(r0);
            }
            C18070vi.A11("newsletterInfoViewModel");
            throw null;
        } else if ((intValue == 7 || intValue == 8) && (A0y = NewsletterInfoActivity.A0y(newsletterInfoActivity)) != null) {
            NewsletterInfoActivity.A19(newsletterInfoActivity);
            NewsletterInfoActivity.A1L(newsletterInfoActivity, AnonymousClass000.A1Z(A0y.A02, C179509Ig.SUBSCRIBED));
        }
        return C27621Wu.A00;
    }
}

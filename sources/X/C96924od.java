package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4od  reason: invalid class name and case insensitive filesystem */
public final class C96924od implements C108125bA {
    public final /* synthetic */ NewsletterInfoActivity A00;

    public C96924od(NewsletterInfoActivity newsletterInfoActivity) {
        this.A00 = newsletterInfoActivity;
    }

    public void C7U(List list) {
        NewsletterInfoActivity newsletterInfoActivity = this.A00;
        AnonymousClass3Ma.A1J(newsletterInfoActivity.A05, newsletterInfoActivity, 16);
    }

    public void Bt4(List list) {
        ArrayList<C821743o> A0s = C72463Mc.A0s(list);
        for (Object next : list) {
            if (next instanceof C821743o) {
                A0s.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A0s);
        for (C821743o r0 : A0s) {
            A0D.add(r0.A00);
        }
        NewsletterInfoActivity newsletterInfoActivity = this.A00;
        newsletterInfoActivity.A05.A0J(new C21458AkP(newsletterInfoActivity, A0D, 10));
    }
}

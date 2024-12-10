package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4og  reason: invalid class name and case insensitive filesystem */
public final class C96954og implements C108125bA {
    public final /* synthetic */ C46162Dk A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ NewsletterInfoActivity A02;
    public final /* synthetic */ boolean A03;

    public C96954og(C46162Dk r1, UserJid userJid, NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        this.A02 = newsletterInfoActivity;
        this.A01 = userJid;
        this.A03 = z;
        this.A00 = r1;
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
        NewsletterInfoActivity newsletterInfoActivity = this.A02;
        newsletterInfoActivity.A05.A0J(new C21435Ak2(newsletterInfoActivity, this.A01, A0D, 2));
    }

    public void C7U(List list) {
        ArrayList<C821843p> A0s = C72463Mc.A0s(list);
        for (Object next : list) {
            if (next instanceof C821843p) {
                A0s.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A0s);
        for (C821843p r0 : A0s) {
            A0D.add(r0.A01);
        }
        NewsletterInfoActivity newsletterInfoActivity = this.A02;
        newsletterInfoActivity.A05.A0J(new C21437Ak4(newsletterInfoActivity, this.A01, A0D, this.A00, 16, this.A03));
    }
}

package X;

import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4oe  reason: invalid class name and case insensitive filesystem */
public class C96934oe implements C108125bA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C96934oe(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void Bt4(List list) {
        AnonymousClass1KB r4;
        Runnable runnable;
        if (this.A00 != 0) {
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
            Object obj = ((Reference) this.A01).get();
            if (obj != null) {
                NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this.A02;
                r4 = newsletterRevokeAdminInviteSheet.A00;
                if (r4 != null) {
                    runnable = new C21435Ak2(newsletterRevokeAdminInviteSheet, A0D, obj, 18);
                }
                AnonymousClass3MW.A1C();
                throw null;
            }
            return;
        }
        NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this.A02;
        r4 = newsletterAcceptAdminInviteSheet.A00;
        if (r4 != null) {
            runnable = new C21356Ail(newsletterAcceptAdminInviteSheet, 48);
        }
        AnonymousClass3MW.A1C();
        throw null;
        r4.A0J(runnable);
    }

    public void C7U(List list) {
        if (this.A00 != 0) {
            Object obj = ((Reference) this.A01).get();
            if (obj != null) {
                NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this.A02;
                AnonymousClass1KB r2 = newsletterRevokeAdminInviteSheet.A00;
                if (r2 != null) {
                    r2.A0J(new C21458AkP(obj, newsletterRevokeAdminInviteSheet, 40));
                    return;
                }
            } else {
                return;
            }
        } else {
            NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this.A02;
            AnonymousClass1KB r3 = newsletterAcceptAdminInviteSheet.A00;
            if (r3 != null) {
                r3.A0J(new C21458AkP(newsletterAcceptAdminInviteSheet, this.A01, 39));
                return;
            }
        }
        AnonymousClass3MW.A1C();
        throw null;
    }
}

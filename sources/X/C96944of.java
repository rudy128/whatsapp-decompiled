package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4of  reason: invalid class name and case insensitive filesystem */
public class C96944of implements C108125bA {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C96944of(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public void Bt4(List list) {
        String A0K;
        AnonymousClass1KB r0;
        String str;
        int i;
        AnonymousClass3gf r8;
        List list2 = list;
        if (this.A00 != 0) {
            C18070vi.A0d(list, 0);
            AnonymousClass3gf r82 = (AnonymousClass3gf) this.A02;
            C18000vb r6 = r82.A0F;
            long size = (long) list.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass3MX.A1S(A1a, 0, (long) list.size());
            A0K = r6.A0K(A1a, 2131755013, size);
            C18070vi.A0X(A0K);
            r0 = r82.A05;
            str = this.A03;
            i = 7;
            r8 = r82;
        } else {
            C18070vi.A0d(list, 0);
            AnonymousClass1FU r83 = (AnonymousClass1FU) this.A02;
            C18000vb r4 = r83.A00;
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, 1, 0);
            A0K = r4.A0K(objArr, 2131755013, 1);
            C18070vi.A0X(A0K);
            r0 = r83.A05;
            str = this.A03;
            i = 6;
            r8 = r83;
        }
        r0.A0J(new C146597Pw(r8, list2, A0K, str, i));
    }

    public void C7U(List list) {
        List list2 = list;
        if (this.A00 != 0) {
            ArrayList<C821843p> A0s = C72463Mc.A0s(list2);
            for (Object next : list2) {
                if (next instanceof C821843p) {
                    A0s.add(next);
                }
            }
            HashMap A11 = C17880vN.A11();
            for (C821843p r0 : A0s) {
                A11.put(r0.A01, Long.valueOf(r0.A00));
            }
            InviteNewsletterAdminSelector inviteNewsletterAdminSelector = (InviteNewsletterAdminSelector) this.A02;
            AnonymousClass00H r02 = inviteNewsletterAdminSelector.A04;
            if (r02 != null) {
                String A0y = AnonymousClass3MW.A0y(inviteNewsletterAdminSelector.A0A);
                String str = this.A03;
                ((C57552jG) r02.get()).A00(inviteNewsletterAdminSelector, (C29681ch) this.A01, A0y, str, A11);
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next2 : list2) {
                    if (next2 instanceof C821743o) {
                        A13.add(next2);
                    }
                }
                if (AnonymousClass000.A1a(A13)) {
                    inviteNewsletterAdminSelector.A05.A0J(new C21462AkT(inviteNewsletterAdminSelector, A11, A13, A0s, str, 7));
                    return;
                } else {
                    C72453Mb.A16(inviteNewsletterAdminSelector, C17880vN.A0A().putExtra("extra_invitees_count", (long) A0s.size()));
                    return;
                }
            }
        } else {
            C18070vi.A0d(list2, 0);
            NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A02;
            C46162Dk A0y2 = NewsletterInfoActivity.A0y(newsletterInfoActivity);
            if (A0y2 != null) {
                HashMap A112 = C17880vN.A11();
                ArrayList<C821843p> A132 = AnonymousClass000.A13();
                for (Object next3 : list2) {
                    if (next3 instanceof C821843p) {
                        A132.add(next3);
                    }
                }
                for (C821843p r03 : A132) {
                    A112.put(r03.A01, Long.valueOf(r03.A00));
                }
                AnonymousClass00H r04 = newsletterInfoActivity.A0z;
                if (r04 != null) {
                    ((C57552jG) r04.get()).A00(newsletterInfoActivity, (C29681ch) this.A01, A0y2.A0T, this.A03, A112);
                    AnonymousClass3Ma.A1J(newsletterInfoActivity.A05, newsletterInfoActivity, 17);
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("newsletterAdminInvitationsUtils");
        throw null;
    }
}

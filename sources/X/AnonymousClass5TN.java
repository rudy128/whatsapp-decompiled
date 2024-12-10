package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.multiadmin.NewsletterInvitedAdminsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5TN  reason: invalid class name */
public final class AnonymousClass5TN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TN(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set set = (Set) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C18070vi.A0b(set);
        AnonymousClass3XK r5 = newsletterInfoActivity.A0k;
        if (r5 != null) {
            ArrayList A0E = C29351c6.A0E(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0E.add(new C821943q(C17880vN.A0O(it)));
            }
            r5.A0U(A0E);
        }
        if (set.isEmpty()) {
            View view = newsletterInfoActivity.A06;
            if (view != null) {
                view.setVisibility(8);
            }
            C18070vi.A11("invitesCard");
            throw null;
        }
        AnonymousClass3MW.A0I(newsletterInfoActivity, 2131427685).setText(newsletterInfoActivity.A00.A0L().format(Integer.valueOf(set.size())));
        View view2 = newsletterInfoActivity.A06;
        if (view2 != null) {
            view2.setVisibility(0);
            NewsletterInfoActivity.A1M(newsletterInfoActivity, false, true);
        }
        C18070vi.A11("invitesCard");
        throw null;
        AnonymousClass3VS r3 = newsletterInfoActivity.A0f;
        if (r3 != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                AnonymousClass1BI A0l = C72453Mb.A0l(it2);
                if (A0l != null) {
                    A13.add(A0l);
                }
            }
            Set A11 = C29431cG.A11(A13);
            AnonymousClass1DT r52 = r3.A05;
            List A10 = AnonymousClass3MW.A10(r52);
            if (A10 != null) {
                ArrayList<AnonymousClass43Q> A132 = AnonymousClass000.A13();
                for (Object next : A10) {
                    if (next instanceof AnonymousClass43Q) {
                        A132.add(next);
                    }
                }
                for (AnonymousClass43Q r0 : A132) {
                    AnonymousClass4NS r1 = r0.A00;
                    r1.A01 = C29431cG.A18(A11, r1.A00.A0J);
                }
            }
            AnonymousClass1DT r32 = r3.A04;
            List A102 = AnonymousClass3MW.A10(r32);
            if (A102 != null) {
                ArrayList<AnonymousClass43Q> A133 = AnonymousClass000.A13();
                for (Object next2 : A102) {
                    if (next2 instanceof AnonymousClass43Q) {
                        A133.add(next2);
                    }
                }
                for (AnonymousClass43Q r02 : A133) {
                    AnonymousClass4NS r12 = r02.A00;
                    r12.A01 = C29431cG.A18(A11, r12.A00.A0J);
                }
            }
            Object A06 = r52.A06();
            if (A06 != null) {
                r52.A0E(A06);
            }
            Object A062 = r32.A06();
            if (A062 != null) {
                r32.A0E(A062);
            }
        }
        Fragment A0Q = newsletterInfoActivity.getSupportFragmentManager().A0Q("NewsletterInvitedAdminsFragment");
        if (A0Q != null) {
            NewsletterInvitedAdminsFragment newsletterInvitedAdminsFragment = (NewsletterInvitedAdminsFragment) A0Q;
            ArrayList A0E2 = C29351c6.A0E(set);
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                A0E2.add(new C821943q(C17880vN.A0O(it3)));
            }
            AnonymousClass3XK r03 = newsletterInvitedAdminsFragment.A07;
            if (r03 == null) {
                C18070vi.A11("newsletterInvitedAdminsListAdapter");
                throw null;
            }
            r03.A0U(A0E2);
        }
        return C27621Wu.A00;
    }
}

package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3XA  reason: invalid class name */
public final class AnonymousClass3XA extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final C18030ve A01;

    public void Bmc(C42011xT r4, int i) {
        C18070vi.A0d(r4, 0);
        if (r4 instanceof AnonymousClass3YI) {
            Object obj = ((AnonymousClass4TH) this.A00.get(i)).A01;
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.community.membersuggestedgroups.SuggestionView.UiState");
            C87284Uz r1 = (C87284Uz) obj;
            C18070vi.A0d(r1, 0);
            ((AnonymousClass3YI) r4).A00.A07(r1);
        } else if (r4 instanceof C74273Ze) {
            Object obj2 = ((AnonymousClass4TH) this.A00.get(i)).A01;
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementAdapter.SuggestionsListData");
            AnonymousClass4TI r2 = (AnonymousClass4TI) obj2;
            ((C74273Ze) r4).A0B(r2.A01, Integer.valueOf(r2.A00));
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass3YI(new AnonymousClass3SG(AnonymousClass3MY.A05(viewGroup)));
        }
        if (i != 2) {
            return new C42011xT(viewGroup);
        }
        return C74273Ze.A00(viewGroup, this.A01);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        AnonymousClass4TH r0 = (AnonymousClass4TH) C29431cG.A0f(this.A00, i);
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public AnonymousClass3XA(C18030ve r2) {
        this.A01 = r2;
    }

    public long A0M(int i) {
        C87284Uz r1;
        if (getItemViewType(i) != 1) {
            return -1;
        }
        Object obj = ((AnonymousClass4TH) this.A00.get(i)).A01;
        if (!(obj instanceof C87284Uz) || (r1 = (C87284Uz) obj) == null) {
            return -1;
        }
        return (long) r1.A02.hashCode();
    }
}

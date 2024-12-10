package X;

import android.content.Context;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.framework.alerts.ui.AlertCardListFragment;

/* renamed from: X.4g3  reason: invalid class name and case insensitive filesystem */
public class C91664g3 implements C24051Ir {
    public final int A00;
    public final Object A01;

    public C91664g3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        String str;
        switch (this.A00) {
            case 0:
                Class cls2 = cls;
                C18070vi.A0d(cls2, 0);
                if (cls2.equals(BaseArEffectsViewModel.class)) {
                    C108785cI r0 = (C108785cI) this.A01;
                    AnonymousClass1J2 A002 = AnonymousClass3MW.A0N(r0).A00(r0.BN9());
                    C18070vi.A0z(A002, "null cannot be cast to non-null type T of com.whatsapp.areffects.viewmodel.ArEffectsHost.getArEffectsViewModelProviderFactory.<no name provided>.create");
                    return A002;
                }
                throw AnonymousClass000.A0k("The `ViewModelProvider.Factory` created via `getArEffectsViewModelProviderFactory` should only be used for `BaseArEffectsViewModel`.");
            case 1:
                AnonymousClass10E r1 = ((C40241uO) this.A01).A00.A02;
                C18030ve A8r = AnonymousClass10E.A8r(r1);
                AnonymousClass1KB A12 = AnonymousClass10E.A12(r1);
                AnonymousClass11S A17 = AnonymousClass10E.A17(r1);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
                AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r1);
                AnonymousClass1Q1 A0U = AnonymousClass3MY.A0U(r1);
                C24681Lg A0o = AnonymousClass3MZ.A0o(r1);
                C42211xo A0i = AnonymousClass3Ma.A0i(r1);
                AnonymousClass00H A003 = C000200d.A00(r1.A2N);
                C34511kb A0b = AnonymousClass3MZ.A0b(r1);
                AnonymousClass1NN A0e = AnonymousClass3Ma.A0e(r1);
                C25191Ng A0Y = AnonymousClass3MY.A0Y(r1);
                AnonymousClass3VJ r3 = new AnonymousClass3VJ(A12, A17, A0b, AnonymousClass10E.A4z(r1), AnonymousClass3Ma.A0S(r1), A0U, A0d, A0e, (AnonymousClass1R3) r1.A5f.get(), A0o, A8r, A0Y, (C39501tB) r1.A7s.get(), A0i, (C35201lp) r1.A5C.get(), AL1, A003);
                C98754rf.A00(r3.A0P, r3, 34);
                return r3;
            case 2:
                MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = (MemberSuggestedGroupsManagementActivity) this.A01;
                AnonymousClass4J6 r12 = memberSuggestedGroupsManagementActivity.A02;
                if (r12 == null) {
                    str = "memberSuggestedGroupsManagementViewModelFactory";
                    break;
                } else {
                    AnonymousClass1EC A0p = AnonymousClass3MX.A0p(memberSuggestedGroupsManagementActivity.A0E);
                    AnonymousClass10E r13 = r12.A00.A01;
                    C18600wl A1B = AnonymousClass3MZ.A1B(r13);
                    C34511kb A0b2 = AnonymousClass3MZ.A0b(r13);
                    AnonymousClass11E A0d2 = AnonymousClass3MZ.A0d(r13);
                    AnonymousClass1CJ A0d3 = AnonymousClass3Ma.A0d(r13);
                    AnonymousClass1R3 r10 = (AnonymousClass1R3) r13.A5f.get();
                    return new MemberSuggestedGroupsManagementViewModel(AnonymousClass10E.A17(r13), A0b2, (MemberSuggestedGroupsManager) r13.A6F.get(), A0d2, AnonymousClass10E.A4z(r13), A0d3, r10, AnonymousClass3MY.A0Y(r13), (C39501tB) r13.A7s.get(), A0p, A1B);
                }
            case 3:
                AlertCardListFragment alertCardListFragment = (AlertCardListFragment) this.A01;
                C74473bj r14 = alertCardListFragment.A04;
                AnonymousClass1QG r02 = alertCardListFragment.A00;
                if (r02 == null) {
                    str = "alertStorage";
                    break;
                } else {
                    Context A0A = C72483Me.A0A(r14);
                    try {
                        return new AnonymousClass3TK(r02);
                    } finally {
                        AnonymousClass12Q.A04();
                        AnonymousClass114.A02(A0A);
                    }
                }
            default:
                AnonymousClass10E r32 = ((C84444Jn) this.A01).A00.A01;
                return new AnonymousClass3VT((C175308yV) r32.A78.get(), (C95424mD) r32.A00.A3T.get(), (C35681md) r32.A7N.get());
        }
        C18070vi.A11(str);
        throw null;
    }

    public AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        if (this.A00 != 0) {
            return C72453Mb.A0a(this, cls);
        }
        C18070vi.A0d(cls, 0);
        return BG9(cls);
    }
}

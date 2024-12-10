package com.whatsapp.businessdirectory.view.fragment;

import X.A36;
import X.A5L;
import X.AAC;
import X.AEQ;
import X.AM7;
import X.APC;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass16K;
import X.AnonymousClass1DT;
import X.AnonymousClass1FL;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass8FJ;
import X.AnonymousClass8I1;
import X.AnonymousClass8IA;
import X.BAZ;
import X.C108365ba;
import X.C108945cZ;
import X.C169238ka;
import X.C173768vh;
import X.C173788vj;
import X.C17880vN;
import X.C17900vP;
import X.C185719d2;
import X.C190509l4;
import X.C192189nx;
import X.C20335AGr;
import X.C20531AOq;
import X.C21446AkD;
import X.C22552BCj;
import X.C23391Fw;
import X.C37361pP;
import X.C37801q9;
import X.C40751vD;
import X.C41731wy;
import X.C56492hY;
import X.C56502hZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Map;
import java.util.Set;

public class BusinessDirectoryContextualSearchFragment extends Hilt_BusinessDirectoryContextualSearchFragment implements C22552BCj, C108365ba, BAZ {
    public C56492hY A00;
    public C56502hZ A01;
    public C40751vD A02;
    public C192189nx A03;
    public AAC A04;
    public C173768vh A05;
    public APC A06;
    public BusinessDirectoryContextualSearchViewModel A07;
    public AnonymousClass1LU A08;
    public AnonymousClass1XN A09;
    public AnonymousClass8IA A0A;
    public AnonymousClass1L4 A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public C169238ka A0E;

    public void A1Q(Bundle bundle) {
        this.A0X = true;
        A00(this).A03 = this;
        Fragment A0Q = A1E().A0Q("filter-bottom-sheet");
        if (A0Q != null) {
            ((FilterBottomSheetDialogFragment) A0Q).A02 = this;
        }
        this.A06.A00();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0E = this.A00.A00((AnonymousClass16K) this.A0D.get());
        this.A07 = (BusinessDirectoryContextualSearchViewModel) AnonymousClass3MW.A0N(this).A00(BusinessDirectoryContextualSearchViewModel.class);
        C56502hZ r1 = this.A01;
        AnonymousClass1LU r6 = this.A08;
        APC A002 = r1.A00(this, this.A0E, this.A04, this, r6);
        this.A06 = A002;
        this.A03.A00(A002);
        Bundle bundle2 = this.A06;
        if (bundle2 != null && (bundle2.getParcelable("SEARCH_CONTEXT_CATEGORY") instanceof AEQ)) {
            AEQ aeq = (AEQ) this.A06.getParcelable("SEARCH_CONTEXT_CATEGORY");
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A07;
            C37361pP r3 = businessDirectoryContextualSearchViewModel.A0I;
            if (!(!r3.A03.containsKey("search_context_category"))) {
                aeq = (AEQ) r3.A02("search_context_category");
            }
            businessDirectoryContextualSearchViewModel.A02 = aeq;
            if (aeq != null) {
                businessDirectoryContextualSearchViewModel.A0R.A01 = C17900vP.A0I(aeq, new AEQ[1], 0);
            }
        }
    }

    public void A20(Bundle bundle) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A07;
        C37361pP r2 = businessDirectoryContextualSearchViewModel.A0I;
        r2.A04("saved_search_session_started", Boolean.valueOf(businessDirectoryContextualSearchViewModel.A05));
        r2.A04("saved_search_state", Integer.valueOf(businessDirectoryContextualSearchViewModel.A01));
        r2.A04("saved_search_query", BusinessDirectoryContextualSearchViewModel.A05(businessDirectoryContextualSearchViewModel));
        r2.A04("search_context_category", businessDirectoryContextualSearchViewModel.A02);
        businessDirectoryContextualSearchViewModel.A0R.A0A(r2);
        r2.A04("SEARCH_CONTEXT_CATEGORY_EXISTS", Boolean.valueOf(AnonymousClass000.A1W(businessDirectoryContextualSearchViewModel.A02)));
        r2.A04("saved_state_query_id", businessDirectoryContextualSearchViewModel.A0K.A00);
    }

    public void BL4() {
        this.A07.A0T.A00.A0H();
    }

    public void Bmp() {
        this.A07.A0U(62);
    }

    public void BtI() {
        this.A07.A0T.A04();
    }

    public void BxF() {
        C20531AOq aOq = this.A07.A0T;
        aOq.A05.A02(true);
        aOq.A00.A0H();
    }

    public void BxJ() {
        this.A07.A0T.A05();
    }

    public void BxK() {
        this.A07.BxL();
    }

    public void BxM(C185719d2 r2) {
        this.A07.A0T.A07(r2);
    }

    public void Bym(Set set) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A07;
        A36 a36 = businessDirectoryContextualSearchViewModel.A0R;
        a36.A01 = set;
        BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel).A02((Boolean) null, A5L.A00(businessDirectoryContextualSearchViewModel), a36.A06(), 46);
        String A052 = BusinessDirectoryContextualSearchViewModel.A05(businessDirectoryContextualSearchViewModel);
        if (A052 == null) {
            A052 = "";
        }
        BusinessDirectoryContextualSearchViewModel.A0H(businessDirectoryContextualSearchViewModel, A052, 1);
        this.A07.A0U(64);
    }

    public void C0Z() {
        this.A07.Boe(0);
    }

    public void C40() {
        this.A07.A0T.A00.A0H();
    }

    public void CRJ() {
        AnonymousClass8FJ r2 = this.A07.A0T.A00;
        C21446AkD.A01(r2.A08, r2, 21);
    }

    public static BusinessDirectoryActivity A00(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        if (businessDirectoryContextualSearchFragment.A1D() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) businessDirectoryContextualSearchFragment.A1D();
        }
        throw AnonymousClass000.A0n("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass1DT r3;
        View inflate = layoutInflater.inflate(2131624364, viewGroup, false);
        RecyclerView A0U = C108945cZ.A0U(inflate, 2131429528);
        A0U.setLayoutManager(new LinearLayoutManager(A1n(), 1, false));
        A0U.setAdapter(this.A05);
        this.A05.CDq(new AnonymousClass8I1(A0U, this));
        C173788vj r0 = new C173788vj(this, 0);
        this.A0A = r0;
        A0U.A0t(r0);
        boolean A032 = this.A09.A03();
        C23391Fw r1 = this.A0L;
        if (A032) {
            r1.A05(this.A0E);
            C169238ka r12 = this.A0E;
            r12.A02 = C17880vN.A0i();
            r3 = r12.A04;
        } else {
            r1.A05(this.A04);
            r3 = this.A04.A00;
        }
        C37801q9 A1G = A1G();
        APC apc = this.A06;
        apc.getClass();
        C20335AGr.A00(A1G, r3, apc, 3);
        C20335AGr.A00(A1G(), this.A07.A0G, this, 8);
        C20335AGr.A00(A1G(), this.A07.A0H, this, 9);
        C20335AGr.A00(A1G(), this.A07.A0E, this, 10);
        C20335AGr.A00(A1G(), this.A07.A0Y, this, 11);
        C20335AGr.A00(A1G(), this.A07.A0Z, this, 12);
        C20335AGr.A00(A1G(), this.A07.A0F, this, 10);
        C20335AGr.A00(A1G(), this.A07.A0b, this, 13);
        C20335AGr.A00(A1G(), this.A07.A0a, this, 14);
        C41731wy r32 = this.A07.A0X;
        C37801q9 A1G2 = A1G();
        APC apc2 = this.A06;
        apc2.getClass();
        C20335AGr.A00(A1G2, r32, apc2, 6);
        return inflate;
    }

    public void A1r() {
        super.A1r();
        if (equals(A00(this).A03)) {
            A00(this).A03 = null;
        }
        this.A03.A01(this.A06);
        AnonymousClass1FL A1B = A1B();
        if (A1B == null || A1B.isFinishing()) {
            ((C190509l4) this.A07.A0c.get()).A00();
        }
    }

    public void A1u() {
        super.A1u();
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A07;
        int i = businessDirectoryContextualSearchViewModel.A01;
        int i2 = 1;
        AM7 am7 = (AM7) businessDirectoryContextualSearchViewModel.A0d.get();
        Integer A002 = A5L.A00(businessDirectoryContextualSearchViewModel);
        if (i == 1) {
            i2 = 2;
        }
        am7.A08(A002, (Integer) null, (Map) null, i2, i2, 0);
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00(this).A03 = this;
    }
}

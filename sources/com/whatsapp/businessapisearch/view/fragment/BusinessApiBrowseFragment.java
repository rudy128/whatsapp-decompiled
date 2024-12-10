package com.whatsapp.businessapisearch.view.fragment;

import X.A17;
import X.AEQ;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass0I4;
import X.AnonymousClass0YX;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FL;
import X.AnonymousClass2YE;
import X.AnonymousClass3MX;
import X.AnonymousClass8FA;
import X.AnonymousClass8IA;
import X.C108945cZ;
import X.C161448Dt;
import X.C173758vg;
import X.C173778vi;
import X.C18070vi;
import X.C189319it;
import X.C20339AGv;
import X.C21728Are;
import X.C22136AyE;
import X.C36241nZ;
import X.C36251na;
import X.C38391rD;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;

public final class BusinessApiBrowseFragment extends Hilt_BusinessApiBrowseFragment {
    public static String A07 = "search_by_category";
    public static AnonymousClass8FA A08;
    public static AEQ A09;
    public static AnonymousClass8IA A0A;
    public AnonymousClass2YE A00;
    public AnonymousClass0I4 A01;
    public C173758vg A02;
    public A17 A03;
    public AnonymousClass00H A04;
    public String A05;
    public RecyclerView A06;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        BusinessApiSearchActivity A002;
        String A1H;
        C18070vi.A0d(layoutInflater, 0);
        View A0B = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624267, false);
        RecyclerView A0U = C108945cZ.A0U(A0B, 2131431475);
        this.A06 = A0U;
        if (A0U != null) {
            A0U.setLayoutManager(new LinearLayoutManager(A0U.getContext(), 1, false));
            C173758vg r0 = this.A02;
            if (r0 != null) {
                A0U.setAdapter(r0);
                if (A09 != null) {
                    if ("search_by_category".equals(A07)) {
                        C173778vi r02 = new C173778vi();
                        A0A = r02;
                        A0U.A0t(r02);
                    }
                    A002 = A00(this);
                    AEQ aeq = A09;
                    if (aeq != null) {
                        A1H = aeq.A01;
                    } else {
                        A1H = null;
                    }
                } else {
                    A002 = A00(this);
                    A1H = A1H(2131886973);
                }
                A002.setTitle(A1H);
            } else {
                C18070vi.A11("listAdapter");
                throw null;
            }
        }
        AnonymousClass8FA r03 = A08;
        if (r03 != null) {
            C20339AGv.A00(A1G(), r03.A02, new C22136AyE(this), 17);
            AnonymousClass8FA r04 = A08;
            if (r04 != null) {
                C20339AGv.A00(A1G(), r04.A06, new C21728Are(this, 13), 17);
                AnonymousClass8FA r05 = A08;
                if (r05 != null) {
                    C20339AGv.A00(A1G(), r05.A03.A02, new C21728Are(this, 14), 17);
                    A00(this).BVe().A09(new C161448Dt(this, 0), A1G());
                    A00(this).A4c();
                    return A0B;
                }
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void A1z(Bundle bundle) {
        AEQ aeq;
        String string;
        Bundle bundle2 = this.A06;
        String str = null;
        if (bundle2 != null) {
            aeq = (AEQ) bundle2.getParcelable("INITIAL_API_CATEGORY");
        } else {
            aeq = null;
        }
        A09 = aeq;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str = bundle3.getString("ENTRYPOINT_TYPE");
        }
        this.A05 = str;
        Bundle bundle4 = this.A06;
        if (!(bundle4 == null || (string = bundle4.getString("API_BIZ_SEARCH_USE_CASE")) == null)) {
            A07 = string;
        }
        AnonymousClass2YE r0 = this.A00;
        if (r0 != null) {
            String str2 = this.A05;
            AEQ aeq2 = A09;
            String str3 = A07;
            C36251na r2 = r0.A00;
            AnonymousClass10E r1 = r2.A02;
            Application A002 = AnonymousClass0YX.A00(r1.Ao9);
            AnonymousClass10G r12 = r1.A00;
            AnonymousClass8FA r22 = new AnonymousClass8FA(A002, (C189319it) r12.A1l.get(), (AnonymousClass0I4) r12.A0a.get(), AnonymousClass10G.A2k(r12), C36241nZ.A0I(r2.A01), aeq2, (A17) r12.A0Z.get(), str2, str3);
            A08 = r22;
            r22.A0T(A09);
            super.A1z(bundle);
            return;
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }

    public static final BusinessApiSearchActivity A00(BusinessApiBrowseFragment businessApiBrowseFragment) {
        if (businessApiBrowseFragment.A1D() instanceof BusinessApiSearchActivity) {
            AnonymousClass1FL A1D = businessApiBrowseFragment.A1D();
            C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity");
            return (BusinessApiSearchActivity) A1D;
        }
        throw AnonymousClass000.A0n("BusinessApiBrowseFragment should be attached to BusinessApiSearchActivity");
    }

    public void A1r() {
        super.A1r();
        this.A06 = null;
    }

    public void A1s() {
        super.A1s();
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            AnonymousClass8IA r0 = A0A;
            if (r0 != null) {
                recyclerView.A0u(r0);
            }
            AnonymousClass8IA r1 = A0A;
            if (r1 != null) {
                RecyclerView recyclerView2 = this.A06;
                C18070vi.A0b(recyclerView2);
                recyclerView2.A0u(r1);
            }
            RecyclerView recyclerView3 = this.A06;
            C18070vi.A0b(recyclerView3);
            recyclerView3.setAdapter((C38391rD) null);
            this.A06 = null;
        }
    }
}

package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass7AT;
import X.AnonymousClass8HW;
import X.C108945cZ;
import X.C157837yj;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;

public final class BusinessDirectoryPopularApiBusinessesFragment extends Hilt_BusinessDirectoryPopularApiBusinessesFragment {
    public BusinessDirectoryPopularApiBusinessesViewModel A00;
    public AnonymousClass8HW A01;
    public RecyclerView A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625350, viewGroup, false);
        RecyclerView A0U = C108945cZ.A0U(inflate, 2131434911);
        this.A02 = A0U;
        if (A0U != null) {
            A0U.setLayoutManager(new LinearLayoutManager(A1n(), 1, false));
        }
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            AnonymousClass8HW r0 = this.A01;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
            } else {
                str = "directoryListAdapter";
                C18070vi.A11(str);
                throw null;
            }
        }
        BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = this.A00;
        if (businessDirectoryPopularApiBusinessesViewModel != null) {
            AnonymousClass7AT.A01(A1G(), businessDirectoryPopularApiBusinessesViewModel.A00, new C157837yj(this), 17);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.setTitle(2131887150);
            }
            C18070vi.A0b(inflate);
            return inflate;
        }
        str = "viewModel";
        C18070vi.A11(str);
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = (BusinessDirectoryPopularApiBusinessesViewModel) AnonymousClass3MW.A0N(this).A00(BusinessDirectoryPopularApiBusinessesViewModel.class);
        C18070vi.A0d(businessDirectoryPopularApiBusinessesViewModel, 0);
        this.A00 = businessDirectoryPopularApiBusinessesViewModel;
    }
}

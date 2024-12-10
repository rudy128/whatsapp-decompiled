package com.whatsapp.businessdirectory.view.fragment;

import X.AFN;
import X.AnonymousClass1HF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass86E;
import X.C19740yt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel;

public class BusinessDirectoryEducationNuxFragment extends RoundedBottomSheetDialogFragment implements AnonymousClass86E {
    public BusinessDirectoryEducationNuxViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625368);
        AnonymousClass1HF.A0L(C19740yt.A03(A14(), AnonymousClass1YL.A00(A1n(), 2130971786, 2131102904)), A09);
        View A06 = AnonymousClass1HF.A06(A09, 2131428437);
        AFN.A00(AnonymousClass1HF.A06(A09, 2131433235), this, 22);
        AFN.A00(A06, this, 23);
        return A09;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A00 = (BusinessDirectoryEducationNuxViewModel) AnonymousClass3MW.A0N(this).A00(BusinessDirectoryEducationNuxViewModel.class);
    }

    public void A2K(View view) {
        super.A2K(view);
        BottomSheetBehavior.A02(view).A0d(true);
    }
}

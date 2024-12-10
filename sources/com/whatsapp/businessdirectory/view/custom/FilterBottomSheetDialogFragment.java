package com.whatsapp.businessdirectory.view.custom;

import X.AFN;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Sz;
import X.AnonymousClass3T7;
import X.AnonymousClass3WV;
import X.BAZ;
import X.C177649Aa;
import X.C17880vN;
import X.C24071It;
import X.C37361pP;
import X.C38471rL;
import X.C84564Jz;
import X.C91574fu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FilterBottomSheetDialogFragment extends Hilt_FilterBottomSheetDialogFragment {
    public C84564Jz A00;
    public AnonymousClass3WV A01;
    public BAZ A02 = null;
    public AnonymousClass3T7 A03;
    public final C38471rL A04 = new C177649Aa(this, 49);

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A03 = (AnonymousClass3T7) new C24071It(new AnonymousClass3Sz(bundle, this, this.A00, A15().getParcelableArrayList("arg-categories"), A15().getParcelableArrayList("arg-selected-categories")), this).A00(AnonymousClass3T7.class);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(2131625319, viewGroup, false);
        View A06 = AnonymousClass1HF.A06(inflate, 2131436787);
        if (A2L()) {
            i = 8;
        }
        A06.setVisibility(i);
        AnonymousClass1HF.A06(inflate, 2131431856).setOnClickListener(new AFN(this, 19));
        AnonymousClass3MW.A0J(inflate, 2131436466).setText(2131887033);
        this.A01 = new AnonymousClass3WV(this);
        AnonymousClass3MX.A0Q(inflate, 2131434769).setAdapter(this.A01);
        this.A03.A01.A0A(A1G(), new C91574fu(this, 9));
        View A062 = AnonymousClass1HF.A06(inflate, 2131428435);
        C38471rL r1 = this.A04;
        A062.setOnClickListener(r1);
        AnonymousClass1HF.A06(inflate, 2131428433).setOnClickListener(r1);
        return inflate;
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        AnonymousClass3T7 r3 = this.A03;
        C37361pP r2 = r3.A02;
        r2.A04("saved_all_categories", r3.A00);
        r2.A04("saved_selected_categories", C17880vN.A10(r3.A03));
    }
}

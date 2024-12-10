package com.whatsapp.businessdirectory.view.fragment;

import X.AGI;
import X.AM5;
import X.APC;
import X.AnonymousClass02n;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C171788sH;
import X.C173768vh;
import X.C189999kC;
import X.C19830z4;
import X.C20335AGr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;

public class LocationOptionPickerFragment extends Hilt_LocationOptionPickerFragment {
    public C173768vh A00;
    public C189999kC A01;
    public APC A02;
    public LocationOptionPickerViewModel A03;
    public C19830z4 A04;
    public AnonymousClass1LU A05;
    public RecyclerView A06;
    public final AnonymousClass02n A07 = CDw(new AGI((Object) this, 4), new Object());
    public final AnonymousClass02n A08 = CDw(new AGI((Object) this, 2), new Object());
    public final AnonymousClass02n A09 = CDw(new AGI((Object) this, 3), new Object());

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(2131625892, viewGroup, false);
        RecyclerView A0U = C108945cZ.A0U(inflate, 2131434770);
        this.A06 = A0U;
        A0U.setAdapter(this.A00);
        View A062 = AnonymousClass1HF.A06(inflate, 2131436787);
        if (A2L()) {
            i = 8;
        }
        A062.setVisibility(i);
        this.A03.A00.A0A(this, new C20335AGr(this, 21));
        this.A03.A07.A0A(this, new C20335AGr(this, 22));
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            LocationOptionPickerViewModel locationOptionPickerViewModel = this.A03;
            int i2 = bundle2.getInt("source", -1);
            AM5 am5 = locationOptionPickerViewModel.A01;
            Integer valueOf = Integer.valueOf(i2);
            Integer A042 = locationOptionPickerViewModel.A03.A04();
            C171788sH r1 = new C171788sH();
            r1.A0C = 35;
            r1.A0F = valueOf;
            r1.A09 = A042;
            AM5.A02(am5, r1);
        }
        return inflate;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A03 = (LocationOptionPickerViewModel) AnonymousClass3MW.A0N(this).A00(LocationOptionPickerViewModel.class);
    }
}

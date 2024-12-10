package com.whatsapp.group;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass5I0;
import X.C102825Hy;
import X.C102835Hz;
import X.C104375Nx;
import X.C18070vi;
import X.C18100vl;
import X.C203411t;
import X.C40371ub;
import X.C90044dR;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class SelectOrCreateCommunityBottomSheetFragment extends Hilt_SelectOrCreateCommunityBottomSheetFragment {
    public C203411t A00;
    public C40371ub A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C102825Hy(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C102835Hz(this));
    public final C18100vl A04 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104375Nx(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5I0(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626865);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C90044dR.A00(AnonymousClass3MW.A0A(this.A02), this, 16);
        C90044dR.A00(AnonymousClass3MW.A0A(this.A05), this, 17);
        C90044dR.A00(AnonymousClass3MW.A0A(this.A03), this, 18);
    }
}

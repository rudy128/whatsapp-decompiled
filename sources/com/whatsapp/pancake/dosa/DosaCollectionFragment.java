package com.whatsapp.pancake.dosa;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C152907of;
import X.C152917og;
import X.C152927oh;
import X.C156577ua;
import X.C156587ub;
import X.C18070vi;
import X.C18100vl;
import X.C25661Pc;
import X.C30391dr;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;

public final class DosaCollectionFragment extends Hilt_DosaCollectionFragment {
    public C25661Pc A00;
    public final C18100vl A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass3MX.A1Q(new DosaCollectionFragment$onViewCreated$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public DosaCollectionFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152917og(new C152907of(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(DosaCollectionViewModel.class);
        this.A01 = C99274sY.A00(new C152927oh(A002), new C156587ub(this, A002), new C156577ua(A002), A15);
    }
}

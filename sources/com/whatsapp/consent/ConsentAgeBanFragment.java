package com.whatsapp.consent;

import X.A8V;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C149247ik;
import X.C149257il;
import X.C149267im;
import X.C155447sl;
import X.C155457sm;
import X.C18070vi;
import X.C18100vl;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;

public final class ConsentAgeBanFragment extends Hilt_ConsentAgeBanFragment {
    public A8V A00;
    public final C18100vl A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        A8V a8v = this.A00;
        if (a8v != null) {
            a8v.A0L("age_collection_under13_blocked", "age_collection_under13_blocked", "view", (String) null);
        } else {
            C18070vi.A11("funnelLogger");
            throw null;
        }
    }

    public ConsentAgeBanFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C149257il(new C149247ik(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ConsentAgeBanViewModel.class);
        this.A01 = C99274sY.A00(new C149267im(A002), new C155457sm(this, A002), new C155447sl(A002), A15);
    }
}

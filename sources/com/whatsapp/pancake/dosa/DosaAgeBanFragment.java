package com.whatsapp.pancake.dosa;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C108955ca;
import X.C108985cd;
import X.C152817oW;
import X.C152827oX;
import X.C152837oY;
import X.C156517uU;
import X.C156527uV;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C25661Pc;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;

public final class DosaAgeBanFragment extends Hilt_DosaAgeBanFragment {
    public C25661Pc A00;
    public final C18100vl A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C25661Pc r2 = this.A00;
        if (r2 != null) {
            C108985cd.A17(r2, C17880vN.A0i(), C108955ca.A0f(), 0);
        } else {
            C18070vi.A11("contextualAgeCollectionLogUtil");
            throw null;
        }
    }

    public DosaAgeBanFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152827oX(new C152817oW(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(DosaAgeBanViewModel.class);
        this.A01 = C99274sY.A00(new C152837oY(A002), new C156527uV(this, A002), new C156517uU(A002), A15);
    }
}

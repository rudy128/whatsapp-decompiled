package com.whatsapp.consent;

import X.A8V;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C149327is;
import X.C149337it;
import X.C149347iu;
import X.C155477so;
import X.C155487sp;
import X.C18070vi;
import X.C18100vl;
import X.C99274sY;

public final class DateOfBirthCollectionFragment extends Hilt_DateOfBirthCollectionFragment {
    public A8V A00;
    public final C18100vl A01;

    public final A8V A27() {
        A8V a8v = this.A00;
        if (a8v != null) {
            return a8v;
        }
        C18070vi.A11("funnelLogger");
        throw null;
    }

    public DateOfBirthCollectionFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C149337it(new C149327is(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(DateOfBirthCollectionViewModel.class);
        this.A01 = C99274sY.A00(new C149347iu(A002), new C155487sp(this, A002), new C155477so(A002), A15);
    }
}

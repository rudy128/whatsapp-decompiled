package com.whatsapp.pancake;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C152757oQ;
import X.C152767oR;
import X.C152777oS;
import X.C156487uR;
import X.C156497uS;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;

public final class PomegranatePancakeFragment extends PearPancakeFragment {
    public final C18100vl A00;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass3MZ.A0G(this).A01(new PomegranatePancakeFragment$onViewCreated$1(this, (C30391dr) null));
    }

    public PomegranatePancakeFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152767oR(new C152757oQ(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(PomegranatePancakeViewModel.class);
        this.A00 = C99274sY.A00(new C152777oS(A002), new C156497uS(this, A002), new C156487uR(A002), A15);
    }
}

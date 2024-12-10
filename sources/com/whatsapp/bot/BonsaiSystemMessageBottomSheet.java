package com.whatsapp.bot;

import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3TG;
import X.AnonymousClass4CO;
import X.AnonymousClass5BM;
import X.AnonymousClass5BN;
import X.AnonymousClass5M0;
import X.C18070vi;
import X.C18100vl;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;

public final class BonsaiSystemMessageBottomSheet extends Hilt_BonsaiSystemMessageBottomSheet {
    public final C18100vl A00;
    public final int A01 = 2131624302;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = 0;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("ARG_TYPE_ORDINAL", 0);
        }
        C18100vl r3 = this.A00;
        AnonymousClass4CO r1 = AnonymousClass4CO.values()[i];
        C18070vi.A0d(r1, 0);
        ((AnonymousClass3TG) r3.getValue()).A00.A0F(r1);
        AnonymousClass3MY.A1K(A1G(), ((AnonymousClass3TG) r3.getValue()).A00, AnonymousClass3MW.A16(this, 0), 9);
        AnonymousClass3MZ.A1I(C18070vi.A05(view, 2131428285), this, 34);
    }

    public int A2F() {
        return this.A01;
    }

    public BonsaiSystemMessageBottomSheet() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AnonymousClass3TG.class);
        this.A00 = C99274sY.A00(new AnonymousClass5BM(this), new AnonymousClass5BN(this), new AnonymousClass5M0(this), A15);
    }
}

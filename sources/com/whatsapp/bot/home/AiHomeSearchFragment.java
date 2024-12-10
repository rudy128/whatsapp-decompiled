package com.whatsapp.bot.home;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass7AT;
import X.C108945cZ;
import X.C108975cc;
import X.C148447hS;
import X.C148457hT;
import X.C148467hU;
import X.C155187sL;
import X.C155197sM;
import X.C157687xu;
import X.C18070vi;
import X.C18100vl;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;

public final class AiHomeSearchFragment extends BotListFragment {
    public final C18100vl A00;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C18100vl r2 = this.A04;
        AnonymousClass3MY.A1L(C108945cZ.A0b(r2).A0B, true);
        C108975cc.A0r(this.A00);
        AnonymousClass7AT.A01(A1G(), C108945cZ.A0b(r2).A05, new C157687xu(this), 7);
    }

    public AiHomeSearchFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148457hT(new C148447hS(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiHomeSearchViewModel.class);
        this.A00 = C99274sY.A00(new C148467hU(A002), new C155197sM(this, A002), new C155187sL(A002), A15);
    }

    public void A1s() {
        super.A1s();
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isChangingConfigurations()) {
            AiHomeViewModel A0b = C108945cZ.A0b(this.A04);
            A0b.A05.A0F((Object) null);
            AnonymousClass3MY.A1L(A0b.A0B, false);
        }
    }
}

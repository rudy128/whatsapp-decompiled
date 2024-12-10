package com.whatsapp.privacy.checkup;

import X.AnonymousClass00H;
import X.AnonymousClass3Ma;
import X.AnonymousClass48n;
import X.C139756zO;
import X.C142807Aw;
import X.C18070vi;
import X.C22891Dp;
import X.C38631rd;
import X.C39771tc;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public final class PrivacyCheckupHomeFragment extends PrivacyCheckupBaseFragment {
    public void A21(Bundle bundle, View view) {
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = A15().getInt("extra_entry_point");
        AnonymousClass00H r1 = this.A03;
        if (r1 != null) {
            ((C139756zO) r1.get()).A02(i, 0);
            A28(view2, new AnonymousClass48n(this, i, 7), 2131894752, 0, 2131232070);
            A28(view2, new AnonymousClass48n(this, i, 8), 2131894748, 0, 2131232283);
            A28(view2, new AnonymousClass48n(this, i, 9), 2131894729, 0, 2131232172);
            A28(view2, new AnonymousClass48n(this, i, 10), 2131894737, 0, 2131232171);
            if (C22891Dp.A02) {
                ImageView A0C = AnonymousClass3Ma.A0C(view, 2131431374);
                C38631rd r3 = new C38631rd();
                C39771tc.A06(A14(), 2132017255).A02(new C142807Aw(r3, 1));
                A0C.setImageDrawable(r3);
                r3.A07();
                return;
            }
            return;
        }
        C18070vi.A11("privacyCheckupWamEventHelper");
        throw null;
    }
}

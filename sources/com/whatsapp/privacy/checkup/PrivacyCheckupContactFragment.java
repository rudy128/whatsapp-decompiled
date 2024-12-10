package com.whatsapp.privacy.checkup;

import X.AnonymousClass00H;
import X.AnonymousClass48n;
import X.C139756zO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import android.os.Bundle;
import android.view.View;

public final class PrivacyCheckupContactFragment extends PrivacyCheckupBaseFragment {
    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = A15().getInt("extra_entry_point");
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            ((C139756zO) r0.get()).A02(i, 1);
            A28(view2, new AnonymousClass48n(this, i, 4), 2131894731, 2131894730, 2131231619);
            C18030ve r3 = this.A00;
            if (r3 != null) {
                if (C18020vd.A05(C18040vf.A02, r3, 3897)) {
                    A28(view2, new AnonymousClass48n(this, i, 5), 2131894733, 2131894732, 2131232144);
                }
                A28(view2, new AnonymousClass48n(this, i, 6), 2131894736, 2131894735, 2131231950);
                return;
            }
            str = "abProps";
        } else {
            str = "privacyCheckupWamEventHelper";
        }
        C18070vi.A11(str);
        throw null;
    }
}

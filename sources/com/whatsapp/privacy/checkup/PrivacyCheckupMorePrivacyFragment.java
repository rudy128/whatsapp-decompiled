package com.whatsapp.privacy.checkup;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1NT;
import X.AnonymousClass48n;
import X.C139756zO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C25491Ok;
import android.os.Bundle;
import android.view.View;

public final class PrivacyCheckupMorePrivacyFragment extends Hilt_PrivacyCheckupMorePrivacyFragment {
    public AnonymousClass11S A00;
    public AnonymousClass1NT A01;
    public C25491Ok A02;

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = A15().getInt("extra_entry_point");
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            ((C139756zO) r0.get()).A02(i, 3);
            AnonymousClass11S r02 = this.A00;
            if (r02 != null) {
                if (!r02.A0N()) {
                    A28(view2, new AnonymousClass48n(this, i, 11), 2131894747, 2131894746, 2131232065);
                }
                C18030ve r3 = this.A00;
                if (r3 != null) {
                    boolean A05 = C18020vd.A05(C18040vf.A02, r3, 3823);
                    if (this.A02 != null) {
                        int i2 = 2131894745;
                        int i3 = 2131894744;
                        if (A05) {
                            i2 = 2131898924;
                            i3 = 2131889526;
                        }
                        A28(view2, new AnonymousClass48n(this, i, 12), i2, i3, 2131231954);
                        return;
                    }
                    str = "businessCoexUtils";
                } else {
                    str = "abProps";
                }
            } else {
                str = "meManager";
            }
        } else {
            str = "privacyCheckupWamEventHelper";
        }
        C18070vi.A11(str);
        throw null;
    }
}

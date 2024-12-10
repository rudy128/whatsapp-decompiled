package com.whatsapp.privacy.checkup;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1XL;
import X.AnonymousClass48n;
import X.C139756zO;
import X.C18070vi;
import android.os.Bundle;
import android.view.View;

public final class PrivacyCheckupMoreSecurityFragment extends Hilt_PrivacyCheckupMoreSecurityFragment {
    public AnonymousClass11S A00;
    public AnonymousClass00H A01;

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = A15().getInt("extra_entry_point");
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            ((C139756zO) r0.get()).A02(i, 4);
            AnonymousClass11S r02 = this.A00;
            if (r02 != null) {
                if (!r02.A0N()) {
                    A28(view2, new AnonymousClass48n(this, i, 13), 2131894754, 2131894753, 2131232159);
                }
                AnonymousClass00H r03 = this.A01;
                if (r03 == null) {
                    str = "appAuthManager";
                } else if (((AnonymousClass1XL) r03.get()).A05()) {
                    A28(view2, new AnonymousClass48n(this, i, 14), 2131894749, 2131894751, 2131231910);
                    return;
                } else {
                    return;
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

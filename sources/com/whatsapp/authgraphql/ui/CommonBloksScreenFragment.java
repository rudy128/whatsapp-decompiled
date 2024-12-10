package com.whatsapp.authgraphql.ui;

import X.AnonymousClass3MW;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class CommonBloksScreenFragment extends Hilt_CommonBloksScreenFragment {
    public C18030ve A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        C18030ve r2 = this.A00;
        if (r2 != null) {
            int i = 2131625346;
            if (C18020vd.A05(C18040vf.A02, r2, 10400)) {
                i = 2131625345;
            }
            return layoutInflater.inflate(i, viewGroup, false);
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public Class A26() {
        return CommonViewModel.class;
    }

    public int A25() {
        return 2131428240;
    }
}

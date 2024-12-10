package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3QU;
import X.AnonymousClass4NJ;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.C129516hv;
import X.C18070vi;
import X.C35511mM;
import X.C72463Mc;
import X.C73203Rj;
import X.C95714mg;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class AutoShareNuxDialogFragment extends Hilt_AutoShareNuxDialogFragment {
    public static final Integer A03 = AnonymousClass00R.A0u;
    public C35511mM A00;
    public boolean A01;
    public final C129516hv A02;

    public AutoShareNuxDialogFragment(C129516hv r1) {
        this.A02 = r1;
    }

    public Dialog A27(Bundle bundle) {
        Context A14 = A14();
        ArrayList A13 = AnonymousClass000.A13();
        String A1H = A1H(2131886825);
        String A1H2 = A1H(2131886826);
        Integer valueOf = Integer.valueOf(AnonymousClass3MZ.A02(A1n(), A14(), 2130970831, 2131102246));
        String A1H3 = A1H(2131886824);
        C35511mM r1 = this.A00;
        if (r1 != null) {
            A13.add(new AnonymousClass4NJ(new C95714mg(this, 2), A1H3, C72463Mc.A1Y(r1.A01(A03))));
            C73203Rj A04 = AnonymousClass4a6.A04(this);
            A04.A0c(new AnonymousClass3QU(A14, (LinearLayout.LayoutParams) null, (Integer) null, valueOf, 16, 28, A1H, A1H2, A13));
            A04.setNegativeButton(2131893111, new AnonymousClass758(this, 44));
            A04.setPositiveButton(2131893112, new AnonymousClass758(this, 43));
            A2D(false);
            C18070vi.A0d("AutoShareNuxDialogFragment Opening auto share nux dialog", 0);
            return AnonymousClass3MY.A0L(A04);
        }
        C18070vi.A11("fbAccountManager");
        throw null;
    }
}

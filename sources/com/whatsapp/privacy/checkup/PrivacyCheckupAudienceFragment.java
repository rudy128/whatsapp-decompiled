package com.whatsapp.privacy.checkup;

import X.AnonymousClass00H;
import X.AnonymousClass48n;
import X.C139756zO;
import X.C18070vi;
import android.os.Bundle;
import android.view.View;

public final class PrivacyCheckupAudienceFragment extends PrivacyCheckupBaseFragment {
    public void A21(Bundle bundle, View view) {
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        int i = A15().getInt("extra_entry_point");
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            ((C139756zO) r0.get()).A02(i, 2);
            A28(view2, new AnonymousClass48n(this, i, 1), 2131894728, 2131894727, 2131232142);
            A28(view2, new AnonymousClass48n(this, i, 2), 2131894724, 2131894723, 2131232414);
            A28(view2, new AnonymousClass48n(this, i, 3), 2131894726, 2131894725, 2131231618);
            return;
        }
        C18070vi.A11("privacyCheckupWamEventHelper");
        throw null;
    }
}

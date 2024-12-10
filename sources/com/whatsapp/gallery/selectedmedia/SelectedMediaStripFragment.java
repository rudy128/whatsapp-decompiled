package com.whatsapp.gallery.selectedmedia;

import X.AnonymousClass1DF;
import X.C102765Hs;
import X.C18070vi;
import X.C18100vl;
import X.C89944dH;
import android.os.Bundle;
import android.view.View;

public final class SelectedMediaStripFragment extends SelectedMediaFragmentBase {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C102765Hs(this));

    public void A21(Bundle bundle, View view) {
        View findViewById;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View view2 = this.A0B;
        if (view2 != null && (findViewById = view2.findViewById(2131431057)) != null) {
            C89944dH.A00(findViewById, this, 32);
        }
    }

    public SelectedMediaStripFragment() {
        super(2131625415);
    }
}

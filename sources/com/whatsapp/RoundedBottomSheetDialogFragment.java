package com.whatsapp;

import X.AnonymousClass6P3;
import X.AnonymousClass6Pd;
import X.AnonymousClass6Pe;
import X.AnonymousClass6Pf;
import X.AnonymousClass6Pg;
import X.AnonymousClass75E;
import X.AnonymousClass86E;
import X.C128116fT;
import X.C138946xx;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;

@Deprecated
public abstract class RoundedBottomSheetDialogFragment extends Hilt_RoundedBottomSheetDialogFragment {
    public C128116fT A00;
    public C138946xx A01 = null;

    public int A25() {
        if (this instanceof PrivacyDisclosureBottomSheetFragment) {
            return 2132083579;
        }
        return 2132083618;
    }

    public C138946xx A2H() {
        C138946xx r1 = this.A01;
        if (r1 == null) {
            AnonymousClass6P3 r5 = new AnonymousClass6P3(this);
            C128116fT r4 = this.A00;
            Class<?> cls = getClass();
            C18070vi.A0d(cls, 0);
            C18030ve r2 = r4.A01;
            C18040vf r12 = C18040vf.A02;
            if (C18020vd.A05(r12, r2, 3856)) {
                r1 = new AnonymousClass6Pd(r5);
            } else if (!AnonymousClass86E.class.isAssignableFrom(cls) || !C18020vd.A05(r12, r2, 3316)) {
                r1 = AnonymousClass6Pg.A00;
            } else {
                r1 = new AnonymousClass6Pe(r4.A00, r5);
            }
            this.A01 = r1;
        }
        return r1;
    }

    public Dialog A27(Bundle bundle) {
        boolean z = A2H().A01;
        Dialog A27 = super.A27(bundle);
        if (!z) {
            A27.setOnShowListener(new AnonymousClass75E(A27, this, 0));
        }
        return A27;
    }

    public void A2K(View view) {
        BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
        A02.A0W(3);
        A02.A0h = true;
        A02.A0V(view.getHeight());
    }

    public boolean A2L() {
        if ((A2H() instanceof AnonymousClass6Pd) || (A2H() instanceof AnonymousClass6Pf)) {
            return true;
        }
        return false;
    }
}

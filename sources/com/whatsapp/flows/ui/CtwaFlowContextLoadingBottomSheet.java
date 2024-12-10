package com.whatsapp.flows.ui;

import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3NL;
import X.C146797Qq;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C72463Mc;
import X.C89944dH;
import X.C98494rF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaTextView;

public final class CtwaFlowContextLoadingBottomSheet extends Hilt_CtwaFlowContextLoadingBottomSheet {
    public AnonymousClass1KB A00;
    public C18000vb A01;
    public C18030ve A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625038, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(2131429741);
        if (toolbar != null) {
            C18000vb r2 = this.A01;
            if (r2 != null) {
                AnonymousClass3NL.A02(A14(), toolbar, r2, 2131233243);
                toolbar.setNavigationOnClickListener(new C89944dH(this, 13));
                C72463Mc.A0v(toolbar.getContext(), A14(), toolbar, 2130971986, 2131103168);
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        return inflate;
    }

    public void A1v() {
        PercentageBasedMaxHeightLinearLayout percentageBasedMaxHeightLinearLayout;
        C18030ve r2 = this.A02;
        if (r2 != null) {
            int A002 = C18020vd.A00(C18040vf.A02, r2, 3319);
            View view = this.A0B;
            if (!(view == null || (percentageBasedMaxHeightLinearLayout = (PercentageBasedMaxHeightLinearLayout) view.findViewById(2131429740)) == null)) {
                percentageBasedMaxHeightLinearLayout.A00 = A002;
            }
            super.A1v();
            return;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final void A2K() {
        View view;
        ViewStub A0F;
        C98494rF A002 = C98494rF.A00();
        View view2 = this.A0B;
        View view3 = null;
        View view4 = null;
        if (view2 != null) {
            view4 = view2.findViewById(2131430516);
        }
        A002.element = view4;
        if (view4 == null) {
            View view5 = this.A0B;
            if (view5 == null || (A0F = AnonymousClass3MW.A0F(view5, 2131430535)) == null) {
                view = null;
            } else {
                view = A0F.inflate();
            }
            if (view instanceof WaTextView) {
                view3 = view;
            }
            A002.element = view3;
        }
        AnonymousClass1KB r2 = this.A00;
        if (r2 != null) {
            r2.CGP(new C146797Qq(A002, this, 11));
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }

    public int A25() {
        return 2132083618;
    }
}

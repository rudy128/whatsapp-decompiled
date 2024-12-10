package com.whatsapp.interop.ui;

import X.AnonymousClass129;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CF;
import X.C18070vi;
import X.C72483Me;
import X.C825148g;
import X.C82834Cg;
import X.C88494Zy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class InteropSystemAboutBottomSheet extends Hilt_InteropSystemAboutBottomSheet {
    public View A00;
    public AnonymousClass129 A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131623966, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A00 = view;
        AnonymousClass1FL A1D = A1D();
        View view2 = this.A00;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                AnonymousClass3MZ.A1G(view2, layoutParams, (float) C72483Me.A02(A1D), 0.86f);
            } else {
                throw AnonymousClass3MY.A0k();
            }
        }
        View A06 = AnonymousClass1HF.A06(view, 2131427351);
        C18070vi.A0z(A06, "null cannot be cast to non-null type com.whatsapp.wds.components.textlayout.WDSTextLayout");
        WDSTextLayout wDSTextLayout = (WDSTextLayout) A06;
        wDSTextLayout.setFootnoteText(A1H(2131886159));
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131886160);
        C88494Zy[] r4 = new C88494Zy[3];
        C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131886155), (CharSequence) null, r4, 2131233680, 0);
        C88494Zy.A02(A1H(2131886156), r4, 2131233681);
        AnonymousClass4CF.A00(wDSTextLayout, C88494Zy.A00(A1H(2131886157), r4, 2131233682));
        wDSTextLayout.setLayoutSize(C82834Cg.MEDIUM);
        wDSTextLayout.setSecondaryButtonText(A1H(2131886158));
        wDSTextLayout.setSecondaryButtonClickListener(new C825148g(this, 38));
    }

    public int A2F() {
        return 2131623966;
    }
}

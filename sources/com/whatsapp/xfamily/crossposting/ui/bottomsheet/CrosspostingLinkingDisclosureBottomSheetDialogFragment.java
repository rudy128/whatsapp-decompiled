package com.whatsapp.xfamily.crossposting.ui.bottomsheet;

import X.AnonymousClass00R;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass6LG;
import X.C108995ce;
import X.C130526jZ;
import X.C1605989c;
import X.C18070vi;
import X.C30131dR;
import X.C35511mM;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.button.WDSButton;

public final class CrosspostingLinkingDisclosureBottomSheetDialogFragment extends Hilt_CrosspostingLinkingDisclosureBottomSheetDialogFragment {
    public static final Integer A07 = AnonymousClass00R.A18;
    public WDSButton A00;
    public WDSButton A01;
    public C1605989c A02;
    public C130526jZ A03;
    public C35511mM A04;
    public C30131dR A05;
    public boolean A06;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131627623, true);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A01 = AnonymousClass3MW.A0q(view, 2131433186);
        this.A00 = AnonymousClass3MW.A0q(view, 2131429538);
        WDSButton wDSButton = this.A01;
        if (wDSButton != null) {
            AnonymousClass6LG.A00(wDSButton, this, 44);
        }
        WDSButton wDSButton2 = this.A00;
        if (wDSButton2 != null) {
            AnonymousClass6LG.A00(wDSButton2, this, 45);
        }
        AnonymousClass3MX.A0C(view, 2131430175).setVisibility(C72453Mb.A07(A2L() ^ true ? 1 : 0));
        C18070vi.A0d("CrosspostingLinkingDisclosureBottomSheetDialogFragment Opening Linking disclosure fragment", 0);
    }

    public void A1s() {
        String str;
        super.A1s();
        if (!this.A06) {
            C30131dR r2 = this.A05;
            if (r2 != null) {
                C35511mM r1 = this.A04;
                if (r1 != null) {
                    C108995ce.A1G(r1, r2, AnonymousClass00R.A18);
                    r2.A03("EXIT_LINKING_NUX");
                    return;
                }
                str = "fbAccountManager";
            } else {
                str = "xFamilyUserFlowLogger";
            }
            C18070vi.A11(str);
            throw null;
        }
    }
}

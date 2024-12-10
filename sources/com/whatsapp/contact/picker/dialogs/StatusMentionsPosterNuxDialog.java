package com.whatsapp.contact.picker.dialogs;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C24641Lc;
import X.C90004dN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.button.WDSButton;

public final class StatusMentionsPosterNuxDialog extends Hilt_StatusMentionsPosterNuxDialog {
    public View.OnClickListener A00;
    public C24641Lc A01;
    public WDSButton A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131627016, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WDSButton A0r = AnonymousClass3MW.A0r(view, 2131428443);
        this.A02 = A0r;
        if (A0r != null) {
            AnonymousClass3Ma.A1B(A0r, this, 44);
        }
        View findViewById = view.findViewById(2131431964);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C90004dN(this, findViewById, 37));
        }
        C24641Lc r0 = this.A01;
        if (r0 != null) {
            if (!C18020vd.A05(C18040vf.A02, r0.A01, 12254)) {
                C17880vN.A0E(view, 2131432487).setText(A1H(2131893130));
                return;
            }
            return;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public int A25() {
        return 2132084407;
    }
}

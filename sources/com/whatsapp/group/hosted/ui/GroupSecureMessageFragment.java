package com.whatsapp.group.hosted.ui;

import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C90044dR;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupSecureMessageFragment extends Hilt_GroupSecureMessageFragment {
    public C19830z4 A00;
    public C18030ve A01;
    public AnonymousClass1LU A02;
    public AnonymousClass129 A03;
    public AnonymousClass00H A04;
    public TextView A05;
    public TextView A06;
    public WDSButton A07;
    public WDSButton A08;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A06 = AnonymousClass3MW.A0J(view, 2131436208);
        this.A05 = AnonymousClass3MW.A0J(view, 2131429927);
        this.A07 = AnonymousClass3MW.A0q(view, 2131431961);
        WDSButton A0q = AnonymousClass3MW.A0q(view, 2131429132);
        C90044dR.A00(A0q, this, 19);
        this.A08 = A0q;
        WDSButton wDSButton = this.A07;
        if (wDSButton != null) {
            C90044dR.A00(wDSButton, this, 20);
        }
        C19830z4 r0 = this.A00;
        if (r0 != null) {
            C17880vN.A1F(C17890vO.A0B(r0).edit(), "secure_bottomsheet_shown", true);
        } else {
            C18070vi.A11("waCapiGroupSharedPreferences");
            throw null;
        }
    }

    public int A2F() {
        return 2131625524;
    }
}

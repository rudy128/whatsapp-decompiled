package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C90044dR;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.button.WDSButton;

public final class AboutAiSupportAssistantBottomSheet extends Hilt_AboutAiSupportAssistantBottomSheet {
    public AnonymousClass00H A00;
    public WDSButton A01;
    public WDSButton A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A0A = AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131623965);
        WDSButton A0r = AnonymousClass3MW.A0r(A0A, 2131433260);
        C90044dR.A00(A0r, this, 47);
        this.A02 = A0r;
        WDSButton A0r2 = AnonymousClass3MW.A0r(A0A, 2131431962);
        C90044dR.A00(A0r2, this, 48);
        this.A01 = A0r2;
        return A0A;
    }

    public void A1r() {
        super.A1r();
        this.A02 = null;
        this.A01 = null;
    }
}

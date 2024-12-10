package com.whatsapp.components;

import X.AnonymousClass129;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupHistoryBottomSheet extends Hilt_GroupHistoryBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass129 A01;
    public WDSButton A02;
    public WDSButton A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A0A = AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131625497);
        WDSButton A0r = AnonymousClass3MW.A0r(A0A, 2131433260);
        AnonymousClass3Ma.A1B(A0r, this, 10);
        this.A03 = A0r;
        WDSButton A0r2 = AnonymousClass3MW.A0r(A0A, 2131431962);
        AnonymousClass3Ma.A1B(A0r2, this, 11);
        this.A02 = A0r2;
        return A0A;
    }

    public void A1r() {
        this.A03 = null;
        this.A02 = null;
        super.A1r();
    }
}

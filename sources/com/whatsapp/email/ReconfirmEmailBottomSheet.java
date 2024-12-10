package com.whatsapp.email;

import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CG;
import X.C18070vi;
import X.C190059kJ;
import X.C196159uY;
import X.C19830z4;
import X.C72453Mb;
import X.C72483Me;
import X.C825048f;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class ReconfirmEmailBottomSheet extends Hilt_ReconfirmEmailBottomSheet {
    public int A00;
    public C19830z4 A01;
    public C190059kJ A02;
    public C196159uY A03;
    public String A04;
    public View A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A0A = AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626692);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(A0A, 2131434409);
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131889670);
        View A08 = AnonymousClass3MX.A08(A1n(), 2131626691);
        TextView A0J = AnonymousClass3MW.A0J(A08, 2131430290);
        C19830z4 r0 = this.A01;
        if (r0 != null) {
            A0J.setText(r0.A0o());
            C18070vi.A0b(A08);
            AnonymousClass4CG.A00(A08, wDSTextLayout);
            AnonymousClass3MY.A1I(this, wDSTextLayout, 2131898593);
            wDSTextLayout.setPrimaryButtonClickListener(new C825048f(this, 47));
            wDSTextLayout.setSecondaryButtonText(A1H(2131889684));
            wDSTextLayout.setSecondaryButtonClickListener(new C825048f(this, 48));
            this.A05 = A0A;
            return A0A;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        A00(view);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.A05;
        if (view != null) {
            A00(view);
        }
    }

    private final void A00(View view) {
        AnonymousClass1FL A1D = A1D();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            float f = 0.35f;
            if (C72453Mb.A08(A14()) == 2) {
                f = 1.0f;
            }
            C18070vi.A0b(A1D);
            AnonymousClass3MZ.A1G(view, layoutParams, (float) C72483Me.A02(A1D), f);
            return;
        }
        throw AnonymousClass3MY.A0k();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A04 = bundle2.getString("session_id");
            this.A00 = bundle2.getInt("entrypoint");
        }
    }
}

package com.whatsapp.payments.ui;

import X.AFQ;
import X.AnonymousClass00H;
import X.AnonymousClass122;
import X.AnonymousClass1FL;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8GH;
import X.AnonymousClass96A;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C189619jX;
import X.C19740yt;
import X.C20284AEs;
import X.C30931ek;
import X.C33701jF;
import X.C72453Mb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

public final class P2mLitePaymentSettingsFragment extends Hilt_P2mLitePaymentSettingsFragment {
    public View A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public AnonymousClass122 A04;
    public C33701jF A05;
    public C189619jX A06;
    public AnonymousClass96A A07;
    public C30931ek A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;

    public void A1s() {
        this.A07 = null;
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass1HF.A06(view, 2131433596).setVisibility(8);
        AnonymousClass3MY.A1A(view, 2131433543, 8);
        this.A00 = view.findViewById(2131433665);
        LinearLayout A0A2 = AnonymousClass8BR.A0A(view, 2131433664);
        this.A02 = A0A2;
        if (A0A2 != null) {
            AFQ.A00(A0A2, this, 10);
        }
        Context A1n = A1n();
        if (A1n != null) {
            int A002 = C19740yt.A00(A1n, 2131102104);
            if (Integer.valueOf(A002) != null) {
                AnonymousClass8BU.A15(view, 2131429897, A002);
            }
        }
        C17880vN.A0E(view, 2131429899).setText(2131893725);
        Context A1n2 = A1n();
        if (A1n2 != null) {
            int A003 = C19740yt.A00(A1n2, 2131102104);
            if (Integer.valueOf(A003) != null) {
                AnonymousClass8BU.A15(view, 2131434585, A003);
            }
        }
        LinearLayout A0A3 = AnonymousClass8BR.A0A(view, 2131434584);
        this.A03 = A0A3;
        if (A0A3 != null) {
            AFQ.A00(A0A3, this, 9);
        }
        LinearLayout A0A4 = AnonymousClass8BR.A0A(view, 2131433673);
        this.A01 = A0A4;
        if (A0A4 != null) {
            AFQ.A00(A0A4, this, 11);
        }
        C72453Mb.A0s(view, 2131433676).A04(8);
        AnonymousClass3MX.A1B(A14(), AnonymousClass3MW.A0H(view, 2131433674), 2131231968);
        AnonymousClass8BU.A15(view, 2131433674, C19740yt.A00(A14(), 2131102104));
        C17880vN.A0E(view, 2131433677).setText(2131893868);
        this.A1C.A00 = 3;
        AnonymousClass1FL A1B = A1B();
        C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        this.A06 = new C189619jX((AnonymousClass1FY) A1B);
    }

    public void Bl5(boolean z) {
    }

    public void C0I(C20284AEs aEs) {
    }

    public boolean CMD() {
        return false;
    }

    public static final void A00(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        boolean z = p2mLitePaymentSettingsFragment.A0W.A03().getBoolean("has_p2mlite_account", false);
        int i = 8;
        LinearLayout linearLayout = p2mLitePaymentSettingsFragment.A02;
        if (z) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            View view = p2mLitePaymentSettingsFragment.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            if (C18020vd.A05(C18040vf.A02, p2mLitePaymentSettingsFragment.A02, 2727)) {
                i = 0;
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            View view2 = p2mLitePaymentSettingsFragment.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        LinearLayout linearLayout2 = p2mLitePaymentSettingsFragment.A03;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i);
        }
    }

    public void CRV(List list) {
        super.CRV(list);
        AnonymousClass96A r0 = this.A07;
        if (r0 != null) {
            r0.A04 = list;
        }
        AnonymousClass8GH r2 = this.A0h;
        if (r2 != null) {
            r2.A0X(this.A0d, this.A0i);
        }
        A00(this);
    }
}

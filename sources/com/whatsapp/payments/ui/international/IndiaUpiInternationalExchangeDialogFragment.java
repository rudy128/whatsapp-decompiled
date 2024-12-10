package com.whatsapp.payments.ui.international;

import X.AFQ;
import X.AZ6;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.C18070vi;
import X.C20087A6p;
import X.C20112A7u;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class IndiaUpiInternationalExchangeDialogFragment extends Hilt_IndiaUpiInternationalExchangeDialogFragment {
    public AZ6 A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625659, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AFQ.A00(AnonymousClass8BS.A06(view), this, 43);
        AFQ.A00(AnonymousClass1HF.A06(view, 2131429535), this, 44);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131430644);
        Object[] A1b = AnonymousClass3MW.A1b();
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_base_currency");
        } else {
            str = null;
        }
        A1b[0] = str;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str2 = bundle3.getString("extra_exchange_rate");
        }
        A1b[1] = str2;
        AnonymousClass8BT.A18(A0J, this, A1b, 2131897465);
        AZ6 az6 = this.A00;
        if (az6 != null) {
            C20087A6p.A03((C20112A7u) null, az6, "currency_exchange_prompt", (String) null);
        } else {
            C18070vi.A11("indiaUpiFieldStatsLogger");
            throw null;
        }
    }
}

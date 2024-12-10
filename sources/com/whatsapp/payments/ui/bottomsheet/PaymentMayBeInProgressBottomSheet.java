package com.whatsapp.payments.ui.bottomsheet;

import X.AFQ;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4AH;
import X.AnonymousClass8BT;
import X.C108955ca;
import X.C139436yq;
import X.C18070vi;
import X.C186919ey;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

public final class PaymentMayBeInProgressBottomSheet extends Hilt_PaymentMayBeInProgressBottomSheet {
    public C186919ey A00;
    public String A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131433568);
        Object[] A1a = AnonymousClass3MW.A1a();
        String str = this.A01;
        if (str == null) {
            C18070vi.A11("receiverName");
            throw null;
        }
        A1a[0] = str;
        AnonymousClass8BT.A18(A0E, this, A1a, 2131893447);
        AFQ.A00(AnonymousClass1HF.A06(view, 2131433570), this, 38);
        AFQ.A00(AnonymousClass1HF.A06(view, 2131433569), this, 39);
    }

    public void A2I(C139436yq r3) {
        C18070vi.A0d(r3, 0);
        r3.A00(AnonymousClass4AH.A00);
        r3.A01(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C186919ey r1 = this.A00;
        if (r1 != null) {
            r1.A02.A28();
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r1.A01;
            if (indiaUpiCheckOrderDetailsActivity.Bg0()) {
                indiaUpiCheckOrderDetailsActivity.finish();
                indiaUpiCheckOrderDetailsActivity.overridePendingTransition(0, 0);
            }
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String A0s = C108955ca.A0s(A15(), "arg_receiver_name");
        C18070vi.A0X(A0s);
        this.A01 = A0s;
    }

    public int A2F() {
        return 2131626378;
    }
}

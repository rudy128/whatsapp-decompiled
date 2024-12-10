package com.whatsapp.payments.ui;

import X.AFP;
import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass91L;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public class IndiaUpiProvideMoreInfoBottomSheetActivity extends AnonymousClass91L {
    public boolean A00;

    public class BottomSheetProvideMoreInfoFragment extends RoundedBottomSheetDialogFragment {
        public void A1K() {
            super.A1K();
            C72463Mc.A1A(this);
        }

        public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625605);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                AFP.A00(AnonymousClass8BS.A06(A09), this, 42);
                AFP.A00(AnonymousClass1HF.A06(A09, 2131427434), A1B, 43);
            }
            return A09;
        }
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            this.A00 = AnonymousClass8BT.A0I(r2);
        }
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity(int i) {
        this.A00 = false;
        AGD.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new RoundedBottomSheetDialogFragment();
        CMl(paymentBottomSheet);
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity() {
        this(0);
    }
}

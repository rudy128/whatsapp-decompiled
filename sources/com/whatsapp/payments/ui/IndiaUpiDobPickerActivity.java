package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3Ma;
import X.AnonymousClass4HC;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.B96;
import X.C137116uw;
import X.C1418477e;
import X.C17880vN;
import X.C34001jj;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

public final class IndiaUpiDobPickerActivity extends AnonymousClass91T implements B96 {
    public boolean A00;

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
        }
    }

    public IndiaUpiDobPickerActivity(int i) {
        this.A00 = false;
        AGD.A00(this, 3);
    }

    public void Bqs(long j, String str) {
        Intent A0A = C17880vN.A0A();
        A0A.putExtra("dob_timestamp_ms", j);
        C72453Mb.A16(this, A0A);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IndiaUpiDobPickerBottomSheet A002 = AnonymousClass4HC.A00((C1418477e) AnonymousClass8BS.A05(this, 2131624050).getParcelableExtra("bank_account"), (String) null, true, false);
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        A0H.A08(A002, 2131430999);
        A0H.A00(false);
    }

    public IndiaUpiDobPickerActivity() {
        this(0);
    }
}

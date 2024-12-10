package com.whatsapp.payments.ui;

import X.ARR;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass8BT;
import X.AnonymousClass92r;
import X.C18070vi;
import X.C20279AEn;
import android.os.Bundle;
import android.view.MotionEvent;

public final class IndiaWebViewUpiP2mHybridActivity extends AnonymousClass92r {
    public ARR A00;

    public void A3h(int i) {
        setResult(2, getIntent());
        super.A3h(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        setResult(0, getIntent());
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2r3, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A5M();
        String stringExtra = getIntent().getStringExtra("extra_p2m_amount");
        AnonymousClass1KJ r2 = AnonymousClass1KL.A0B;
        AnonymousClass1KN A0H = AnonymousClass8BT.A0H(r2, stringExtra);
        if (A0H != null) {
            ? obj = new Object();
            obj.A02 = r2;
            obj.A01(A0H);
            this.A00 = obj.A00();
        }
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
        ARR arr = this.A00;
        if (arr != null) {
            A5o(arr, (C20279AEn) null);
        } else {
            C18070vi.A11("paymentMoney");
            throw null;
        }
    }
}

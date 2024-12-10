package com.whatsapp.payments;

import X.AGC;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass93Q;
import X.C000200d;
import X.C137116uw;
import X.C17880vN;
import X.C18070vi;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

public final class GlobalPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public AnonymousClass00H A00;
    public boolean A01;

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        Bundle A09 = AnonymousClass3MY.A09(this);
        if (A09 != null) {
            bundle.putAll(A09);
        }
        super.onSaveInstanceState(bundle);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass93Q.A0q(r2, r1, this);
            AnonymousClass93Q.A0d(r2, r1, AnonymousClass8BT.A0J(r2), this);
            this.A0N = AnonymousClass3MZ.A0z(r2);
            AnonymousClass93Q.A0V(A002, r2, r1, AnonymousClass3MZ.A0q(r2), this);
            AnonymousClass93Q.A0c(A002, r2, r1, this);
            this.A00 = C000200d.A00(r1.ABh);
        }
    }

    public GlobalPaymentTransactionDetailActivity(int i) {
        this.A01 = false;
        AGC.A00(this, 8);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0h = C17880vN.A0h();
        A4g(A0h, A0h);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            Integer A0h = C17880vN.A0h();
            A4g(A0h, A0h);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public GlobalPaymentTransactionDetailActivity() {
        this(0);
    }
}

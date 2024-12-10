package com.whatsapp.payments.ui;

import X.A56;
import X.AGD;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8DB;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.BDt;
import X.C000200d;
import X.C003401n;
import X.C137116uw;
import X.C20154A9q;
import X.C20284AEs;
import X.C20310AFs;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.AbsListView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

public class IndiaUpiPaymentMethodSelectionActivity extends AnonymousClass91T implements BDt {
    public AnonymousClass8DB A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final AnonymousClass1QE A04;

    public String BUt(C20284AEs aEs) {
        return null;
    }

    public boolean CMD() {
        return false;
    }

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
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
            this.A01 = C000200d.A00(r2.A87);
            this.A02 = C000200d.A00(r1.AEf);
        }
    }

    public String BUu(C20284AEs aEs) {
        return A56.A00(aEs, this.A01);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 29) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        AnonymousClass8BW.A19(A002);
        C20154A9q.A00(A002, this, 38, 2131899101);
        C20154A9q.A01(A002, this, 39, 2131899286);
        return A002.create();
    }

    public IndiaUpiPaymentMethodSelectionActivity(int i) {
        this.A03 = false;
        AGD.A00(this, 14);
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        return 0;
    }

    public /* synthetic */ boolean CLr(C20284AEs aEs) {
        return false;
    }

    public /* synthetic */ boolean CMH() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AnonymousClass8BS.A05(this, 2131625690) == null) {
            this.A04.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AnonymousClass8BV.A17(supportActionBar, "Select bank account");
        }
        this.A04.A06("onCreate");
        AbsListView absListView = (AbsListView) findViewById(2131433598);
        AnonymousClass8DB r0 = new AnonymousClass8DB(this, AnonymousClass8BR.A0c(this.A01), this);
        this.A00 = r0;
        r0.A00 = (List) getIntent().getSerializableExtra("bank_accounts");
        r0.notifyDataSetChanged();
        absListView.setAdapter(this.A00);
        absListView.setOnItemClickListener(new C20310AFs(this, 2));
    }

    public IndiaUpiPaymentMethodSelectionActivity() {
        this(0);
        this.A04 = AnonymousClass1QE.A00("IndiaUpiPaymentMethodSelectionActivity", "payment-settings", "IN");
    }
}

package com.whatsapp.payments.ui;

import X.AGD;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1QE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass9RM;
import X.B5S;
import X.C000200d;
import X.C003401n;
import X.C137116uw;
import X.C1763391t;
import X.C1765794t;
import X.C17880vN;
import X.C20337AGt;
import X.C20759AXo;
import X.C21427Aju;
import X.C42011xT;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import java.util.List;

public class IndiaUpiMandateHistoryActivity extends C1763391t {
    public AZ6 A00;
    public IndiaUpiMandateHistoryViewModel A01;
    public AnonymousClass00H A02;
    public B5S A03;
    public boolean A04;
    public final AnonymousClass1QE A05;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass8BU.A0T(r2);
            this.A02 = C000200d.A00(r2.A8C);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.94z, X.1xT] */
    public C42011xT A4b(ViewGroup viewGroup, int i) {
        if (i == 1002) {
            View A09 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626359);
            C72463Mc.A0x(A09.getContext(), AnonymousClass000.A0Y(A09), A09, 2130970830, 2131102245);
            return new C1765794t(A09);
        } else if (i == 1003) {
            View A092 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625661);
            ? r2 = new C42011xT(A092);
            r2.A01 = AnonymousClass3MW.A0J(A092, 2131431358);
            r2.A00 = AnonymousClass3MW.A0J(A092, 2131429927);
            return r2;
        } else if (i != 1007) {
            return super.A4b(viewGroup, i);
        } else {
            List list = C42011xT.A0I;
            return AnonymousClass9RM.A00(viewGroup);
        }
    }

    public void onDestroy() {
        C17880vN.A0V(this.A02).unregisterObserver(this.A03);
        super.onDestroy();
    }

    public IndiaUpiMandateHistoryActivity(int i) {
        this.A04 = false;
        AGD.A00(this, 7);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A01.A05.BiI(1, "mandate_payment_screen", "payment_home", 1, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AnonymousClass8BV.A17(supportActionBar, getString(2131897566));
        }
        this.A05.A06("onCreate");
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = (IndiaUpiMandateHistoryViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiMandateHistoryViewModel.class);
        this.A01 = indiaUpiMandateHistoryViewModel;
        C21427Aju.A00(indiaUpiMandateHistoryViewModel.A06, indiaUpiMandateHistoryViewModel, 43);
        indiaUpiMandateHistoryViewModel.A05.BiI((Integer) null, "mandate_payment_screen", "payment_home", 0, true);
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel2 = this.A01;
        indiaUpiMandateHistoryViewModel2.A00.A0A(this, new C20337AGt(this, 10));
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel3 = this.A01;
        indiaUpiMandateHistoryViewModel3.A02.A0A(this, new C20337AGt(this, 11));
        this.A03 = new C20759AXo(this, 2);
        C17880vN.A0V(this.A02).registerObserver(this.A03);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A01.A05.BiI(1, "mandate_payment_screen", "payment_home", 1, true);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMandateHistoryActivity() {
        this(0);
        this.A05 = AnonymousClass1QE.A00("IndiaUpiMandateHistoryActivity", "mandates", "IN");
    }
}

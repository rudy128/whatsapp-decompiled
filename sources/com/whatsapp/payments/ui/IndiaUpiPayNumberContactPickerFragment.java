package com.whatsapp.payments.ui;

import X.AnonymousClass3MW;
import X.AnonymousClass8DS;
import X.C18070vi;
import X.C188449hR;
import X.C20296AFe;
import X.C20339AGv;
import X.C21728Are;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;

public final class IndiaUpiPayNumberContactPickerFragment extends Hilt_IndiaUpiPayNumberContactPickerFragment {
    public IndiaUpiPayNumberContactPickerViewModel A00;
    public AnonymousClass8DS A01;

    public String A2E(String str) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (X.AnonymousClass1YE.A0A(r3, "91", false) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2W(X.C127096dn r7) {
        /*
            r6 = this;
            r4 = 0
            X.C18070vi.A0d(r7, r4)
            super.A2W(r7)
            java.util.List r1 = r7.A00
            boolean r0 = r1.isEmpty()
            r5 = 8
            if (r0 != 0) goto L_0x0021
            java.lang.Object r0 = r1.get(r4)
            boolean r0 = r0 instanceof X.AnonymousClass7ED
            if (r0 != 0) goto L_0x0021
            X.8DS r0 = r6.A01
            if (r0 == 0) goto L_0x0020
            r0.setVisibility(r5)
        L_0x0020:
            return
        L_0x0021:
            X.8DS r0 = r6.A01
            if (r0 == 0) goto L_0x0028
            r0.setVisibility(r4)
        L_0x0028:
            X.1DT r0 = r6.A49
            java.lang.String r3 = X.C108945cZ.A1F(r0)
            if (r3 != 0) goto L_0x0032
            java.lang.String r3 = ""
        L_0x0032:
            boolean r0 = android.text.TextUtils.isDigitsOnly(r3)
            if (r0 == 0) goto L_0x007e
            int r2 = r3.length()
            java.lang.String r1 = "viewModel"
            if (r5 > r2) goto L_0x005f
            r0 = 11
            if (r2 >= r0) goto L_0x005f
        L_0x0044:
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel r2 = r6.A00
            if (r2 == 0) goto L_0x009d
            X.1DT r1 = r2.A02
            X.964 r0 = new X.964
            r0.<init>(r3)
            r1.A0E(r0)
            X.6nr r1 = r2.A05
            X.AwM r0 = new X.AwM
            r0.<init>(r2, r3)
            r1.A00 = r0
            r1.A00()
            return
        L_0x005f:
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel r0 = r6.A00
            if (r0 == 0) goto L_0x009d
            r0 = 12
            if (r2 != r0) goto L_0x0072
            X.2tK r0 = X.C63572tK.A0E
            java.lang.String r0 = "91"
            boolean r0 = X.AnonymousClass1YE.A0A(r3, r0, r4)
            if (r0 == 0) goto L_0x0072
            goto L_0x0044
        L_0x0072:
            X.8DS r2 = r6.A01
            if (r2 == 0) goto L_0x0020
            r0 = 2131897428(0x7f122c54, float:1.9429745E38)
            java.lang.String r1 = r6.A1H(r0)
            goto L_0x0089
        L_0x007e:
            X.8DS r2 = r6.A01
            if (r2 == 0) goto L_0x0020
            r0 = 2131895497(0x7f1224c9, float:1.9425829E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0o(r6, r3, r4, r0)
        L_0x0089:
            X.C18070vi.A0X(r1)
            android.view.ViewGroup r0 = r2.A00
            r0.setVisibility(r5)
            X.1bI r0 = r2.A03
            android.view.View r0 = X.AnonymousClass3MY.A0I(r0, r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            return
        L_0x009d:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPayNumberContactPickerFragment.A2W(X.6dn):void");
    }

    public static final void A00(IndiaUpiPayNumberContactPickerFragment indiaUpiPayNumberContactPickerFragment, C188449hR r5) {
        Intent A002 = indiaUpiPayNumberContactPickerFragment.A02.A00(indiaUpiPayNumberContactPickerFragment.A1n(), false, true);
        A002.putExtra("extra_payment_handle", r5.A03);
        A002.putExtra("extra_payment_handle_id", r5.A05);
        A002.putExtra("extra_payee_name", r5.A01);
        A002.putExtra("extra_payment_upi_number", r5.A02);
        A002.putExtra("extra_transaction_is_merchant", r5.A07);
        A002.putExtra("extra_transaction_is_valid_merchant", r5.A08);
        A002.putExtra("extra_merchant_code", r5.A04);
        A002.putExtra("extra_disable_transaction_confirmation_fragment", true);
        A002.putExtra("referral_screen", indiaUpiPayNumberContactPickerFragment.A07);
        A002.addFlags(67108864);
        indiaUpiPayNumberContactPickerFragment.A1k(A002);
    }

    public boolean A2o() {
        this.A02.BiL(1, "pay_number_contact_picker", this.A07, 1);
        return super.A2o();
    }

    public void A1y(Bundle bundle) {
        WDSSearchView wDSSearchView;
        super.A1y(bundle);
        this.A0r.A00.getSupportActionBar().A0M(2131897607);
        WDSSearchBar wDSSearchBar = this.A20;
        if (!(wDSSearchBar == null || (wDSSearchView = wDSSearchBar.A08) == null)) {
            wDSSearchView.setHint(2131897608);
        }
        this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(new C20296AFe(this, 4));
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        IndiaUpiPayNumberContactPickerViewModel indiaUpiPayNumberContactPickerViewModel = (IndiaUpiPayNumberContactPickerViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiPayNumberContactPickerViewModel.class);
        this.A00 = indiaUpiPayNumberContactPickerViewModel;
        if (indiaUpiPayNumberContactPickerViewModel != null) {
            C20339AGv.A00(this, indiaUpiPayNumberContactPickerViewModel.A02, new C21728Are(this, 46), 41);
            IndiaUpiPayNumberContactPickerViewModel indiaUpiPayNumberContactPickerViewModel2 = this.A00;
            if (indiaUpiPayNumberContactPickerViewModel2 != null) {
                C20339AGv.A00(this, indiaUpiPayNumberContactPickerViewModel2.A01, new C21728Are(this, 47), 41);
                return;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void A2G() {
        super.A2G();
        AnonymousClass8DS r1 = new AnonymousClass8DS(A14());
        this.A01 = r1;
        r1.setVisibility(8);
        AnonymousClass3MW.A0D(this.A07, 16908292).addView(this.A01);
    }

    public String A33() {
        return "pay_number_contact_picker";
    }
}

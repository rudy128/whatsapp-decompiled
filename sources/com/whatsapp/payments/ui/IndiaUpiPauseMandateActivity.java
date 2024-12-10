package com.whatsapp.payments.ui;

import X.A43;
import X.A7B;
import X.A8C;
import X.A9J;
import X.ADI;
import X.AFP;
import X.AGD;
import X.AW0;
import X.AXS;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KH;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8Dv;
import X.AnonymousClass91U;
import X.AnonymousClass933;
import X.C110885hR;
import X.C137116uw;
import X.C17960vV;
import X.C191339mR;
import X.C20110A7s;
import X.C20337AGt;
import X.C21433Ak0;
import X.C63662tU;
import X.C63932tv;
import X.C72473Md;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import java.text.DateFormat;
import java.util.Calendar;

public class IndiaUpiPauseMandateActivity extends AnonymousClass933 {
    public DatePicker A00;
    public DatePicker A01;
    public TextInputLayout A02;
    public TextInputLayout A03;
    public C20110A7s A04;
    public IndiaUpiPauseMandateViewModel A05;
    public String A06;
    public Button A07;
    public boolean A08;

    private DatePicker A03(EditText editText, long j) {
        DateFormat dateInstance = DateFormat.getDateInstance(2, this.A00.A0N());
        AnonymousClass8BW.A13(editText, dateInstance, j);
        Calendar instance = Calendar.getInstance();
        AnonymousClass8Dv r3 = new AnonymousClass8Dv(new A9J(editText, this, dateInstance, 0), this, (Calendar) null, 2132083202, instance.get(1), instance.get(2), AnonymousClass8BT.A02(instance));
        AFP.A00(editText, r3, 13);
        return r3.A01;
    }

    public void C5K(A7B a7b) {
    }

    public boolean CN3() {
        return true;
    }

    public void onBackPressed() {
        setResult(0);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0067, code lost:
        if (android.text.TextUtils.isEmpty(r11.A02.getError()) == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r11) {
        /*
            android.widget.DatePicker r0 = r11.A01
            long r2 = X.AnonymousClass8BY.A07(r0)
            com.google.android.material.textfield.TextInputLayout r5 = r11.A03
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r4 = r11.A05
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Integer r6 = X.C17880vN.A0h()
            int r0 = X.A87.A00(r6, r2, r0)
            if (r0 >= 0) goto L_0x00ab
            X.118 r1 = r4.A05
            r0 = 2131897603(0x7f122d03, float:1.94301E38)
            java.lang.String r0 = r1.A01(r0)
        L_0x0021:
            r5.setError(r0)
            android.widget.DatePicker r0 = r11.A00
            long r0 = X.AnonymousClass8BY.A07(r0)
            com.google.android.material.textfield.TextInputLayout r8 = r11.A02
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r9 = r11.A05
            X.0vb r4 = r9.A06
            java.util.Locale r5 = r4.A0N()
            r4 = 2
            java.text.DateFormat r7 = java.text.DateFormat.getDateInstance(r4, r5)
            r10 = 1
            int r2 = X.A87.A00(r6, r0, r2)
            if (r2 > 0) goto L_0x006e
            X.118 r0 = r9.A05
            android.content.Context r1 = r0.A00
            r0 = 2131897601(0x7f122d01, float:1.9430096E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x004b:
            r8.setError(r0)
            android.widget.Button r2 = r11.A07
            com.google.android.material.textfield.TextInputLayout r0 = r11.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0069
            com.google.android.material.textfield.TextInputLayout r0 = r11.A02
            java.lang.CharSequence r0 = r0.getError()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            r2.setEnabled(r0)
            return
        L_0x006e:
            X.AW0 r2 = r9.A01
            X.8pf r2 = X.AnonymousClass8BS.A0C(r2)
            X.9ue r2 = r2.A0H
            X.C17960vV.A07(r2)
            long r4 = r2.A01
            java.lang.String r2 = "Asia/Kolkata"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r4 = r4 - r2
            int r0 = X.A87.A00(r6, r0, r4)
            if (r0 <= 0) goto L_0x00a9
            X.118 r0 = r9.A05
            android.content.Context r6 = r0.A00
            r3 = 2131897600(0x7f122d00, float:1.9430094E38)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            X.11P r0 = r9.A04
            long r0 = r0.A09(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r7.format(r0)
            java.lang.String r0 = X.C108975cc.A0b(r6, r0, r2, r3)
            goto L_0x004b
        L_0x00a9:
            r0 = 0
            goto L_0x004b
        L_0x00ab:
            r0 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity.A0Q(com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity):void");
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
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
            AnonymousClass91U.A1T(A002, r2, r1, this);
            this.A06 = AnonymousClass3MY.A0Z(r2);
            this.A04 = (AnonymousClass1KH) r2.A94.get();
            this.A00 = AnonymousClass3MZ.A0e(r2);
            this.A0C = (A8C) r1.A2k.get();
            this.A0D = (A43) r2.AW8.get();
            this.A01 = AnonymousClass3Ma.A0b(r2);
            this.A09 = (C191339mR) r1.AEX.get();
            AnonymousClass933.A0V(r2, AnonymousClass8BT.A0I(r2), this);
            this.A04 = r1.A8N();
        }
    }

    public IndiaUpiPauseMandateActivity(int i) {
        this.A08 = false;
        AGD.A00(this, 11);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625642);
        A4r(2131232759, 2131434837);
        C72473Md.A18(this);
        TextInputLayout textInputLayout = (TextInputLayout) C110885hR.A0A(this, 2131435590);
        this.A03 = textInputLayout;
        long currentTimeMillis = System.currentTimeMillis();
        EditText editText = textInputLayout.A0B;
        C17960vV.A05(editText);
        this.A01 = A03(editText, currentTimeMillis);
        TextInputLayout textInputLayout2 = (TextInputLayout) C110885hR.A0A(this, 2131430468);
        this.A02 = textInputLayout2;
        EditText editText2 = textInputLayout2.A0B;
        C17960vV.A05(editText2);
        this.A00 = A03(editText2, currentTimeMillis);
        Button button = (Button) C110885hR.A0A(this, 2131429535);
        this.A07 = button;
        AFP.A00(button, this, 12);
        this.A06 = AXS.A01(this);
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = (IndiaUpiPauseMandateViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiPauseMandateViewModel.class);
        this.A05 = indiaUpiPauseMandateViewModel;
        indiaUpiPauseMandateViewModel.A02.A0A(this, new C20337AGt(this, 18));
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel2 = this.A05;
        AW0 aw0 = ((ADI) getIntent().getParcelableExtra("extra_transaction_detail_data")).A00;
        indiaUpiPauseMandateViewModel2.A01 = aw0;
        C21433Ak0.A00(indiaUpiPauseMandateViewModel2.A09, indiaUpiPauseMandateViewModel2, aw0, 0);
    }

    public IndiaUpiPauseMandateActivity() {
        this(0);
    }
}

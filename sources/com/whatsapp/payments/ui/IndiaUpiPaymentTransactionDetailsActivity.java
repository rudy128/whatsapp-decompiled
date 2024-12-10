package com.whatsapp.payments.ui;

import X.A2C;
import X.AGD;
import X.AH2;
import X.AW0;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass1QK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass93Q;
import X.AnonymousClass954;
import X.AnonymousClass966;
import X.AnonymousClass96K;
import X.AnonymousClass9NU;
import X.AnonymousClass9RM;
import X.AnonymousClass9V1;
import X.AnonymousClass9V2;
import X.B5Z;
import X.B96;
import X.C010105w;
import X.C137116uw;
import X.C161588Gc;
import X.C170318pf;
import X.C171858sO;
import X.C1765694s;
import X.C17880vN;
import X.C190699lN;
import X.C196219ue;
import X.C197979xa;
import X.C20080A6g;
import X.C20154A9q;
import X.C20156A9s;
import X.C20161A9x;
import X.C20163A9z;
import X.C20787AYq;
import X.C24071It;
import X.C42011xT;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import java.util.GregorianCalendar;
import java.util.List;

public class IndiaUpiPaymentTransactionDetailsActivity extends PaymentTransactionDetailsListActivity implements B96, B5Z {
    public AnonymousClass9V1 A00;
    public AnonymousClass9V2 A01;
    public AnonymousClass1QK A02;
    public C20080A6g A03;
    public A2C A04;
    public C190699lN A05;
    public AZ6 A06;
    public IndiaUpiDobPickerBottomSheet A07;
    public AnonymousClass96K A08;
    public C197979xa A09;
    public boolean A0A;
    public final C171858sO A0B;
    public final AnonymousClass1QE A0C;

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            AnonymousClass93Q.A0q(r3, r2, this);
            AnonymousClass93Q.A0d(r3, r2, AnonymousClass8BT.A0J(r3), this);
            this.A0N = AnonymousClass3MZ.A0z(r3);
            AnonymousClass93Q.A0V(A002, r3, r2, AnonymousClass3MZ.A0q(r3), this);
            AnonymousClass93Q.A0c(A002, r3, r2, this);
            this.A03 = (C20080A6g) r3.A5G.get();
            this.A02 = (AnonymousClass1QK) r3.A7z.get();
            this.A09 = (C197979xa) r2.A9p.get();
            this.A06 = AnonymousClass8BU.A0T(r3);
            this.A04 = (A2C) r2.AEZ.get();
            this.A05 = (C190699lN) r2.AEb.get();
            this.A00 = (AnonymousClass9V1) A002.A4Q.get();
            this.A01 = (AnonymousClass9V2) A002.A4R.get();
        }
    }

    public C161588Gc A4e(Bundle bundle) {
        C24071It A0C2;
        Class cls;
        if (!(bundle == null && (bundle = AnonymousClass3MY.A09(this)) == null) && bundle.getBoolean("extra_new_mandate_transaction", false)) {
            A0C2 = AnonymousClass8BR.A0C(new AH2(bundle, this, 3), this);
            cls = AnonymousClass966.class;
        } else {
            A0C2 = AnonymousClass8BR.A0C(new AH2(bundle, this, 4), this);
            cls = AnonymousClass96K.class;
        }
        AnonymousClass96K r0 = (AnonymousClass96K) A0C2.A00(cls);
        this.A08 = r0;
        return r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.95S} */
    /* JADX WARNING: type inference failed for: r1v110, types: [com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment, com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentRaiseComplaintFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015e, code lost:
        r1.A0D(r0);
        r1.A0Z((android.content.DialogInterface.OnClickListener) null, 2131899286);
        r1.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0273, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0276, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0292, code lost:
        if (r1.A0v.A02 == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02d2, code lost:
        if (r2 == false) goto L_0x029f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4f(X.C198789yu r18) {
        /*
            r17 = this;
            r3 = r18
            X.AW0 r5 = r3.A05
            r0 = r17
            if (r5 == 0) goto L_0x0012
            X.8sO r2 = r0.A0B
            boolean r1 = r5.A0Q
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r1
        L_0x0012:
            int r2 = r3.A00
            r1 = 4
            java.lang.String r8 = "payment_transaction_details"
            r12 = 1
            if (r2 == r1) goto L_0x0092
            r1 = 9
            if (r2 == r1) goto L_0x006f
            r1 = 10
            if (r2 != r1) goto L_0x002f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r1 = 39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A4g(r4, r1)
        L_0x002f:
            boolean r1 = r3 instanceof X.AnonymousClass96D
            r5 = 7
            if (r1 == 0) goto L_0x0052
            r9 = r3
            X.96D r9 = (X.AnonymousClass96D) r9
            r1 = 24
            r4 = 203(0xcb, float:2.84E-43)
            if (r2 == r1) goto L_0x03ba
            r1 = 29
            if (r2 == r1) goto L_0x0304
            r1 = 30
            r13 = 0
            r10 = 0
            if (r2 == r1) goto L_0x0277
            r4 = 4
            switch(r2) {
                case 101: goto L_0x0215;
                case 102: goto L_0x01d1;
                case 103: goto L_0x01b1;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r2) {
                case 105: goto L_0x016b;
                case 106: goto L_0x026e;
                case 107: goto L_0x00ef;
                case 108: goto L_0x0151;
                case 109: goto L_0x00d6;
                case 110: goto L_0x00bc;
                case 111: goto L_0x0148;
                case 112: goto L_0x012d;
                case 113: goto L_0x02d5;
                case 114: goto L_0x011f;
                case 115: goto L_0x0105;
                case 116: goto L_0x00ae;
                default: goto L_0x004e;
            }
        L_0x004e:
            super.A4f(r3)
            return
        L_0x0052:
            if (r2 != r5) goto L_0x004e
            X.AEs r2 = r3.A04
            X.C17960vV.A07(r2)
            X.8pN r2 = (X.AnonymousClass8pN) r2
            if (r2 == 0) goto L_0x006d
            X.8pb r1 = r2.A08
            if (r1 == 0) goto L_0x006d
            X.8pS r1 = (X.AnonymousClass8pS) r1
            java.lang.String r1 = r1.A0A
        L_0x0065:
            android.content.Intent r1 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A03(r0, r2, r1, r12)
            r0.startActivity(r1)
            return
        L_0x006d:
            r1 = 0
            goto L_0x0065
        L_0x006f:
            X.8sO r4 = r0.A0B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r4.A08 = r1
            r1 = 59
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A07 = r1
            r4.A0b = r8
            java.lang.String r1 = r0.A0f
            r4.A0a = r1
            if (r5 == 0) goto L_0x00a8
            boolean r1 = X.A4C.A01(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.A06 = r1
            goto L_0x00a8
        L_0x0092:
            X.8sO r4 = r0.A0B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r4.A08 = r1
            r1 = 60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A07 = r1
            r4.A0b = r8
            java.lang.String r1 = r0.A0f
            r4.A0a = r1
        L_0x00a8:
            X.AZ6 r1 = r0.A06
            r1.BiH(r4)
            goto L_0x002f
        L_0x00ae:
            X.1KB r2 = r0.A05
            r1 = 2131893652(0x7f121d94, float:1.9422087E38)
            java.lang.String r1 = r0.getString(r1)
            r2.A0G(r1, r13)
            goto L_0x0273
        L_0x00bc:
            X.AZ6 r2 = r0.A06
            r1 = 138(0x8a, float:1.93E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.AZ6.A04(r2, r1, r8)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131897620(0x7f122d14, float:1.9430135E38)
            r1.A0E(r0)
            r0 = 2131897621(0x7f122d15, float:1.9430137E38)
            goto L_0x015e
        L_0x00d6:
            X.AZ6 r2 = r0.A06
            r1 = 138(0x8a, float:1.93E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.AZ6.A04(r2, r1, r8)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131897630(0x7f122d1e, float:1.9430155E38)
            r1.A0E(r0)
            r0 = 2131897628(0x7f122d1c, float:1.943015E38)
            goto L_0x015e
        L_0x00ef:
            X.AZ6 r2 = r0.A06
            r1 = 138(0x8a, float:1.93E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.AZ6.A04(r2, r1, r8)
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r1 = new com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment
            r1.<init>()
            r1.A01 = r0
            r0.CMl(r1)
            return
        L_0x0105:
            X.AEs r2 = r3.A04
            if (r2 == 0) goto L_0x011d
            java.lang.String r1 = r2.A0A
            X.77e r10 = r2.A09
        L_0x010d:
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet r2 = X.AnonymousClass4HC.A00(r10, r1, r13, r12)
            r0.A07 = r2
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "IndiaUpiDobPickerBottomSheet"
            r2.A2C(r1, r0)
            return
        L_0x011d:
            r1 = r10
            goto L_0x010d
        L_0x011f:
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131893901(0x7f121e8d, float:1.9422592E38)
            r1.A0E(r0)
            r0 = 2131893900(0x7f121e8c, float:1.942259E38)
            goto L_0x015e
        L_0x012d:
            X.AW0 r1 = r9.A05
            android.content.Intent r1 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A03(r0, r1, r8, r5)
            r0.startActivity(r1)
            X.AZ6 r2 = r0.A06
            r1 = 126(0x7e, float:1.77E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = r0.A0f
            r7 = r12
            r4 = r8
            r5 = r0
            r6 = r12
            r2.BiI(r3, r4, r5, r6, r7)
            return
        L_0x0148:
            X.96K r0 = r0.A08
            r0.A0r(r12)
            r0.A0q(r13)
            return
        L_0x0151:
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131897622(0x7f122d16, float:1.9430139E38)
            r1.A0E(r0)
            r0 = 2131897629(0x7f122d1d, float:1.9430153E38)
        L_0x015e:
            r1.A0D(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.A0Z(r10, r0)
            r1.A0C()
            return
        L_0x016b:
            X.ALX r1 = r0.A0I
            android.content.Intent r3 = r1.A00(r0, r13, r13)
            java.lang.String r2 = "extra_payment_handle"
            X.77e r1 = r9.A01
            r3.putExtra(r2, r1)
            java.lang.String r2 = "extra_payment_handle_id"
            java.lang.String r1 = r9.A0H
            r3.putExtra(r2, r1)
            java.lang.String r2 = "extra_payee_name"
            X.77e r1 = r9.A07
            r3.putExtra(r2, r1)
            java.lang.String r2 = "referral_screen"
            java.lang.String r1 = "send_again_button"
            r3.putExtra(r2, r1)
            java.lang.String r1 = "extra_mapper_alias_resolved"
            r3.putExtra(r1, r12)
            java.lang.String r2 = "extra_merchant_code"
            java.lang.String r1 = r9.A0D
            r3.putExtra(r2, r1)
            X.1KN r1 = r9.A00
            if (r1 == 0) goto L_0x01ad
            java.math.BigDecimal r1 = r1.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "extra_payment_preset_amount"
            r3.putExtra(r1, r2)
            java.lang.String r1 = "extra_payment_is_amount_editable"
            r3.putExtra(r1, r12)
        L_0x01ad:
            r0.A3q(r3, r13)
            return
        L_0x01b1:
            X.AW0 r2 = r9.A05
            X.C17960vV.A07(r2)
            boolean r1 = r9.A0L
            if (r1 == 0) goto L_0x01bc
            r4 = 9
        L_0x01bc:
            android.content.Intent r1 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A03(r0, r2, r8, r4)
            r0.startActivity(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A4g(r2, r1)
            return
        L_0x01d1:
            X.9xa r5 = r0.A09
            java.lang.String r1 = r9.A07
            android.net.Uri r4 = android.net.Uri.parse(r1)
            X.118 r1 = r5.A01
            android.content.Context r6 = r1.A00
            r3 = 2131891638(0x7f1215b6, float:1.9418002E38)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.String r1 = r4.toString()
            java.lang.String r1 = X.C197979xa.A00(r1)
            java.lang.String r1 = X.C17880vN.A0q(r6, r1, r2, r13, r3)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            android.text.util.Linkify.addLinks(r2, r12)
            r1 = 2132082712(0x7f150018, float:1.9805546E38)
            X.3Rj r3 = X.AnonymousClass4a6.A01(r0, r1)
            r3.A0S(r2)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r3.A0X(r10, r1)
            r2 = 2131887451(0x7f12055b, float:1.940951E38)
            X.A9Y r1 = new X.A9Y
            r1.<init>(r0, r4, r5, r12)
            r3.A0Z(r1, r2)
            r3.A0C()
            return
        L_0x0215:
            X.1QE r2 = r0.A0C
            java.lang.String r1 = "return back to caller without getting the finalized status"
            r2.A06(r1)
            java.lang.String r8 = r9.A03
            java.lang.String r7 = r9.A06
            java.lang.String r6 = r9.A05
            java.lang.String r5 = r9.A04
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "txnId="
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r8, r2)
            r4[r13] = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "txnRef="
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r7, r2)
            r4[r12] = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Status="
            java.lang.String r2 = X.AnonymousClass001.A1H(r1, r6, r2)
            r1 = 2
            r4[r1] = r2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "responseCode="
            java.lang.String r2 = X.AnonymousClass001.A1H(r1, r5, r2)
            r1 = 3
            java.util.List r2 = X.AnonymousClass8BR.A15(r2, r4, r1)
            java.lang.String r1 = "&"
            java.lang.String r2 = android.text.TextUtils.join(r1, r2)
            java.lang.String r1 = "response"
            r3.putExtra(r1, r2)
            r1 = -1
            r0.setResult(r1, r3)
            goto L_0x0273
        L_0x026e:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r1 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            X.AnonymousClass8BT.A16(r0, r1)
        L_0x0273:
            r0.finish()
            return
        L_0x0277:
            X.96K r1 = r0.A08
            X.9NU r1 = r1.A06
            X.A7u r6 = r0.A4c(r10, r1)
            if (r1 == 0) goto L_0x029f
            X.AW0 r3 = r1.A01
            X.96K r1 = r0.A08
            X.9NU r1 = r1.A06
            if (r1 == 0) goto L_0x0294
            X.206 r1 = r1.A02
            if (r1 == 0) goto L_0x0294
            X.205 r1 = r1.A0v
            boolean r1 = r1.A02
            r2 = 1
            if (r1 != 0) goto L_0x0295
        L_0x0294:
            r2 = 0
        L_0x0295:
            if (r3 == 0) goto L_0x02d1
            X.1R2 r1 = r0.A0T
            boolean r1 = r1.A0j(r3)
            if (r1 == 0) goto L_0x02d1
        L_0x029f:
            r15 = 0
        L_0x02a0:
            X.AZ6 r5 = r0.A06
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.String r9 = r0.A0f
            r11 = r10
            r14 = r13
            r5.BiJ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.1QK r1 = r0.A02
            boolean r1 = r1.A0D()
            if (r1 != 0) goto L_0x03c5
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity"
            r3.setClassName(r2, r1)
            java.lang.String r2 = "extra_payments_entry_type"
            java.lang.String r1 = "chat"
            r3.putExtra(r2, r1)
            java.lang.String r2 = "extra_referral_screen"
            java.lang.String r1 = "payment_interop_bubble"
            r3.putExtra(r2, r1)
            goto L_0x02fa
        L_0x02d1:
            r15 = 1
            if (r2 != 0) goto L_0x02a0
            goto L_0x029f
        L_0x02d5:
            java.lang.Class<com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r1 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r0, r1)
            java.lang.String r1 = "extra_disable_search"
            r3.putExtra(r1, r12)
            X.ADh r2 = r9.A02
            if (r2 == 0) goto L_0x02fe
            java.lang.String r1 = "extra_predefined_search_filter"
            r3.putExtra(r1, r2)
        L_0x02e9:
            java.lang.String r1 = "extra_payment_flow_entry_point"
            r3.putExtra(r1, r4)
            r1 = 2131894095(0x7f121f4f, float:1.9422985E38)
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "extra_list_screen_configurable_title"
            r3.putExtra(r1, r2)
        L_0x02fa:
            r0.startActivity(r3)
            return
        L_0x02fe:
            java.lang.String r1 = "extra_show_empty_list_screen"
            r3.putExtra(r1, r12)
            goto L_0x02e9
        L_0x0304:
            X.8DT r10 = new X.8DT
            r10.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r10.A00
            X.8Hh r8 = new X.8Hh
            r8.<init>(r0)
            r1.setAdapter(r8)
            X.AnonymousClass3Ma.A15(r0, r1)
            X.96K r2 = r0.A08
            X.1DT r1 = r2.A01
            java.util.List r1 = X.AnonymousClass3MW.A10(r1)
            X.A6g r7 = r2.A06
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            if (r1 == 0) goto L_0x0380
            java.util.Iterator r9 = r1.iterator()
        L_0x032a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0380
            java.lang.Object r5 = r9.next()
            X.9Yd r5 = (X.C183409Yd) r5
            int r2 = r5.A00
            r1 = 102(0x66, float:1.43E-43)
            if (r2 == r1) goto L_0x0362
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 == r1) goto L_0x037c
            r1 = 210(0xd2, float:2.94E-43)
            if (r2 == r1) goto L_0x037c
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r1) goto L_0x037c
            r1 = 1004(0x3ec, float:1.407E-42)
            if (r2 == r1) goto L_0x037c
            r1 = 202(0xca, float:2.83E-43)
            if (r2 == r1) goto L_0x037c
            if (r2 == r4) goto L_0x035b
            r1 = 206(0xce, float:2.89E-43)
            if (r2 == r1) goto L_0x0368
            r1 = 207(0xcf, float:2.9E-43)
            if (r2 == r1) goto L_0x037c
            goto L_0x032a
        L_0x035b:
            r2 = r5
            X.95m r2 = (X.C1767695m) r2
            r1 = 0
            r2.A04 = r1
            goto L_0x037c
        L_0x0362:
            X.95S r5 = new X.95S
            r5.<init>()
            goto L_0x037c
        L_0x0368:
            r1 = r5
            X.95k r1 = (X.C1767495k) r1
            java.lang.String r3 = r1.A04
            X.118 r2 = r7.A01
            r1 = 2131897005(0x7f122aad, float:1.9428887E38)
            java.lang.String r1 = r2.A01(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x032a
        L_0x037c:
            r6.add(r5)
            goto L_0x032a
        L_0x0380:
            r8.A00 = r6
            r8.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            int r2 = r1.getWidth()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r3 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r10.measure(r2, r1)
            X.10I r2 = r0.A05
            java.lang.ref.WeakReference r14 = X.AnonymousClass3MW.A0z(r0)
            int r15 = r10.getMeasuredWidth()
            int r16 = r10.getMeasuredHeight()
            X.190 r11 = r0.A03
            X.17r r12 = r0.A04
            r1 = 1
            X.AVY r13 = new X.AVY
            r13.<init>(r0, r1)
            X.9BH r9 = new X.9BH
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass3MW.A1T(r9, r2, r3)
            return
        L_0x03ba:
            X.AZ6 r3 = r0.A06
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = r0.A0f
            r3.BiL(r2, r8, r1, r12)
        L_0x03c5:
            X.BD1 r1 = r0.A4d()
            android.content.Intent r2 = r1.BWv(r0, r8)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r1)
            r0.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity.A4f(X.9yu):void");
    }

    public void Bqs(long j, String str) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        this.A04.A02(new C20787AYq(this, 1), "kyc-recollect", str, gregorianCalendar.get(1), gregorianCalendar.get(2), AnonymousClass8BT.A02(gregorianCalendar));
    }

    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131893997);
        A002.A0T(false);
        C20154A9q.A00(A002, this, 42, 2131899286);
        A002.A0E(2131893993);
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass9NU r0;
        AW0 aw0;
        C196219ue r02;
        AnonymousClass96K r03 = this.A08;
        if (!(r03 == null || (r0 = r03.A06) == null || (aw0 = r0.A01) == null)) {
            C170318pf r2 = (C170318pf) aw0.A0A;
            if (aw0.A02 == 415 && r2 != null && (r02 = r2.A0H) != null && r02.A0M) {
                menu.add(0, 2131432609, 0, 2131889308);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        AnonymousClass96K r1 = this.A08;
        if (r1 != null) {
            r1.A01 = AnonymousClass3MY.A1a(intent, "extra_return_after_completion");
        }
        super.onNewIntent(intent);
    }

    public IndiaUpiPaymentTransactionDetailsActivity(int i) {
        this.A0A = false;
        AGD.A00(this, 16);
    }

    public void A2l(Fragment fragment) {
        super.A2l(fragment);
        if (fragment instanceof ProgressDialogFragment) {
            ((ProgressDialogFragment) fragment).A00 = new C20161A9x(this, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.1xT, X.94x] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.951, X.1xT] */
    public C42011xT A4b(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1000:
                return new C42011xT(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625657));
            case 1001:
                View A092 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625628);
                AnonymousClass4aX.A0D(AnonymousClass3MW.A0H(A092, 2131433532), AnonymousClass3Ma.A01(viewGroup.getContext(), AnonymousClass000.A0Y(viewGroup), 2130970094, 2131101215));
                ? r2 = new C42011xT(A092);
                r2.A00 = A092.findViewById(2131433644);
                return r2;
            case 1004:
                View A093 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625643);
                ? r22 = new C42011xT(A093);
                r22.A01 = AnonymousClass3MW.A0J(A093, 2131433489);
                r22.A02 = AnonymousClass3MW.A0J(A093, 2131433493);
                r22.A00 = (Space) AnonymousClass1HF.A06(A093, 2131435521);
                return r22;
            case 1005:
                return new C1765694s(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625695));
            case 1006:
                return new C42011xT(AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625631));
            case 1007:
                List list = C42011xT.A0I;
                return AnonymousClass9RM.A00(viewGroup);
            case 1008:
                List list2 = C42011xT.A0I;
                return new AnonymousClass954(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626321, false));
            default:
                return super.A4b(viewGroup, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9N6, java.lang.Object] */
    public void onBackPressed() {
        Integer A0h = C17880vN.A0h();
        A4g(A0h, A0h);
        AnonymousClass96K r2 = this.A08;
        ? obj = new Object();
        obj.A00 = 301;
        r2.A0e(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9N6, java.lang.Object] */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass96K r2 = this.A08;
        ? obj = new Object();
        obj.A00 = 2;
        r2.A0e(obj);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131432609 || this.A08 == null) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(2131897511);
            A002.A0Z((DialogInterface.OnClickListener) null, 2131898593);
            A002.A0X((DialogInterface.OnClickListener) null, 2131892908);
            A002.A00.A0O(new C20156A9s(1));
            C010105w create = A002.create();
            create.setOnShowListener(new C20163A9z(this, 3));
            create.show();
            return true;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (AnonymousClass3MY.A09(this) != null) {
            bundle.putAll(AnonymousClass3MY.A09(this));
        }
        super.onSaveInstanceState(bundle);
    }

    public IndiaUpiPaymentTransactionDetailsActivity() {
        this(0);
        this.A0C = AnonymousClass1QE.A00("IndiaUpiPaymentTransactionDetailsActivity", "payment-settings", "IN");
        this.A0B = new C171858sO();
    }
}

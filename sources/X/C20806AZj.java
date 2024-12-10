package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.payments.ui.Hilt_IndiaUpiEditTransactionDescriptionFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.AZj  reason: case insensitive filesystem */
public class C20806AZj implements C22564BCz {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public /* synthetic */ void Bw1(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public /* synthetic */ void C0G(PaymentBottomSheet paymentBottomSheet) {
    }

    public /* synthetic */ void C0J(C20284AEs aEs) {
    }

    public /* synthetic */ void C0M(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void C0O(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public C20806AZj(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BpZ(View view, View view2, C20274AEh aEh, AnonymousClass8pI r43, C20284AEs aEs, PaymentBottomSheet paymentBottomSheet) {
        String A01;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.CNA(2131895077);
        C170318pf r1 = new C170318pf();
        indiaUpiSendPaymentActivity.A0P = r1;
        r1.A0M = AnonymousClass8BW.A0c(indiaUpiSendPaymentActivity);
        C170318pf r12 = indiaUpiSendPaymentActivity.A0P;
        if (!TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0s)) {
            A01 = indiaUpiSendPaymentActivity.A0s;
        } else {
            A01 = AXS.A01(indiaUpiSendPaymentActivity);
        }
        r12.A0V = A01;
        AnonymousClass8pS A0N = AnonymousClass8BU.A0N(indiaUpiSendPaymentActivity.A0i, indiaUpiSendPaymentActivity.A0B.A08, "IndiaUpiPaymentActivity onRequestPayment: Cannot get IndiaUpiMethodData");
        indiaUpiSendPaymentActivity.A0P.A0D = A0N.A05;
        indiaUpiSendPaymentActivity.A0U = AnonymousClass9R9.A00(indiaUpiSendPaymentActivity.A0F, indiaUpiSendPaymentActivity.A0T);
        C175828zL r0 = indiaUpiSendPaymentActivity.A0D;
        C1418477e r9 = indiaUpiSendPaymentActivity.A0J;
        String str = indiaUpiSendPaymentActivity.A0i;
        C1418477e A0D = indiaUpiSendPaymentActivity.A0N.A0D();
        String A0J = indiaUpiSendPaymentActivity.A0N.A0J();
        C1418477e r2 = A0N.A05;
        AnonymousClass1KN r8 = indiaUpiSendPaymentActivity.A09;
        C170318pf r13 = indiaUpiSendPaymentActivity.A0P;
        String str2 = r13.A0V;
        String str3 = r13.A0M;
        String str4 = indiaUpiSendPaymentActivity.A0B.A0A;
        String str5 = indiaUpiSendPaymentActivity.A0U;
        C1418477e r5 = indiaUpiSendPaymentActivity.A0I;
        AnonymousClass9YZ r14 = new AnonymousClass9YZ(indiaUpiSendPaymentActivity);
        Log.i("PAY: collectFromVpa called");
        AnonymousClass1OZ r37 = r0.A02;
        String A0B = r37.A0B();
        String str6 = (String) C20061A5k.A01(r9);
        String str7 = (String) AnonymousClass8BT.A0q(r5);
        String str8 = (String) A0D.A00;
        String str9 = (String) AnonymousClass8BT.A0q(r2);
        String A012 = r0.A05.A01();
        String A013 = r0.A04.A01();
        C29621ca A03 = C178749Eh.A00(C175828zL.A00(r0.A01.A01(AnonymousClass1KL.A0B, r8)), "amount").A03();
        AnonymousClass8BU.A1H(str6, 4, str8);
        C72473Md.A1K(str9, str2);
        C18070vi.A0d(str4, 11);
        AnonymousClass8BW.A1I(str3, A012);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, A0B);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-collect-from-vpa");
        if (C29601cY.A04(str6, 1, 100, false)) {
            C29591cX.A01(A0R, "sender-vpa", str6);
        }
        if (str != null && C29601cY.A04(str, 1, 100, true)) {
            C29591cX.A01(A0R, "sender-vpa-id", str);
        }
        if (str7 != null && C29601cY.A04(str7, 8, 15, true)) {
            C29591cX.A01(A0R, "sender-upi-number", str7);
        }
        if (C29601cY.A04(str8, 1, 100, false)) {
            C29591cX.A01(A0R, "receiver-vpa", str8);
        }
        if (A0J != null && C29601cY.A04(A0J, 1, 100, true)) {
            C29591cX.A01(A0R, "receiver-vpa-id", A0J);
        }
        if (C29601cY.A04(str9, 1, 10000, false)) {
            C29591cX.A01(A0R, "upi-bank-info", str9);
        }
        if (AnonymousClass8BV.A1U(str2, 0)) {
            C29591cX.A01(A0R, "seq-no", str2);
        }
        if (C29601cY.A04(str4, 1, 100, false)) {
            C29591cX.A01(A0R, "credential-id", str4);
        }
        if (str5 != null && C29601cY.A04(str5, 0, 10000, true)) {
            C29591cX.A01(A0R, "note", str5);
        }
        if (C29601cY.A04(str3, 1, 100, false)) {
            C29591cX.A01(A0R, "message-id", str3);
        }
        AnonymousClass8BY.A1C(A0R, A012, false);
        if (A013 != null) {
            AnonymousClass8BY.A14(A0R, A013);
        }
        A0R.A05(A03);
        AnonymousClass1OZ r11 = r37;
        r11.A0I(new C175978za(r0.A00, r0.A01, r0.A03, C197889xR.A04(r0, "upi-collect-from-vpa"), r0, r14), C29591cX.A00(A0R, A0Y), A0B, 204, 0);
    }

    public void C0P(int i) {
        String str;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        indiaUpiSendPaymentActivity.A0t = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment, com.whatsapp.payments.ui.Hilt_IndiaUpiEditTransactionDescriptionFragment, androidx.fragment.app.Fragment] */
    public void C95(PaymentBottomSheet paymentBottomSheet, PaymentDescriptionRow paymentDescriptionRow) {
        String str = this.A00.A0T;
        ? hilt_IndiaUpiEditTransactionDescriptionFragment = new Hilt_IndiaUpiEditTransactionDescriptionFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_payment_description", str);
        hilt_IndiaUpiEditTransactionDescriptionFragment.A1R(A0D);
        hilt_IndiaUpiEditTransactionDescriptionFragment.A09 = new C20864Aag(this, paymentDescriptionRow, 1);
        paymentBottomSheet.A2L(hilt_IndiaUpiEditTransactionDescriptionFragment);
    }
}

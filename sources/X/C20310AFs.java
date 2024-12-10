package X;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AFs  reason: case insensitive filesystem */
public class C20310AFs implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public C20310AFs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.A00) {
            case 0:
                ((Activity) this.A01).openContextMenu(view);
                return;
            case 1:
                AnonymousClass91F r1 = (AnonymousClass91F) this.A01;
                r1.C0I(AnonymousClass8BR.A0Q(r1.A0A.A00, i));
                return;
            case 2:
                IndiaUpiPaymentMethodSelectionActivity indiaUpiPaymentMethodSelectionActivity = (IndiaUpiPaymentMethodSelectionActivity) this.A01;
                C20284AEs A0Q = AnonymousClass8BR.A0Q(indiaUpiPaymentMethodSelectionActivity.A00.A00, i);
                AnonymousClass8pS r0 = (AnonymousClass8pS) A0Q.A08;
                if (r0 == null || C170278pb.A03(r0)) {
                    if (C18020vd.A05(C18040vf.A02, indiaUpiPaymentMethodSelectionActivity.A0P.A02, 10405)) {
                        indiaUpiPaymentMethodSelectionActivity.CNh(AnonymousClass8BW.A09(indiaUpiPaymentMethodSelectionActivity, A0Q, IndiaUpiCheckBalanceActivity.class), 1015);
                        return;
                    }
                    C194579rx r7 = new C194579rx("upi_p2p_check_balance", (String) null, (Map) null);
                    HashMap A11 = C17880vN.A11();
                    A11.put("credential_id", A0Q.A0A);
                    indiaUpiPaymentMethodSelectionActivity.A05.A07(0, 2131895077);
                    ((C191129m4) indiaUpiPaymentMethodSelectionActivity.A02.get()).A00(new C20900AbG(indiaUpiPaymentMethodSelectionActivity, 7), new C20903AbJ(indiaUpiPaymentMethodSelectionActivity, 3), r7, "payment_method_picker", A11);
                    return;
                }
                AnonymousClass4Yv.A01(indiaUpiPaymentMethodSelectionActivity, 29);
                return;
            default:
                PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this.A01;
                paymentSettingsFragment.C0I(AnonymousClass8BR.A0Q(paymentSettingsFragment.A0e.A00, i));
                BD4 bd4 = paymentSettingsFragment.A0h.A09;
                C17960vV.A07(bd4);
                bd4.BiL(181, "payment_home", "payment_home", 1);
                return;
        }
    }
}

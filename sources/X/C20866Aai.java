package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.math.BigDecimal;

/* renamed from: X.Aai  reason: case insensitive filesystem */
public class C20866Aai implements C22546BCd {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public C20866Aai(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public String BWf() {
        Object obj;
        C1418477e r0 = this.A00.A0J;
        if (r0 != null) {
            obj = r0.A00;
        } else {
            obj = null;
        }
        return (String) obj;
    }

    public boolean Bfn() {
        String str;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (indiaUpiSendPaymentActivity.A0q != null || (str = indiaUpiSendPaymentActivity.A0o) == null || ((indiaUpiSendPaymentActivity.A0U != null && BigDecimal.ZERO.compareTo(new BigDecimal(str)) == 0) || indiaUpiSendPaymentActivity.getIntent().getBooleanExtra("extra_payment_is_amount_editable", false))) {
            return true;
        }
        return false;
    }

    public boolean BgS() {
        return this.A00.A4y();
    }

    public AnonymousClass01E BMU() {
        return this.A00;
    }
}

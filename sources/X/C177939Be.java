package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9Be  reason: invalid class name and case insensitive filesystem */
public class C177939Be extends A34 {
    public final UserJid A00;
    public final boolean A01;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177939Be(UserJid userJid, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z) {
        super(indiaUpiSendPaymentActivity, true);
        this.A02 = indiaUpiSendPaymentActivity;
        this.A01 = z;
        this.A00 = userJid;
    }

    public static void A00(UserJid userJid, BCC bcc, C177939Be r7) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = r7.A02;
        AnonymousClass8BX.A1D(indiaUpiSendPaymentActivity.A0i, userJid, "sendGetContactInfoForJid: ", AnonymousClass000.A10());
        indiaUpiSendPaymentActivity.A05.A01(indiaUpiSendPaymentActivity, userJid, indiaUpiSendPaymentActivity.A04, bcc, indiaUpiSendPaymentActivity.A0Q.A05());
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass8pF r3 = (AnonymousClass8pF) obj;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A02;
        if (r3 != null) {
            indiaUpiSendPaymentActivity.A0J = r3.A01;
            indiaUpiSendPaymentActivity.A0i = r3.A02;
            if (!C20061A5k.A02(r3.A00)) {
                indiaUpiSendPaymentActivity.A0H = r3.A00;
            }
        } else {
            indiaUpiSendPaymentActivity.A0J = null;
            indiaUpiSendPaymentActivity.A0i = null;
        }
        IndiaUpiSendPaymentActivity.A0v(indiaUpiSendPaymentActivity, this.A01);
    }
}

package X;

import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class AX9 implements BCB {
    public final /* synthetic */ AnonymousClass91S A00;

    public AX9(AnonymousClass91S r1) {
        this.A00 = r1;
    }

    public void Bv8() {
        AnonymousClass91S r3 = this.A00;
        r3.A0K.A0A("onGetChallengeFailure got; showErrorAndFinish", (Throwable) null);
        r3.A56();
    }

    public void BvE(A7B a7b, boolean z) {
        int i;
        AnonymousClass91S r2 = this.A00;
        r2.CEx();
        if (!z) {
            AnonymousClass1QE r5 = r2.A0K;
            r5.A0A("onGetToken got; failure", (Throwable) null);
            if (r2.A04.A05("upi-get-token")) {
                r5.A0A("retry get token", (Throwable) null);
                AXS axs = r2.A0N;
                synchronized (axs) {
                    try {
                        AnonymousClass1QD r3 = axs.A01;
                        JSONObject A0c = AnonymousClass8BY.A0c(r3);
                        A0c.remove("token");
                        A0c.remove("tokenTs");
                        AnonymousClass8BT.A1G(r3, A0c);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
                    }
                }
                if (r2 instanceof IndiaUpiInternationalDeactivationActivity) {
                    throw AnonymousClass8BY.A0b();
                }
                if (!(r2 instanceof IndiaUpiInternationalActivationActivity)) {
                    if (!(r2 instanceof IndiaUpiStepUpActivity)) {
                        if (!(r2 instanceof AnonymousClass91R)) {
                            if (!(r2 instanceof IndiaUpiPauseMandateActivity) && !(r2 instanceof IndiaUpiMandatePaymentActivity) && !(r2 instanceof IndiaUpiCheckBalanceActivity)) {
                                if (r2 instanceof IndiaUpiChangePinActivity) {
                                    ((IndiaUpiChangePinActivity) r2).A01.setText(2131894072);
                                } else if (r2 instanceof AnonymousClass91M) {
                                    i = 2131894215;
                                    r2.CNA(i);
                                }
                            }
                        }
                    }
                    r2.A53();
                    return;
                }
                i = 2131894072;
                r2.CNA(i);
                r2.A53();
                return;
            }
            if (a7b != null) {
                r5.A0A(AnonymousClass001.A1E(a7b, "onGetToken showErrorAndFinish error: ", AnonymousClass000.A10()), (Throwable) null);
                if (C20752AXh.A01(r2, "upi-get-token", a7b.A00, true)) {
                    return;
                }
            } else {
                r5.A0A("onGetToken showErrorAndFinish", (Throwable) null);
            }
            r2.A56();
            return;
        }
        return;
    }

    public void C2l(boolean z) {
        AnonymousClass91S r3 = this.A00;
        if (r3.Bed()) {
            return;
        }
        if (z) {
            r3.A04.A01("upi-register-app");
            boolean z2 = r3.A0G;
            AnonymousClass1QE r1 = r3.A0K;
            if (z2) {
                r1.A0A("internal error ShowPinError", (Throwable) null);
                r3.A5B((C170278pb) null);
                return;
            }
            r1.A06("onRegisterApp registered ShowMainPane");
            r3.A57();
            return;
        }
        r3.A0K.A0A("onRegisterApp not registered; showErrorAndFinish", (Throwable) null);
        r3.A56();
    }
}

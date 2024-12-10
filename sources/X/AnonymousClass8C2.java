package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.8C2  reason: invalid class name */
public class AnonymousClass8C2 extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8C2(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this();
        this.A02 = indiaUpiDeviceBindStepActivity;
    }

    public void onReceive(Context context, Intent intent) {
        int intExtra;
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C02800Fk.A00(context);
                    this.A01 = true;
                }
            }
        }
        int resultCode = getResultCode();
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A02;
        AnonymousClass1QE r4 = indiaUpiDeviceBindStepActivity.A0h;
        r4.A06(AnonymousClass001.A1I("SmsSentReceiver onReceive: ", AnonymousClass000.A10(), resultCode));
        if (resultCode == -1) {
            IndiaUpiDeviceBindStepActivity.A12(indiaUpiDeviceBindStepActivity, (String) null, -1, true);
            indiaUpiDeviceBindStepActivity.A0F.A00.A06("smsSend");
            indiaUpiDeviceBindStepActivity.A0F.A00.A07("deviceBind");
            C196259ui r1 = indiaUpiDeviceBindStepActivity.A0B;
            if (r1 != null) {
                r1.A03("device-binding-sms");
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("IndiaUpiPaymentBankSetupActivity: onSmsSent to psp: ");
            A10.append(indiaUpiDeviceBindStepActivity.A0R);
            A10.append(" storing verification data sent: ");
            AnonymousClass8BV.A1E(r4, C20088A6q.A00(indiaUpiDeviceBindStepActivity.A0T), A10);
            if (!TextUtils.isEmpty(indiaUpiDeviceBindStepActivity.A0T)) {
                indiaUpiDeviceBindStepActivity.A05.A0J(C21447AkE.A00(indiaUpiDeviceBindStepActivity, 26));
                indiaUpiDeviceBindStepActivity.A0V = true;
                indiaUpiDeviceBindStepActivity.A0P = indiaUpiDeviceBindStepActivity.A05.CGv(C21447AkE.A00(indiaUpiDeviceBindStepActivity, 28), 3000);
                return;
            }
            return;
        }
        C196259ui r12 = indiaUpiDeviceBindStepActivity.A0B;
        if (r12 != null) {
            r12.A04("device-binding-sms", resultCode);
        }
        if (resultCode == 1 && (intExtra = intent.getIntExtra("errorCode", -1)) != -1) {
            resultCode = intExtra;
        }
        IndiaUpiDeviceBindStepActivity.A12(indiaUpiDeviceBindStepActivity, "sms_sending_failed", resultCode, false);
        IndiaUpiDeviceBindStepActivity.A0z(indiaUpiDeviceBindStepActivity, new C19967A1c(2131893856), true);
    }

    public AnonymousClass8C2() {
        this.A01 = false;
        this.A00 = C17880vN.A0p();
    }
}

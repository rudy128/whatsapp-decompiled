package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.A9v  reason: case insensitive filesystem */
public class C20159A9v implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20159A9v(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                dialogFragment = (DialogFragment) this.A02;
                BrazilPaymentActivity brazilPaymentActivity = ((AYZ) obj).A05;
                brazilPaymentActivity.A01 = 7;
                brazilPaymentActivity.A4l((String) null);
                break;
            case 1:
                dialogFragment = (DialogFragment) this.A02;
                PaymentView paymentView = ((AYZ) obj).A05.A0W;
                if (paymentView != null) {
                    paymentView.A0l.setText((CharSequence) null);
                    break;
                }
                break;
            case 2:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A02;
                AZ2 A012 = ((AYZ) obj).A05.A0J.A01.A01("FB", "PIN");
                boolean A1b = fingerprintBottomSheet.A1b();
                if (A012 != null) {
                    if (A1b) {
                        fingerprintBottomSheet.A2G();
                        return;
                    }
                    return;
                } else if (A1b) {
                    fingerprintBottomSheet.A29();
                    return;
                } else {
                    return;
                }
            case 3:
                dialogFragment = (DialogFragment) this.A02;
                BrazilPaymentActivity brazilPaymentActivity2 = ((AYY) obj).A00.A05;
                brazilPaymentActivity2.A01 = 7;
                brazilPaymentActivity2.A4l((String) null);
                break;
            default:
                dialogFragment = (DialogFragment) this.A02;
                PaymentView paymentView2 = ((AYY) obj).A00.A05.A0W;
                if (paymentView2 != null) {
                    paymentView2.A0l.setText((CharSequence) null);
                    break;
                }
                break;
        }
        if (!dialogFragment.A1b()) {
            return;
        }
        dialogFragment.A29();
    }
}

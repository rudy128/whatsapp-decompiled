package X;

import android.os.CountDownTimer;
import androidx.fragment.app.Fragment;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import org.npci.upi.security.pinactivitycomponent.s;

/* renamed from: X.8Cd  reason: invalid class name and case insensitive filesystem */
public class C161188Cd extends CountDownTimer {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161188Cd(IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity, PaymentMethodRow paymentMethodRow, long j) {
        super(j, 1000);
        this.A01 = indiaUpiPinPrimerFullSheetActivity;
        this.A02 = paymentMethodRow;
    }

    public void onFinish() {
        if (this.A00 != 0) {
            Fragment fragment = (Fragment) this.A02;
            fragment.A1B().runOnUiThread(new C21429Ajw(fragment, 24));
            return;
        }
        IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity = (IndiaUpiPinPrimerFullSheetActivity) this.A01;
        indiaUpiPinPrimerFullSheetActivity.A0N.A0M();
        CountDownTimer countDownTimer = indiaUpiPinPrimerFullSheetActivity.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            indiaUpiPinPrimerFullSheetActivity.A01 = null;
        }
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) this.A02;
        paymentMethodRow.A04(true);
        AnonymousClass4aO.A04(paymentMethodRow, true);
        paymentMethodRow.A03(indiaUpiPinPrimerFullSheetActivity.getString(2131893777), true);
    }

    public void onTick(long j) {
        String A1H;
        if (this.A00 != 0) {
            long A04 = C17880vN.A04(j);
            long j2 = A04 - 15;
            int i = (A04 > 15 ? 1 : (A04 == 15 ? 0 : -1));
            AnonymousClass8Do r2 = (AnonymousClass8Do) this.A01;
            if (i > 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(Long.toString(j2));
                A1H = AnonymousClass000.A0y("s", A10);
            } else {
                A1H = ((Fragment) this.A02).A1H(2131899583);
            }
            r2.A02(A1H, true);
            return;
        }
        AnonymousClass1FP r4 = (AnonymousClass1FP) this.A01;
        ((PaymentMethodRow) this.A02).A03(C108975cc.A0b(r4, C64052u8.A0A(r4.A00, j), new Object[1], 2131893780), true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161188Cd(s sVar, AnonymousClass8Do r6) {
        super(60000, 1000);
        this.A02 = sVar;
        this.A01 = r6;
    }
}

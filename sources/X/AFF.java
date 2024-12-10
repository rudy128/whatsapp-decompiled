package X;

import android.view.View;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;

public final /* synthetic */ class AFF implements View.OnClickListener {
    public final /* synthetic */ PaymentsWarmWelcomeBottomSheet A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onClick(View view) {
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        B95 b95 = paymentsWarmWelcomeBottomSheet.A01;
        if (b95 != null) {
            b95.C1m(paymentsWarmWelcomeBottomSheet);
        }
        BD4 bd4 = paymentsWarmWelcomeBottomSheet.A00;
        if (bd4 != null) {
            if (str == null) {
                str = "";
            }
            bd4.BiL(36, str, str2, 1);
            return;
        }
        C18070vi.A11("paymentUIEventLogger");
        throw null;
    }

    public /* synthetic */ AFF(PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet, String str, String str2) {
        this.A00 = paymentsWarmWelcomeBottomSheet;
        this.A01 = str;
        this.A02 = str2;
    }
}

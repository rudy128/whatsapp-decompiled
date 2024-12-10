package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

/* renamed from: X.9RL  reason: invalid class name */
public abstract class AnonymousClass9RL {
    public static final PaymentCustomInstructionsBottomSheet A00(AnonymousClass1BI r3, String str, String str2, String str3, boolean z) {
        C18070vi.A0d(str, 1);
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("merchantJid", r3);
        A0D.putString("PayInstructionsKey", str);
        A0D.putString("referral_screen", str2);
        A0D.putString("total_amount", str3);
        A0D.putBoolean("has_total_amount", z);
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = new PaymentCustomInstructionsBottomSheet();
        paymentCustomInstructionsBottomSheet.A1R(A0D);
        return paymentCustomInstructionsBottomSheet;
    }
}

package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.payments.ui.Hilt_BrazilPaymentIncomeCollectionBottomSheet;

/* renamed from: X.6X5  reason: invalid class name */
public abstract class AnonymousClass6X5 {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.whatsapp.payments.ui.Hilt_BrazilPaymentIncomeCollectionBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet] */
    public static final BrazilPaymentIncomeCollectionBottomSheet A00(BD4 bd4, BBZ bbz, String str) {
        C18070vi.A0d(bd4, 1);
        Bundle A0D = C17880vN.A0D();
        A0D.putString("referral_screen", str);
        ? hilt_BrazilPaymentIncomeCollectionBottomSheet = new Hilt_BrazilPaymentIncomeCollectionBottomSheet();
        hilt_BrazilPaymentIncomeCollectionBottomSheet.A1R(A0D);
        hilt_BrazilPaymentIncomeCollectionBottomSheet.A01 = bbz;
        hilt_BrazilPaymentIncomeCollectionBottomSheet.A00 = bd4;
        return hilt_BrazilPaymentIncomeCollectionBottomSheet;
    }
}

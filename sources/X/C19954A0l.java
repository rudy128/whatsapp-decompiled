package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentTransactionConfirmationFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.List;

/* renamed from: X.A0l  reason: case insensitive filesystem */
public final class C19954A0l {
    public static final List A02;
    public static final List A03;
    public static final List A04 = AnonymousClass8BX.A0o("chat", "payment_composer_icon", 2, 1);
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    static {
        String[] strArr = new String[4];
        strArr[0] = "payments_camera";
        strArr[1] = "payments_camera_gallery";
        strArr[2] = "main_qr_code_camera";
        A02 = C18070vi.A0O("main_qr_code_gallery", strArr, 3);
        String[] strArr2 = new String[4];
        strArr2[0] = "chat";
        strArr2[1] = "payment_composer_icon";
        strArr2[2] = "photo_received";
        A03 = C18070vi.A0O("photo_received_gallery", strArr2, 3);
    }

    public final boolean A01(String str, boolean z) {
        if (!z) {
            return false;
        }
        if (C29431cG.A18(A02, str)) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 2820)) {
                return true;
            }
        }
        if (!C29431cG.A18(A03, str)) {
            return false;
        }
        if (C18020vd.A05(C18040vf.A02, this.A00, 8558)) {
            return true;
        }
        return false;
    }

    public C19954A0l(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.Fragment, com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment, com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentTransactionConfirmationFragment] */
    public final void A00(AnonymousClass1FU r5, C194529rs r6, AnonymousClass9YW r7) {
        Bundle A0J = C72463Mc.A0J(r5);
        ? hilt_IndiaUpiPaymentTransactionConfirmationFragment = new Hilt_IndiaUpiPaymentTransactionConfirmationFragment();
        hilt_IndiaUpiPaymentTransactionConfirmationFragment.A1R(A0J);
        hilt_IndiaUpiPaymentTransactionConfirmationFragment.A1R(r6.A00);
        Bundle bundle = hilt_IndiaUpiPaymentTransactionConfirmationFragment.A06;
        if (bundle != null) {
            bundle.putBoolean("is_interop", r6.A02);
        }
        hilt_IndiaUpiPaymentTransactionConfirmationFragment.A0C = new C191099m1(r5, r6, this, r6.A01);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = hilt_IndiaUpiPaymentTransactionConfirmationFragment;
        r5.CMk(paymentBottomSheet, "IndiaUpiPaymentTransactionConfirmationFragment");
        paymentBottomSheet.A01 = C20160A9w.A00(r7, 6);
    }
}

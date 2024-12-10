package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;
import com.whatsapp.payments.ui.Hilt_BrazilPaymentMethodAddPixBottomSheet;

/* renamed from: X.9RG  reason: invalid class name */
public abstract class AnonymousClass9RG {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.Hilt_BrazilPaymentMethodAddPixBottomSheet] */
    public static final BrazilPaymentMethodAddPixBottomSheet A00(C194929sW r4, Boolean bool, String str, String str2, String str3) {
        ? hilt_BrazilPaymentMethodAddPixBottomSheet = new Hilt_BrazilPaymentMethodAddPixBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("extra_is_edit_mode_enabled", bool.booleanValue());
        if (r4 != null) {
            A0D.putString("extra_pix_info_key_credential_id", r4.A00);
            A0D.putString("pix_info_key_type", r4.A02);
            A0D.putString("pix_info_display_name", r4.A01);
            A0D.putString("pix_info_key_value", r4.A03);
        }
        A0D.putString("referral_screen", str);
        A0D.putString("previous_screen", str2);
        A0D.putString("campaign_id", str3);
        hilt_BrazilPaymentMethodAddPixBottomSheet.A1R(A0D);
        return hilt_BrazilPaymentMethodAddPixBottomSheet;
    }
}

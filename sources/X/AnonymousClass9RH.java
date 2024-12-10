package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPixSendKeyBottomSheet;
import com.whatsapp.payments.ui.Hilt_BrazilPixSendKeyBottomSheet;

/* renamed from: X.9RH  reason: invalid class name */
public abstract class AnonymousClass9RH {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.payments.ui.BrazilPixSendKeyBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.Hilt_BrazilPixSendKeyBottomSheet] */
    public static final BrazilPixSendKeyBottomSheet A00(C194929sW r4, AnonymousClass1BI r5, String str, String str2, String str3) {
        C18070vi.A0h(r5, r4);
        ? hilt_BrazilPixSendKeyBottomSheet = new Hilt_BrazilPixSendKeyBottomSheet();
        if (str != null) {
            Bundle A0D = C17880vN.A0D();
            A0D.putString("extra_payment_name", str3);
            A0D.putString("extra_receiver_jid", r5.getRawString());
            A0D.putString("referral_screen", str);
            A0D.putString("previous_screen", str2);
            A0D.putString("extra_pix_info_key_credential_id", r4.A00);
            A0D.putString("pix_info_key_type", r4.A02);
            A0D.putString("pix_info_display_name", r4.A01);
            A0D.putString("pix_info_key_value", r4.A03);
            hilt_BrazilPixSendKeyBottomSheet.A1R(A0D);
        }
        return hilt_BrazilPixSendKeyBottomSheet;
    }
}

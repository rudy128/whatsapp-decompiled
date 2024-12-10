package X;

import android.os.Bundle;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authentication.Hilt_FingerprintBottomSheet;

/* renamed from: X.9iL  reason: invalid class name and case insensitive filesystem */
public final class C188999iL {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.authentication.Hilt_FingerprintBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.authentication.FingerprintBottomSheet] */
    public final FingerprintBottomSheet A00() {
        ? hilt_FingerprintBottomSheet = new Hilt_FingerprintBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("title", 2131893606);
        A0D.putInt("negative_button_text", 2131898766);
        A0D.putInt("positive_button_text", 2131897668);
        A0D.putInt("header_layout_id", 2131626312);
        A0D.putInt("fingerprint_view_style_id", 2132083295);
        A0D.putBoolean("full_screen", false);
        hilt_FingerprintBottomSheet.A1R(A0D);
        return hilt_FingerprintBottomSheet;
    }
}

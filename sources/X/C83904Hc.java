package X;

import android.os.Bundle;
import com.whatsapp.registration.Hilt_VerificationCodeBottomSheet;
import com.whatsapp.registration.VerificationCodeBottomSheet;

/* renamed from: X.4Hc  reason: invalid class name and case insensitive filesystem */
public abstract class C83904Hc {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.whatsapp.registration.Hilt_VerificationCodeBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.registration.VerificationCodeBottomSheet] */
    public static final VerificationCodeBottomSheet A00(String str) {
        ? hilt_VerificationCodeBottomSheet = new Hilt_VerificationCodeBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("code", str);
        hilt_VerificationCodeBottomSheet.A1R(A0D);
        return hilt_VerificationCodeBottomSheet;
    }
}

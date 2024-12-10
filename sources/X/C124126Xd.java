package X;

import android.os.Bundle;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;

/* renamed from: X.6Xd  reason: invalid class name and case insensitive filesystem */
public abstract class C124126Xd {
    public static final StatusPrivacyBottomSheetDialogFragment A00(String str, boolean z) {
        StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = new StatusPrivacyBottomSheetDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_entry_point", str);
        A0D.putBoolean("should_display_xo", z);
        statusPrivacyBottomSheetDialogFragment.A1R(A0D);
        return statusPrivacyBottomSheetDialogFragment;
    }
}

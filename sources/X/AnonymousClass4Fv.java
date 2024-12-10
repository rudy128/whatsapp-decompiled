package X;

import android.os.Bundle;
import com.whatsapp.calling.capi.view.CapiCallingConfirmationBottomSheetDialogFragment;
import com.whatsapp.calling.capi.view.Hilt_CapiCallingConfirmationBottomSheetDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Fv  reason: invalid class name */
public abstract class AnonymousClass4Fv {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.whatsapp.calling.capi.view.Hilt_CapiCallingConfirmationBottomSheetDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.calling.capi.view.CapiCallingConfirmationBottomSheetDialogFragment] */
    public static final CapiCallingConfirmationBottomSheetDialogFragment A00(UserJid userJid, int i) {
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, userJid, "jid");
        A0D.putInt("call_from", i);
        ? hilt_CapiCallingConfirmationBottomSheetDialogFragment = new Hilt_CapiCallingConfirmationBottomSheetDialogFragment();
        hilt_CapiCallingConfirmationBottomSheetDialogFragment.A1R(A0D);
        return hilt_CapiCallingConfirmationBottomSheetDialogFragment;
    }
}

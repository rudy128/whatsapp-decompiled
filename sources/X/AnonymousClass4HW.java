package X;

import android.os.Bundle;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_ErrorDialogFragment;

/* renamed from: X.4HW  reason: invalid class name */
public abstract class AnonymousClass4HW {
    /* JADX WARNING: type inference failed for: r0v1, types: [com.whatsapp.qrcode.contactqr.ErrorDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.qrcode.contactqr.Hilt_ErrorDialogFragment] */
    public static final ErrorDialogFragment A00(int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("ARG_ERROR_CODE", i);
        ? hilt_ErrorDialogFragment = new Hilt_ErrorDialogFragment();
        hilt_ErrorDialogFragment.A1R(A0D);
        return hilt_ErrorDialogFragment;
    }
}

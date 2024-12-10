package X;

import android.os.Bundle;
import com.whatsapp.Hilt_RevokeLinkConfirmationDialogFragment;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;

/* renamed from: X.4FZ  reason: invalid class name */
public abstract class AnonymousClass4FZ {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.RevokeLinkConfirmationDialogFragment, com.whatsapp.Hilt_RevokeLinkConfirmationDialogFragment, androidx.fragment.app.Fragment] */
    public static final RevokeLinkConfirmationDialogFragment A00(AnonymousClass1EC r3, boolean z) {
        C18070vi.A0d(r3, 0);
        ? hilt_RevokeLinkConfirmationDialogFragment = new Hilt_RevokeLinkConfirmationDialogFragment();
        Bundle A0H = C72473Md.A0H(r3);
        A0H.putBoolean("from_qr", z);
        hilt_RevokeLinkConfirmationDialogFragment.A1R(A0H);
        return hilt_RevokeLinkConfirmationDialogFragment;
    }
}

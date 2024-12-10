package X;

import android.content.DialogInterface;
import androidx.biometric.FingerprintDialogFragment;

/* renamed from: X.0R2  reason: invalid class name */
public class AnonymousClass0R2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public AnonymousClass0R2(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A01.A17(true);
    }
}

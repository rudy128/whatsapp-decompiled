package X;

import android.os.Bundle;
import com.whatsapp.calling.dialogs.Hilt_MessageDialogFragment;
import com.whatsapp.calling.dialogs.MessageDialogFragment;

/* renamed from: X.4Fw  reason: invalid class name */
public abstract class AnonymousClass4Fw {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.whatsapp.calling.dialogs.Hilt_MessageDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.calling.dialogs.MessageDialogFragment] */
    public static final MessageDialogFragment A00(AnonymousClass868 r3, String str) {
        C18070vi.A0d(str, 1);
        ? hilt_MessageDialogFragment = new Hilt_MessageDialogFragment();
        hilt_MessageDialogFragment.A00 = r3;
        Bundle A0D = C17880vN.A0D();
        A0D.putString("message", str);
        hilt_MessageDialogFragment.A1R(A0D);
        return hilt_MessageDialogFragment;
    }
}

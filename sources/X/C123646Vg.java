package X;

import android.os.Bundle;
import com.whatsapp.Hilt_SuspiciousLinkWarningDialogFragment;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6Vg  reason: invalid class name and case insensitive filesystem */
public abstract class C123646Vg {
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.fragment.app.Fragment, com.whatsapp.Hilt_SuspiciousLinkWarningDialogFragment, com.whatsapp.SuspiciousLinkWarningDialogFragment] */
    public static final SuspiciousLinkWarningDialogFragment A00(String str, String str2, Set set) {
        C18070vi.A0d(str, 0);
        C18070vi.A0j(set, str2);
        ? hilt_SuspiciousLinkWarningDialogFragment = new Hilt_SuspiciousLinkWarningDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("url", str);
        A0D.putSerializable("message_key_id", str2);
        A0D.putSerializable("phishingChars", new HashSet(set));
        hilt_SuspiciousLinkWarningDialogFragment.A1R(A0D);
        return hilt_SuspiciousLinkWarningDialogFragment;
    }
}

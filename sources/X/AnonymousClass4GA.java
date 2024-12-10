package X;

import com.whatsapp.community.CommunityExitDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4GA  reason: invalid class name */
public abstract class AnonymousClass4GA {
    public static final CommunityExitDialogFragment A00(C34511kb r2, AnonymousClass1EC r3, boolean z) {
        C18070vi.A0i(r3, r2);
        if (!r2.A0R(r3)) {
            return null;
        }
        AnonymousClass1EC A05 = r2.A05(r3);
        if (A05 != null) {
            return CommunityExitDialogFragment.A00(A05, r2.A08(A05), z);
        }
        Log.e("CommunityNavigationUtils/getCommunityExitDialogIfCAG/parentGroupJid is null");
        return null;
    }
}

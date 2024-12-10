package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.blocklist.Hilt_UnblockDialogFragment;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Vi  reason: invalid class name and case insensitive filesystem */
public abstract class C87374Vi {
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.fragment.app.Fragment, com.whatsapp.blocklist.UnblockDialogFragment, com.whatsapp.blocklist.Hilt_UnblockDialogFragment] */
    public static final UnblockDialogFragment A01(C107105Yk r3, String str, int i, boolean z) {
        ? hilt_UnblockDialogFragment = new Hilt_UnblockDialogFragment();
        hilt_UnblockDialogFragment.A00 = r3;
        hilt_UnblockDialogFragment.A01 = z;
        Bundle A0D = C17880vN.A0D();
        A0D.putString("message", str);
        A0D.putInt("title", i);
        hilt_UnblockDialogFragment.A1R(A0D);
        return hilt_UnblockDialogFragment;
    }

    public static final C92934iA A00(Activity activity, C37551pj r3, UserJid userJid) {
        C18070vi.A0j(r3, userJid);
        return new C92934iA(activity, userJid, r3, 0);
    }
}

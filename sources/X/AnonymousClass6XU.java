package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.Hilt_StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;

/* renamed from: X.6XU  reason: invalid class name */
public abstract class AnonymousClass6XU {
    /* JADX WARNING: type inference failed for: r4v0, types: [com.whatsapp.status.Hilt_StatusConfirmUnmuteDialogFragment, com.whatsapp.status.StatusConfirmUnmuteDialogFragment, androidx.fragment.app.Fragment] */
    public static final StatusConfirmUnmuteDialogFragment A00(UserJid userJid, Long l, String str, String str2, String str3, boolean z) {
        C18070vi.A0d(userJid, 0);
        ? hilt_StatusConfirmUnmuteDialogFragment = new Hilt_StatusConfirmUnmuteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, userJid, "jid");
        A0D.putString("message_id", str);
        A0D.putLong("status_item_index", C17900vP.A01(l));
        A0D.putString("psa_campaign_id", str2);
        A0D.putString("psa_campaign_ids", str3);
        A0D.putBoolean("is_message_sampled", z);
        hilt_StatusConfirmUnmuteDialogFragment.A1R(A0D);
        return hilt_StatusConfirmUnmuteDialogFragment;
    }
}

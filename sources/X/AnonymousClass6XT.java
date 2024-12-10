package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.Hilt_StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;

/* renamed from: X.6XT  reason: invalid class name */
public abstract class AnonymousClass6XT {
    /* JADX WARNING: type inference failed for: r4v0, types: [com.whatsapp.status.StatusConfirmMuteDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.status.Hilt_StatusConfirmMuteDialogFragment] */
    public static final StatusConfirmMuteDialogFragment A00(UserJid userJid, Long l, String str, String str2, String str3, boolean z) {
        C18070vi.A0d(userJid, 0);
        ? hilt_StatusConfirmMuteDialogFragment = new Hilt_StatusConfirmMuteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, userJid, "jid");
        A0D.putString("message_id", str);
        A0D.putLong("status_item_index", C17900vP.A01(l));
        A0D.putString("psa_campaign_id", str2);
        A0D.putString("psa_campaign_ids", str3);
        A0D.putBoolean("is_message_sampled", z);
        hilt_StatusConfirmMuteDialogFragment.A1R(A0D);
        return hilt_StatusConfirmMuteDialogFragment;
    }
}

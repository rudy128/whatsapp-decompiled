package X;

import android.os.Bundle;
import com.whatsapp.invites.Hilt_RevokeInviteDialogFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Gz  reason: invalid class name and case insensitive filesystem */
public abstract class C83874Gz {
    /* JADX WARNING: type inference failed for: r0v1, types: [com.whatsapp.invites.Hilt_RevokeInviteDialogFragment, com.whatsapp.invites.RevokeInviteDialogFragment, androidx.fragment.app.Fragment] */
    public static final RevokeInviteDialogFragment A00(UserJid userJid, AnonymousClass23S r4) {
        C18070vi.A0h(userJid, r4);
        Bundle A0H = C72473Md.A0H(userJid);
        A0H.putLong("invite_row_id", r4.A0x);
        ? hilt_RevokeInviteDialogFragment = new Hilt_RevokeInviteDialogFragment();
        hilt_RevokeInviteDialogFragment.A1R(A0H);
        return hilt_RevokeInviteDialogFragment;
    }
}

package X;

import android.os.Bundle;
import com.whatsapp.community.CommunityConfirmLinkDialogFragment;
import java.util.List;

/* renamed from: X.4G8  reason: invalid class name */
public abstract class AnonymousClass4G8 {
    public static final CommunityConfirmLinkDialogFragment A00(C82884Cn r4, List list) {
        C18070vi.A0d(list, 0);
        CommunityConfirmLinkDialogFragment communityConfirmLinkDialogFragment = new CommunityConfirmLinkDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A17(A0D, "subgroup_jid_list", list);
        A0D.putString("link_mode", r4.toString());
        communityConfirmLinkDialogFragment.A1R(A0D);
        return communityConfirmLinkDialogFragment;
    }
}

package X;

import android.os.Bundle;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment;
import java.util.List;

/* renamed from: X.4H8  reason: invalid class name */
public abstract class AnonymousClass4H8 {
    public static final InviteNewsletterAdminMessageFragment A00(C29681ch r4, List list, boolean z) {
        InviteNewsletterAdminMessageFragment inviteNewsletterAdminMessageFragment = new InviteNewsletterAdminMessageFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, r4, "newsletter_jid");
        C18070vi.A0d(list, 2);
        AnonymousClass3MY.A17(A0D, "invitee_jids", list);
        A0D.putBoolean("arg_from_contacts_picker", z);
        inviteNewsletterAdminMessageFragment.A1R(A0D);
        return inviteNewsletterAdminMessageFragment;
    }
}

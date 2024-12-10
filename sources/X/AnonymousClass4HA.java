package X;

import android.os.Bundle;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;

/* renamed from: X.4HA  reason: invalid class name */
public abstract class AnonymousClass4HA {
    public static final NewsletterAcceptAdminInviteSheet A00(C29681ch r3, String str, long j, boolean z) {
        NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = new NewsletterAcceptAdminInviteSheet();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, r3, "newsletter_jid");
        A0D.putString("newsletter_name", str);
        A0D.putLong("invite_expiration_ts", j);
        A0D.putBoolean("from_tos_accepted", z);
        newsletterAcceptAdminInviteSheet.A1R(A0D);
        return newsletterAcceptAdminInviteSheet;
    }
}

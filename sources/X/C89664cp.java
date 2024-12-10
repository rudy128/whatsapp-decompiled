package X;

import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment;

/* renamed from: X.4cp  reason: invalid class name and case insensitive filesystem */
public class C89664cp implements MenuItem.OnMenuItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C89664cp(UserJid userJid, C86264Qy r2, String str, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = userJid;
        this.A03 = str;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        NewsletterInfoActivity newsletterInfoActivity;
        int i = this.A00;
        C86264Qy r1 = (C86264Qy) this.A01;
        if (i != 0) {
            UserJid userJid = (UserJid) this.A02;
            String str = this.A03;
            C18070vi.A0d(userJid, 1);
            AnonymousClass1FY r12 = r1.A00;
            if (!(r12 instanceof NewsletterInfoActivity) || (newsletterInfoActivity = (NewsletterInfoActivity) r12) == null) {
                return true;
            }
            newsletterInfoActivity.A4q(userJid, str);
            return true;
        }
        Jid jid = (Jid) this.A02;
        String str2 = this.A03;
        C18070vi.A0d(jid, 1);
        AnonymousClass1GP supportFragmentManager = r1.A00.getSupportFragmentManager();
        RevokeNewsletterAdminInviteDialogFragment revokeNewsletterAdminInviteDialogFragment = new RevokeNewsletterAdminInviteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, jid, "arg_contact_jid");
        A0D.putString("arg_contact_name", str2);
        revokeNewsletterAdminInviteDialogFragment.A1R(A0D);
        C20098A7b.A02(revokeNewsletterAdminInviteDialogFragment, supportFragmentManager);
        return true;
    }
}

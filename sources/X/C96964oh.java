package X;

import android.net.Uri;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4oh  reason: invalid class name and case insensitive filesystem */
public final class C96964oh implements C34571ki {
    public final /* synthetic */ NewsletterInfoActivity A00;

    public C96964oh(NewsletterInfoActivity newsletterInfoActivity) {
        this.A00 = newsletterInfoActivity;
    }

    public void Bw8(C46162Dk r5, C18090vk r6) {
        NewsletterInfoActivity newsletterInfoActivity = this.A00;
        AnonymousClass440 r3 = newsletterInfoActivity.A0m;
        if (r3 == null) {
            C18070vi.A11("newsletterViewModel");
            throw null;
        } else {
            r3.A0V(r5, AnonymousClass00R.A0G, Long.valueOf(newsletterInfoActivity.A00), r6);
        }
    }

    public void Bz7(C46162Dk r13) {
        String str = r13.A0S;
        if (str != null) {
            NewsletterInfoActivity newsletterInfoActivity = this.A00;
            AnonymousClass00H r0 = newsletterInfoActivity.A11;
            if (r0 != null) {
                ((C36341nj) C18070vi.A0E(r0)).A02(newsletterInfoActivity, Uri.parse(AnonymousClass001.A1H("whatsapp://channel/", str, AnonymousClass000.A10())), (C29681ch) null, AnonymousClass00R.A05, Long.valueOf(newsletterInfoActivity.A00), str, 0, -1);
                return;
            }
            C18070vi.A11("newsletterLinkLauncher");
            throw null;
        }
    }
}

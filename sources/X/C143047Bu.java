package X;

import com.whatsapp.ShareProductLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Bu  reason: invalid class name and case insensitive filesystem */
public class C143047Bu implements AnonymousClass86R {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C143047Bu(ShareProductLinkActivity shareProductLinkActivity, UserJid userJid, String str, int i) {
        this.A00 = i;
        this.A01 = shareProductLinkActivity;
        this.A03 = str;
        this.A02 = userJid;
    }

    public final void Bhy() {
        int i;
        int i2;
        int i3 = this.A00;
        ShareProductLinkActivity shareProductLinkActivity = (ShareProductLinkActivity) this.A01;
        String str = this.A03;
        UserJid userJid = (UserJid) this.A02;
        A8Q A4i = shareProductLinkActivity.A4i();
        switch (i3) {
            case 0:
                i = 23;
                i2 = 40;
                break;
            case 1:
                i = 23;
                i2 = 94;
                break;
            case 2:
                i = 25;
                i2 = 42;
                break;
            default:
                i = 20;
                i2 = 37;
                break;
        }
        A4i.A09(ShareProductLinkActivity.A0Q(shareProductLinkActivity, userJid, str, i, i2));
    }
}

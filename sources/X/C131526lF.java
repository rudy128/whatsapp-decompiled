package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6lF  reason: invalid class name and case insensitive filesystem */
public final class C131526lF {
    public final AnonymousClass18K A00;

    public C131526lF(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(UserJid userJid, String str) {
        Long l;
        String str2;
        C1180862c r1 = new C1180862c();
        r1.A00 = 1;
        r1.A02 = str;
        if (userJid == null || (str2 = userJid.user) == null) {
            l = null;
        } else {
            l = C108965cb.A0m(str2);
        }
        r1.A01 = l;
        this.A00.CC7(r1);
    }
}

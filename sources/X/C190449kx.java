package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9kx  reason: invalid class name and case insensitive filesystem */
public final class C190449kx {
    public final C24751Ln A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public final UserJid A00(UserJid userJid, String str) {
        AnonymousClass190 r2;
        StringBuilder A10;
        String str2;
        boolean z = userJid instanceof AnonymousClass1E2;
        if (C18020vd.A05(C18040vf.A02, this.A01, 11180)) {
            if (!z && (userJid instanceof PhoneUserJid) && (userJid = this.A00.A0A((PhoneUserJid) userJid)) == null && (r2 = (AnonymousClass190) this.A02.get()) != null) {
                A10 = AnonymousClass000.A10();
                str2 = "LID JID conversion failed for context: ";
            }
            return userJid;
        }
        if (z && (userJid = this.A00.A0D((AnonymousClass1E1) userJid)) == null && (r2 = (AnonymousClass190) this.A02.get()) != null) {
            A10 = AnonymousClass000.A10();
            str2 = "PN JID conversion failed for context: ";
        }
        return userJid;
        r2.A0G("cart-lid-migration-pn-jid-failure", AnonymousClass001.A1H(str2, str, A10), false);
        return userJid;
    }

    public C190449kx(C24751Ln r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}

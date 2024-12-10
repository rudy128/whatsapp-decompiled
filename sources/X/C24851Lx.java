package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Lx  reason: invalid class name and case insensitive filesystem */
public final class C24851Lx {
    public final C24751Ln A00;
    public final C18030ve A01;

    public C24851Lx(C24751Ln r2, C18030ve r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final UserJid A00(UserJid userJid) {
        PhoneUserJid A0D;
        if (!C18020vd.A05(C18040vf.A01, this.A01, 8573) || (userJid instanceof PhoneUserJid) || !(userJid instanceof AnonymousClass1E2) || (A0D = this.A00.A0D((AnonymousClass1E1) userJid)) == null) {
            return userJid;
        }
        return A0D;
    }

    public final UserJid A01(UserJid userJid) {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A01;
        if (C18020vd.A05(r1, r2, 8573)) {
            if (userJid instanceof PhoneUserJid) {
                if (C18020vd.A05(r1, r2, 8573) && !(userJid instanceof AnonymousClass1E2)) {
                    AnonymousClass1E1 A0A = this.A00.A0A((PhoneUserJid) userJid);
                    if (!(A0A instanceof AnonymousClass1E2) || A0A == null) {
                        return userJid;
                    }
                    return A0A;
                }
            } else if (userJid instanceof AnonymousClass1E2) {
                return A00(userJid);
            }
        }
        return userJid;
    }
}

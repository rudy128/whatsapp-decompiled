package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2hy  reason: invalid class name and case insensitive filesystem */
public final class C56752hy {
    public final C24751Ln A00;

    public C56752hy(C24751Ln r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final UserJid A00(UserJid userJid, boolean z) {
        UserJid A0D;
        C18070vi.A0d(userJid, 0);
        if (z) {
            if (!C22971Dz.A0X(userJid)) {
                return userJid;
            }
            A0D = this.A00.A0A((PhoneUserJid) userJid);
        } else if (!C22971Dz.A0T(userJid)) {
            return userJid;
        } else {
            A0D = this.A00.A0D((AnonymousClass1E1) userJid);
        }
        return A0D;
    }
}

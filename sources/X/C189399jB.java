package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.9jB  reason: invalid class name and case insensitive filesystem */
public final class C189399jB {
    public final C24751Ln A00;

    public C189399jB(C24751Ln r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public String A00(Jid jid) {
        String str;
        if (jid instanceof PhoneUserJid) {
            return jid.user;
        }
        if (jid instanceof AnonymousClass1E2) {
            PhoneUserJid A0D = this.A00.A0D((AnonymousClass1E1) jid);
            if (A0D == null || (str = A0D.user) == null) {
                return "-1";
            }
            return str;
        } else if (jid instanceof DeviceJid) {
            return A00(((DeviceJid) jid).userJid);
        }
        return "-1";
    }
}

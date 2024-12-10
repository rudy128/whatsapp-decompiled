package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9ji  reason: invalid class name and case insensitive filesystem */
public final class C189729ji {
    public final C184319al A00;

    public final void A00(UserJid userJid, B9F b9f, boolean z) {
        int i;
        C18070vi.A0d(userJid, 0);
        if (z) {
            C184319al r4 = this.A00;
            C42741yf A02 = r4.A01.A02(userJid);
            if (A02 != null) {
                if (A02.A03()) {
                    i = 1;
                } else if (A02.A02()) {
                    r4.A00.A0C(new C20469AMg(b9f, 3), userJid);
                    return;
                }
            }
            b9f.Bx7((Integer) null);
            return;
        }
        i = null;
        b9f.Bx7(i);
    }

    public C189729ji(C184319al r1) {
        this.A00 = r1;
    }
}

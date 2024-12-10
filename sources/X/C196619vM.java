package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.9vM  reason: invalid class name and case insensitive filesystem */
public abstract class C196619vM {
    public static final A24 A00(C170598qH r2) {
        C18070vi.A0d(r2, 1);
        AnonymousClass1BI chatJid = r2.getChatJid();
        C18070vi.A0d(chatJid, 0);
        if (chatJid instanceof PhoneUserJid) {
            C42701yb.A01(chatJid);
        }
        return new A24(r2, chatJid, chatJid);
    }

    public static final C170598qH A01(A24 a24, C26331Rs r2) {
        C170598qH r0 = (C170598qH) r2.A09(a24.A03);
        if (r0 != null) {
            return r0;
        }
        if (!a24.A05) {
            return (C170598qH) r2.A09(a24.A04);
        }
        return null;
    }
}

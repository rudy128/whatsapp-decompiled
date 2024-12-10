package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.9vN  reason: invalid class name and case insensitive filesystem */
public abstract class C196629vN {
    public static final C195559tX A00(AnonymousClass8q2 r2) {
        C18070vi.A0d(r2, 1);
        AnonymousClass1BI chatJid = r2.getChatJid();
        C18070vi.A0d(chatJid, 0);
        if (chatJid instanceof PhoneUserJid) {
            C42701yb.A01(chatJid);
        }
        return new C195559tX(r2, chatJid, chatJid);
    }

    public static final AnonymousClass8q2 A01(C195559tX r1, C26331Rs r2) {
        AnonymousClass8q2 r0 = (AnonymousClass8q2) r2.A09(r1.A04);
        if (r0 != null) {
            return r0;
        }
        if (!r1.A06) {
            return (AnonymousClass8q2) r2.A09(r1.A05);
        }
        return null;
    }
}

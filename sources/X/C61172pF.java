package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2pF  reason: invalid class name and case insensitive filesystem */
public final class C61172pF {
    public final A8Q A00;

    public C61172pF(A8Q a8q) {
        C18070vi.A0d(a8q, 1);
        this.A00 = a8q;
    }

    public static final void A00(C61172pF r5, UserJid userJid, Integer num, Integer num2, String str, int i) {
        Long l;
        A8Q a8q = r5.A00;
        if (num2 != null) {
            l = C17880vN.A0n(num2.intValue() + 1);
        } else {
            l = null;
        }
        a8q.A0B.CGF(new AnonymousClass7QG(a8q, userJid, num, l, str, i, 0));
    }
}
